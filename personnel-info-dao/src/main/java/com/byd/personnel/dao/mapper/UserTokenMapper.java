package com.byd.personnel.dao.mapper;

import com.byd.personnel.common.entity.UserTokenEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface UserTokenMapper {

    UserTokenEntity getById(Long id);

    List<UserTokenEntity> listByEntity(UserTokenEntity userToken);

    UserTokenEntity getByEntity(UserTokenEntity userToken);

    List<UserTokenEntity> listByIds(List<Long> list);

    int insert(UserTokenEntity userToken);

    int insertBatch(List<UserTokenEntity> list);

    int update(UserTokenEntity userToken);

    int updateByField(@Param("where") UserTokenEntity where, @Param("set") UserTokenEntity set);

    int updateBatch(List<UserTokenEntity> list);

    int deleteById(Long id);

    int deleteByEntity(UserTokenEntity userToken);
  
    int deleteByIds(List<Long> list);
    
    int countAll();
    
    int countByEntity(UserTokenEntity userToken);
    
}