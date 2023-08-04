package com.api.domain.service.update;

import com.api.domain.entity.Service;
import java.time.OffsetDateTime;
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
public class ServiceUpdateResponse {

  private long id;
  private String name;
  private String description;
  private OffsetDateTime updatedAt;
  private String updatedBy;

  public static ServiceUpdateResponse of(Service service) {
    return ServiceUpdateResponse.builder()
        .id(service.getId())
        .name(service.getName())
        .description(service.getDescription())
        .updatedAt(service.getUpdatedAt())
        .updatedBy(service.getUpdatedBy())
        .build();
  }
}
