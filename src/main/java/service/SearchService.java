package service;

import java.util.List;

public interface SearchService<S, T> {

  List<T> execute(S request);
}
