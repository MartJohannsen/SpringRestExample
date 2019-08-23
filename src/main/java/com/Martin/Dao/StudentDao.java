package com.Martin.Dao;

import com.Martin.Entity.Student;

import java.util.Collection;

public interface StudentDao
{
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDB(Student student);
}
