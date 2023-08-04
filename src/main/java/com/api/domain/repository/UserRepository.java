package com.api.domain.repository;

import com.api.domain.entity.User;
import com.api.domain.user.search.UserSearchRequest;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface UserRepository {

  List<User> findAll();

  Long create(User user);

  Long delete(long id);

  Long softDelete(User user, List<Long> ids);

  List<User> search(UserSearchRequest request, RowBounds rowBounds);
}
