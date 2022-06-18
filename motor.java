package kegiatan2;

public class motor {
	private String namamotor;
	private String hargamotor;
	private String ccmotor;
	private String powermotor;
	private String modelmotor;
	pembuat author;
	
	public motor(String namamotor, String hargamotor, String ccmotor, String powermotor, String modelmotor, pembuat author){
		this.namamotor = namamotor;
		this.hargamotor = hargamotor;
		this.ccmotor = ccmotor;
		this.powermotor = powermotor;
		this.modelmotor = modelmotor;
		this.author = author;
	}
	
	public String getNama() {
		return namamotor;
	}
	
	public String getHarga() {
		return hargamotor;
	}
	
	public String getCc() {
		return ccmotor;
	}
	
	public String getPowermotor() {
		return powermotor;
	}
	
	public String getModel() {
		return modelmotor;
	}
	
	public void metu(){
		System.out.println("Jenis Motor");
		System.out.println("Nama         : " + getNama());
		System.out.println("Harga        : " + getHarga());
		System.out.println("Kapasitas CC : " + getCc());
		System.out.println("Power        : " + getPowermotor());
		System.out.println("Model        : " + getModel());
	}
}
