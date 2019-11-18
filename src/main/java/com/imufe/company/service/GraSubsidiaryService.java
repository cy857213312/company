package com.imufe.company.service;

import com.imufe.company.entity.GraSubsidiary;
import io.swagger.models.auth.In;

import javax.validation.constraints.Max;
import java.util.List;

public interface GraSubsidiaryService {

    boolean insertGraSubsidiary(GraSubsidiary graSubsidiary);

    List<GraSubsidiary> selectAllGraSubsidiary(Integer gId);

    GraSubsidiary selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKeySelective(GraSubsidiary graSubsidiary);
}
