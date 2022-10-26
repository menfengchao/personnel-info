package com.byd.personnel.controller;

import com.byd.personnel.common.entity.FreshStudentsInfoEntity;
import com.byd.personnel.service.FreshStudentsInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;


/**
 * 控制层
 *
 * @author mfc
 * @since 2022-10-25 15:10:10
 */

@RestController
@Slf4j
@RequestMapping("freshStudentsInfo")
public class FreshStudentsInfoController {

   @Autowired
   private FreshStudentsInfoService freshStudentsInfoService;

   @GetMapping("/get/{id}")
   public FreshStudentsInfoEntity getById(@PathVariable(value = "id") Long id) {
       FreshStudentsInfoEntity freshStudentsInfo = freshStudentsInfoService.getById(id);
       return freshStudentsInfo!=null?freshStudentsInfo:new FreshStudentsInfoEntity();
   }

   @GetMapping("/get")
   public FreshStudentsInfoEntity getByEntity(@RequestBody FreshStudentsInfoEntity param) {
       return freshStudentsInfoService.getByEntity(param);
   }

   @GetMapping("/list")
   public List<FreshStudentsInfoEntity> list( @RequestBody FreshStudentsInfoEntity param) {
       List<FreshStudentsInfoEntity> freshStudentsInfoList = freshStudentsInfoService.listByEntity(param);
       return freshStudentsInfoList;
   }

   @PostMapping("/insert")
   public FreshStudentsInfoEntity insert(@RequestBody FreshStudentsInfoEntity param){
       int insert = freshStudentsInfoService.insert(param);
       return param;
   }

   @PutMapping("/update")
   public int update(@RequestBody FreshStudentsInfoEntity param){
       return freshStudentsInfoService.update(param);
   }

   @DeleteMapping("/delete/{id}")
   public int deleteOne(@PathVariable(value = "id") Long id){
       return freshStudentsInfoService.deleteById(id);
   }

   @DeleteMapping("/delete")
   public int deleteBatch(@RequestBody List<Long> param){
       return freshStudentsInfoService.deleteByIds(param);
   }

    /**
     * 导入学员基本信息
     * @param file
     * @return
     */
    @PostMapping(value = "/imports")
    public Integer importFreshStudentsInfo(@RequestParam("file") MultipartFile file) {
        log.info("importFreshStudentsInfo, file:{}", file.getSize());
        Integer result = 0;
        try {
            byte[] byteArr = file.getBytes();
            InputStream inputStream = new ByteArrayInputStream(byteArr);
            result = freshStudentsInfoService.importFreshStudentsInfo(inputStream);
        } catch (Exception e) {
            log.error("file err", e);
        }
        return result;
    }
}