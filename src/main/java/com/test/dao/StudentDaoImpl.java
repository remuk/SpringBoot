package com.test.dao;

import com.test.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDaoImpl implements StudentDao {

    private static Map<Integer,Student> students;

    static{

        students = new HashMap<Integer,Student>(){
            {
                put(1, new Student(1,"Reshmi","German"));
                put(2, new Student(2,"Prateek","Hindi"));
                put(3, new Student(3,"Hitha","Kannada"));
                put(4, new Student(4,"Kumud","Computer Science"));
                put(5, new Student(5,"Thanuja","Murex"));

            }

        };
    }

    @Override
    public Collection<Student> getAllStudents()
    {
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id)
    {
        return this.students.get(id);
    }

    @Override
    public void removeStudentById(int id)
    {
        this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student)
    {
       // Student s = students.get(student.getId());
        //s.setCourse(student.getCourse());
        //s.setName(student.getName());
        students.put(student.getId(),student);
    }
}
