package com.byd.personnel.service.impl;

import com.byd.personnel.common.entity.PostSchoolEnrollmentEntity;
import com.byd.personnel.dao.mapper.PostSchoolEnrollmentMapper;
import com.byd.personnel.service.PostSchoolEnrollmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class PostSchoolEnrollmentServiceImpl implements PostSchoolEnrollmentService {

    @Resource(type = PostSchoolEnrollmentMapper.class)
    private PostSchoolEnrollmentMapper postSchoolEnrollmentMapper;

    @Override
    public PostSchoolEnrollmentMapper getPostSchoolEnrollmentDao() {
        return postSchoolEnrollmentMapper;
    }

    public PostSchoolEnrollmentEntity getById(Long id) {
        return postSchoolEnrollmentMapper.getById(id);
    }

    public PostSchoolEnrollmentEntity getByEntity(PostSchoolEnrollmentEntity postSchoolEnrollment) {
        return postSchoolEnrollmentMapper.getByEntity(postSchoolEnrollment);
    }

    public List<PostSchoolEnrollmentEntity> listByEntity(PostSchoolEnrollmentEntity postSchoolEnrollment) {
        return postSchoolEnrollmentMapper.listByEntity(postSchoolEnrollment);
    }

    public List<PostSchoolEnrollmentEntity> listByIds(List<Long> ids) {
        return postSchoolEnrollmentMapper.listByIds(ids);
    }

    public int insert(PostSchoolEnrollmentEntity postSchoolEnrollment) {
        return postSchoolEnrollmentMapper.insert(postSchoolEnrollment);
    }

    public int insertBatch(List<PostSchoolEnrollmentEntity> list) {
        return postSchoolEnrollmentMapper.insertBatch(list);
    }

    public int update(PostSchoolEnrollmentEntity postSchoolEnrollment) {
        return postSchoolEnrollmentMapper.update(postSchoolEnrollment);
    }

    public int updateBatch(List<PostSchoolEnrollmentEntity> list) {
        return postSchoolEnrollmentMapper.updateBatch(list);
    }

    public int deleteById(Long id) {
        return postSchoolEnrollmentMapper.deleteById(id);
    }

    public int deleteByEntity(PostSchoolEnrollmentEntity postSchoolEnrollment) {
        return postSchoolEnrollmentMapper.deleteByEntity(postSchoolEnrollment);
    }
  
    public int deleteByIds(List<Long> list) {
        return postSchoolEnrollmentMapper.deleteByIds(list);
    }

    public int countAll() {
        return postSchoolEnrollmentMapper.countAll();
    }
    
    public int countByEntity(PostSchoolEnrollmentEntity postSchoolEnrollment) {
        return postSchoolEnrollmentMapper.countByEntity(postSchoolEnrollment);
    }

}