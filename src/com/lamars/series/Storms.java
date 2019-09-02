package com.lamars.series;

import java.io.Serializable;

public class Storms implements Serializable {

	private static final long serialVersionUID = 3298877464647364L;
	
	private int categorie;
	private int lightningStrikesperMin;
	private double rainFall;
	private int windSpeed;
	public int getCategorie() {
		return categorie;
	}
	public void setCategorie(int categorie) {
		this.categorie = categorie;
	}
	public int getLightningStrikesperMin() {
		return lightningStrikesperMin;
	}
	public void setLightningStrikesperMin(int lightningStrikesperMin) {
		this.lightningStrikesperMin = lightningStrikesperMin;
	}
	public double getRainFall() {
		return rainFall;
	}
	public void setRainFall(double rainFall) {
		this.rainFall = rainFall;
	}
	public int getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}
	@Override
	public String toString() {
		return "Storms [categorie=" + categorie + ", lightningStrikesperMin=" + lightningStrikesperMin + ", rainFall="
				+ rainFall + ", windSpeed=" + windSpeed + "]";
	}
	public Storms(int categorie, int lightningStrikesperMin, double rainFall, int windSpeed) {
		super();
		this.categorie = categorie;
		this.lightningStrikesperMin = lightningStrikesperMin;
		this.rainFall = rainFall;
		this.windSpeed = windSpeed;
	}
	
	
}
