package org.resourse;

import org.service.ServicePerson;

public class Person {

    ServicePerson servicePerson;  // In order to make the connection between Person.java and ServicePerson.java,
                                  // we are declaring the variable servicePerson

    public Person(ServicePerson servicePerson) {
        this.servicePerson = servicePerson;
    }
    // This is a constructor method; which is used here to carry the objects from PersonTest.java to Person.java
    // The Person class has the parameters ServicePerson servicePerson; where servicePerson is the reference of ServicePerson class; and
    // servicePerson on Line 10 is the same reference as on Line 11 (after the = sign)
    // this.servicePerson on Line 11 is the same as the reference servicePerson on Line 7. (Click on servicePerson to see which match is highlighted.
    // In order to get an object from PersonTest class, we do mocking of ServicePerson class
    // Mocking is used to create a connection between person class and ServicePerson class
    // After all this setting up, then we can write the mocking test case

    public String findPersonId(String name){
        if (name == "lisa"){
            return "9832";
        }
        else{
            return "6732";
        }
    }

    public String findPersonIds(String name){
        try {
            name.length();  // When name=null (If in the test we use null), then this line will cause a NullPointerException
                            // So code will skip over the if-else statements, and go straight to the catch block; and throw the exception
            if (name == "lisa") {
                return "9832";
            }
            else{
                return "6732";
            }
        }
        catch (Exception e) {
            throw e;
        }
    }

    public String findPersonFromServiceClass(String name){
        try {
            name.length();  // When name=null (If in the test we use null), then this line will cause a NullPointerException
            // So code will skip over the if-else statements, and go straight to the catch block; and throw the exception
            if (name == "lisa") {
                String res = servicePerson.personId();  // We mock in order to avoid using the actual values ("9832") in ServicePerson.java class; and
                                                        // In order to mock ServicePerson.java class,
                                                        // we are making a connection between Person.java and ServicePerson.java
                                                        // Here servicePerson is the reference of the class ServicePerson.java
                                                        // Here personId() is the method in the ServicePerson.java class
                return res;
            }
            else{
                return "6732";
            }
        }
        catch (Exception e) {
            throw e;
        }
    }
}
