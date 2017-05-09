package com.cleancode.samples.spock

import spock.Customer
import spock.lang.Specification


class MySecondTest extends Specification {

    def "given customer when passing name as null then should throw exception"() {

        when:
        custoemr = new Customer(null)
        then:
        thrown(Customer.NullNameException)

    }

    def "given customer when passing empty name then should throw exception"() {
        def map = ["key":100]
        print map.get("key")

        def person = new Person()
        person.setName("Mousa")
        person.setAge(1010)
        print person.getName()
        print person.getAge()


        when:
        customer = new Customer("")
        then:
        thrown(Customer.EmptyNameException)
    }


}
