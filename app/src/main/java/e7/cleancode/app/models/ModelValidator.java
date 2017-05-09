package e7.cleancode.app.models;

import java.util.List;
import java.util.Objects;

public class ModelValidator {
    public boolean isNull(List<?> args) {
        return args.stream().filter(Objects::isNull).count()>0;
    }

    public boolean isEmpty(List<String> strings) {
        return strings.stream().filter(String::isEmpty).count()>0;
    }
}
