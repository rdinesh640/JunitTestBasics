package org.example;

public class Junit {

    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }
    public Boolean addIfElse(int a, int b){
        if(a>1){
            return true;
        }
        else{
            return false;
        }
    }
    public int subIfElse(int a, int b){
        if(a>1){
            return a-b;
        }
        else{
            return a-b+a;
        }
    }

    public Boolean nestedIfCondition(int a, int b, int c){
        if(a>b){
            if(a>c){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    public int mul(int a, int b){
        return a*b;
    }
}
