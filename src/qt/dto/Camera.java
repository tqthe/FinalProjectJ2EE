package qt.dto;

// Generated Jun 12, 2010 11:48:25 PM by Hibernate Tools 3.3.0.GA

/**
 * Camera generated by hbm2java
 */
@SuppressWarnings("serial")
public class Camera implements java.io.Serializable {

	private double doPhanGiaiMayAnh;
	private String moTaMayAnh;

	public Camera() {
	}

	public Camera(double doPhanGiaiMayAnh, String moTaMayAnh) {
		this.doPhanGiaiMayAnh = doPhanGiaiMayAnh;
		this.moTaMayAnh = moTaMayAnh;
	}

	public double getDoPhanGiaiMayAnh() {
		return this.doPhanGiaiMayAnh;
	}

	public void setDoPhanGiaiMayAnh(double doPhanGiaiMayAnh) {
		this.doPhanGiaiMayAnh = doPhanGiaiMayAnh;
	}

	public String getMoTaMayAnh() {
		return this.moTaMayAnh;
	}

	public void setMoTaMayAnh(String moTaMayAnh) {
		this.moTaMayAnh = moTaMayAnh;
	}

}
