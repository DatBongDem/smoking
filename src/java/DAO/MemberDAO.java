package DAO;

import DTO.Member;
import SourceData.ConnectDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

    private ConnectDb db;

    public MemberDAO() {
        db = new ConnectDb(); // dùng constructor mặc định (localhost)
    }

    public MemberDAO(ConnectDb db) {
        this.db = db;
    }

    public List<Member> getAllMembers() {
        List<Member> list = new ArrayList<>();
        String sql = "SELECT * FROM Member";

        try (Connection conn = db.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Member member = new Member(
                        rs.getString("IDMember"),
                        rs.getString("password"),
                        rs.getString("memberName"),
                        rs.getString("phone"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getDate("dateOfBirth"),
                        rs.getDate("joinDate"),
                        rs.getString("IDCoach"),
                        rs.getString("subcription"),
                        rs.getString("status")
                );
                list.add(member);
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("LỖI KẾT NỐI HOẶC TRUY VẤN: " + e.getMessage());
            e.printStackTrace();
        }

        return list;
    }

    public boolean checkLogin(String id, String password) throws Exception {
        String sql = "SELECT * FROM Member WHERE IDMember = ? AND password = ?";
        try (Connection conn = db.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, id);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        }

    }

}
