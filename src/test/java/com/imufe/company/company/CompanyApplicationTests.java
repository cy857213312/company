package com.imufe.company.company;

import com.imufe.company.entity.Check;
import com.imufe.company.entity.Company;
import com.imufe.company.entity.Pos;
import com.imufe.company.mapper.CheckMapper;
import com.imufe.company.mapper.CompanyMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyApplicationTests {

    @Autowired
    CheckMapper checkMapper;
    @Test
    public void contextLoads() {
        final List<Check> checks = checkMapper.selectChecks();
        System.out.println(checks.get(0).getScore());
    }

}
