package qt.dto;

// Generated Jun 8, 2010 3:50:20 AM by Hibernate Tools 3.3.0.GA

/**
 * Account generated by hbm2java
 */
@SuppressWarnings("serial")
public class Account implements java.io.Serializable {

	private Integer id;
	private String username;
	private String pass;
	private String pass2; // for confirm password in register form  (not persistent in database)
	private Integer trangThai;
	private String ho;
	private String dem;
	private String ten;
	private String email;
	private boolean xoa;

	public Account() {
	}

	public Account(String username, String pass, Integer trangThai, String ho,
			String ten, String email, boolean xoa) {
		this.username = username;
		this.pass = pass;
		this.trangThai = trangThai;
		this.ho = ho;
		this.ten = ten;
		this.email = email;
		this.xoa = xoa;
	}

	public Account(String username, String pass, Integer trangThai, String ho,
			String dem, String ten, String email, boolean xoa) {
		this.username = username;
		this.pass = pass;
		this.trangThai = trangThai;
		this.ho = ho;
		this.dem = dem;
		this.ten = ten;
		this.email = email;
		this.xoa = xoa;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Integer getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Integer trangThai) {
		this.trangThai = trangThai;
	}

	public String getHo() {
		return this.ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getDem() {
		return this.dem;
	}

	public void setDem(String dem) {
		this.dem = dem;
	}

	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isXoa() {
		return this.xoa;
	}

	public void setXoa(boolean xoa) {
		this.xoa = xoa;
	}

	/**
	 * @param pass2 the pass2 to set
	 */
	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}

	/**
	 * @return the pass2
	 */
	public String getPass2() {
		return pass2;
	}

}
