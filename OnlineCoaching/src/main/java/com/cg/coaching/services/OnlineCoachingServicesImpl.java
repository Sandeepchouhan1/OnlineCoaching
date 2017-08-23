package com.cg.coaching.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.coaching.beans.Course;
import com.cg.coaching.beans.Student;
import com.cg.coaching.dao.OnlineCoachingDao;
import com.cg.coaching.exceptions.OnlineCoachingServerDownException;
import com.cg.coaching.exceptions.StudentDetailsNotFoundException;

@Service("services")
@Transactional
public class OnlineCoachingServicesImpl implements OnlineCoachingServices {

	@Autowired
	OnlineCoachingDao dao;

	@Override
	public Student acceptStudentDetails(Student student) {
		return dao.insertStudentDetails(student);
	}

	@Override
	public List<Course> showCourses() {
		return dao.showCourses();
	}

	@Override
	public Course addCourse(Course course) {

		return dao.insertCourse(course);
	}

	@Override
	public Student authenticateStudent(Student student) throws StudentDetailsNotFoundException, OnlineCoachingServerDownException {
		if(student != null) {
			if(dao.getStudentDetail(student) !=null)
				return dao.getStudentDetail(student);
			else
				throw new StudentDetailsNotFoundException("Username or Password Incorrect");
		}else
				throw new OnlineCoachingServerDownException("Server Down");
	}

	@Override
	public List<Student> showAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course getCourseDetails(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentDetail(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
