package com.byd.personnel.service;


import com.byd.personnel.common.entity.FreshStudentsInfoEntity;
import com.byd.personnel.dao.mapper.FreshStudentsInfoMapper;

import java.util.List;

public interface FreshStudentsInfoService {

    FreshStudentsInfoMapper getFreshStudentsInfoMapper();

    FreshStudentsInfoEntity getById(Long id);

    FreshStudentsInfoEntity getByEntity(FreshStudentsInfoEntity freshStudentsInfo);

    List<FreshStudentsInfoEntity> listByEntity(FreshStudentsInfoEntity freshStudentsInfo);

    List<FreshStudentsInfoEntity> listByIds(List<Long> ids);

    int insert(FreshStudentsInfoEntity freshStudentsInfo);

    int insertBatch(List<FreshStudentsInfoEntity> list);

    int update(FreshStudentsInfoEntity freshStudentsInfo);

    int updateBatch(List<FreshStudentsInfoEntity> list);

    int deleteById(Long id);

    int deleteByEntity(FreshStudentsInfoEntity freshStudentsInfo);
  
    int deleteByIds(List<Long> list);
    
    int countAll();
    
    int countByEntity(FreshStudentsInfoEntity freshStudentsInfo);
}