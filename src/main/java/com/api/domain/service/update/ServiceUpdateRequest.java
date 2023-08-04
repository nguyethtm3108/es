package com.api.domain.service.update;

//import com.springboot.demo.mockproject.core.entity.Service;
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
public class ServiceUpdateRequest {

  private long id;
  private String name;
  private String description;

  /**
   * Service builder convert.
   */
  public Service.ServiceBuilder toServiceBuilder() {
    return Service.builder().name(this.name).description(this.description);
  }
}
