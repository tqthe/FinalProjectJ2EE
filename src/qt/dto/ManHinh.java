package qt.dto;

// Generated May 27, 2010 8:56:45 PM by Hibernate Tools 3.3.0.GA

/**
 * ManHinh generated by hbm2java
 */
@SuppressWarnings("serial")
public class ManHinh implements java.io.Serializable {

	private String loaiManHinh;
	private Integer soMauManHinh;
	private Integer chieuRongManHinh;
	private Integer chieuCaoManHinh;
	private boolean camUng;
	private boolean chiTietCamUng;

	public ManHinh() {
	}

	public ManHinh(String loaiManHinh, Integer soMauManHinh,
			Integer chieuRongManHinh, Integer chieuCaoManHinh, boolean camUng,
			boolean chiTietCamUng) {
		this.loaiManHinh = loaiManHinh;
		this.soMauManHinh = soMauManHinh;
		this.chieuRongManHinh = chieuRongManHinh;
		this.chieuCaoManHinh = chieuCaoManHinh;
		this.camUng = camUng;
		this.chiTietCamUng = chiTietCamUng;
	}

	public String getLoaiManHinh() {
		return this.loaiManHinh;
	}

	public void setLoaiManHinh(String loaiManHinh) {
		this.loaiManHinh = loaiManHinh;
	}

	public Integer getSoMauManHinh() {
		return this.soMauManHinh;
	}

	public void setSoMauManHinh(Integer soMauManHinh) {
		this.soMauManHinh = soMauManHinh;
	}

	public Integer getChieuRongManHinh() {
		return this.chieuRongManHinh;
	}

	public void setChieuRongManHinh(Integer chieuRongManHinh) {
		this.chieuRongManHinh = chieuRongManHinh;
	}

	public Integer getChieuCaoManHinh() {
		return this.chieuCaoManHinh;
	}

	public void setChieuCaoManHinh(Integer chieuCaoManHinh) {
		this.chieuCaoManHinh = chieuCaoManHinh;
	}

	public boolean isCamUng() {
		return this.camUng;
	}

	public void setCamUng(boolean camUng) {
		this.camUng = camUng;
	}

	public boolean isChiTietCamUng() {
		return this.chiTietCamUng;
	}

	public void setChiTietCamUng(boolean chiTietCamUng) {
		this.chiTietCamUng = chiTietCamUng;
	}

}
