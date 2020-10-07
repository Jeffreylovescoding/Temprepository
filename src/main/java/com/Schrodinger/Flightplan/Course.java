package com.Schrodinger.Flightplan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courseInfo")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String subject;
	
	
	private String title;
	private float credit;
	private String level;
	
	public Course() { }
	
	public Course(String subject, String title, float credit, String level)
	{
		this.setSubject(subject);
		this.setTitle(title);
		this.setCredit(credit);
		this.setLevel(level);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	@Override
	public String toString() {
		return "Course{subject=" + subject + ", title=" + title + 
				", credit=" + credit + ", level=" + level + "}";
	}
	
	
}