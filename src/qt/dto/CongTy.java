package qt.dto;

// Generated Jun 17, 2010 12:35:19 AM by Hibernate Tools 3.3.0.GA

import java.util.Date;

/**
 * CongTy generated by hbm2java
 */
public class CongTy implements java.io.Serializable {

	private Integer id;
	private String ten;
	private String diaChi;
	private String dienThoai;
	private String email;
	private Date ngayThanhLap;
	private String thongTinChung;

	public CongTy() {
	}

	public CongTy(String ten, String diaChi, String dienThoai, String email,
			Date ngayThanhLap, String thongTinChung) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.dienThoai = dienThoai;
		this.email = email;
		this.ngayThanhLap = ngayThanhLap;
		this.thongTinChung = thongTinChung;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getDienThoai() {
		return this.dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getNgayThanhLap() {
		return this.ngayThanhLap;
	}

	public void setNgayThanhLap(Date ngayThanhLap) {
		this.ngayThanhLap = ngayThanhLap;
	}

	public String getThongTinChung() {
		return this.thongTinChung;
	}

	public void setThongTinChung(String thongTinChung) {
		this.thongTinChung = thongTinChung;
	}

}
