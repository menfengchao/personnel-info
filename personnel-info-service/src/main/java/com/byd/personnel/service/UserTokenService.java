package com.byd.personnel.service;

import com.byd.personnel.common.entity.UserTokenEntity;
import com.byd.personnel.dao.mapper.UserTokenMapper;

import java.util.List;


public interface UserTokenService {

    UserTokenMapper getUserTokenDao();
   
    UserTokenEntity getById(Long id);

    UserTokenEntity getByEntity(UserTokenEntity userToken);

    List<UserTokenEntity> listByEntity(UserTokenEntity userToken);

    List<UserTokenEntity> listByIds(List<Long> ids);

    int insert(UserTokenEntity userToken);

    int insertBatch(List<UserTokenEntity> list);

    int update(UserTokenEntity userToken);

    int updateBatch(List<UserTokenEntity> list);

    int deleteById(Long id);

    int deleteByEntity(UserTokenEntity userToken);
  
    int deleteByIds(List<Long> list);
    
    int countAll();
    
    int countByEntity(UserTokenEntity userToken);
}