package com.springboot.springtest9.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Member {
    private String id;
    private String user_pw;
    private String user_name;
    private Date reg_date;
}
