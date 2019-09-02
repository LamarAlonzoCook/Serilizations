package com.lamars.series;

import java.io.Serializable;

public class TerroristOrgs implements Serializable {

	private static final long serialVersionUID = 1223345445432345637L;
	
	private String name;
	private String country;
	private int threatLevel;
	private boolean destroyTerrorist;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getThreatLevel() {
		return threatLevel;
	}
	public void setThreatLevel(int threatLevel) {
		this.threatLevel = threatLevel;
	}
	public boolean isDestroyTerrorist() {
		return destroyTerrorist;
	}
	public void setDestroyTerrorist(boolean destroyTerrorist) {
		this.destroyTerrorist = destroyTerrorist;
	}
	@Override
	public String toString() {
		return "TerroristOrgs [name=" + name + ", country=" + country + ", threatLevel=" + threatLevel
				+ ", destroyTerrorist=" + destroyTerrorist + "]";
	}
	public TerroristOrgs(String name, String country, int threatLevel, boolean destroyTerrorist) {
		super();
		this.name = name;
		this.country = country;
		this.threatLevel = threatLevel;
		this.destroyTerrorist = destroyTerrorist;
	}
	
	
}
