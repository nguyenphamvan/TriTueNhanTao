package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Connect.DBConnect;
import Model.Benh;
import Model.BenhNhan;

public class BenhNhanDAO {
	
	public boolean themBenhNhan(BenhNhan b) throws SQLException {
		Connection connection = DBConnect.getConnection();
		String sql = "INSERT INTO benhnhan VALUES(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
			ps.setInt(1, b.getIdBenhNhan());
			ps.setString(2, b.getName());
			ps.setString(3, b.getImage());
			ps.setString(4,b.getHomeTown());
			ps.setString(5,b.getBirth());
			ps.setBoolean(6, b.isGender());
			return (ps.executeUpdate() == 1);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public BenhNhan timKiemBenhNhan(int idBenhNhan) throws SQLException {
		Connection connection = DBConnect.getConnection();
		String sql = "SELECT * FROM benhnhan WHERE idBenhNhan = '" + idBenhNhan + "'";
		PreparedStatement ps = (PreparedStatement) connection.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		BenhNhan benhNhan = new BenhNhan();
		while (rs.next()) {
			benhNhan.setIdBenhNhan(rs.getInt("idBenhNhan"));
			benhNhan.setName(rs.getString("name"));
			benhNhan.setImage(rs.getString("image"));
			benhNhan.setHomeTown(rs.getString("homeTown"));
			benhNhan.setBirth(rs.getString("birth"));
			benhNhan.setGender(rs.getBoolean("gender"));
		}
		return benhNhan;
	}
	
	public static void main(String[] args) throws SQLException {
		BenhNhan benhNhan = new BenhNhan(5, "nguyen pham van", "deptrai.jpg","thanh hoa","11/04/1998",true);
		System.out.println(new BenhNhanDAO().themBenhNhan(benhNhan));
	}

}
