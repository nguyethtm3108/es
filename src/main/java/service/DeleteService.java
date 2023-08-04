package service;

public interface DeleteService<S, T> {
  T execute(S request);
}
