package com.example.Catalog.catalog;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    @Column(name = "number",unique=true, nullable = false)
    private String number;
    private String name;
    private String amount;
    private String inventoryCode;

    public Item() {
    }

    public Item( String number, String name, String amount, String inventoryCode) {
        super();
        this.number = number;
        this.name = name;
        this.amount = amount;
        this.inventoryCode = inventoryCode;
    }

    public Item(Item newItem) {
        super();
        this.number = newItem.number;
        this.name = newItem.name;
        this.amount = newItem.amount;
        this.inventoryCode = newItem.inventoryCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }


    public String getInventoryCode() {
        return inventoryCode;
    }

    public void setInventoryCode(String inventoryCode) {
        this.inventoryCode = inventoryCode;
    }

}