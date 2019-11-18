package com.imufe.company.service.Impl;

import com.imufe.company.entity.GraSubsidiaryRules;
import com.imufe.company.mapper.GraSubsidiaryRulesMapper;
import com.imufe.company.service.GraSubsidiaryRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GraSubsidiaryRulesServiceImpl implements GraSubsidiaryRulesService {


    @Autowired
    GraSubsidiaryRulesMapper graSubsidiaryRulesMapper;
    @Override
    public List<GraSubsidiaryRules> selectAllGraSubsidiaryRules(Integer graSuId) {
        return graSubsidiaryRulesMapper.selectAllGraSubsidiaryRules(graSuId);
    }
}
