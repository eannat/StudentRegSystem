/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegSystemPackage;



/**
 *
 * @author Eannat
 */
public class Student {
    
	// initialising variables
	public String name, age, grade, id, DOB;
        
	        
	// constructor with parameters for student data
	public Student(String Nname, String Aage, String Ggrade, String Iid, String DDOB ) {
		this.name = Nname;
		this.age = Aage;
		this.id = Iid;
                this.grade = Ggrade;
                this.DOB = DDOB;
                
                
	}
	
        public String getusername() {
        return name + age;
        }
        
	public String getname() {
        return name;
    }
	public String getage() {
        return age;
    }
	
        public String getgrade() {
        return grade;
    }
        
	public String getid() {
        return id;
    }
	
        public String getDOB() {
        return DOB;
    }

    @Override
    public String toString() {
        return "Student{" + "username=" + getusername() + ", name=" + name + ", age=" + age + ", grade=" + grade + ", id=" + id + ", DOB=" + DOB + '}';
    }
        
	     
    }

