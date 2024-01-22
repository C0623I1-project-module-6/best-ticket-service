package com.codegym.bestticket.payload.response.user;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class ExistsUserResponse {
    private List<String> usernames;
    private List<String> userEmails;
    private List<String> customerPhoneNumbers;
    private List<String> customerIdCards;
    private List<String> organizerPhoneNumbers;
    private List<String> organizerEmails;
    private List<String> organizerIdCards;
    private List<String> organizerTaxCodes;
    private List<String> organizerBusinessCodes;
}
