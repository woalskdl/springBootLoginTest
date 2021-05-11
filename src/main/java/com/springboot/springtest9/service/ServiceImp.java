package com.springboot.springtest9.service;

import com.springboot.springtest9.dao.ServiceDao;
import com.springboot.springtest9.domain.Member;
import com.springboot.springtest9.dto.MemberDto;
import com.springboot.springtest9.vo.MemberDetailVo;
import com.springboot.springtest9.vo.MemberNameVo;

@org.springframework.stereotype.Service
public class ServiceImp implements Service{

    private final ServiceDao serviceDao;

    public ServiceImp(ServiceDao serviceDao) {
        this.serviceDao = serviceDao;
    }

    @Override
    public MemberDetailVo login(MemberDto member){
        return serviceDao.selectMember(member);
    }

    @Override
    public String join(MemberDto member){

        int doubleCk = serviceDao.selectMemberCnt(member);

        if(doubleCk == 0){
            serviceDao.insertMember(member);
            return "join completed";
        }else{
            return "join failed";
        }
    }

    @Override
    public MemberNameVo getName(String userId){ return serviceDao.selectMemberName(userId); }

    @Override
    public String updateMember(MemberDto member){
        int result = serviceDao.updateMember(member);
        if(result == 1){
            return "update completed";
        }else{
            return "update failed";
        }
    }

    @Override
    public String deleteMember(MemberDto member){
        int result = serviceDao.deleteMember(member);
        if(result == 1){
            return "delete completed";
        }else{
            return "delete failed";
        }
    }
}
