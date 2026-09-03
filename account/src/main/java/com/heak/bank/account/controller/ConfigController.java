package com.heak.bank.account.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.heak.bank.account.config.AccountServiceConfig;
import com.heak.bank.account.property.Properties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("api/config")
@RequiredArgsConstructor
public class ConfigController {

    private final AccountServiceConfig accountServiceConfig;

    @GetMapping("/properties")
    public String getProperties() throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        Properties prop = new Properties(
                accountServiceConfig.getMsg(),
                accountServiceConfig.getBuildVersion(),
                accountServiceConfig.getMailDetails(),
                accountServiceConfig.getActiveBranches()
        );
        return ow.writeValueAsString(prop);
    }

}
