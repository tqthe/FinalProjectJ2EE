package qt.dto;

// Generated Jun 17, 2010 12:35:19 AM by Hibernate Tools 3.3.0.GA

/**
 * MultiMedia generated by hbm2java
 */
public class MultiMedia implements java.io.Serializable {

	private String ngheNhac;
	private String xemPhim;
	private boolean FMRadio;
	private boolean xemTivi;
	private String troChoi;
	private boolean loaNgoai;
	private String ghiAm;
	private boolean ghiAmCuocGoi;
	private boolean videoCall;
	private String quayPhim;

	public MultiMedia() {
	}

	public MultiMedia(String ngheNhac, String xemPhim, boolean FMRadio,
			boolean xemTivi, String troChoi, boolean loaNgoai, String ghiAm,
			boolean ghiAmCuocGoi, boolean videoCall, String quayPhim) {
		this.ngheNhac = ngheNhac;
		this.xemPhim = xemPhim;
		this.FMRadio = FMRadio;
		this.xemTivi = xemTivi;
		this.troChoi = troChoi;
		this.loaNgoai = loaNgoai;
		this.ghiAm = ghiAm;
		this.ghiAmCuocGoi = ghiAmCuocGoi;
		this.videoCall = videoCall;
		this.quayPhim = quayPhim;
	}

	public String getNgheNhac() {
		return this.ngheNhac;
	}

	public void setNgheNhac(String ngheNhac) {
		this.ngheNhac = ngheNhac;
	}

	public String getXemPhim() {
		return this.xemPhim;
	}

	public void setXemPhim(String xemPhim) {
		this.xemPhim = xemPhim;
	}

	public boolean isFMRadio() {
		return this.FMRadio;
	}

	public void setFMRadio(boolean FMRadio) {
		this.FMRadio = FMRadio;
	}

	public boolean isXemTivi() {
		return this.xemTivi;
	}

	public void setXemTivi(boolean xemTivi) {
		this.xemTivi = xemTivi;
	}

	public String getTroChoi() {
		return this.troChoi;
	}

	public void setTroChoi(String troChoi) {
		this.troChoi = troChoi;
	}

	public boolean isLoaNgoai() {
		return this.loaNgoai;
	}

	public void setLoaNgoai(boolean loaNgoai) {
		this.loaNgoai = loaNgoai;
	}

	public String getGhiAm() {
		return this.ghiAm;
	}

	public void setGhiAm(String ghiAm) {
		this.ghiAm = ghiAm;
	}

	public boolean isGhiAmCuocGoi() {
		return this.ghiAmCuocGoi;
	}

	public void setGhiAmCuocGoi(boolean ghiAmCuocGoi) {
		this.ghiAmCuocGoi = ghiAmCuocGoi;
	}

	public boolean isVideoCall() {
		return this.videoCall;
	}

	public void setVideoCall(boolean videoCall) {
		this.videoCall = videoCall;
	}

	public String getQuayPhim() {
		return this.quayPhim;
	}

	public void setQuayPhim(String quayPhim) {
		this.quayPhim = quayPhim;
	}

}
