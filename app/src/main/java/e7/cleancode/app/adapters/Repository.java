package e7.cleancode.app.adapters;

public interface Repository<D extends BusinessModel> {
    default D save(D businessModel) {
        throw new RepositoryNotImplementedRuntimeException();
    }

    default D update(D businessModel) {
        throw new RepositoryNotImplementedRuntimeException();
    }

    default void remove(D businessModel) {
    }

    default D getById(long id) {
        throw new RepositoryNotImplementedRuntimeException();
    }

    default void removeById(long id) {

    }

    class RepositoryNotImplementedRuntimeException extends RuntimeException{
    }
}
