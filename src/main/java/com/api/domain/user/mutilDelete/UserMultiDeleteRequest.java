package com.api.domain.user.mutilDelete;

import com.api.domain.entity.User;
import java.util.List;
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
public class UserMultiDeleteRequest {

  private List<Long> ids;

  public User.UserBuilder toUserBuilder() {
    return User.builder();
  }
}
