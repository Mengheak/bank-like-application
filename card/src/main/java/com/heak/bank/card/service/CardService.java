package com.heak.bank.card.service;



import com.heak.bank.card.entity.Card;

import java.util.List;

public interface CardService {
    Card save(Card loan);

    List<Card> list();


    List<Card> getByCustomerId(Long customerId);
}
