package com.wtw.catfriendsServer.controller;

import com.wtw.catfriendsServer.service.GoodsService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
public class StoreController { //상점
    private final GoodsService goodsService;

    @ApiOperation(value = "패키지 목록", notes = "패키지 목록 출력")
    @GetMapping("/packages")
    public ResponseEntity<?> packageList(){

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "혜택 목록", notes = "혜택 목록 출력")
    @GetMapping("/benefits")
    public ResponseEntity<?> benefitList(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "뽑기 냥인", notes = "냥인 랜덤 뽑기 - 데이터 전달")
    @GetMapping("/lottery/person")
    public ResponseEntity<?> lotteryPerson(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "뽑기 동물친구", notes = "동물친구 랜덤 뽑기 - 데이터 전달")
    @GetMapping("/lottery/animal")
    public ResponseEntity<?> lotteryAnimal(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "다이아 상품 목록", notes = "다이아 상품 목록 출력")
    @GetMapping("/dias")
    public ResponseEntity<?> diaList(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "돈 상품 목록", notes = "돈 상품 목록 출력")
    @GetMapping("/money")
    public ResponseEntity<?> moneyList(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
