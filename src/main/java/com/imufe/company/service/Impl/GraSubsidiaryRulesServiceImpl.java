package com.imufe.company.service.Impl;

import com.imufe.company.entity.GraSubsidiaryRules;
import com.imufe.company.mapper.GraSubsidiaryRulesMapper;
import com.imufe.company.service.GraSubsidiaryRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GraSubsidiaryRulesServiceImpl implements GraSubsidiaryRulesService {


    @Autowired
    GraSubsidiaryRulesMapper graSubsidiaryRulesMapper;
    @Override
    public List<GraSubsidiaryRules> selectAllGraSubsidiaryRules(Integer graSuId) {
        return graSubsidiaryRulesMapper.selectAllGraSubsidiaryRules(graSuId);
    }

    @Override
    public GraSubsidiaryRules selectSingleGraSubRules(Integer id) {
        return graSubsidiaryRulesMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public String insertGraSubRules(GraSubsidiaryRules graSubsidiaryRules) {
        try {
            graSubsidiaryRulesMapper.insertSelective(graSubsidiaryRules);
            return "success";
        }catch (Exception e){
            return "fail";
        }

    }

    @Override
    @Transactional
    public String updateGraSubRules(GraSubsidiaryRules graSubsidiaryRules) {
        try {
            graSubsidiaryRulesMapper.updateByPrimaryKeySelective(graSubsidiaryRules);
            return "success";
        }catch (Exception e){
            return "fail";
        }
    }
}
