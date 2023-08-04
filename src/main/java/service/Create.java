package service;

import org.springframework.security.core.Authentication;

public interface Create<S, T> {

  T execute(Authentication authentication,S request);
}
