package com.heak.bank.card.mapper;

import com.heak.bank.card.dto.CardDTO;
import com.heak.bank.card.entity.Card;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper {
    Card toCard(CardDTO dto);
}
