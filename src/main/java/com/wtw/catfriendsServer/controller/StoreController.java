package com.wtw.catfriendsServer.controller;

import com.wtw.catfriendsServer.service.GoodsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StoreController { //상점
    private GoodsService goodsService;

    public ResponseEntity<?> packageList(){

        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<?> benefitList(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<?> lotteryPerson(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<?> lotteryAnimal(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<?> diaList(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<?> moneyList(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
