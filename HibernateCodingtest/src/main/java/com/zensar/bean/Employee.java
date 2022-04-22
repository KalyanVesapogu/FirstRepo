package com.zensar.bean;



import java.util.List;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
public class Employee {
@Id
int employeeId;
@Column
String name;
@Column
double basicSalary;
@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
@PrimaryKeyJoinColumn
Address address;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name = "skillName", nullable = false, insertable = false,updatable = false)
List<Skill> skillList;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "bank_id", referencedColumnName = "bankId")
BankAccount account;
public Employee(int employeeId, String name, double basicSalary, Address address, List<Skill> skillList,
BankAccount account) {
super();
this.employeeId = employeeId;
this.name = name;
this.basicSalary = basicSalary;
this.address = address;
this.skillList = skillList;
this.account = account;
}
public Employee(int i, String string, double d, List<Skill> skillList, BankAccount account) {
super();
this.name = i;
this.basicSalary = string;
this.address = d;
this.skillList = skillList;
this.account = account;
}
public Employee(int employeeId) {
super();
this.employeeId = employeeId;
}
public Employee() {
super();
}
public int getEmployeeId() {
return employeeId;
}
public void setEmployeeId(int employeeId) {
this.employeeId = employeeId;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public double getBasicSalary() {
return basicSalary;
}
public void setBasicSalary(double basicSalary) {
this.basicSalary = basicSalary;
}
public Address getAddress() {
return address;
}
public void setAddress(Address address) {
this.address = address;
}
public List<Skill> getSkillList() {
return skillList;
}
public void setSkillList(List<Skill> skillList) {
this.skillList = skillList;
}
public BankAccount getAccount() {
return account;
}
public void setAccount(BankAccount account) {
this.account = account;
}
@Override
public String toString() {
return "Employee [employeeId=" + employeeId + ", name=" + name + ", basicSalary=" + basicSalary + ", address="
+ address + ", skillList=" + skillList + ", account=" + account + "]";
}

}