package com.byd.personnel.controller;

import com.byd.personnel.common.entity.UserInfoEntity;
import com.byd.personnel.service.UserInfoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


/**
 * 控制层
 *
 * @author mfc
 * @since 2022-10-25 15:13:19
 */

@RestController
@RequestMapping("userInfo")
public class UserInfoController {

   @Autowired
   private UserInfoService userInfoService;

   @GetMapping("/get/{id}")
   public UserInfoEntity getById(@PathVariable(value = "id") Long id) {
       UserInfoEntity userInfo = userInfoService.getById(id);
       return userInfo!=null?userInfo:new UserInfoEntity();
   }

   @GetMapping("/get")
   public UserInfoEntity getByEntity( @RequestBody UserInfoEntity param ) {
       return userInfoService.getByEntity(param);
   }

   @GetMapping("/list")
   public List<UserInfoEntity> list(@RequestBody UserInfoEntity param) {
       List<UserInfoEntity> userInfoList = userInfoService.listByEntity(param);
       return userInfoList;
   }

   @PostMapping("/insert")
   public UserInfoEntity insert(@RequestBody UserInfoEntity param){
       userInfoService.insert(param);
       return param;
   }

   @PutMapping("/update")
   public int update(@RequestBody UserInfoEntity param){
       return userInfoService.update(param);
   }

   @DeleteMapping("/delete/{id}")
   public int deleteOne(@PathVariable(value = "id") Long id){
       return userInfoService.deleteById(id);
   }

   @DeleteMapping("/delete")
   public int deleteBatch(@RequestBody List<Long> param){
       return userInfoService.deleteByIds(param);
   }

}