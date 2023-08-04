package com.api.domain.userservice.search;

import com.api.domain.entity.UserService;
import com.api.domain.repository.UserServiceRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import service.Search;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceSearchService implements Search<UserServiceSearchRequest, UserServiceSearchResponse> {

  private final UserServiceRepository userServiceRepository;
  @Override
  public List<UserServiceSearchResponse> execute(UserServiceSearchRequest request) {
    RowBounds rowBounds = new RowBounds(request.getOffset(), request.getLimit());
    List<UserService> listRequest = userServiceRepository.search(request, rowBounds);
    return listRequest.stream().map(UserServiceSearchResponse::of).toList();
  }
}
