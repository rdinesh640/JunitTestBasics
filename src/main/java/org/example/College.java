package org.example;

public class College {

    private Student student;
    private Teacher teacher;
    private int id = 145673;

    public College(Student student, Teacher teacher) {
        this.student = student;
        this.teacher = teacher;
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
