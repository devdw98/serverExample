package com.wtw.catfriendsServer.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/place")
@RequiredArgsConstructor
public class PlaceController { //공간 내부

    @ApiOperation(value = "춘배커피 아이템 리스트", notes="춘배커피 아이템 리스트 출력")
    @GetMapping("/cafe")
    public ResponseEntity<?> getCafeElementList(){

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "치킨집 아이템 리스트", notes="치킨집 아이템 리스트 출력")
    @GetMapping("/chicken")
    public ResponseEntity<?> getChickenElementList(){

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "곱창집 아이템 리스트", notes="곱창집 아이템 리스트 출력")
    @GetMapping("/tripe")
    public ResponseEntity<?> getTripeElementList(){

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "헬스장 아이템 리스트", notes="헬스장 아이템 리스트 출력")
    @GetMapping("/gym")
    public ResponseEntity<?> getGymElementList(){

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "냥냐랜드 아이템 리스트", notes="냥나랜드 아이템 리스트 출력")
    @GetMapping("/land")
    public ResponseEntity<?> getLandElementList(){

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
