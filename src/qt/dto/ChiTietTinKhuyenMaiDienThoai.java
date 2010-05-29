package qt.dto;

// Generated May 27, 2010 8:56:45 PM by Hibernate Tools 3.3.0.GA

/**
 * ChiTietTinKhuyenMaiDienThoai generated by hbm2java
 */
@SuppressWarnings("serial")
public class ChiTietTinKhuyenMaiDienThoai implements java.io.Serializable {

	private Integer id;
	private TinKhuyenMaiDienThoai tinKhuyenMai;
	private DienThoai dienThoai;
	private String chiTiet;
	private double mucGiam;
	private boolean xoa;

	public ChiTietTinKhuyenMaiDienThoai() {
	}

	public ChiTietTinKhuyenMaiDienThoai(String chiTiet, double mucGiam,
			boolean xoa) {
		this.chiTiet = chiTiet;
		this.mucGiam = mucGiam;
		this.xoa = xoa;
	}

	public ChiTietTinKhuyenMaiDienThoai(TinKhuyenMaiDienThoai tinKhuyenMai,
			DienThoai dienThoai, String chiTiet, double mucGiam, boolean xoa) {
		this.tinKhuyenMai = tinKhuyenMai;
		this.dienThoai = dienThoai;
		this.chiTiet = chiTiet;
		this.mucGiam = mucGiam;
		this.xoa = xoa;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TinKhuyenMaiDienThoai getTinKhuyenMai() {
		return this.tinKhuyenMai;
	}

	public void setTinKhuyenMai(TinKhuyenMaiDienThoai tinKhuyenMai) {
		this.tinKhuyenMai = tinKhuyenMai;
	}

	public DienThoai getDienThoai() {
		return this.dienThoai;
	}

	public void setDienThoai(DienThoai dienThoai) {
		this.dienThoai = dienThoai;
	}

	public String getChiTiet() {
		return this.chiTiet;
	}

	public void setChiTiet(String chiTiet) {
		this.chiTiet = chiTiet;
	}

	public double getMucGiam() {
		return this.mucGiam;
	}

	public void setMucGiam(double mucGiam) {
		this.mucGiam = mucGiam;
	}

	public boolean isXoa() {
		return this.xoa;
	}

	public void setXoa(boolean xoa) {
		this.xoa = xoa;
	}

}
