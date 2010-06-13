package qt.dto;

// Generated Jun 12, 2010 11:48:25 PM by Hibernate Tools 3.3.0.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * KhachHang generated by hbm2java
 */
@SuppressWarnings("serial")
public class KhachHang extends qt.dto.Account implements java.io.Serializable {

	private Date ngaySinh;
	private String diaChi;
	private String soDienThoai;
	private Set<GopY> dsGopY = new HashSet<GopY>(0);
	private Set<DonHang> dsDonHang = new HashSet<DonHang>(0);
	private Set<NhanXetDienThoai> dsNhanXetDienThoai = new HashSet<NhanXetDienThoai>(
			0);

	public KhachHang() {
	}

	public KhachHang(String username, String pass, Integer trangThai,
			String ho, String ten, String email, Integer gioiTinh, boolean xoa) {
		super(username, pass, trangThai, ho, ten, email, gioiTinh, xoa);
	}

	public KhachHang(String username, String pass, Integer trangThai,
			String ho, String dem, String ten, String email, Integer gioiTinh,
			boolean xoa, Date ngaySinh, String diaChi, String soDienThoai,
			Set<GopY> dsGopY, Set<DonHang> dsDonHang,
			Set<NhanXetDienThoai> dsNhanXetDienThoai) {
		super(username, pass, trangThai, ho, dem, ten, email, gioiTinh, xoa);
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.dsGopY = dsGopY;
		this.dsDonHang = dsDonHang;
		this.dsNhanXetDienThoai = dsNhanXetDienThoai;
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

	public Set<GopY> getDsGopY() {
		return this.dsGopY;
	}

	public void setDsGopY(Set<GopY> dsGopY) {
		this.dsGopY = dsGopY;
	}

	public Set<DonHang> getDsDonHang() {
		return this.dsDonHang;
	}

	public void setDsDonHang(Set<DonHang> dsDonHang) {
		this.dsDonHang = dsDonHang;
	}

	public Set<NhanXetDienThoai> getDsNhanXetDienThoai() {
		return this.dsNhanXetDienThoai;
	}

	public void setDsNhanXetDienThoai(Set<NhanXetDienThoai> dsNhanXetDienThoai) {
		this.dsNhanXetDienThoai = dsNhanXetDienThoai;
	}

}
