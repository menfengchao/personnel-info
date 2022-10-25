package com.byd.personnel.service;

import com.byd.personnel.common.entity.PostSchoolEnrollmentEntity;
import com.byd.personnel.dao.mapper.PostSchoolEnrollmentMapper;

import java.util.List;


public interface PostSchoolEnrollmentService {

    PostSchoolEnrollmentMapper getPostSchoolEnrollmentDao();

    PostSchoolEnrollmentEntity getById(Long id);

    PostSchoolEnrollmentEntity getByEntity(PostSchoolEnrollmentEntity postSchoolEnrollment);

    List<PostSchoolEnrollmentEntity> listByEntity(PostSchoolEnrollmentEntity postSchoolEnrollment);

    List<PostSchoolEnrollmentEntity> listByIds(List<Long> ids);

    int insert(PostSchoolEnrollmentEntity postSchoolEnrollment);

    int insertBatch(List<PostSchoolEnrollmentEntity> list);

    int update(PostSchoolEnrollmentEntity postSchoolEnrollment);

    int updateBatch(List<PostSchoolEnrollmentEntity> list);

    int deleteById(Long id);

    int deleteByEntity(PostSchoolEnrollmentEntity postSchoolEnrollment);
  
    int deleteByIds(List<Long> list);
    
    int countAll();
    
    int countByEntity(PostSchoolEnrollmentEntity postSchoolEnrollment);
}