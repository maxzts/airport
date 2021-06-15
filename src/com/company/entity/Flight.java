package com.company.entity;


public class Flight {
    private int id;
    private int plane_id;
    private int pilot_id;
    private String data_flight;
    private String time_flight;
    private String number_flight;

    public Flight(int id, int plane_id, int pilot_id, String data_flight, String time_flight, String number_flight) {
        this.id = id;
        this.plane_id = plane_id;
        this.pilot_id = pilot_id;
        this.data_flight = data_flight;
        this.time_flight = time_flight;
        this.number_flight = number_flight;
    }


    public int getId() {
        return id;
    }

    public int getPlane_id() {
        return plane_id;
    }

    public int  getPilot_id() {
        return pilot_id;
    }

    public String getData_flight() {
        return data_flight;
    }

    public String getTime_flight() {
        return time_flight;
    }

    public String getNumber_flight() {
        return number_flight;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", plane_id=" + plane_id +
                ", pilot_id=" + pilot_id +
                ", data='" + data_flight + '\'' +
                ", time='" + time_flight + '\'' +
                ", number_flight='" + number_flight + '\'' +
                '}'+'\n';
    }
}
