package org.example;

public class Calculator {

    public int add(int a,int b, int c){
        return a+b+c;
    }

    public int sub(int a,int b, int c){
        System.out.println(a-b-c);
        return a-b-c;
    }

    public String mul(String a,int b, int c){
        try {
            return a.toString();  // null.toString()
        }
        catch(Exception e){
            System.out.println(e);
        }
        return a;
    }

}
