package org.example;

public class College {

    private Student student;  // saving the object in the student variable; this is the same as declaring the variable student
    private Teacher teacher;  // saving the object in the teacher variable; this is the same as declaring the variable teacher
    private int id = 145673;
    private String person = "Dinesh";// assigning a value to the variable id  which is of type int. The value being assigned is 145673.

    public College(Student student, Teacher teacher) {   // constructor method does not creat new objects; but getting/carrying the object references to the constructor
        this.student = student;  // this.student is the same as on Line 5
        this.teacher = teacher;  // this.teacher is the same as on Line 6
    }

    public String findCollege(){
        return "Griffith";   // "Griffith" is the response (res) we will receive when we call the findCollege() method in Student.java
                             // It is the college.findCollege(); method that we are calling from Student.java
    }
    public String findStudentAndTeachers(int personId, String name){
        if (name !=null){
            if(personId ==id){
                String studentName = student.findStudentAndTeacher(id);
                String teacherName = teacher.findTeacher1();
                return studentName +" "+ teacherName;
            }
            else{
                return "no student found";
            }
        }
        return "name is null";
    }
}
