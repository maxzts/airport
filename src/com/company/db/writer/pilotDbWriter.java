package com.company.db.writer;

import com.company.db.DbConnection;

import com.company.entity.Pilot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class pilotDbWriter {

    private static final String INSERT = "INSERT INTO pilot (id, firstname, lastname, rank, code1) VALUES(?,?,?,?,?)";

    public static void insert(List<Pilot> pilots) {
        for (Pilot pilot : pilots) {
            insert(pilot);
        }
    }

    public static void insert(Pilot pilot) {
        Connection connection = DbConnection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setInt(1, pilot.getId());
            statement.setString(2, pilot.getFirstname());
            statement.setString(3, pilot.getLastname());
            statement.setString(4, pilot.getRank());
            statement.setString(5, pilot.getCode());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

