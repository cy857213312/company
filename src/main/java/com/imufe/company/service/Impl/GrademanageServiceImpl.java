package com.imufe.company.service.Impl;

import com.imufe.company.entity.Grademanage;
import com.imufe.company.mapper.GrademanageMapper;
import com.imufe.company.service.GrademanageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GrademanageServiceImpl implements GrademanageService {

    @Autowired
    GrademanageMapper grademanageMapper;

    @Override
    public List<Grademanage> selectAllGrade() {
        return grademanageMapper.selectAllGrade();
    }

}
