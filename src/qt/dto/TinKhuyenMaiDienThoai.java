package qt.dto;

// Generated Jun 18, 2010 3:27:17 PM by Hibernate Tools 3.3.0.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TinKhuyenMaiDienThoai generated by hbm2java
 */
public class TinKhuyenMaiDienThoai implements java.io.Serializable {

	private Integer id;
	private String noiDung;
	private Date ngayBatDau;
	private Date ngayKetThuc;
	private boolean hienThi;
	private boolean xoa;
	private Set<ChiTietTinKhuyenMaiDienThoai> dsChiTietTinKhuyenMaiDienThoai = new HashSet<ChiTietTinKhuyenMaiDienThoai>(
			0);

	public TinKhuyenMaiDienThoai() {
	}

	public TinKhuyenMaiDienThoai(String noiDung, Date ngayBatDau,
			Date ngayKetThuc, boolean hienThi, boolean xoa) {
		this.noiDung = noiDung;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.hienThi = hienThi;
		this.xoa = xoa;
	}

	public TinKhuyenMaiDienThoai(String noiDung, Date ngayBatDau,
			Date ngayKetThuc, boolean hienThi, boolean xoa,
			Set<ChiTietTinKhuyenMaiDienThoai> dsChiTietTinKhuyenMaiDienThoai) {
		this.noiDung = noiDung;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.hienThi = hienThi;
		this.xoa = xoa;
		this.dsChiTietTinKhuyenMaiDienThoai = dsChiTietTinKhuyenMaiDienThoai;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNoiDung() {
		return this.noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public Date getNgayBatDau() {
		return this.ngayBatDau;
	}

	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public Date getNgayKetThuc() {
		return this.ngayKetThuc;
	}

	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}

	public boolean isHienThi() {
		return this.hienThi;
	}

	public void setHienThi(boolean hienThi) {
		this.hienThi = hienThi;
	}

	public boolean isXoa() {
		return this.xoa;
	}

	public void setXoa(boolean xoa) {
		this.xoa = xoa;
	}

	public Set<ChiTietTinKhuyenMaiDienThoai> getDsChiTietTinKhuyenMaiDienThoai() {
		return this.dsChiTietTinKhuyenMaiDienThoai;
	}

	public void setDsChiTietTinKhuyenMaiDienThoai(
			Set<ChiTietTinKhuyenMaiDienThoai> dsChiTietTinKhuyenMaiDienThoai) {
		this.dsChiTietTinKhuyenMaiDienThoai = dsChiTietTinKhuyenMaiDienThoai;
	}

}
