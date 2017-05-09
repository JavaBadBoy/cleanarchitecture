package e7.cleancode.app.datastructures;


public class AddEmployeeResponseBuilder {

    private final AddEmployeeResponse response = new AddEmployeeResponse();

    public AddEmployeeResponse build() {
        return response;
    }

    public AddEmployeeResponseBuilder withId(long id) {
       response.id=id;
        return this;
    }

    public AddEmployeeResponseBuilder withName(String name) {
        response.name=name;
        return this;
    }
}
