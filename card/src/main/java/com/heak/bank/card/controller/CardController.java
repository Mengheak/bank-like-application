package com.heak.bank.card.controller;


import com.heak.bank.card.dto.CardDTO;
import com.heak.bank.card.entity.Card;
import com.heak.bank.card.mapper.CardMapper;
import com.heak.bank.card.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/loans")
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;
    private final CardMapper cardMapper;

    @PostMapping
    public ResponseEntity<Card> save(@RequestBody CardDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body( cardService.save(cardMapper.toCard(dto)));
    }
    @GetMapping
    public ResponseEntity<List<Card>> list(){
        return ResponseEntity.status(HttpStatus.OK).body(cardService.list());
    }
    @GetMapping("{id}")
    public ResponseEntity<Card> get(@PathVariable("id") String id){
        return ResponseEntity.status(HttpStatus.OK).body(this.cardService.getById(id));
    }
    @GetMapping("/by-customer/{customerId}")
    public ResponseEntity<Card> getByCustomerId(@PathVariable("customerId") Long customerId){
        return ResponseEntity.status(HttpStatus.OK).body(cardService.getByCustomerId(customerId));
    }
}
