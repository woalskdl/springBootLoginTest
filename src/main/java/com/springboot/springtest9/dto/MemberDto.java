package com.springboot.springtest9.dto;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor
public class MemberDto {
    @NonNull private String userId;
    @NonNull private String userPw;
    private String userName;
    private Date regDate;
}
