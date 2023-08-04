package com.api.domain.userservice.search;

import com.api.domain.entity.UserService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserServiceSearchResponse {

  private long id;
  private String userName;
  private String serviceName;
  private int quantity;
  private int status;

  public static UserServiceSearchResponse of(UserService userService) {
    return UserServiceSearchResponse.builder()
        .id(userService.getId())
        .quantity(userService.getQuantity())
        .status(userService.getStatus())
        .build();
  }
}
