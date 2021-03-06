package qt.dto;

// Generated Jun 21, 2010 1:02:40 AM by Hibernate Tools 3.3.0.GA

import java.util.HashSet;
import java.util.Set;

/**
 * NhaCungCap generated by hbm2java
 */
public class NhaCungCap implements java.io.Serializable {

	private Integer id;
	private String ten;
	private String diaChi;
	private String dienThoai;
	private String email;
	private String ghiChu;
	private boolean xoa;
	private Set<PhieuNhapDienThoai> dsPhieuNhapDienThoai = new HashSet<PhieuNhapDienThoai>(
			0);
	private Set<PhieuNhapPhuKien> dsPhieuNhapPhuKien = new HashSet<PhieuNhapPhuKien>(
			0);
	private Set<SanPham> dsSanPham = new HashSet<SanPham>(0);

	public NhaCungCap() {
	}

	public NhaCungCap(String ten, String diaChi, String dienThoai, String email) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.dienThoai = dienThoai;
		this.email = email;
	}

	public NhaCungCap(String ten, String diaChi, String dienThoai,
			String email, String ghiChu, boolean xoa,
			Set<PhieuNhapDienThoai> dsPhieuNhapDienThoai,
			Set<PhieuNhapPhuKien> dsPhieuNhapPhuKien, Set<SanPham> dsSanPham) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.dienThoai = dienThoai;
		this.email = email;
		this.ghiChu = ghiChu;
		this.xoa = xoa;
		this.dsPhieuNhapDienThoai = dsPhieuNhapDienThoai;
		this.dsPhieuNhapPhuKien = dsPhieuNhapPhuKien;
		this.dsSanPham = dsSanPham;
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

	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public boolean isXoa() {
		return this.xoa;
	}

	public void setXoa(boolean xoa) {
		this.xoa = xoa;
	}

	public Set<PhieuNhapDienThoai> getDsPhieuNhapDienThoai() {
		return this.dsPhieuNhapDienThoai;
	}

	public void setDsPhieuNhapDienThoai(
			Set<PhieuNhapDienThoai> dsPhieuNhapDienThoai) {
		this.dsPhieuNhapDienThoai = dsPhieuNhapDienThoai;
	}

	public Set<PhieuNhapPhuKien> getDsPhieuNhapPhuKien() {
		return this.dsPhieuNhapPhuKien;
	}

	public void setDsPhieuNhapPhuKien(Set<PhieuNhapPhuKien> dsPhieuNhapPhuKien) {
		this.dsPhieuNhapPhuKien = dsPhieuNhapPhuKien;
	}

	public Set<SanPham> getDsSanPham() {
		return this.dsSanPham;
	}

	public void setDsSanPham(Set<SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}

}
