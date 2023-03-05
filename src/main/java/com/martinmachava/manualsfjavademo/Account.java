package com.martinmachava.manualsfjavademo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Map;

public class Account {
    @JsonProperty("AccountSource")
    private String accountSource;

    @JsonProperty("BillingAddress")
    private Map<String, Object> billingAddress;

    @JsonProperty("CreatedById")
    private String createdById;

    @JsonProperty("CreatedDate")
    private ZonedDateTime createdDate;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Industry")
    private String industry;

    @JsonProperty("IsDeleted")
    private boolean isDeleted;

    @JsonProperty("Jigsaw")
    private String jigsaw;

    @JsonProperty("JigsawCompanyId")
    private String jigsawCompanyId;

    @JsonProperty("LastActivityDate")
    private LocalDate lastActivityDate;

    @JsonProperty("LastModifiedById")
    private String lastModifiedById;

    @JsonProperty("LastModifiedDate")
    private ZonedDateTime lastModifiedDate;

    @JsonProperty("LastReferencedDate")
    private ZonedDateTime lastReferencedDate;

    @JsonProperty("LastViewedDate")
    private ZonedDateTime lastViewedDate;

    @JsonProperty("MasterRecordId")
    private String masterRecordId;


    @JsonProperty("Name")
    private String name;
    public String getName() {
        return name;
    }

    @JsonProperty("NumberOfEmployees")
    private Double numberOfEmployees;

    @JsonProperty("OwnerId")
    private String ownerId;

    @JsonProperty("ParentId")
    private Map<String, Object> parentId;

    @JsonProperty("Phone")
    private String phone;

    @JsonProperty("PhotoUrl")
    private String photoUrl;

    @JsonProperty("ShippingAddress")
    private Map<String, Object> shippingAddress;

    @JsonProperty("SicDesc")
    private String sicDesc;

    @JsonProperty("SystemModstamp")
    private ZonedDateTime systemModstamp;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Website")
    private String website;

    // Getters and Setters
    // Constructors
}