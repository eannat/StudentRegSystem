/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import RegSystemPackage.Student;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eannat
 */
public class StudentTest {
    
    public StudentTest() {
    }
     
    @Test
    public void testgetusername(){
        Student student = new Student("eanna","20", "A", "13476428","5/2/1996");
        
        String result = student.getusername();
        
        assertEquals("eanna20", result);
    }
}
