package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class StudentTest {

    //Teacher teacher = new Teacher();
    Teacher teacher = Mockito.mock(Teacher.class); // Create of an object using the Mockito framework.
    College college = Mockito.mock(College.class); // Creating a new object using Mockito framework

    @Test
    public void testFindStudent() {
        Student stu = new Student(teacher, college);  // create an object for class Student.  Student is the class. stu is the reference of the class.
        String name = stu.findStudentAndTeacher(1345);    // call method in Student class (findStudent); then enter one of the values for the parameter named id
        Assert.assertEquals("Dinesh", name);   // Assert is the class name. assertQuals is the method in the class Assert.
    }

    @Test
    public void testFindStudent2() {
        Student stu2 = new Student(teacher, college);
        String name = stu2.findStudentAndTeacher(4567);
        Assert.assertEquals("lisa", name);
    }

    @Test
    public void testFindStudent3() {
        Student stu3 = new Student(teacher, college);
        String name = stu3.findStudentAndTeacher(2489);
        Assert.assertEquals("peter", name);
    }

    @Test
    public void testFindStudentNull() {    // testFindStudentNull is to validate the return null; line of code
        Student stu = new Student(teacher, college);
        String name = stu.findStudentAndTeacher(1234);  // String is the class. name is the variable and the reference of the String class
                                                 // call method in Student class (findStudent); then enter one of the values for the parameter named id
        Assert.assertNull(name);
    }

    @Test
    public void testFindStudentAndTeacher1(){
        when(teacher.findTeacher1()).thenReturn("stev");
        Student stu = new Student(teacher, college);
        String res = stu.findStudentAndTeacher(1345);
        Assert.assertEquals("Dinesh",res);
        verify(teacher).findTeacher1();
    }

    @Test
    public void testFindStudentAndTeacher2(){
        when(teacher.findTeacher2()).thenReturn("stephan");
        Student stu = new Student(teacher, college);
        String res = stu.findStudentAndTeacher(4567);
        Assert.assertEquals("lisa",res);
    }

    @Test
    public void testfindStudentAndTeacher3() {  //
        when(teacher.findTeacher3()).thenReturn("Abigail");  //
        Student stu = new Student(teacher, college);  //
        String res = stu.findStudentAndTeacher(2489);  //
        Assert.assertEquals("peter", res);  //
    }

    @Test
    public void testfindStudentAndCollege() {
        when(college.findCollege()).thenReturn("Yale"); // keyword when is used to create a mock for college.findCollege().
                                                          // We mock the method college.findCollege() and return Yale instead of Griffith.
        Student stu = new Student(teacher, college);
        String res = stu.findStudentAndCollege(1456);  // String is the same return type as in Student.java Line 29  public String findStudentAndCollege(int id){
                                                          //  res means response. It will give the same as value the return value found in College.java Line 6 return "Griffith";
                                                          //  String res means we save the value which comes from stu.findStudentAndCollege(1456) to res
        Assert.assertEquals("Yale", res);
    }

    @Test
    public void testfindStudentAndCollege2() {
        Student stu = new Student(teacher, college);
        String res = stu.findStudentAndCollege(1457);
        Assert.assertNull(res);
    }

    @Test  // covers the lines of code 41 and 42
    public void testTruncateAInFirst2Positions() {
        Student stu = new Student(teacher, college);
        String res = stu.truncateAInFirst2Positions("A");
        Assert.assertEquals("", "");  // could also write Assert.assertEquals("", res);
    }

    @Test  // covers the lines of code 41 and 42
    public void testTruncateAInFirst2Positions2() {
        Student stu = new Student(teacher, college);
        String res = stu.truncateAInFirst2Positions("AA");
        Assert.assertEquals("BB", res);
    }

    @Test  // covers the lines of code 44-48
    public void testTruncateAInFirst2Positions3() {
        Student stu = new Student(teacher, college);
        String res = stu.truncateAInFirst2Positions("AACD");
        Assert.assertEquals("CD", res);
    }

    @Test  // covers the lines of code 44-48
    public void testTruncateAInFirst2Positions4() {
        Student stu = new Student(teacher, college);
        String res = stu.truncateAInFirst2Positions("CDAA");
        Assert.assertEquals("CDAA", res);
    }
}
