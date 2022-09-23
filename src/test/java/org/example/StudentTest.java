package org.example;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testFindStudent() {
        Student stu = new Student();  // create an object for class Student.  Student is the class. stu is the reference of the class.
        String name = stu.findStudent(1345);    // call method in Student class (findStudent); then enter one of the values for the parameter named id
        Assert.assertEquals("Dinesh", name);   // Assert is the class name. assertQuals is the method in the class Assert.
    }

    @Test
    public void testFindStudent2() {
        Student stu2 = new Student();
        String name = stu2.findStudent(4567);
        Assert.assertEquals("lisa", name);
    }

    @Test
    public void testFindStudent3() {
        Student stu3 = new Student();
        String name = stu3.findStudent(2489);
        Assert.assertEquals("peter", name);
    }

    @Test
    public void testFindStudentNull() {    // testFindStudentNull is to validate the return null; line of code
        Student stu = new Student();
        String name = stu.findStudent(1234);  // String is the class. name is the variable and the reference of the String class
                                                 // call method in Student class (findStudent); then enter one of the values for the parameter named id
        Assert.assertNull(name);
    }

}
