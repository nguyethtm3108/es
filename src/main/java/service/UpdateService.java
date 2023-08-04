package service;

public interface UpdateService <S, T> {
  T execute(S request);
}
