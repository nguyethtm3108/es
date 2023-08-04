package com.api.domain.service.delete;

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
public class ServiceDeleteResponse {

  private String message;
  public static ServiceDeleteResponse response () {
    return ServiceDeleteResponse.builder()
        .message("Delete success")
        .build();
  }
}
