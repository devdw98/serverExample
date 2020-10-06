package com.wtw.catfriendsServer.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/center")
@RequiredArgsConstructor
public class CenterController { //보호센터

    @ApiOperation(value = "", notes="")
    @GetMapping("/donation")
    public ResponseEntity<?> donation(){

        return new ResponseEntity<>(HttpStatus.OK);
    }
    @ApiOperation(value = "", notes="")
    @GetMapping("/center")
    public ResponseEntity<?> center(){

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "", notes="")
    @GetMapping("/peopleList")
    public ResponseEntity<?> getCatDogPeopleList(){

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "", notes="")
    @GetMapping("/animalList")
    public ResponseEntity<?> getAnimalList(){

        return new ResponseEntity<>(HttpStatus.OK);
    }


}
