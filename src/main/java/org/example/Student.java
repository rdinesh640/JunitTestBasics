package org.example;

public class Student {

    Teacher teacher; // Teacher class reference

    College college;

    public Student(Teacher teacher, College college) { // using construter we can provide object of an teacher
        this.teacher = teacher;
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
}
