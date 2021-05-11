package com.springboot.springtest9.dao;

import com.springboot.springtest9.domain.Member;
import com.springboot.springtest9.dto.MemberDto;
import com.springboot.springtest9.vo.MemberDetailVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.springboot.springtest9.vo.MemberNameVo;

@Mapper
public interface ServiceDao {

    MemberDetailVo selectMember(MemberDto member);
    void insertMember(MemberDto member);
    int selectMemberCnt(MemberDto member);
    MemberNameVo selectMemberName(String userId);
    int updateMember(MemberDto member);
    int deleteMember(MemberDto member);

}
