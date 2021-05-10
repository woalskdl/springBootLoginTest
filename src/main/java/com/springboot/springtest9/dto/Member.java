package com.springboot.springtest9.dto;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor
public class Member {
    @NonNull private String id;
    @NonNull private String pw;
    private String name;
    private Date regdate;
}
