/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Nguyen Tien Dat
 */
import SourceData.ConnectDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CoachDAO {
    private ConnectDb db;

    public CoachDAO(ConnectDb db) {
        this.db = db;
    }

    public boolean checkLogin(String id, String password) throws Exception {
        String sql = "SELECT * FROM Coach WHERE IDCoach = ? AND password = ?";
        try (Connection conn = db.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, id);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            return rs.next(); // Nếu có bản ghi => đăng nhập thành công
        }
    }
}