package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class StudentTest {

    //Teacher teacher = new Teacher();
    Teacher teacher = Mockito.mock(Teacher.class); // Create of an object usinthe Mockito framework.

    @Test
    public void testFindStudent() {
        Student stu = new Student(teacher);  // create an object for class Student.  Student is the class. stu is the reference of the class.
        String name = stu.findStudentAndTeacher(1345);    // call method in Student class (findStudent); then enter one of the values for the parameter named id
        Assert.assertEquals("Dinesh", name);   // Assert is the class name. assertQuals is the method in the class Assert.
    }

    @Test
    public void testFindStudent2() {
        Student stu2 = new Student(teacher);
        String name = stu2.findStudentAndTeacher(4567);
        Assert.assertEquals("lisa", name);
    }

    @Test
    public void testFindStudent3() {
        Student stu3 = new Student(teacher);
        String name = stu3.findStudentAndTeacher(2489);
        Assert.assertEquals("peter", name);
    }

    @Test
    public void testFindStudentNull() {    // testFindStudentNull is to validate the return null; line of code
        Student stu = new Student(teacher);
        String name = stu.findStudentAndTeacher(1234);  // String is the class. name is the variable and the reference of the String class
                                                 // call method in Student class (findStudent); then enter one of the values for the parameter named id
        Assert.assertNull(name);
    }

    @Test
    public void testFindStudentAndTeacher1(){
        when(teacher.findTeacher1()).thenReturn("stev");
        Student stu = new Student(teacher);
        String res = stu.findStudentAndTeacher(1345);
        Assert.assertEquals("Dinesh",res);
        verify(teacher).findTeacher1();
    }

    @Test
    public void testFindStudentAndTeacher2(){
        when(teacher.findTeacher2()).thenReturn("stephan");
        Student stu = new Student(teacher);
        String res = stu.findStudentAndTeacher(4567);
        Assert.assertEquals("lisa",res);
    }

    @Test
    public void testfindStudentAndTeacher3() {  //
        when(teacher.findTeacher3()).thenReturn("Abigail");  //
        Student stu = new Student(teacher);  //
        String res = stu.findStudentAndTeacher(2489);  //
        Assert.assertEquals("peter", res);  //
    }
}
