package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Connect.DBConnect;
import Model.Benh;
import Model.BenhNhan;

public class BenhDAO {
	
	public boolean themTapXacSuatBenh(Benh b) throws SQLException {
		Connection connection = DBConnect.getConnection();
		String sql = "INSERT INTO benh(idBenhNhan, sotvirut, sotret, thuonghan, daday, tim) VALUES(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
			ps.setInt(1, b.getIdBenhNhan());
			ps.setDouble(2, b.getSotVirut());
			ps.setDouble(3, b.getSotRet());
			ps.setDouble(4, b.getThuongHan());
			ps.setDouble(5, b.getDaDay());
			ps.setDouble(6, b.getTim());
			return (ps.executeUpdate() == 1);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public ArrayList<Benh> LichSuKhamBenh(int idBenhNhan) throws SQLException {
		Connection connection = DBConnect.getConnection();
		String sql = "SELECT * FROM benh WHERE idBenhNhan = '" + idBenhNhan + "'";
		PreparedStatement ps = (PreparedStatement) connection.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<Benh> list = new ArrayList<>();
		
		while (rs.next()) {
			Benh benh = new Benh();
			benh.setIdBenhNhan(rs.getInt("idBenhNhan"));
			benh.setSotVirut(rs.getDouble("sotvirut"));
			benh.setSotRet(rs.getDouble("sotret"));
			benh.setThuongHan(rs.getDouble("thuonghan"));
			benh.setDaDay(rs.getDouble("daday"));
			benh.setTim(rs.getDouble("tim"));
			list.add(benh);
		}
		return list;
	}
	
	public static void main(String[] args) throws SQLException {
//		Benh benh = new Benh(0,5, 0.001, 0.7906, 0.75, 0.1875, 0.125);
//		System.out.println(new BenhDAO().themTapXacSuatBenh(benh));
//		
		ArrayList<Benh> list = new BenhDAO().LichSuKhamBenh(2);
		for(Benh b : list) {
			System.out.println(b.getSotVirut() + " - "+ b.getSotRet() + " - "+b.getThuongHan()+" - "+b.getDaDay()+" - "+b.getTim());
		}
		
	}

}
