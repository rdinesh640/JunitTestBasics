package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class CollegeTest {

    Teacher teacher = Mockito.mock(Teacher.class);  // Creating a new mock object of Teacher class. *Note: Mockito is a class; and mock is a method; containing parameter Teacher.class. Works with the when-then statements below
    Student student = Mockito.mock(Student.class);  // Creating a new mock object of Student class. *Note: Mockito is a class; and mock is a method; containing parameter Student.class. Works with the when-then statements below

    College college;

    @Before  // This Before method will be run before each @Test is run to avoid creating new object of class Employee within each @Test
    public void setUp() {
        college = new College(student, teacher);  // created object for College class

    }

    @Test
    public void testFindStudentAndTeachers() {
        String res = college.findStudentAndTeachers(12345, "Abby");  // calling findStudentAndTeachers() method from College class. college is the object reference for College class.
                                                                                  // When I ctrl + click findStudentAndTeachers, then I can see the parameters to enter in the ()
        Assert.assertEquals("no student found", res);

    }

    @Test
    public void testFindStudentAndTeachers2() {
        when(student.findStudentAndTeacher(123)).thenReturn("Dinesh");  // Works with the mock statements above Line 14
        when(teacher.findTeacher1()).thenReturn("Lisa");  // Works with the mock statements above Line 13
        String res = college.findStudentAndTeachers(145673, "Abby");  // calling findStudentAndTeachers() method from College class. college is the object reference for College class.
        Assert.assertNotNull(res);

    }

    @Test
    public void testFindStudentAndTeachers3() {
        String res = college.findStudentAndTeachers(12345, null);
        Assert.assertEquals("name is null", res);
    }

    @Test
    public void testFindStudentAndTeachers4() {
        String res = college.findCollege();  // calling findCollege() method from College class. college is the object reference for College class.
        Assert.assertEquals("Griffith", res);
    }
}
