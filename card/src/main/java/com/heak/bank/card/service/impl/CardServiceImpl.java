package com.heak.bank.card.service.impl;


import com.heak.bank.card.entity.Card;
import com.heak.bank.card.repository.CardRepository;
import com.heak.bank.card.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {
    private final CardRepository cardRepository;

    @Override
    public Card save(Card loan) {
        return cardRepository.save(loan);
    }

    @Override
    public List<Card> list() {
        return cardRepository.findAll();
    }

    @Override
    public Card getById(String id) {
        return cardRepository.findById(id).orElseThrow(() -> new RuntimeException("Cannot find loan with id = "+id));
    }

    @Override
    public Card getByCustomerId(Long customerId) {
        return cardRepository.findByCustomerId(customerId).orElseThrow(() -> new RuntimeException("Cannot find loan with id = "+customerId));
    }
}
