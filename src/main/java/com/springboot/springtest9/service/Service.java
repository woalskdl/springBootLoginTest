package com.springboot.springtest9.service;

import com.springboot.springtest9.domain.Member;
import com.springboot.springtest9.dto.MemberDto;
import com.springboot.springtest9.vo.MemberDetailVo;
import com.springboot.springtest9.vo.MemberNameVo;

public interface Service {

    MemberDetailVo login(MemberDto member);

    String join(MemberDto member);

    MemberNameVo getName(String userId);

    String updateMember(MemberDto member);

    String deleteMember(MemberDto member);
}
