package com.api.domain.service.search;

import com.api.domain.user.search.UserSearchRequest;
import java.util.List;
import jakarta.annotation.Nullable;
import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ServiceSearchController
 *
 * @author nguyethtm
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/services")
public class ServiceSearchController {

  private final ServiceSearchService serviceSearchService;

  @GetMapping
  @RolesAllowed({"ROLE_ADMIN", "ROLE_USER"})
  public ResponseEntity<List<ServiceSearchResponse>> search(
      @RequestParam @Nullable String name,
      @RequestParam  @Nullable Integer id,
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "20") int size) {
    ServiceSearchRequest request = new ServiceSearchRequest(id, name, page, size);
    return ResponseEntity.ok(serviceSearchService.execute(request));
  }
}
