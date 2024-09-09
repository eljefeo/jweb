package com.jmedia.jweb.repo;

import com.jmedia.jweb.model.PokerHands;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PokerHandsRepo extends JpaRepository<PokerHands, Long> {
}
