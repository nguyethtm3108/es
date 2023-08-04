package com.api.domain.service.create;

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
public class ServiceCreateRequest {

  private String name;
  private String description;

  public Service.ServiceBuilder toServiceBuilder() {
    return Service.builder().name(this.name).description(this.description);
  }
}
