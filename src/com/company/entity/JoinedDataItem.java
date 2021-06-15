package com.company.entity;

public class JoinedDataItem {
    private String number_flight;
    private String data_flight;
    private String time_flight;
    private int number_plane;
    private String branmodel;
    private int number_passengers;
    private String namepilot;
    private String code1rank;

    public JoinedDataItem(String number_flight, String data_flight, String time_flight, int number_plane,  String branmodel, int number_passengers, String namepilot, String code1rank) {
        this.number_flight = number_flight;
        this.data_flight = data_flight;
        this.time_flight = time_flight;
        this.number_plane = number_plane;
        this.branmodel= branmodel;
        this.number_passengers = number_passengers;
        this.namepilot = namepilot;
        this.code1rank = code1rank;
    }

    @Override
    public String toString() {
        return "JoinedDataItem{" +
                "number_flight='" + number_flight + '\'' +
                ", data_flight='" + data_flight + '\'' +
                ", time_flight='" + time_flight + '\'' +
                ", number_plane=" + number_plane +
                ", branmodel='" + branmodel + '\'' +
                ", number_passengers=" + number_passengers +
                ", namepilot='" + namepilot + '\'' +
                ", code1rank='" + code1rank + '\'' +
                '}'+'\n';
    }

    public String getNumber_flight() {
        return number_flight;
    }

    public String getData_flight() {
        return data_flight;
    }

    public String getTime_flight() {
        return time_flight;
    }

    public int getNumber_plane() {
        return number_plane;
    }

    public String getBranmodel() {
        return branmodel;
    }

    public int getNumber_passengers() {
        return number_passengers;
    }

    public String getNamepilot() {
        return namepilot;
    }

    public String getCode1rank() {
        return code1rank;
    }
}
