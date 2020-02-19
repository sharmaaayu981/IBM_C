//package com.demo.inheritance;
//
//class GrandParent{
//	private String firstName;
//	private String middleName;
//	private String lastName;
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getMiddleName() {
//		return middleName;
//	}
//	public void setMiddleName(String middleName) {
//		this.middleName = middleName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	@Override
//	public String toString() {
//		return "GrandParent [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
//	}
//	
//	
//	
//}
//
//class Parent extends GrandParent{
//	private String firstName;
//	private String middleName;
//	private String lastName;
//	
//	public Parent(String firstName) {
//		super();
//		this.firstName = firstName;
//		this.lastName = super.getLastName();
//		this.middleName = super.getFirstName();
//	}
//	@Override
//	public String toString() {
//		return "Parent [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getMiddleName() {
//		return middleName;
//	}
//	public void setMiddleName(String middleName) {
//		this.middleName = middleName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	
//	
//}
//
//class Child extends Parent{
//	private String firstName;
//	private String middleName;
//	private String lastName;
//	
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getMiddleName() {
//		return middleName;
//	}
//	public void setMiddleName(String middleName) {
//		this.middleName = middleName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	@Override
//	public String toString() {
//		return "Child [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
//	}
//	
//}
//
//public class ChildParent {
//
//	public static void main(String[] args) {
//		GrandParent gp = new GrandParent();
//		gp.setFirstName("Mahesh");
//		gp.setMiddleName("Kumar");
//		gp.setLastName("Sharma");
//		
//		Parent p = new Parent("Ramesh");
//		
//	}
//}
