package com.example.cosmosdbconnect;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;
import com.microsoft.azure.spring.data.cosmosdb.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

@Document(collection = "products")
public class Product {

    @Id
    public String productid;

    public String productName;

    public double price;

    @PartitionKey
    public String productCategory;
}