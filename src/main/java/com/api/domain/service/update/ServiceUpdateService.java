package com.api.domain.service.update;

import com.api.domain.entity.Service;
import com.api.domain.repository.ServiceRepository;
import java.time.OffsetDateTime;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import service.Update;

/**
 * ServiceUpdateService
 *
 * @author NguyetHTM1
 */
@Slf4j
@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class ServiceUpdateService implements Update<ServiceUpdateRequest, ServiceUpdateResponse> {

  private final ServiceRepository serviceRepository;

  /**
   * @param request ServiceUpdateRequest
   * @return ServiceUpdateResponse
   */
  @Override
  public ServiceUpdateResponse execute(ServiceUpdateRequest request, Long id) {
    try {
      Service service = request.toServiceBuilder().updatedAt(OffsetDateTime.now()).updatedBy("NguyetHTM1").build();
      serviceRepository.update(service, id);
      return ServiceUpdateResponse.of(service);
    } catch (Exception e) {
      log.error("ServiceUpdateService execute error: ", e);
      throw e;
    }
  }
}
