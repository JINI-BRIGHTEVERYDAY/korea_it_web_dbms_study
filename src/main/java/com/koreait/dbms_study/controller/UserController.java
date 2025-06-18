package com.koreait.dbms_study.controller;

import com.koreait.dbms_study.dto.AddUserReqDto;
import com.koreait.dbms_study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


//mybatis 방식
//SQL 중심의 데이터 접근 프레임워크
// => 내가 직접 SQL문을 작성하고 그 결과를 JAVA 객체로 매핑하는 것
//SQL을 직접 짜기 때문에 완전히 통제 가능 (자유도 높음), 대신 코드가 복잡하고 반복적이다.


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody AddUserReqDto addUserReqDto) {
        return ResponseEntity.ok(userService.addUser(addUserReqDto));
    }

    @GetMapping("/get/list")
    public ResponseEntity<?> getUserList() {
        return ResponseEntity.ok(userService.getUserList());
    }

    @GetMapping("/get")
    public ResponseEntity<?> getUserByUserId(@RequestParam Integer userId) {
        return ResponseEntity.ok(userService.getUserByUserId((userId)));
    }

}
