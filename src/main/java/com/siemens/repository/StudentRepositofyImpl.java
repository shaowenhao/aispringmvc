package com.siemens.repository;

import com.siemens.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>Create Time: 2022年03月02日 16:37          </p>
 **/

@Repository
public class StudentRepositofyImpl implements StudentRepository{

    private static Map<Long,Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"shaownehao",22));
        studentMap.put(2L,new Student(2L,"master",23));
        studentMap.put(3L,new Student(3L,"lisi",23));

    }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
