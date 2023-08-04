package com.api.domain.service.delete;

import com.api.domain.entity.Service;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Updated by nguyethtm
 * Date: 02/08/2023
 * Time: 06:24
 * */

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ServiceDeleteRequest {
  private List<Long> ids;

  public Service.ServiceBuilder toServiceBuilder() {
    return Service.builder();
  }
}
