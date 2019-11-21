package com.imufe.company.service.Impl;

import com.imufe.company.dto.PosDto;
import com.imufe.company.entity.Admin;
import com.imufe.company.entity.Area;
import com.imufe.company.mapper.AdminMapper;
import com.imufe.company.mapper.AreaMapper;
import com.imufe.company.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    AreaMapper areaMapper;
    @Autowired
    AdminMapper adminMapper;


    @Override
    public List<Area> selectAllArea() {
        return areaMapper.selectAllArea();
    }

    @Override
    @Transactional
    public String insertArea(Area area) {
        try {
            areaMapper.insertSelective(area);
            return "success";
        }catch (Exception e){
            return "fail";
        }
    }

    @Override
    @Transactional
    public String deleteArea(Integer id) {
        try {
            areaMapper.deleteByPrimaryKey(id);
            return "success";
        }catch (Exception e){
            return "fail";
        }
    }

    @Override
    @Transactional
    public String updateArea(Area area) {
        try {
            areaMapper.updateByPrimaryKeySelective(area);
            return "success";
        }catch (Exception e) {
            return "fail";
        }
    }

    @Override
    public Area selectSingleArea(Integer id) {
        return areaMapper.selectByPrimaryKey(id);
    }
}
