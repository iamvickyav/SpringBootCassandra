package com.iamvickyav.SpringBootCassandra

import com.iamvickyav.SpringBootCassandra.entity.Student
import com.iamvickyav.SpringBootCassandra.repo.StudentRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/student")
class StudentController {

    @Autowired
    StudentRepo studentRepo

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    def getAllStudent(){
        studentRepo.findAll()
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    def insertStudent(@RequestBody Student student){
        studentRepo.insert(student)
    }

    @RequestMapping(method = RequestMethod.GET)
    def findStudent(@RequestParam Integer id){
        studentRepo.findById(id)
    }

    @RequestMapping(method = RequestMethod.GET, value = "/delete")
    def deleteStudent(@RequestParam Integer id){
        studentRepo.deleteById(id)
    }
}