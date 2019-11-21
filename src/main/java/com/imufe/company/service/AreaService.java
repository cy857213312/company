package com.imufe.company.service;

import com.imufe.company.dto.PosDto;
import com.imufe.company.entity.Admin;
import com.imufe.company.entity.Area;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AreaService {

     List<Area> selectAllArea();

     String insertArea(Area area);

     String deleteArea(Integer id);

     String updateArea(Area area);

     Area selectSingleArea(Integer id);
}
