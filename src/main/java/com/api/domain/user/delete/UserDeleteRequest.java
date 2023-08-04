package com.api.domain.user.delete;

import com.api.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class UserDeleteRequest {

  private int id;

  public User.UserBuilder toUserBuilder() {
    return User.builder();
  }
}
