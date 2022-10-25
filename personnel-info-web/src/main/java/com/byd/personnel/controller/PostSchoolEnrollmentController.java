package com.byd.personnel.controller;


import com.byd.personnel.common.entity.PostSchoolEnrollmentEntity;
import com.byd.personnel.service.PostSchoolEnrollmentService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * 控制层
 *
 * @author mfc
 * @since 2022-10-25 15:40:52
 */

@RestController("/postSchoolEnrollment")
public class PostSchoolEnrollmentController {

   @Autowired
   private PostSchoolEnrollmentService postSchoolEnrollmentService;

   @GetMapping("/get/{id}")
   public PostSchoolEnrollmentEntity getById(@PathVariable(value = "id") Long id) {
       PostSchoolEnrollmentEntity postSchoolEnrollment = postSchoolEnrollmentService.getById(id);
       return postSchoolEnrollment!=null?postSchoolEnrollment:new PostSchoolEnrollmentEntity();
   }

   @GetMapping("/get")
   public PostSchoolEnrollmentEntity getByEntity(@RequestBody PostSchoolEnrollmentEntity param ) {
       return postSchoolEnrollmentService.getByEntity(param);
   }

   @GetMapping("/list")
   public List<PostSchoolEnrollmentEntity> list(@RequestBody PostSchoolEnrollmentEntity param) {
       List<PostSchoolEnrollmentEntity> postSchoolEnrollmentList = postSchoolEnrollmentService.listByEntity(param);
       return postSchoolEnrollmentList;
   }

   @PostMapping("/insert")
   public PostSchoolEnrollmentEntity insert(@RequestBody PostSchoolEnrollmentEntity param){
       postSchoolEnrollmentService.insert(param);
       return param;
   }

   @PutMapping("/update")
   public int update(@RequestBody PostSchoolEnrollmentEntity param){
       return postSchoolEnrollmentService.update(param);
   }

   @DeleteMapping("/delete/{id}")
   public int deleteOne(@PathVariable(value = "id") Long id){
       return postSchoolEnrollmentService.deleteById(id);
   }

   @DeleteMapping("/delete")
   public int deleteBatch( @RequestBody List<Long> param){
       return postSchoolEnrollmentService.deleteByIds(param);
   }

}