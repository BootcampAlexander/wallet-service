package com.nttdata.bootcamp.walletservice.model.dto;

import com.nttdata.bootcamp.walletservice.model.constant.CardType;
import lombok.Data;

import java.util.Date;

/**
 *
 * @since 2022
 */

@Data
public class CardDto {
    private String id;
    private String number;
    private Date expirationDate;
    private String cvv;
    private CardType cardType;
    private String holderId;
}
