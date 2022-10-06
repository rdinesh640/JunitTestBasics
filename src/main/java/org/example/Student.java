package org.example;

public class Student {

    Teacher teacher; // Teacher class reference

    College college;

    public Student(Teacher teacher, College college) { // using construter we can provide object of an teacher
        this.teacher = teacher;
        this.college = college;
    }

    public String findStudentAndTeacher(int id){
        if (id == 1345){
            teacher.findTeacher1(); //Mock this line
            return "Dinesh";
        }
        if (id == 4567){
            teacher.findTeacher2();//mocking this line using mockito
            return "lisa";
        }
        if (id ==2489){
            teacher.findTeacher3();
            return "peter";
        }
        return null;
    }

    public String findStudentAndCollege(int id){
        if (id == 1456){
            String clg = college.findCollege();
            return clg;
        }
        else
            return null;
    }

    //AACD ==> CD, ACD =>CD ,CDAA ===>CDAA
    public String truncateAInFirst2Positions(String str) { // truncateAInFirst2Positions MEANS we replace one thing with another; the Char A with empty "";
        try {
            if (str.length() <= 2)
                return str.replaceAll("A", "B");}
        catch(Exception e){
            System.out.println("str is null");
        }
        String first2Chars = str.substring(0, 2);   // (0, 2) refers to the index positions in the string AACD; where 0 is A and 2 is C
        String stringMinusFirst2Chars = str.substring(2);
        return first2Chars.replaceAll("A", "") + stringMinusFirst2Chars;}
}
