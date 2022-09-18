package org.example;

public class Junit {

    private Object NullPointerException;

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public Boolean addIfElse(int a, int b) {
        if (a > 1) {
            return true;
        } else {
            return false;
        }
    }

    public int subIfElse(int a, int b) {
        if (a > 1) {
            return a - b;
        } else {
            return a - b + a;
        }
    }

    public Boolean nestedIfCondition(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public int mul(int a, int b) {
        return a * b;
    }


    public String nameOfPerson(String name, String id){
        if(name == "Dinesh"){
            return  id; //1
        }
        if(name == "Lisa"){
            return id;//2
        }
        if(name == "Peter"){
            return id;//3
        }
        return "no name matched";
    }

    public void findUser(String name) throws Exception { // throws Exception will be used when we thow excpetion to the method.
        try{
            System.out.println(name.toString());// prints the name of the person
        }
        catch(NullPointerException e){
            throw new NullPointerException("Exception message");
        }
    }

    public String checkException(String name) throws Exception { // throws Exception will be used when we thow excpetion to the method.
        try{
            return name.toString();
        }
        catch(NullPointerException e){
            throw new NullPointerException("Exception message");
        }
    }
}
