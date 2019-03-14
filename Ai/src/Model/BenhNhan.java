package Model;

import Controller.DaiSoGiaTu;
import Controller.PictureFuzzySet;

public class BenhNhan {
	public static final String S[] = {"nhiệt độ", "đau đầu", "đau bụng", "ho", "đau ngực"};
    public static final String S2[] = {"temperature", "headache", "stomachache", "cough", "chest pain"};
	private int idBenhNhan;
	private String name;
	private String image;
	private String homeTown;
	private String birth;
	private boolean gender;
	private PictureFuzzySet set[] = new PictureFuzzySet[S.length];
	
	public BenhNhan() {
		super();
	}
	
	public BenhNhan(int idBenhNhan) {
		super();
		this.idBenhNhan = idBenhNhan;
//		this.name = name;
	}
	public BenhNhan(int idBenhNhan, String name, String image,String homeTown,String birth,boolean gender) {
		super();
		this.idBenhNhan = idBenhNhan;
		this.name = name;
		this.image = image;
		this.homeTown = homeTown;
		this.birth = birth;
		this.gender = gender;
	}
	public int getIdBenhNhan() {
		return idBenhNhan;
	}
	public void setIdBenhNhan(int idBenhNhan) {
		this.idBenhNhan = idBenhNhan;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public PictureFuzzySet[] getSet() {
		return set;
	}
	public void setSet(PictureFuzzySet[] set) {
		this.set = set;
	}
	public void InputSet1(String cao, String tBinh, String thap, int i) {
        double x = 0, y = 0, z = 0;
        DaiSoGiaTu giaTu = new DaiSoGiaTu();
        x = giaTu.getValue(cao);
        y = giaTu.getValue(tBinh);
        z = giaTu.getValue(thap);

        PictureFuzzySet pfset = new PictureFuzzySet(x, y, z);
        set[i] = pfset;
    }
    
    public void InputSet2(String cao, String tBinh, String thap, int i) {
        double x = 0, y = 0, z = 0;
        DaiSoGiaTu giaTu = new DaiSoGiaTu();
        x = giaTu.getValue2(cao);
        y = giaTu.getValue2(tBinh);
        z = giaTu.getValue2(thap);

        PictureFuzzySet pfset = new PictureFuzzySet(x, y, z);
        set[i] = pfset;
    }

}
