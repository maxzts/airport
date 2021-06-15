//package com.company.db.writer;
//
//public class planeDbWriter {
//
//}
package com.company.db.writer;

import com.company.db.DbConnection;

import com.company.entity.Pilot;
import com.company.entity.Plane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class planeDbWriter {

    private static final String INSERT = "INSERT INTO plane (id, brand, model, number_passengers, number_plane) VALUES(?,?,?,?,?)";

    public static void insert(List<Plane> planes) {
        for (Plane plane: planes) {
            insert(plane);
        }
    }

    public static void insert(Plane plane) {
        Connection connection = DbConnection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setInt(1,  plane.getId());
            statement.setString(2,  plane.getBrand());
            statement.setString(3,  plane.getModel());
            statement.setInt(4,  plane.getNumberPassenger());
            statement.setInt(5,  plane.getNumberPlane());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

