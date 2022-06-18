package BangunRuang;

import Abstract.*;

public class bola extends BangunRuang{
	private double luasPermukaan;
	private double volume;
	private double phi;
	private double r;
	
	public void setLuasPermukaan(double luasPermukaan) {
		this.luasPermukaan = luasPermukaan;
	}
	
	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	public double getPhi() {
		return phi;
	}
	
	public void setPhi(double phi) {
		this.phi = phi;
	}
	
	public double getR() {
		return r;
	}
	
	public void setR(double r) {
		this.r = r;
	}
	
	@Override
	public double getLuasPermukaan() {
		luasPermukaan = 4 * phi * r * r;
		System.out.println("Luas Permukaan Bola adalah " + luasPermukaan);
		return luasPermukaan;
	}
	
	@Override
	public double getVolume() {
		volume = 4/(double)3 * phi * r * r * r;
		System.out.println("Volume Bola adalah " + volume);
		return volume;
	}
}
