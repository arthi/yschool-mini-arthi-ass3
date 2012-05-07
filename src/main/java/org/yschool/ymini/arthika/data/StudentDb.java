/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yschool.ymini.arthika.data;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class StudentDb {
    
    	private final static List<Student> students;
	
	static{
		Student ananthan = new Student("Ananthan", "Jaffna Town",1,"djsv");
		Student tharsan = new Student("Tharsan", "Jaffna Town",2,"dsjd");
		Student sekar = new Student("Sekar","Jaffna Town",3,"dhg");
		Student ramesh = new Student("Ramesh", "Jaffna Town",3,"djgfhk");
		Student raman = new Student("Raman","Jaffna Town",5,"dhwtye");
		Student kannan = new Student("Kannan", "Jaffna Town",7,"iuyyt");
		
		students = new ArrayList<Student>();
		students.add(ananthan);
		students.add(tharsan);
		students.add(sekar);
		students.add(ramesh);
		students.add(raman);
		students.add(kannan);
	}
	
	
	
	public static void addStudent(Student student){
                    Student st=new Student();
                    st.setName(student.getName());            
                    st.setAddress(student.getAddress());
                    st.setGrade(student.getGrade());
                    st.setParentName(student.getParentName());
                    students.add(st);
	}
        
        	public static void searchStudent(Student student){
                for(Student st : students){
                if(st.getName().equals(student.getName())){
                   student.setName(st.getName());            
                   student.setAddress(st.getAddress());
                   student.setGrade(st.getGrade());
                   student.setParentName(st.getParentName());
                }
            }
	}
        
	public static List<Student> getStudents(){
		return students;
	}
    
}
