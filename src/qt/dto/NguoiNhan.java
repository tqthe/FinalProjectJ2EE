package qt.dto;

// Generated May 27, 2010 8:56:45 PM by Hibernate Tools 3.3.0.GA

/**
 * NguoiNhan generated by hbm2java
 */
@SuppressWarnings("serial")
public class NguoiNhan implements java.io.Serializable {

	private String hoTen;
	private String soDienThoai;

	public NguoiNhan() {
	}

	public NguoiNhan(String hoTen, String soDienThoai) {
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
	}

	public String getHoTen() {
		return this.hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSoDienThoai() {
		return this.soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

}
