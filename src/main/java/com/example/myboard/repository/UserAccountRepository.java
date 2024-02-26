package com.example.myboard.repository;

import com.example.myboard.domain.UserAccount;
import com.example.myboard.domain.projection.UserAccountProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = UserAccountProjection.class)
public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}
