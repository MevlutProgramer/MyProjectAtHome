package Otomobil;

public class Şanziman extends Honda{

	private  int vites;
	private boolean otomatikMi;
	
	public Şanziman(int vites, boolean vitesDurumu,String model ) {
		super(model);
this.otomatikMi=vitesDurumu;
this.vites=vites;

		
	}
 	

}
