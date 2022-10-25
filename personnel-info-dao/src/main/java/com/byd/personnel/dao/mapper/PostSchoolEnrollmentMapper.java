package com.byd.personnel.dao.mapper;

import com.byd.personnel.common.entity.PostSchoolEnrollmentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface PostSchoolEnrollmentMapper {

    PostSchoolEnrollmentEntity getById(Long id);

    List<PostSchoolEnrollmentEntity> listByEntity(PostSchoolEnrollmentEntity postSchoolEnrollment);

    PostSchoolEnrollmentEntity getByEntity(PostSchoolEnrollmentEntity postSchoolEnrollment);

    List<PostSchoolEnrollmentEntity> listByIds(List<Long> list);

    int insert(PostSchoolEnrollmentEntity postSchoolEnrollment);

    int insertBatch(List<PostSchoolEnrollmentEntity> list);

    int update(PostSchoolEnrollmentEntity postSchoolEnrollment);

    int updateByField(@Param("where") PostSchoolEnrollmentEntity where, @Param("set") PostSchoolEnrollmentEntity set);

    int updateBatch(List<PostSchoolEnrollmentEntity> list);

    int deleteById(Long id);

    int deleteByEntity(PostSchoolEnrollmentEntity postSchoolEnrollment);
  
    int deleteByIds(List<Long> list);
    
    int countAll();
    
    int countByEntity(PostSchoolEnrollmentEntity postSchoolEnrollment);
    
}