package com.api.domain.user.search;

import java.util.List;
import jakarta.annotation.Nullable;
import lombok.Builder.Default;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserSearchController {

  private final UserSearchService userSearchService;

  @GetMapping
  public ResponseEntity<List<UserSearchResponse>> search(
      @RequestParam @Nullable String account,
      @RequestParam(defaultValue = "1") Integer page,
      @RequestParam(defaultValue = "20")  Integer size) {
    UserSearchRequest request = new UserSearchRequest(account, page, size);
    return ResponseEntity.ok(userSearchService.list(request));
  }
}
