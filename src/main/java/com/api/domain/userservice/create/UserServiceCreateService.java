package com.api.domain.userservice.create;

import com.api.domain.entity.UserService;
import com.api.domain.repository.UserServiceRepository;
import com.api.domain.user.search.UserSearchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.Create;

/**
 * RequestCreateService
 *
 * @author NguyetHTM
 */
@Slf4j
@Transactional
@RequiredArgsConstructor
@Service
public class UserServiceCreateService implements Create<UserServiceCreateRequest, UserServiceCreateResponse> {

  private final UserServiceRepository requestRepository;
  private final UserSearchService userSearchService;

  /**
   * @param authentication Authentication
   * @param request RequestCreateRequest
   * @return RequestCreateResponse
   */
  @Override
  public UserServiceCreateResponse execute(Authentication authentication, UserServiceCreateRequest request) {
    try {
      //@todo: lấy thông tin user từ token
//      DefaultOidcUser loginUser = (DefaultOidcUser) authentication.getPrincipal();
//      UserSearchResponse userInfo = userSearchService.findByEmail(UserSearchRequest.builder().email(loginUser.getEmail()).build());
      UserService requestObj =
          request
              .toUserServiceBuilder()
              .createdBy("NguyetHTM")
              .build();
      return UserServiceCreateResponse.of(requestRepository.create(requestObj));
    } catch (Exception e) {
      log.error("UserServiceCreateService execute error: ", e);
      throw e;
    }
  }
}
