package com.company.db.writer;

import com.company.db.DbConnection;

import com.company.entity.Flight;
import com.company.entity.Pilot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class flightDbWriter {

    private static final String INSERT = "INSERT INTO flight (id, plane_id, pilot_id, data_flight, time_flight, number_flight) VALUES(?,?,?,?,?,?)";

    public static void insert(List<Flight> flights) {
        for (Flight flight  : flights) {
            insert(flight);
        }
    }

    public static void insert(Flight flight) {
        Connection connection = DbConnection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setInt(1, flight.getId());
            statement.setInt(2, flight.getPlane_id());
            statement.setInt(3, flight.getPilot_id());
            statement.setString(4, flight.getData_flight());
            statement.setString(5, flight.getTime_flight());
            statement.setString(6, flight.getNumber_flight());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

