package service;

public interface Update<S, T> {
  T execute(S request, Long id);
}
