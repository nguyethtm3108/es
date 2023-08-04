package com.api.domain.service.search;

import com.api.domain.entity.Service;
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
public class ServiceSearchResponse {

  private long id;
  private String name;
  private String description;

  public static ServiceSearchResponse of(Service service) {
    return ServiceSearchResponse.builder()
        .id(service.getId())
        .name(service.getName())
        .description(service.getDescription())
        .build();
  }
}
