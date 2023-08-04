package com.api.domain.service.search;

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
public class ServiceSearchRequest {

  private long id;
  private String name;
  private int limit;
  private int offset;
}
