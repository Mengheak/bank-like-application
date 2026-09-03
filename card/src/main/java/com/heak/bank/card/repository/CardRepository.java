package com.heak.bank.card.repository;

import com.heak.bank.card.entity.Card;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardRepository extends MongoRepository<Card,String> {
    Optional<Card> findByCustomerId(Long customerId);
}
