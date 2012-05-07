/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yschool.ymini.arthika.data;

import java.util.Date;

/**
 *
 * @author Lukshy
 */
public class Student {
    
	private String name;
        private String address;
	private int grade;
	private String parentName;

        	
	public Student(){
		
	}
	public Student(String name, String address, int grade, String parentName){
		setName(name);
                setAddress(address);
		setGrade(grade);
		setParentName(parentName);
	}
	public String getName() {
		return name;
	}
        public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
        public void setAddress(String address) {
		this.address = address;
	}
	public int getGrade() {
		return grade;
	}
        public void setGrade(int grade) {
		this.grade = grade;
	}
        public String getParentName() {
		return parentName;
	}
        public void setParentName(String parentName) {
		this.parentName = parentName;
	}
}
