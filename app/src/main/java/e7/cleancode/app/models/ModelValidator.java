package e7.cleancode.app.models;

import java.util.List;
import java.util.Objects;

public interface ModelValidator {

    default boolean isNull(List<?> args) {
        return args.stream().filter(Objects::isNull).count()>0;
    }

    default boolean isEmpty(List<String> strings) {
        return strings.stream().filter(String::isEmpty).count()>0;
    }
}
