package service;

public interface CreateService<S, T> {

  T execute(S request);
}
