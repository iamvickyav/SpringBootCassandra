package com.iamvickyav.SpringBootCassandra

import com.iamvickyav.SpringBootCassandra.entity.Staff
import com.iamvickyav.SpringBootCassandra.entity.StaffPrimaryKey
import com.iamvickyav.SpringBootCassandra.entity.Student
import com.iamvickyav.SpringBootCassandra.repo.StaffRepo
import com.iamvickyav.SpringBootCassandra.repo.StudentRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/staff")
class StaffController {

    @Autowired
    StaffRepo staffRepo

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    def getAllStaff(){
     staffRepo.findAll()
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    def insertStaff(@RequestBody Staff staff){
       staffRepo.insert(staff)
    }

    @RequestMapping(method = RequestMethod.POST)
    def findStaff(@RequestBody StaffPrimaryKey pk){
        staffRepo.findById(pk)
    }

    @RequestMapping(method = RequestMethod.POST, value = "/delete")
    def deleteStaff(@RequestBody StaffPrimaryKey pk){
        staffRepo.deleteById(pk)
    }
}
