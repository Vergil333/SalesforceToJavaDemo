package com.martinmachava.manualsfjavademo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "salesforceClient", url = "${salesforce.instance.url}/services/data/v53.0/query")
public interface SalesforceClient {

    @GetMapping(
            produces = {MediaType.APPLICATION_FORM_URLENCODED_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    AccountResponse getAllAccounts(
            @RequestHeader("Authorization") String accessToken,
            @RequestParam("q") String query
    );
}