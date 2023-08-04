package com.api.domain.userservice.create;

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
public class UserServiceCreateResponse {

  private long total;

  public static UserServiceCreateResponse of(long total) {
    return UserServiceCreateResponse.builder().total(total).build();
  }
}
