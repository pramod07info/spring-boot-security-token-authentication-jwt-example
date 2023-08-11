package com.jwt.repository;


import com.jwt.entity.MyOAuthUser;
import com.jwt.service.MyOauthUser.MyOauthUserService;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

/**
 * @author Pramod
 */

public interface MyOauthUserRepo extends CrudRepository<MyOAuthUser, Long> {

    Optional<MyOAuthUser> findByUsername(String userName);
    Optional<MyOAuthUser> findById(UUID id);
}
