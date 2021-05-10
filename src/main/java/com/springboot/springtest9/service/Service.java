package com.springboot.springtest9.service;

import com.springboot.springtest9.dto.Member;
import vo.MemberVo;

public interface Service {

    public Member login(Member member);

    public String join(Member member);

    public MemberVo getName(String id);

    public String updateMember(Member member);

    public String deleteMember(Member member);
}
