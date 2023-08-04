package com.api.domain.service.create;

import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ServiceCreateController
 *
 * @author NguyetHTM
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/services")
public class ServiceCreateController {

  private final ServiceCreateService serviceCreateService;

  /**
   * @param request ServiceCreateRequest
   * @return ServiceCreateResponse
   */
  @PostMapping
  @RolesAllowed("ROLE_ADMIN")
  public ResponseEntity<ServiceCreateResponse> create(Authentication authentication, @RequestBody ServiceCreateRequest request) {
    return ResponseEntity.ok(serviceCreateService.execute(authentication, request));
  }
}
