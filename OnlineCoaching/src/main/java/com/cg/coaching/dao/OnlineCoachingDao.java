package com.cg.coaching.dao;

import java.util.List;

import com.cg.coaching.beans.Course;
import com.cg.coaching.beans.Student;

public interface OnlineCoachingDao {

	public Student insertStudentDetails(Student student);
	public List<Course> showCourses();
	public Course insertCourse(Course course);
	public Student getStudentDetail(Student student);
}
