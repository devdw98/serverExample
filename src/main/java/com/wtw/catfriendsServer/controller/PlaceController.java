package com.wtw.catfriendsServer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PlaceController { //공간 내부

    public ResponseEntity<?> getPlaceElementList(){

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
