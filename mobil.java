package kegiatan2;

public class mobil {
	pembuat author;
	private String namamobil;
	private String hargamobil;
	private String ccmobil;
	private String powermobil;
	private String modelmobil;
	
	public mobil(String namamobil, String hargamobil, String ccmobil, String powermobil, String modelmobil, pembuat author) {
		this.namamobil = namamobil;
		this.hargamobil = hargamobil;
		this.ccmobil = ccmobil;
		this.powermobil = powermobil;
		this.modelmobil = modelmobil;
		this.author = author;
	}
	
	public String getNamamobil() {
		return namamobil;
	}
	
	public String getHargamobil() {
		return hargamobil;
	}
	
	public String getCcmobil() {
		return ccmobil;
	}
	
	public String getPowermobil() {
		return powermobil;
	}
	
	public String getModelmobil() {
		return modelmobil;
	}
	
	public void keluar(){
		System.out.println("Jenis Mobil");
		System.out.println("Nama         : " + getNamamobil());
		System.out.println("Harga        : " + getHargamobil());
		System.out.println("Kapasitas CC : " + getCcmobil());
		System.out.println("Power        : " + getPowermobil());
		System.out.println("Model        : " + getModelmobil());
	}
}






