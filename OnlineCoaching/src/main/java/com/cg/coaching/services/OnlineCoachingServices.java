package com.cg.coaching.services;

import java.util.List;

import com.cg.coaching.beans.Course;
import com.cg.coaching.beans.Student;
import com.cg.coaching.exceptions.OnlineCoachingServerDownException;
import com.cg.coaching.exceptions.StudentDetailsNotFoundException;

public interface OnlineCoachingServices {

	public Student authenticateStudent(Student student) throws StudentDetailsNotFoundException,OnlineCoachingServerDownException;
	public Student acceptStudentDetails(Student student);
	public List<Course> showCourses();
	public Course addCourse(Course course);
	public List<Student> showAllStudents();
	public Course getCourseDetails(int courseId);
	public Student getStudentDetail(int studentId);
	
}
