package com.api.domain.user.create;

import com.api.domain.entity.User;
import com.api.domain.repository.UserRepository;
import service.CreateService;

import java.time.OffsetDateTime;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class UserCreateService implements CreateService<UserCreateRequest, UserCreateResponse> {

  private final UserRepository userRepository;

  @Override
  public UserCreateResponse execute(UserCreateRequest request) {
    User user = request.toUserBuilder().createAt(OffsetDateTime.now()).build();
    userRepository.create(user);
    return UserCreateResponse.of(user);
  }

}
