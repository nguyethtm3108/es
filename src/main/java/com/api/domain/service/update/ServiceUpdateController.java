package com.api.domain.service.update;

import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ServiceUpdateController
 *
 * @author HieuNC7
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/services")
public class ServiceUpdateController {

  private final ServiceUpdateService serviceUpdateService;

  @PutMapping("/{serviceId}")
  @RolesAllowed("ROLE_ADMIN")
  public ResponseEntity<ServiceUpdateResponse> update(
      @PathVariable long serviceId, @RequestBody ServiceUpdateRequest request) {
    return ResponseEntity.ok(serviceUpdateService.execute(request, serviceId));
  }
}
