package com.api.domain.repository;

import com.api.domain.entity.Service;
import com.api.domain.entity.UserService;
import com.api.domain.service.search.ServiceSearchRequest;
import com.api.domain.userservice.search.UserServiceSearchRequest;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface UserServiceRepository {

//  List<Service> findAll();

  Long create(UserService userService);

  UserService findById(long id);

//  Long delete(long id);

  Long approve(UserService service, long id);

//  Long update(Service service, long id);

//  Long softDelete(Service service, List<Long> ids);

  List<UserService> search(UserServiceSearchRequest request, RowBounds rowBounds);

}
