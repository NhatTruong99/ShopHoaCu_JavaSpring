package webhoacu.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hangsanxuat")
public class HangSanXuat {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long maHangSX;
	  
	  @Column(name = "TenHangSX")
	  private String tenHangSX;
	  
	  @Column(name = "DacDiem")
	  private String dacDiem;

	public long getMaHangSX() {
		return maHangSX;
	}

	public void setMaHangSX(long maHangSX) {
		this.maHangSX = maHangSX;
	}

	public String getTenHangSX() {
		return tenHangSX;
	}

	public void setTenHangSX(String tenHangSX) {
		this.tenHangSX = tenHangSX;
	}

	public String getDacDiem() {
		return dacDiem;
	}

	public void setDacDiem(String dacDiem) {
		this.dacDiem = dacDiem;
	}

	public HangSanXuat() {
		
	}
	  
	
}
