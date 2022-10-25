package com.byd.personnel.service.impl;

import com.byd.personnel.common.entity.UserInfoEntity;
import com.byd.personnel.dao.mapper.UserInfoMapper;
import com.byd.personnel.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource(type = UserInfoMapper.class)
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfoMapper getUserInfoDao() {
        return userInfoMapper;
    }

    public UserInfoEntity getById(Long id) {
        return userInfoMapper.getById(id);
    }

    public UserInfoEntity getByEntity(UserInfoEntity userInfo) {
        return userInfoMapper.getByEntity(userInfo);
    }

    public List<UserInfoEntity> listByEntity(UserInfoEntity userInfo) {
        return userInfoMapper.listByEntity(userInfo);
    }

    public List<UserInfoEntity> listByIds(List<Long> ids) {
        return userInfoMapper.listByIds(ids);
    }

    public int insert(UserInfoEntity userInfo) {
        return userInfoMapper.insert(userInfo);
    }

    public int insertBatch(List<UserInfoEntity> list) {
        return userInfoMapper.insertBatch(list);
    }

    public int update(UserInfoEntity userInfo) {
        return userInfoMapper.update(userInfo);
    }

    public int updateBatch(List<UserInfoEntity> list) {
        return userInfoMapper.updateBatch(list);
    }

    public int deleteById(Long id) {
        return userInfoMapper.deleteById(id);
    }

    public int deleteByEntity(UserInfoEntity userInfo) {
        return userInfoMapper.deleteByEntity(userInfo);
    }
  
    public int deleteByIds(List<Long> list) {
        return userInfoMapper.deleteByIds(list);
    }

    public int countAll() {
        return userInfoMapper.countAll();
    }
    
    public int countByEntity(UserInfoEntity userInfo) {
        return userInfoMapper.countByEntity(userInfo);
    }

}