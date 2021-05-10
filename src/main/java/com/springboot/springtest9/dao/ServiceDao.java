package com.springboot.springtest9.dao;

import com.springboot.springtest9.dto.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import vo.MemberVo;

@Mapper
public interface ServiceDao {

    MemberVo getName(@Param("id") String id);

    public Member login(Member member);
//    {
//
//        if(memberList.getMemberList().containsKey(member.getId())){
//            String id = member.getId();
//            String pw = member.getPw();
//            if(memberList.getMemberList().get(id).getPw().equals(member.getPw())){
//                return id;
//            }else{
//                return "check pw";
//            }
//        }else{
//            return "check id";
//        }
//    }

    public String join(Member member);
//    {
//        if(memberList.getMemberList().containsKey(member.getId())){
//            return "id already exist";
//        }else{
//            memberList.getMemberList().put(member.getId(), member);
//            return "join completed";
//        }
//    }




    public String updateMember(Member member);
//    {
//        if(memberList.getMemberList().containsKey(member.getId())){
//            String id = member.getId();
//            if(memberList.getMemberList().get(id).getPw().equals(member.getPw())){
//                memberList.getMemberList().get(id).setName(member.getName());
//                return "update completed";
//            }else{
//                return "check pw";
//            }
//        }else{
//            return "check id";
//        }
//    }

    public String deleteMember(Member member);
//    {
//        if(memberList.getMemberList().containsKey(member.getId())){
//            String id = member.getId();
//            if(memberList.getMemberList().get(id).getPw().equals(member.getPw())){
//                memberList.getMemberList().remove(id);
//                return "delete completed";
//            }else{
//                return "check pw";
//            }
//        }else{
//            return "check id";
//        }
//    }
}
