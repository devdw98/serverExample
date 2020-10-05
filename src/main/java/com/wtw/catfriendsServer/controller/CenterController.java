package com.wtw.catfriendsServer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CenterController { //보호센터


    public ResponseEntity<?> donation(){

        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<?> center(){

        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<?> getCatDogPeopleList(){

        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<?> getAnimalList(){

        return new ResponseEntity<>(HttpStatus.OK);
    }


}
