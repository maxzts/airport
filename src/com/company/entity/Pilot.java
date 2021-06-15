package com.company.entity;

public class Pilot {
    private int id;
    private String firstname;
    private String lastname;
    private String rank;
    private String code1;

    public Pilot(int id, String firstname, String lastname, String rank, String code1) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.rank = rank;
        this.code1 = code1;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }



    public String getCode() {
        return code1;
    }

    public String getRank() {
        return rank;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public void setCode(String code) {
        this.code1 = code1;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", rank=" + rank +
                ", code1='" + code1 + '\'' +
                '}'+"\n";
    }
}
