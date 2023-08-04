package com.api.domain.user.search;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserPaginationSearchResponse {

  private List<UserSearchResponse> items;
  private int page;
  private int size;

  public static UserPaginationSearchResponse of(
      List<UserSearchResponse> items, Integer currentPage, Integer pageSize) {
    return UserPaginationSearchResponse.builder()
        .items(items)
        .page(currentPage)
        .size(pageSize)
        .build();
  }


}
