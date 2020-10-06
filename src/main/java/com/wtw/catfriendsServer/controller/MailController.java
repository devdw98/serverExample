package com.wtw.catfriendsServer.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
@RequiredArgsConstructor
public class MailController { //이벤트 보상, 게임 업데이트 및 공지사항

    @ApiOperation(value = "우편함 목록", notes="우편함의 목록 출력")
    public ResponseEntity<?> getMailbox(){

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
