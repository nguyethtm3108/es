package com.api.domain.userservice.service;

import java.util.List;

public interface Search<S, T> {
  List<T> list(S request);
}
