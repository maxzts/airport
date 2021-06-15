package com.company.util;
import com.company.entity.Flight;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;




public class flightUtil {

    public static Flight toObject(String line) {
        String[] flightArr = line.split(";");
        int id = Integer.parseInt(flightArr[0]);
        int plane_id = Integer.parseInt(flightArr[1]);
        int pilot_id = Integer.parseInt(flightArr[2]);
        String data = flightArr[3];
        String time_flight  = flightArr[4];
        String number_flight = flightArr[5];
        return new Flight(id, plane_id, pilot_id, data, time_flight, number_flight);
    }
private  Date StrToDate(String stringDate){
   SimpleDateFormat sim = new SimpleDateFormat("yyyy.MM.dd");
   Date d = new Date();
   try{
       d = sim.parse(stringDate);
   } catch (ParseException e) {
       e.printStackTrace();
   }
    return d;
}}





