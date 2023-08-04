package com.api.domain.userservice.approve;

import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RequestApproveController
 *
 * @author NguyetHTM
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user-service/approve")
public class UserServiceApproveController {

  private final UserServiceApproveService requestApproveService;

  /**
   * approve request service
   *
   * @param requestId long
   * @param authentication Authentication
   */
  @PutMapping("/{requestId}")
  @RolesAllowed("ROLE_ADMIN")
  public ResponseEntity<Object> approve(
      @PathVariable long requestId, Authentication authentication) {
    requestApproveService.execute(requestId, authentication);
    return ResponseEntity.ok(null);
  }
}
