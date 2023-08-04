package com.api.domain.service.delete;

import java.util.List;
import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ServiceDeleteController
 *
 * @author NguyetHTM
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/services")
public class ServiceDeleteController {

  private final ServiceDeleteService serviceDeleteService;

  /**
   * @param request
   * @return ServiceDeleteResponse
   */
  @DeleteMapping
  @RolesAllowed("ROLE_ADMIN")
  public ResponseEntity<ServiceDeleteResponse> delete(@RequestBody ServiceDeleteRequest request) {
    return ResponseEntity.ok(serviceDeleteService.execute(request));
  }
}
