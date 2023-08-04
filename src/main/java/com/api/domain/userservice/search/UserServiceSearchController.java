package com.api.domain.userservice.search;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * RequestSearchController
 *
 * @author NguyetHTM
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/requests")
public class UserServiceSearchController {

  private final UserServiceSearchService requestSearchService;

  /**
   * @param userId long
   * @param serviceId long
   * @param status int
   * @param pageIndex int
   * @param pageSize int
   * @return List<RequestSearchResponse>
   */
  @GetMapping
  public ResponseEntity<List<UserServiceSearchResponse>> search(
      @RequestParam long userId,
      @RequestParam long serviceId,
      @RequestParam int status,
      @RequestParam(defaultValue = "0") int pageIndex,
      @RequestParam(defaultValue = "10") int pageSize) {

    return ResponseEntity.ok(
        requestSearchService.execute(
            UserServiceSearchRequest.builder()
                .userId(userId)
                .serviceId(serviceId)
                .status(status)
                .limit(pageSize < 1 ? 10: pageSize)
                .offset(pageIndex < 0 ? 1 : pageIndex)
                .build()));
  }
}
