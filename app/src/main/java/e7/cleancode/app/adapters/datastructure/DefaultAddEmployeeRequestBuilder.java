package e7.cleancode.app.adapters.datastructure;

import e7.cleancode.app.datastructures.AddEmployeeRequest;

public interface DefaultAddEmployeeRequestBuilder<R extends AddEmployeeRequest> extends RequestBuilder {
    @Override
    R build();

    public DefaultAddEmployeeRequestBuilder<?> withId(long id);
    public DefaultAddEmployeeRequestBuilder<?> withName(String name);
}
