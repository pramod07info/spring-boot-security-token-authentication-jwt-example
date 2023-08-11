package com.jwt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * @author Pramod
 *
 * This is user related entity class
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "my_oauth_user")
public class MyOAuthUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, length = 255, updatable = false)
    private UUID id;

    @Column(name = "user_name", unique = true, length = 50)
    private String username;

    @Column(name = "password", length = 200)
    private String password;

    @CreationTimestamp
    @Column(name = "created_at", updatable=false)
    private Timestamp createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at",insertable=false)
    private Timestamp updatedAt;

}
