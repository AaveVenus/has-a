package kegiatan2;

public class pembuat {
	private String nama;
	private String ttl;
	private String asal;
	
	public pembuat(String nama, String ttl, String asal){
		this.nama = nama;
		this.ttl = ttl;
		this.asal = asal;
	}
	
	public String getNama() {
		return nama;
	}
	
	public String getTtl() {
		return ttl;
	}
	
	public String getAsal() {
		return asal;
	}
	
	public void display(){
		System.out.println("Nama            : " + getNama());
		System.out.println("Tanggal berdiri : " + getTtl());
		System.out.println("Asal            : " + getAsal());
	}
}
