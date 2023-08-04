package com.api.domain.user.create;

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
public class UserCreateRequest {

  private String firstName;
  private String lastName;
  private String account;
  private String phone;
  private int gender;
  private String address;

  public User.UserBuilder toUserBuilder() {
    return User.builder()
        .firstName(this.firstName)
        .lastName(this.lastName)
        .account(this.account)
        .gender(this.gender)
        .phone(this.phone)
        .address(this.address);
  }
}
