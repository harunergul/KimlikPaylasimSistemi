package tr.gov.nvi.kpsv2.model;

import java.io.Serializable;

public class TarihModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer gun;
	private Integer ay;
	private Integer yil;
	
	public Integer getGun() {
		return gun;
	}
	
	public void setGun(Integer gun) {
		this.gun = gun;
	}
	
	public Integer getAy() {
		return ay;
	}
	
	public void setAy(Integer ay) {
		this.ay = ay;
	}
	
	public Integer getYil() {
		return yil;
	}
	
	public void setYil(Integer yil) {
		this.yil = yil;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
    	
    	boolean hasValue = false;
    	
    	if (gun != null) {
    		builder.append(String.format("%02d", gun));
    		
    		hasValue = true;
    	}
    	
    	if (hasValue) {
    		builder.append(".");
    	}
    	
    	if (ay != null) {
    		builder.append(String.format("%02d", ay));
    		
    		hasValue = true;
    	}
    	
    	if (hasValue) {
    		builder.append(".");
    	}
    	
    	if (yil != null) {
    		builder.append(String.format("%04d", yil));
    		
    		hasValue = true;
    	}
    	
    	return builder.toString();
	}
	
}
