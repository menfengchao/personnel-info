package com.byd.personnel.dao.mapper;

import com.byd.personnel.common.entity.FreshStudentsInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface FreshStudentsInfoMapper {

    FreshStudentsInfoEntity getById(Long id);

    List<FreshStudentsInfoEntity> listByEntity(FreshStudentsInfoEntity freshStudentsInfo);

    FreshStudentsInfoEntity getByEntity(FreshStudentsInfoEntity freshStudentsInfo);

    List<FreshStudentsInfoEntity> listByIds(List<Long> list);

    int insert(FreshStudentsInfoEntity freshStudentsInfo);

    int insertBatch(List<FreshStudentsInfoEntity> list);

    int update(FreshStudentsInfoEntity freshStudentsInfo);

    int updateByField(@Param("where") FreshStudentsInfoEntity where, @Param("set") FreshStudentsInfoEntity set);

    int updateBatch(List<FreshStudentsInfoEntity> list);

    int deleteById(Long id);

    int deleteByEntity(FreshStudentsInfoEntity freshStudentsInfo);
  
    int deleteByIds(List<Long> list);
    
    int countAll();
    
    int countByEntity(FreshStudentsInfoEntity freshStudentsInfo);
    
}