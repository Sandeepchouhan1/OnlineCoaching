package com.cg.coaching.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int courseId;
	private String courseName;
	private String courseType;
	private String courseDuration;
	private String startDate;
	private String endDate;
	private String maxSeats;
	private double fees;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Student> students=new ArrayList<Student>();
	
	
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getMaxSeats() {
		return maxSeats;
	}
	public void setMaxSeats(String maxSeats) {
		this.maxSeats = maxSeats;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseDuration == null) ? 0 : courseDuration.hashCode());
		result = prime * result + courseId;
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result + ((courseType == null) ? 0 : courseType.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(fees);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((maxSeats == null) ? 0 : maxSeats.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((students == null) ? 0 : students.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (courseDuration == null) {
			if (other.courseDuration != null)
				return false;
		} else if (!courseDuration.equals(other.courseDuration))
			return false;
		if (courseId != other.courseId)
			return false;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		if (courseType == null) {
			if (other.courseType != null)
				return false;
		} else if (!courseType.equals(other.courseType))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (Double.doubleToLongBits(fees) != Double.doubleToLongBits(other.fees))
			return false;
		if (maxSeats == null) {
			if (other.maxSeats != null)
				return false;
		} else if (!maxSeats.equals(other.maxSeats))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (students == null) {
			if (other.students != null)
				return false;
		} else if (!students.equals(other.students))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseType=" + courseType
				+ ", courseDuration=" + courseDuration + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", maxSeats=" + maxSeats + ", fees=" + fees + ", students=" + students + "]";
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String courseName, String courseType, String courseDuration, String startDate, String endDate,
			String maxSeats, double fees) {
		super();
		this.courseName = courseName;
		this.courseType = courseType;
		this.courseDuration = courseDuration;
		this.startDate = startDate;
		this.endDate = endDate;
		this.maxSeats = maxSeats;
		this.fees = fees;
	}
	public Course(int courseId, String courseName, String courseType, String courseDuration, String startDate,
			String endDate, String maxSeats, double fees, List<Student> students) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseType = courseType;
		this.courseDuration = courseDuration;
		this.startDate = startDate;
		this.endDate = endDate;
		this.maxSeats = maxSeats;
		this.fees = fees;
		this.students = students;
	}
	
	
}
