package com.api.domain.user.mutilDelete;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserMultiDeleteResponse {

  private String message;
  public static UserMultiDeleteResponse response () {
    return UserMultiDeleteResponse.builder()
        .message("Delete success")
        .build();
  }
}
