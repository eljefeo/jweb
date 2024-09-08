package com.jmedia.jweb.repo;

import com.jmedia.jweb.model.JUser;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface JUsersRepo extends JpaRepository<JUser, Long> {
}
