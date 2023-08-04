package com.api.domain.service.delete;

import com.api.domain.entity.Service;
import com.api.domain.repository.ServiceRepository;
import java.time.OffsetDateTime;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import service.Delete;

/**
 * ServiceDeleteService
 *
 * @author NguyetHTM
 */
@Slf4j
@RequiredArgsConstructor
public class ServiceDeleteService {

  private final ServiceRepository serviceRepository;
  public ServiceDeleteResponse execute(ServiceDeleteRequest request) {
    try {
      Service service = request
              .toServiceBuilder()
              .deletedAt(OffsetDateTime.now())
              .build();
      serviceRepository.softDelete(service, request.getIds());
      return ServiceDeleteResponse.response();
    } catch (Exception e) {
      log.error("ServiceDeleteService execute error: ", e);
      throw e;
    }
  }
}
