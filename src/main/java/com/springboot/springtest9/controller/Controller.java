package com.springboot.springtest9.controller;

import com.springboot.springtest9.dto.Member;
import com.springboot.springtest9.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping ("temp")
    public ResponseEntity temp(){
        System.out.println("access temp");

        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @PostMapping("login")
    public ResponseEntity login(@RequestBody Member member){
        System.out.println("access Login");

        Member m = service.login(member);


        return new ResponseEntity(service.login(member), HttpStatus.OK);
    }

    @PostMapping("join")
    public ResponseEntity join(@RequestBody Member member){
        System.out.println("access Join");

        return new ResponseEntity(service.join(member), HttpStatus.OK);
    }

    // query string
    @GetMapping("name")
    public ResponseEntity getName(@RequestParam("id") String id){
        System.out.println("access GetName");

        return new ResponseEntity(service.getName(id), HttpStatus.OK);
    }

//    // path value
//    @GetMapping("name/{id}")
//    public ResponseEntity getName(@PathVariable String id){
//        System.out.println("access GetName");
//
//        return new ResponseEntity(service.getName(id), HttpStatus.OK);
//    }

    @PutMapping("update")
    public ResponseEntity updateMember(@RequestBody Member member){
        System.out.println("access UpdateMember");

        return new ResponseEntity(service.updateMember(member), HttpStatus.OK);
    }

    @DeleteMapping("delete")
    public ResponseEntity deleteMember(@RequestBody Member member){
        System.out.println("access DeleteMember");

        return new ResponseEntity(service.deleteMember(member), HttpStatus.OK);
    }
}
