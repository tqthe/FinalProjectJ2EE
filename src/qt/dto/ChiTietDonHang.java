package qt.dto;

// Generated Jun 17, 2010 12:35:19 AM by Hibernate Tools 3.3.0.GA

/**
 * ChiTietDonHang generated by hbm2java
 */
public class ChiTietDonHang implements java.io.Serializable {

	private Integer id;
	private Integer soLuong;
	private boolean xoa;
	private SanPham sanPham;
	private DonHang donHang;

	public ChiTietDonHang() {
	}

	public ChiTietDonHang(Integer soLuong, boolean xoa, SanPham sanPham,
			DonHang donHang) {
		this.soLuong = soLuong;
		this.xoa = xoa;
		this.sanPham = sanPham;
		this.donHang = donHang;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSoLuong() {
		return this.soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public boolean isXoa() {
		return this.xoa;
	}

	public void setXoa(boolean xoa) {
		this.xoa = xoa;
	}

	public SanPham getSanPham() {
		return this.sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public DonHang getDonHang() {
		return this.donHang;
	}

	public void setDonHang(DonHang donHang) {
		this.donHang = donHang;
	}

}
