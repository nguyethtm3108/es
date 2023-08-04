package com.api.domain.user.create;

import com.api.domain.entity.User;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateResponse {

  private Long id;
  private String firstName;
  private String lastName;
  private String account;
  private String phone;
//  private String username;
  private String address;
  private Integer gender;
  private OffsetDateTime createdAt;

  public static UserCreateResponse of(User user) {
    return UserCreateResponse.builder()
        .id(user.getId())
        .firstName(user.getFirstName())
        .lastName(user.getLastName())
        .account(user.getAccount())
        .phone(user.getPhone())
        .gender(user.getGender())
        .address(user.getAddress())
        .createdAt(user.getCreateAt())
        .build();
  }
}
