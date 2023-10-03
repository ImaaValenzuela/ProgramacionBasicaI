package pb1.trabajo.practico1;

public class ClaseDePrueba {

	public static void main(String[] args) {
		int capacidadHDD = 1;
		double capacidadDVD = 8.5;
		double capacidadBlueRay = 25.0;
		int cantidadDVDParaBackupearHDD;
		int cantidadBlueRayParaBackupearHDD;
		
		int conversionUnidad = 1024;
		
		cantidadDVDParaBackupearHDD = (int)((capacidadHDD*conversionUnidad)/capacidadDVD);
		cantidadBlueRayParaBackupearHDD = ((capacidadHDD*conversionUnidad)/(int)capacidadBlueRay);
		
		System.out.println("Cantidad DVD que se necesitan para backupear el disco rigido: " + cantidadDVDParaBackupearHDD);
		System.out.println("Cantidad BlueRay que se necesitan para backupear el disco rigido: " + cantidadBlueRayParaBackupearHDD);
	}

}
