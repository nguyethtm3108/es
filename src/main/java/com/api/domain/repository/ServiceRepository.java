package com.api.domain.repository;

import com.api.domain.entity.Service;
import com.api.domain.entity.User;
import com.api.domain.service.search.ServiceSearchRequest;
import com.api.domain.user.search.UserSearchRequest;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface ServiceRepository {

  List<Service> findAll();

  Long create(Service service);

  Long delete(long id);

  Long approve(Service service, long id);

  Long update(Service service, long id);

  Long softDelete(Service service, List<Long> ids);

  List<Service> search(ServiceSearchRequest request, RowBounds rowBounds);

}
