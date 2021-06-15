package com.company.db.joiner;

import com.company.db.DbConnection;
import com.company.entity.JoinedDataItem;
import com.company.util.JoinedDataItemUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DataJoiner {

        public static final String QUERY = "SELECT fl.number_flight, fl.data_flight,fl.time_flight ,pl.number_plane, concat(pl.brand, ' ', pl.model) AS branmodel, pl.number_passengers,concat(pi.lastname, ' ', LEFT(pi.firstname, 1), '.') AS namepilot, concat(pi.code1, ' (', pi.rank, ')') AS code1rank FROM flight AS fl INNER JOIN plane AS pl ON fl. plane_id =pl.id INNER JOIN pilot AS pi ON fl.pilot_id = pi.id";

        public static List<JoinedDataItem> getJoinedData() {
            List<JoinedDataItem> result = null;

            Connection connection = DbConnection.getConnection();

            try (PreparedStatement statement = connection.prepareStatement(QUERY)) {
                ResultSet resultSet = statement.executeQuery();
                result = JoinedDataItemUtil.parseResultSet(resultSet);

            } catch (SQLException e) {
                e.printStackTrace();
            }

            return result;
        }

}
