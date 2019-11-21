package com.imufe.company.service;

import com.imufe.company.entity.GraSubsidiary;
import com.imufe.company.entity.GraSubsidiaryRules;
import io.swagger.models.auth.In;

import java.util.List;

public interface GraSubsidiaryRulesService {

    List<GraSubsidiaryRules> selectAllGraSubsidiaryRules(Integer graSuId);

    GraSubsidiaryRules selectSingleGraSubRules(Integer id);

    String insertGraSubRules(GraSubsidiaryRules graSubsidiaryRules);

    String updateGraSubRules(GraSubsidiaryRules graSubsidiaryRules);
}
