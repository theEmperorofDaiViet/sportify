/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sportify.data;

import java.sql.*;
import sportify.business.*;

/**
 *
 * @author Admin
 */
public class DownloadDB {

    public static long insert(Download download) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "INSERT INTO Download "
                + "(UserID, DownloadDate, ProductCode) "
                + "VALUES "
                + "(?, NOW(), ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setLong(1, download.getUser().getId());
            ps.setString(2, download.getProductCode());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
            return 0;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }    
}