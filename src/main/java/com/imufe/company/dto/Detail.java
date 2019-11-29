package com.imufe.company.dto;

import com.imufe.company.entity.Check;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 封装实体对应详细查看页面
 */
@Data
@NoArgsConstructor
public class Detail extends Check {
    //检查机构
    private String sname;
    //条款
    private String number;
    //检查内容
    private String content;
    //检查依据
    private String gist;

}

