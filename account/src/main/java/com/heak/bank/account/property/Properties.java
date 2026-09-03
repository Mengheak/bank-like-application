package com.heak.bank.account.property;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class Properties {
    private String msg;
    private String buildVersion;
    private Map<String, Object> mailDetails;
    private List<String> activeBranches;
}
