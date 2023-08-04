package com.api.domain.user.mutilDelete;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserMultiDeleteController {

  private final UserMultiDeleteService userMultiDeleteService;

  @DeleteMapping()
  public ResponseEntity<UserMultiDeleteResponse> delete(@RequestBody UserMultiDeleteRequest request) {
    return ResponseEntity.ok(userMultiDeleteService.execute(request));
  }
}
