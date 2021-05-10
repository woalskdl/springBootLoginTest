package com.springboot.springtest9.service;

import com.springboot.springtest9.dao.ServiceDao;
import com.springboot.springtest9.dto.Member;
import vo.MemberVo;

@org.springframework.stereotype.Service
public class ServiceImp implements Service{

    private ServiceDao serviceDao;

    @Override
    public Member login(Member member){
        return serviceDao.login(member);
    }

    @Override
    public String join(Member member){
        return serviceDao.join(member);
    }

    @Override
    public MemberVo getName(String id){
        return serviceDao.getName(id);
    }

    @Override
    public String updateMember(Member member){
        return serviceDao.updateMember(member);
    }

    @Override
    public String deleteMember(Member member){
        return serviceDao.updateMember(member);
    }
}
