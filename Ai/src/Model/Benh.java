package Model;

public class Benh {
	
	private int idBenh;
	private  int idBenhNhan;
	private double sotVirut;
	private double sotRet;
	private double thuongHan;
	private double daDay;
	private double tim;
	
	public Benh(int idBenh, int idBenhNhan, double sotVirut, double sotRet, double thuongHan, double daDay,
			double tim) {
		super();
		this.idBenh = idBenh;
		this.idBenhNhan = idBenhNhan;
		this.sotVirut = sotVirut;
		this.sotRet = sotRet;
		this.thuongHan = thuongHan;
		this.daDay = daDay;
		this.tim = tim;
	}
	public Benh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdBenhNhan() {
		return idBenhNhan;
	}
	public void setIdBenhNhan(int idBenhNhan) {
		this.idBenhNhan = idBenhNhan;
	}
	public int getIdBenh() {
		return idBenh;
	}
	public void setIdBenh(int idBenh) {
		this.idBenh = idBenh;
	}
	public double getSotVirut() {
		return sotVirut;
	}
	public void setSotVirut(double sotVirut) {
		this.sotVirut = sotVirut;
	}
	public double getSotRet() {
		return sotRet;
	}
	public void setSotRet(double sotRet) {
		this.sotRet = sotRet;
	}
	public double getThuongHan() {
		return thuongHan;
	}
	public void setThuongHan(double thuongHan) {
		this.thuongHan = thuongHan;
	}
	public double getDaDay() {
		return daDay;
	}
	public void setDaDay(double daDay) {
		this.daDay = daDay;
	}
	public double getTim() {
		return tim;
	}
	public void setTim(double tim) {
		this.tim = tim;
	}
	
	

}
