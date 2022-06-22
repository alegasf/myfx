package com.example.myfx;

import javafx.beans.property.SimpleStringProperty;

/**
 * @author Merkulov A
 */
public class Order {
    private SimpleStringProperty name;
    private SimpleStringProperty amount;
    private SimpleStringProperty price;
    private SimpleStringProperty sum;

    public Order(String name, String amount, String price, String sum) {
        this.name = new SimpleStringProperty(name);
        this.amount = new SimpleStringProperty(amount);
        this.price = new SimpleStringProperty(price);
        this.sum = new SimpleStringProperty(sum);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public String getAmount() {
        return amount.get();
    }

    public SimpleStringProperty amountProperty() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = new SimpleStringProperty(amount);
    }

    public String getPrice() {
        return price.get();
    }

    public SimpleStringProperty priceProperty() {
        return price;
    }

    public void setPrice(String price) {
        this.price.set(price);
    }

    public String getSum() {
        return sum.get();
    }

    public SimpleStringProperty sumProperty() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum.set(sum);
    }
}