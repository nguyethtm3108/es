package com.api.domain.user.delete;

import com.api.domain.repository.UserRepository;
import service.DeleteOneService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class UserDeleteService implements DeleteOneService<UserDeleteResponse> {

  private final UserRepository userRepository;

  @Override
  public UserDeleteResponse execute(Long id) {
    userRepository.delete(id);
    return UserDeleteResponse.response();
  }
}
