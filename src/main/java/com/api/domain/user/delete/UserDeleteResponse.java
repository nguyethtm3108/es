package com.api.domain.user.delete;

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
public class UserDeleteResponse {

  private String message;
  public static UserDeleteResponse response () {
    return UserDeleteResponse.builder()
        .message("Delete success")
        .build();
  }
}
