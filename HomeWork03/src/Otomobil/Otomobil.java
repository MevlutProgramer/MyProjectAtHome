package Otomobil;

public class Otomobil {
private Motor motor;
private Şanziman sanzıman;
private Teker[] teker;

public Otomobil(Motor motor,Şanziman Sanzıman,Teker[] teker ) {
	this.motor=motor;
	this.sanzıman=sanzıman;
	this.teker=teker;
	
}
public void lastikDegis(Teker teker) {
	System.out.println("teker degisti ");
}
public void ilerle(int hız,int mesafe ) {
	System.out.println(hız+" km/h hiz ile "+mesafe+" km mesafe gidildi ");
	
}
}
