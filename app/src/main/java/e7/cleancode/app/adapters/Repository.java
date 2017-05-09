package e7.cleancode.app.adapters;

import java.util.ArrayList;
import java.util.List;

public interface Repository<D extends BusinessModel> {
    default D save(D businessModel) {
        throw new RepositoryNotImplementedRuntimeException();
    }

    default D update(D businessModel) {
        throw new RepositoryNotImplementedRuntimeException();
    }

    default void remove(D businessModel) {
    }

    default D findById(long id) {
        throw new RepositoryNotImplementedRuntimeException();
    }

    default void removeById(long id) {

    }

    default List<D> findAll(){
        return new ArrayList<D>();
    }

    class RepositoryNotImplementedRuntimeException extends RuntimeException{
    }
}
