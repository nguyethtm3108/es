package com.api.domain.service.search;

import com.api.domain.entity.Service;
import com.api.domain.repository.ServiceRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.RowBounds;
import service.Search;

/**
 * ServiceSearchService
 *
 * @author NguyetHTM
 */
@Slf4j
@RequiredArgsConstructor
public class ServiceSearchService implements Search<ServiceSearchRequest, ServiceSearchResponse> {

  private final ServiceRepository serviceRepository;

  /**
   * @param request ServiceSearchRequest
   * @return List<ServiceSearchResponse>
   */
  @Override
  public List<ServiceSearchResponse> execute(ServiceSearchRequest request) {
    try {
      RowBounds rowBounds = new RowBounds(request.getOffset(), request.getLimit());
      List<Service> serviceList = serviceRepository.search(request, rowBounds);
      return serviceList.stream().map(ServiceSearchResponse::of).toList();
    } catch (Exception e) {
      log.error("ServiceSearchService list error: ", e);
      throw e;
    }
  }
}
