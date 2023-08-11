package com.jwt.controller;

import com.jwt.entity.MyOAuthUser;
import com.jwt.service.MyOauthUser.MyOauthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author Pramod
 */
@RestController
@RequestMapping("/myOAuthUser")
public class MyOAuthUserController {

    @Autowired
    private MyOauthUserService myOauthUserService;

    /**
     * Save my oauth user details
     *
     * @param myOAuthUser request object
     * @return MyOAuthUser object
     */
    @PostMapping
    public ResponseEntity<MyOAuthUser> saveMyOAuthUser(@RequestBody MyOAuthUser myOAuthUser){
        return ResponseEntity.ok(myOauthUserService.saveMyOAuthUser(myOAuthUser));
    }

    @GetMapping("/{id}")
    public ResponseEntity<MyOAuthUser> saveMyOAuthUser(@PathVariable UUID id){
        return ResponseEntity.ok(myOauthUserService.findById(id));
    }
}
