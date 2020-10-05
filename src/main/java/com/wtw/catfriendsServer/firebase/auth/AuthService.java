package com.wtw.catfriendsServer.firebase.auth;

import com.google.firebase.auth.*;
import com.google.firebase.auth.hash.HmacSha256;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthService {
    public List<ImportUserRecord> getUsers(){
        // Up to 1000 users can be imported at once.
        List<ImportUserRecord> users = new ArrayList<>();
        users.add(ImportUserRecord.builder()
                .setUid("uid1")
                .setEmail("user1@example.com")
                .setPasswordHash("passwordHash1".getBytes())
                .setPasswordSalt("salt1".getBytes())
                .build());
        users.add(ImportUserRecord.builder()
                .setUid("uid2")
                .setEmail("user2@example.com")
                .setPasswordHash("passwordHash2".getBytes())
                .setPasswordSalt("salt2".getBytes())
                .build());
        return users;
    }
}
