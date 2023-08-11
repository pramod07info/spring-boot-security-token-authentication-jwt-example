package com.jwt.service.MyOauthUser.Impl;

import com.jwt.entity.MyOAuthUser;
import com.jwt.repository.MyOauthUserRepo;
import com.jwt.service.MyOauthUser.MyOauthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

/**
 * @author Pramod
 */
@Service
public class MyOauthUserServiceImpl implements MyOauthUserService {

    @Autowired
    MyOauthUserRepo myOauthUserRepo;

//    @Qualifier("")
//    @Autowired
//    BCryptPasswordEncoder passwordEncoder;

    @Override
    public Optional<MyOAuthUser> findByUsername(String userName) {
        return myOauthUserRepo.findByUsername(userName);
    }

    @Override
    public MyOAuthUser saveMyOAuthUser(MyOAuthUser myOAuthUser) {

        myOAuthUser.setPassword(new BCryptPasswordEncoder().encode(myOAuthUser.getPassword()));
        return myOauthUserRepo.save(myOAuthUser);
    }

    @Override
    public MyOAuthUser findById(UUID id) {
        return myOauthUserRepo.findById(id).orElseThrow(() -> new UsernameNotFoundException("user not found for this id" + id));
    }
}
