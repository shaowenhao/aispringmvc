package com.siemens.repository;

import com.siemens.entity.Student;

import java.util.Collection;

/**
 * <p>Create Time: 2022年03月02日 16:32          </p>
 **/
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
