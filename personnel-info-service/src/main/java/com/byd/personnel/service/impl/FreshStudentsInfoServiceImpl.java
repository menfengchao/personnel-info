package com.byd.personnel.service.impl;

import com.byd.personnel.common.entity.FreshStudentsInfoEntity;
import com.byd.personnel.dao.mapper.FreshStudentsInfoMapper;
import com.byd.personnel.service.FreshStudentsInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class FreshStudentsInfoServiceImpl implements FreshStudentsInfoService {

    @Resource(type = FreshStudentsInfoMapper.class)
    private FreshStudentsInfoMapper freshStudentsInfoMapper;

    @Override
    public FreshStudentsInfoMapper getFreshStudentsInfoMapper() {
        return freshStudentsInfoMapper;
    }

    public FreshStudentsInfoEntity getById(Long id) {
        return freshStudentsInfoMapper.getById(id);
    }

    public FreshStudentsInfoEntity getByEntity(FreshStudentsInfoEntity freshStudentsInfo) {
        return freshStudentsInfoMapper.getByEntity(freshStudentsInfo);
    }

    public List<FreshStudentsInfoEntity> listByEntity(FreshStudentsInfoEntity freshStudentsInfo) {
        return freshStudentsInfoMapper.listByEntity(freshStudentsInfo);
    }

    public List<FreshStudentsInfoEntity> listByIds(List<Long> ids) {
        return freshStudentsInfoMapper.listByIds(ids);
    }

    public int insert(FreshStudentsInfoEntity freshStudentsInfo) {
        return freshStudentsInfoMapper.insert(freshStudentsInfo);
    }

    public int insertBatch(List<FreshStudentsInfoEntity> list) {
        return freshStudentsInfoMapper.insertBatch(list);
    }

    public int update(FreshStudentsInfoEntity freshStudentsInfo) {
        return freshStudentsInfoMapper.update(freshStudentsInfo);
    }

    public int updateBatch(List<FreshStudentsInfoEntity> list) {
        return freshStudentsInfoMapper.updateBatch(list);
    }

    public int deleteById(Long id) {
        return freshStudentsInfoMapper.deleteById(id);
    }

    public int deleteByEntity(FreshStudentsInfoEntity freshStudentsInfo) {
        return freshStudentsInfoMapper.deleteByEntity(freshStudentsInfo);
    }
  
    public int deleteByIds(List<Long> list) {
        return freshStudentsInfoMapper.deleteByIds(list);
    }

    public int countAll() {
        return freshStudentsInfoMapper.countAll();
    }
    
    public int countByEntity(FreshStudentsInfoEntity freshStudentsInfo) {
        return freshStudentsInfoMapper.countByEntity(freshStudentsInfo);
    }

}