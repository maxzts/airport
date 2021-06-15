package com.company.util;

import com.company.entity.JoinedDataItem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JoinedDataItemUtil {
    public static List<JoinedDataItem> parseResultSet(ResultSet resultSet) throws SQLException {
        List<JoinedDataItem> items = new ArrayList<>();
        while (resultSet.next()) {
            String number_flight = resultSet.getString("number_flight");
            String data_flight = resultSet.getString("data_flight");
            String time_flight = resultSet.getString("time_flight");
            int number_plane= resultSet.getInt("number_plane");
            String branmodel = resultSet.getString("branmodel");
            int number_passengers = resultSet.getInt("number_passengers");
            String namepilot = resultSet.getString("namepilot");
            String code1rank= resultSet.getString("code1rank");


            JoinedDataItem item = new JoinedDataItem(number_flight, data_flight,time_flight,number_plane, branmodel, number_passengers,namepilot, code1rank);
            items.add(item);
        }

        return items;
    }
public static String madeString(JoinedDataItem item){
       return item.getNumber_flight() + ";" + item.getData_flight()+";"+ item.getTime_flight()+";"
                +item.getNumber_plane()+";"+item.getBranmodel()+";"+item.getNumber_passengers()+";"+item.getNamepilot()+";"+item.getCode1rank() +'\n';
}


}
