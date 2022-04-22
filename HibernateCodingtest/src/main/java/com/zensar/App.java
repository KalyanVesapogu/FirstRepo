package com.zensar;



import java.util.ArrayList;
import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



import com.zensar.bean.Address;
import com.zensar.bean.BankAccount;
import com.zensar.bean.Employee;
import com.zensar.bean.Skill;



public class App {
public static void loadTesting() {
//write code here to load employee object
EntityManagerFactory emf=Persistence.createEntityManagerFactory("CT");
EntityManager em=emf.createEntityManager();
//em.getTransaction().begin();
Employee employee=null;
employee=em.find(Employee.class, 1);
System.out.println(employee);
em.close();
emf.close();
}
public static void insertTesting() {
//write code here to persist employee object
Employee employee = new Employee(5, "Kalyan", 25000.0, null, null, null);
Address address=new Address("Ongole", "723228", null);
List<Skill> skill=new ArrayList<Skill>();
skill.add(0, null);
BankAccount account= new BankAccount("12375");
employee.setAddress(address);
employee.setSkillList(skill);
employee.setAccount(account);
address.setEmployee(employee);
EntityManagerFactory emf=Persistence.createEntityManagerFactory("CT");
EntityManager em=emf.createEntityManager();
em.getTransaction().begin();
em.persist(employee);
em.getTransaction().commit();
em.close();
emf.close();
}
public static void main(String[] args) {
insertTesting();
}
}