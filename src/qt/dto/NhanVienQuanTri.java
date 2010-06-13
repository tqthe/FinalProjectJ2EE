package qt.dto;

// Generated Jun 12, 2010 11:48:25 PM by Hibernate Tools 3.3.0.GA

import java.util.Date;

/**
 * NhanVienQuanTri generated by hbm2java
 */
@SuppressWarnings("serial")
public class NhanVienQuanTri extends qt.dto.Account implements
		java.io.Serializable {

	private String cmnd;
	private Date ngaySinh;
	private String diaChi;
	private String soDienThoai;

	public NhanVienQuanTri() {
	}

	public NhanVienQuanTri(String username, String pass, Integer trangThai,
			String ho, String ten, String email, Integer gioiTinh, boolean xoa,
			String cmnd, Date ngaySinh, String diaChi, String soDienThoai) {
		super(username, pass, trangThai, ho, ten, email, gioiTinh, xoa);
		this.cmnd = cmnd;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}

	public NhanVienQuanTri(String username, String pass, Integer trangThai,
			String ho, String dem, String ten, String email, Integer gioiTinh,
			boolean xoa, String cmnd, Date ngaySinh, String diaChi,
			String soDienThoai) {
		super(username, pass, trangThai, ho, dem, ten, email, gioiTinh, xoa);
		this.cmnd = cmnd;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}

	public String getCmnd() {
		return this.cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public Date getNgaySinh() {
		return this.ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return this.soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

}
