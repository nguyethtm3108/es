package com.api.domain.service.create;

import com.api.domain.entity.Service;
import com.api.domain.repository.ServiceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import service.Create;

/**
 * ServiceCreateService
 *
 * @author NguyetHTM
 */
@Slf4j
@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class ServiceCreateService implements Create<ServiceCreateRequest, ServiceCreateResponse> {

  private final ServiceRepository serviceRepository;

  /**
   * @param request ServiceCreateRequest
   * @return ServiceCreateResponse
   */
  @Override
  public ServiceCreateResponse execute(Authentication authentication, ServiceCreateRequest request) {
    try {
      //@todo: lấy thông tin user từ token
//      DefaultOidcUser loginUser = (DefaultOidcUser) authentication.getPrincipal();
//      UserSearchResponse userInfo = userSearchService.findByEmail(UserSearchRequest.builder().email(loginUser.getEmail()).build());
      Service service = request.toServiceBuilder().createdBy("NguyetHTM").build();
      serviceRepository.create(service);
      return ServiceCreateResponse.of(service);
    } catch (Exception e) {
      log.error("ServiceCreateService execute error: ", e);
      throw e;
    }
  }
}
