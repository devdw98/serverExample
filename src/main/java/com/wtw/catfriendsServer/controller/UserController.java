package com.wtw.catfriendsServer.controller;

import com.wtw.catfriendsServer.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"1. User"})
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<?> initial(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "회원가입", notes="회원 가입")
    @PostMapping("/{username}") //회원가입
    public ResponseEntity<?> signUp(@PathVariable("username") String username){
        return new ResponseEntity<>(
                userService.join(userService.checkDuplicateUser(username)),
                HttpStatus.OK);
    }

    @GetMapping("/{username}") //유저 찾기
    public ResponseEntity<?> findUser(@PathVariable("username") String username){
        return new ResponseEntity<>(
                userService.getUser(username),
                HttpStatus.OK
        );
    }
}
