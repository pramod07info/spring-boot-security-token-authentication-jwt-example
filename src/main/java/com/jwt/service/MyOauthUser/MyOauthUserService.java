package com.jwt.service.MyOauthUser;

import com.jwt.entity.MyOAuthUser;
import com.jwt.repository.MyOauthUserRepo;

import java.util.Optional;
import java.util.UUID;

/**
 * @author Pramod
 */
public interface MyOauthUserService {

    Optional<MyOAuthUser> findByUsername(String userName);

    MyOAuthUser saveMyOAuthUser(MyOAuthUser myOAuthUser);

    MyOAuthUser findById(UUID id);
}
