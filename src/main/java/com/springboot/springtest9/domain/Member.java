package com.springboot.springtest9.domain;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
public class Member {
    private String id;
    private String pw;
    private String name;
    private Date regdate;
}
