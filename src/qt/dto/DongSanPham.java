package qt.dto;

// Generated Jun 20, 2010 4:44:09 PM by Hibernate Tools 3.3.0.GA

import java.util.HashSet;
import java.util.Set;

/**
 * DongSanPham generated by hbm2java
 */
public class DongSanPham implements java.io.Serializable {

	private Integer id;
	private String ten;
	private Set<DienThoai> dsDienThoai = new HashSet<DienThoai>(0);

	public DongSanPham() {
	}

	public DongSanPham(String ten) {
		this.ten = ten;
	}

	public DongSanPham(String ten, Set<DienThoai> dsDienThoai) {
		this.ten = ten;
		this.dsDienThoai = dsDienThoai;
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

	public Set<DienThoai> getDsDienThoai() {
		return this.dsDienThoai;
	}

	public void setDsDienThoai(Set<DienThoai> dsDienThoai) {
		this.dsDienThoai = dsDienThoai;
	}

}
