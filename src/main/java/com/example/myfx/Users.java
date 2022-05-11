package com.example.myfx;

/**
 * @author Merkulov A
 */
public class Users {
    String firstname, lastname, type, id;

    public Users(String firstname, String lastname, String type, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.type = type;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
