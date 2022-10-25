package com.byd.personnel.service;


import com.byd.personnel.common.entity.UserInfoEntity;
import com.byd.personnel.dao.mapper.UserInfoMapper;

import java.util.List;

public interface UserInfoService {
    
    UserInfoMapper getUserInfoDao();
   
    UserInfoEntity getById(Long id);

    UserInfoEntity getByEntity(UserInfoEntity userInfo);

    List<UserInfoEntity> listByEntity(UserInfoEntity userInfo);

    List<UserInfoEntity> listByIds(List<Long> ids);

    int insert(UserInfoEntity userInfo);

    int insertBatch(List<UserInfoEntity> list);

    int update(UserInfoEntity userInfo);

    int updateBatch(List<UserInfoEntity> list);

    int deleteById(Long id);

    int deleteByEntity(UserInfoEntity userInfo);
  
    int deleteByIds(List<Long> list);
    
    int countAll();
    
    int countByEntity(UserInfoEntity userInfo);
}