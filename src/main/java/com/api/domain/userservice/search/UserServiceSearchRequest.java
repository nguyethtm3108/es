package com.api.domain.userservice.search;

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
public class UserServiceSearchRequest {
  private long userId;
  private long serviceId;
  private int status;
  private int limit;
  private int offset;
}
