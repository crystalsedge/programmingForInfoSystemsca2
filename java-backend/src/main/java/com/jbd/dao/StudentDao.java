package com.jbd.dao;

import java.util.List;

import com.jbd.entity.Student;
import com.jbd.exception.StudentManagementSystemException;

public interface StudentDao {

	List<Student> getAllStudents() throws StudentManagementSystemException;

	Student getStudentById(int id) throws StudentManagementSystemException;

	boolean deleteStudentById(Integer id) throws StudentManagementSystemException;

	boolean insertEmployee(Student student) throws StudentManagementSystemException;

}
