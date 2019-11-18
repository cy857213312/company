package com.imufe.company.service.Impl;

import com.imufe.company.entity.GraSubsidiary;
import com.imufe.company.mapper.GraSubsidiaryMapper;
import com.imufe.company.service.GraSubsidiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GraSubsidiaryServiceImpl implements GraSubsidiaryService {

    @Autowired
    GraSubsidiaryMapper graSubsidiaryMapper;
    @Override
    public boolean insertGraSubsidiary(GraSubsidiary graSubsidiary) {
        try {
            graSubsidiaryMapper.insertSelective(graSubsidiary);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<GraSubsidiary> selectAllGraSubsidiary(Integer gId) {
        return graSubsidiaryMapper.selectAllGraSubsidiary(gId);
    }

    @Override
    public GraSubsidiary selectByPrimaryKey(Integer id) {
        return graSubsidiaryMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKeySelective(GraSubsidiary graSubsidiary) {
        try {
            graSubsidiaryMapper.updateByPrimaryKeySelective(graSubsidiary);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
