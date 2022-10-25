package com.byd.personnel.controller;

import com.byd.personnel.common.entity.UserTokenEntity;
import com.byd.personnel.service.UserTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



/**
 * 控制层
 *
 * @author mfc
 * @since 2022-10-25 17:02:34
 */

@RestController
@RequestMapping("userToken")
public class UserTokenController {

   @Autowired
   private UserTokenService userTokenService;

   @GetMapping("/get/{id}")
   public UserTokenEntity getById(@PathVariable(value = "id") Long id) {
       UserTokenEntity userToken = userTokenService.getById(id);
       return userToken!=null?userToken:new UserTokenEntity();
   }

   @GetMapping("/get")
   public UserTokenEntity getByEntity( @RequestBody UserTokenEntity param ) {
       return userTokenService.getByEntity(param);
   }

   @GetMapping("/list")
   public List<UserTokenEntity> list(@RequestBody UserTokenEntity param) {
       List<UserTokenEntity> userTokenList = userTokenService.listByEntity(param);
       return userTokenList;
   }

   @PostMapping("/insert")
   public UserTokenEntity insert(@RequestBody UserTokenEntity param){
       userTokenService.insert(param);
       return param;
   }

   @PutMapping("/update")
   public int update(@RequestBody UserTokenEntity param){
       return userTokenService.update(param);
   }

   @DeleteMapping("/delete/{id}")
   public int deleteOne(@PathVariable(value = "id") Long id){
       return userTokenService.deleteById(id);
   }

   @DeleteMapping("/delete")
   public int deleteBatch(@RequestBody List<Long> param){
       return userTokenService.deleteByIds(param);
   }

}