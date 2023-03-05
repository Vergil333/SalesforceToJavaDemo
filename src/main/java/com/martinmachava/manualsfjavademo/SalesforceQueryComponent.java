package com.martinmachava.manualsfjavademo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesforceQueryComponent {

    @Autowired
    private SalesforceClient sfClient;

    @Value("${salesforce.instance.accessToken}")
    String accessToken;

    String accountAttributes = "AccountSource%2CBillingAddress%2CCreatedById%2CCreatedDate%2CDescription%2CIndustry%2CIsDeleted%2CJigsaw%2CJigsawCompanyId%2CLastActivityDate%2CLastModifiedById%2CLastModifiedDate%2CLastReferencedDate%2CLastViewedDate%2CMasterRecordId%2CName%2CNumberOfEmployees%2COwnerId%2CParentId%2CPhone%2CPhotoUrl%2CShippingAddress%2CSicDesc%2CSystemModstamp%2CType%2CWebsite";

    String buildSelectQuery(String attributes, String objectName) {
        return "SELECT%20" + attributes + "%20FROM%20" + objectName;
    }

    @PostConstruct
    void initializeBeans() {
        AccountResponse response = sfClient.getAllAccounts(
                "Bearer " + accessToken,
                buildSelectQuery(accountAttributes, "Account")
        );
        List<Account> accounts = response.getRecords();
        List<String> accountNames = accounts.stream().map(Account::getName).toList();

        accountNames.forEach(System.out::println);
    }
}