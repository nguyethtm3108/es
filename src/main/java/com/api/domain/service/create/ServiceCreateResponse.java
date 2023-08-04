package com.api.domain.service.create;

import com.api.domain.entity.Service;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
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
public class ServiceCreateResponse {

  private long id;
  private String name;
  private String description;
  private OffsetDateTime createdAt;
  private String createdBy;

  public static ServiceCreateResponse of(Service service) {
    return ServiceCreateResponse.builder()
        .id(service.getId())
        .name(service.getName())
        .description(service.getDescription())
        .createdAt(service.getCreatedAt())
        .createdBy(service.getCreatedBy())
        .build();
  }
}
