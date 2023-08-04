package com.api.domain.userservice.create;

import com.api.domain.entity.UserService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author nguyethtm
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserServiceCreateRequest {

  private long serviceId;
  private int quantity;

  public UserService.UserServiceBuilder toUserServiceBuilder() {
    return UserService.builder()
        .serviceId(this.serviceId)
        .quantity(this.quantity);
  }
}
