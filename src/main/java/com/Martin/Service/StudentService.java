package com.Martin.Service;

import com.Martin.Dao.FakeStudentDaoImpl;
import com.Martin.Dao.StudentDao;
import com.Martin.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService
{
    @Autowired
    @Qualifier("mongoData")
    private StudentDao studentDao; //Change to mongoData qualifier, in order to make instant use of it

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id){
        return studentDao.getStudentById(id);
    }

    public void removeStudentById(int id)
    {
        this.studentDao.removeStudentById(id);
    }

    public void updateStudent(Student student){
        this.studentDao.updateStudent(student);
    }

    public void insertStudent(Student student)
    {
        studentDao.insertStudentToDB(student);
    }
}
