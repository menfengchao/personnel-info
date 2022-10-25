package com.byd.personnel.service.impl;

import com.byd.personnel.common.entity.UserTokenEntity;
import com.byd.personnel.dao.mapper.UserTokenMapper;
import com.byd.personnel.service.UserTokenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserTokenServiceImpl implements UserTokenService {

    @Resource(type = UserTokenMapper.class)
    private UserTokenMapper userTokenMapper;

    @Override
    public UserTokenMapper getUserTokenDao() {
        return userTokenMapper;
    }

    public UserTokenEntity getById(Long id) {
        return userTokenMapper.getById(id);
    }

    public UserTokenEntity getByEntity(UserTokenEntity userToken) {
        return userTokenMapper.getByEntity(userToken);
    }

    public List<UserTokenEntity> listByEntity(UserTokenEntity userToken) {
        return userTokenMapper.listByEntity(userToken);
    }

    public List<UserTokenEntity> listByIds(List<Long> ids) {
        return userTokenMapper.listByIds(ids);
    }

    public int insert(UserTokenEntity userToken) {
        return userTokenMapper.insert(userToken);
    }

    public int insertBatch(List<UserTokenEntity> list) {
        return userTokenMapper.insertBatch(list);
    }

    public int update(UserTokenEntity userToken) {
        return userTokenMapper.update(userToken);
    }

    public int updateBatch(List<UserTokenEntity> list) {
        return userTokenMapper.updateBatch(list);
    }

    public int deleteById(Long id) {
        return userTokenMapper.deleteById(id);
    }

    public int deleteByEntity(UserTokenEntity userToken) {
        return userTokenMapper.deleteByEntity(userToken);
    }
  
    public int deleteByIds(List<Long> list) {
        return userTokenMapper.deleteByIds(list);
    }

    public int countAll() {
        return userTokenMapper.countAll();
    }
    
    public int countByEntity(UserTokenEntity userToken) {
        return userTokenMapper.countByEntity(userToken);
    }

}