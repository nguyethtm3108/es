package com.api.domain.user.mutilDelete;

import com.api.domain.entity.User;
import com.api.domain.repository.UserRepository;
import java.time.OffsetDateTime;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class UserMultiDeleteService {
  private final UserRepository userRepository;

  public UserMultiDeleteResponse execute(
      UserMultiDeleteRequest request) {
    User user =
        request
            .toUserBuilder()
            .deletedAt(OffsetDateTime.now())
            .build();
    userRepository.softDelete(user, request.getIds());
    return UserMultiDeleteResponse.response();
  }
}
