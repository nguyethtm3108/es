package service;

import java.util.List;

public interface Search<S, T> {

  List<T> execute(S request);
}
