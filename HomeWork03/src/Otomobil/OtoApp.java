package Otomobil;

public class OtoApp {
public static void main(String[] args) {
	

	
	Motor motor=new Motor("tsi", "1,6" );
	Şanziman Sanziman =new Şanziman(7, true, "JVS");
	Teker teker1=new Teker("16",true);
	Teker teker2=new Teker("16",true);
	Teker teker3=new Teker("16",true);
	Teker teker4=new Teker("16",true);

	Teker[] tekerler= {teker1,teker2,teker3,teker4};
Otomobil oto =new  Otomobil(motor, Sanziman, tekerler);

oto.ilerle(80, 600);
oto.lastikDegis(teker4);
}
}
