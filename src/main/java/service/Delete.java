package service;

public interface Delete<S, T> {
  T execute(S request);
}
