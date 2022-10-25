package com.byd.personnel.dao.mapper;

import com.byd.personnel.common.entity.UserInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface UserInfoMapper {

    UserInfoEntity getById(Long id);

    List<UserInfoEntity> listByEntity(UserInfoEntity userInfo);

    UserInfoEntity getByEntity(UserInfoEntity userInfo);

    List<UserInfoEntity> listByIds(List<Long> list);

    int insert(UserInfoEntity userInfo);

    int insertBatch(List<UserInfoEntity> list);

    int update(UserInfoEntity userInfo);

    int updateByField(@Param("where") UserInfoEntity where, @Param("set") UserInfoEntity set);

    int updateBatch(List<UserInfoEntity> list);

    int deleteById(Long id);

    int deleteByEntity(UserInfoEntity userInfo);
  
    int deleteByIds(List<Long> list);
    
    int countAll();
    
    int countByEntity(UserInfoEntity userInfo);
    
}