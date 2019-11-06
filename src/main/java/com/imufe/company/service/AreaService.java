package com.imufe.company.service;

import com.imufe.company.dto.PosDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AreaService {

     List<PosDto> selectPos();
}
