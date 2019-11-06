package com.imufe.company.service.Impl;

import com.imufe.company.dto.PosDto;
import com.imufe.company.mapper.AreaMapper;
import com.imufe.company.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    AreaMapper areaMapper;
    public List<PosDto> selectPos(){

        return  areaMapper.selcetPos();
    }

}
