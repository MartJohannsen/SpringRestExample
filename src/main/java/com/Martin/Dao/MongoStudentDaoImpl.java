package com.Martin.Dao;

import com.Martin.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImpl implements StudentDao
{

    @Override
    public Collection<Student> getAllStudents()
    {
        return new ArrayList<Student>(){
            {
                add(new Student(1, "Mario", "Comp Science"));
            }

        };
    }

    @Override
    public Student getStudentById(int id)
    {
        return null;
    }

    @Override
    public void removeStudentById(int id)
    {

    }

    @Override
    public void updateStudent(Student student)
    {

    }

    @Override
    public void insertStudentToDB(Student student)
    {

    }
}
