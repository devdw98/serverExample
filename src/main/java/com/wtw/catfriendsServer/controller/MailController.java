package com.wtw.catfriendsServer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MailController { //이벤트 보상, 게임 업데이트 및 공지사항

    public ResponseEntity<?> getMailbox(){

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
