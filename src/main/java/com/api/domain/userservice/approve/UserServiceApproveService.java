package com.api.domain.userservice.approve;

import com.api.domain.entity.UserService;
import com.api.domain.repository.UserServiceRepository;
import java.time.OffsetDateTime;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.transaction.annotation.Transactional;

/**
 * RequestApproveService
 *
 * @author NguyetHTM
 */
@Slf4j
@Transactional
@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class UserServiceApproveService {

  private final UserServiceRepository userServiceRepository;

  /**
   * @param id long
   * @param authentication Authentication
   */
  public void execute(long id, Authentication authentication) {
    try {
      UserService userService = userServiceRepository.findById(id);
      userService.setUpdatedAt(OffsetDateTime.now());

      int status = userService.getStatus() == 1 ? 0 : 1;
      userService.setStatus(status);

      //@todo: get thong tin user dang nhap
//      DefaultOidcUser loginUser = (DefaultOidcUser) authentication.getPrincipal();
//      request.setUpdatedBy(loginUser.getEmail());

      userServiceRepository.approve(userService, id);
    } catch (Exception e) {
      log.error("RequestApproveService execute error: ", e);
      throw e;
    }
  }
}
