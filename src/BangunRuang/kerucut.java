package BangunRuang;

import Abstract.*;

public class kerucut extends BangunRuang {
	private double luasPermukaan;
	private double volume;
	private double phi;
	private double s;
	private double r;
	private double t;

	public double getPhi() {
		return phi;
	}

	public void setPhi(double phi) {
		this.phi = phi;
	}

	public double getS() {
		return s;
	}

	public void setS(double s) {
		this.s = s;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}

	@Override
	public double getLuasPermukaan() {
		luasPermukaan = phi * r * (r + s);
		System.out.println("Luas Permukaan kerucut adalah " + luasPermukaan);
		return luasPermukaan;
	}

	@Override
	public double getVolume() {
		volume = 1 / (double) 3 * phi * r * r * t;
		System.out.println("Volume kerucut adalah " + volume);
		return volume;
	}
}
