package qt.dto;

// Generated Jun 12, 2010 11:48:25 PM by Hibernate Tools 3.3.0.GA

import java.util.Date;

/**
 * NhanXetDienThoai generated by hbm2java
 */
@SuppressWarnings("serial")
public class NhanXetDienThoai implements java.io.Serializable {

	private Integer id;
	private DienThoai dienThoai;
	private KhachHang khachHang;
	private String tongQuan;
	private String uuDiem;
	private String nhuocDiem;
	private Integer danhGia;
	private Date thoiGian;
	private boolean hienThi;
	private boolean xoa;

	public NhanXetDienThoai() {
	}

	public NhanXetDienThoai(String tongQuan, String uuDiem, String nhuocDiem,
			Integer danhGia, Date thoiGian, boolean hienThi, boolean xoa) {
		this.tongQuan = tongQuan;
		this.uuDiem = uuDiem;
		this.nhuocDiem = nhuocDiem;
		this.danhGia = danhGia;
		this.thoiGian = thoiGian;
		this.hienThi = hienThi;
		this.xoa = xoa;
	}

	public NhanXetDienThoai(DienThoai dienThoai, KhachHang khachHang,
			String tongQuan, String uuDiem, String nhuocDiem, Integer danhGia,
			Date thoiGian, boolean hienThi, boolean xoa) {
		this.dienThoai = dienThoai;
		this.khachHang = khachHang;
		this.tongQuan = tongQuan;
		this.uuDiem = uuDiem;
		this.nhuocDiem = nhuocDiem;
		this.danhGia = danhGia;
		this.thoiGian = thoiGian;
		this.hienThi = hienThi;
		this.xoa = xoa;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DienThoai getDienThoai() {
		return this.dienThoai;
	}

	public void setDienThoai(DienThoai dienThoai) {
		this.dienThoai = dienThoai;
	}

	public KhachHang getKhachHang() {
		return this.khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public String getTongQuan() {
		return this.tongQuan;
	}

	public void setTongQuan(String tongQuan) {
		this.tongQuan = tongQuan;
	}

	public String getUuDiem() {
		return this.uuDiem;
	}

	public void setUuDiem(String uuDiem) {
		this.uuDiem = uuDiem;
	}

	public String getNhuocDiem() {
		return this.nhuocDiem;
	}

	public void setNhuocDiem(String nhuocDiem) {
		this.nhuocDiem = nhuocDiem;
	}

	public Integer getDanhGia() {
		return this.danhGia;
	}

	public void setDanhGia(Integer danhGia) {
		this.danhGia = danhGia;
	}

	public Date getThoiGian() {
		return this.thoiGian;
	}

	public void setThoiGian(Date thoiGian) {
		this.thoiGian = thoiGian;
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

}
