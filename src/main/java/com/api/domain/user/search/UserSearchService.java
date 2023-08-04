package com.api.domain.user.search;

import com.api.domain.entity.User;
import com.api.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.RowBounds;
import service.SearchService;
import java.util.List;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class UserSearchService implements SearchService<UserSearchRequest, UserSearchResponse> {

  private final UserRepository userRepository;

  @Override
  public List<UserSearchResponse> execute(UserSearchRequest request) {
    List<User> listUser;
    RowBounds rowBounds = new RowBounds(request.getPage() < 1 ? 1 : request.getPage() - 1 , request.getSize());
    listUser = userRepository.search(request, rowBounds);
    return listUser.stream().map(UserSearchResponse::of).toList();
  }
}
