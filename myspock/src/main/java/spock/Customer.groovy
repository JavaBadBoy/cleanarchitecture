package spock


class Customer {

    Customer(String name) {
        if(Objects.isNull(name))
            throw new NullNameException("Null name is not allowed.")
        if(name.isEmpty())
            throw new EmptyNameException();
    }

    public class NullNameException extends RuntimeException {

        NullNameException(String message) {
            super(message)
        }
    }

    public class EmptyNameException extends RuntimeException{

    }
}
