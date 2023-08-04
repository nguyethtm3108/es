package com.api.domain.user.delete;

import com.api.domain.user.create.UserCreateRequest;
import com.api.domain.user.create.UserCreateResponse;
import com.api.domain.user.create.UserCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users/{id}")
public class UserDeleteController {

  private final UserDeleteService userDeleteService;

  @DeleteMapping()
  public ResponseEntity<UserDeleteResponse> delete(@PathVariable long id) {
    return ResponseEntity.ok(userDeleteService.execute(id));
  }
}
