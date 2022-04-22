package com.zensar.bean;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="skills")
public class Skill {
@Id
String skillName;
int skillLevel;
public Skill(String skillName, int skillLevel) {
super();
this.skillName = skillName;
this.skillLevel = skillLevel;
}
public Skill() {
super();
}
public String getSkillName() {
return skillName;
}
public void setSkillName(String skillName) {
this.skillName = skillName;
}
public int getSkillLevel() {
return skillLevel;
}
public void setSkillLevel(int skillLevel) {
this.skillLevel = skillLevel;
}
@Override
public String toString() {
return "Skill [skillName=" + skillName + ", skillLevel=" + skillLevel + "]";
}

}