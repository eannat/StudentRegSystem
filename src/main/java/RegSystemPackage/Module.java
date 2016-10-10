/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegSystemPackage;

import java.util.ArrayList;

/**
 *
 * @author Eannat
 */
public class Module {
    
   	// initialising variables
	public String name; 
	public String id;
	ArrayList<Student> ListofStudents = new ArrayList<Student>();
        
	
	// constructor with parameters for Module data
	public Module(String Software, String CT417) {
		this.name = Software;
		this.id = CT417;
	}
         
       public String getname() {
            return name;
        }
        public String getid() {
            return id;
        }

    @Override
    public String toString() {
        return "Module{" + "name=" + name + ", id=" + id + " ,ListOfStudents=" + ListofStudents + '}';
    }
       
       
        public void addStudent(Student student){
            ListofStudents.add(student);
        }
        
        

}
