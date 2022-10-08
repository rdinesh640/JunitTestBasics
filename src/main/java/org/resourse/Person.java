package org.resourse;

import org.service.ServicePerson;

public class Person {

    ServicePerson servicePerson;

    public Person(ServicePerson servicePerson) {
        this.servicePerson = servicePerson;
    }

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
                String res = servicePerson.personId();
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
