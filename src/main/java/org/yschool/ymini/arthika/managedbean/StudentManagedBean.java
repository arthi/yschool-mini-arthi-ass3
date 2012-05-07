/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yschool.ymini.arthika.managedbean;

import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.yschool.ymini.arthika.data.Student;
import org.yschool.ymini.arthika.data.StudentDb;

@ManagedBean(name = "StudentManagedBean")
@RequestScoped
public class StudentManagedBean {

   
    private static final long serialVersionUID = 1L;
    private List<Student> students;
    private Student selectedStudent;
    private String message;
    private Student createStudent;
    public StudentManagedBean() {
                System.out.println("Data Loaded");
        students = StudentDb.getStudents();
        selectedStudent = new Student();
        createStudent=new Student();
    }
    
    public Student getCreateStudent() {
        return createStudent;
    }

    public void setCreateStudent(Student createStudent) {
        this.createStudent = createStudent;
    }

public void search() {
        StudentDb.searchStudent(selectedStudent);
    }

    public void prepareCreate() {
        StudentDb.addStudent(createStudent);
        setSelectedStudent(createStudent);        
        System.out.println("Successfully added!!");
         FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Student is successfully inserted.", null));
    }        
    
   
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getSelectedStudent() {
        return selectedStudent;
    }

    public void setSelectedStudent(Student selectedStudent) {
        this.selectedStudent = selectedStudent;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
