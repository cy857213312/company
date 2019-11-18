package com.imufe.company.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GraSubsidiaryRules {
    private Integer id;

    private Integer graSuId;

    private String number;

    private String content;

    private String type;

    private String gist;

    private String score;

    private Integer ifVote;

    private Integer state;


}