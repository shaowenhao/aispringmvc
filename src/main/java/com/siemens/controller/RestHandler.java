package com.siemens.controller;

import com.siemens.entity.Student;
import com.siemens.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * <p>Create Time: 2022年03月02日 16:26          </p>
 **/

@RestController
@RequestMapping("/rest")
public class RestHandler {

    @Autowired
    private StudentRepository studentRepository;


    /**
     * http://localhost:8080/rest/findAll
     *
     * [{"age":22,"id":1,"name":"shaownehao"},{"age":23,"id":2,"name":"master"},{"age":23,"id":3,"name":"lisi"}]
     * @return
     */
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public Collection<Student> findAll(){
        return studentRepository.findAll();
    }

    @RequestMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentRepository.findById(id);
    }

    /**
     * postman body里 写json格式的 student
     * {
     *     "id":5,
     *     "name":"haha",
     *     "age":22
     * }
     *
     * @param student
     */
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void  update(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        studentRepository.deleteById(id);
    }
}
