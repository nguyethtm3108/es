package com.api.domain.userservice.create;

import com.api.domain.service.create.ServiceCreateRequest;
import com.api.domain.service.create.ServiceCreateResponse;
import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RequestCreateController
 *
 * @author NguyetHTM
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user-service")
public class UserServiceCreateController {

  private final UserServiceCreateService userServiceCreateService;

  /**
   * @param authentication Authentication
   * @param request RequestCreateRequest
   */
  @PostMapping
  @RolesAllowed({"ROLE_ADMIN", "ROLE_USER"})
  public ResponseEntity<UserServiceCreateResponse> create(Authentication authentication, @RequestBody UserServiceCreateRequest request) {
    return ResponseEntity.ok(userServiceCreateService.execute(authentication, request));
  }


}
