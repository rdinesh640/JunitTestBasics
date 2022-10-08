package org.resourse;

public class Person {

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
            if (name == "lisa") {
                name.length();
                return "9832";
            }
            else{
                return "6732";
            }
        }
        catch (NullPointerException e){
            return "6762";
        }
    }
}
