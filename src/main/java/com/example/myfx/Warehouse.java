package com.example.myfx;

import javafx.beans.property.SimpleStringProperty;

/**
 * @author Merkulov A
 */
public class Warehouse {
    private SimpleStringProperty name;
    private SimpleStringProperty amount;
    private SimpleStringProperty type;
    private SimpleStringProperty cost;

    public Warehouse(String name, String amount, String type, String cost) {
        this.name = new SimpleStringProperty(name);
        this.amount = new SimpleStringProperty(amount);
        this.type = new SimpleStringProperty(type);
        this.cost = new SimpleStringProperty(cost);
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

    public String getType() {
        return type.get();
    }

    public SimpleStringProperty typeProperty() {
        return type;
    }

    public void setType(String type) {
        this.type.set(type);
    }

    public String getCost() {
        return cost.get();
    }

    public SimpleStringProperty costProperty() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost.set(cost);
    }


}
