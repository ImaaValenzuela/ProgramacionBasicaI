package pb1.trabajo.practico2.interfaces;

import pb1.trabajo.practico2.dominios.DiscoRigido;

public class EjemploDiscoRigido {
	public static void main(String args[]) {
		DiscoRigido seagate = new DiscoRigido(10);
		DiscoRigido hitachi = new DiscoRigido(20);
		DiscoRigido westernDigital = new DiscoRigido(32);
		DiscoRigido toshiba = new DiscoRigido(48);
        System.out.println("Seagate de 10 TB:");
        System.out.println("Equivale a " + seagate.capacidadDvd() + " DVDs de 4.5GB.");
        System.out.println("Equivale a " + seagate.capacidadBlueRay() + " Blu-Rays de 15GB.");
        
        System.out.println("\nHitachi de 20TB:");
        System.out.println("Equivale a " + hitachi.capacidadDvd() + " DVDs de 4.5GB.");
        System.out.println("Equivale a " + hitachi.capacidadBlueRay() + " Blu-Rays de 15GB.");

        System.out.println("\nWestern Digital de 32TB:");
        System.out.println("Equivale a " + westernDigital.capacidadDvd() + " DVDs de 4.5GB.");
        System.out.println("Equivale a " + westernDigital.capacidadBlueRay() + " Blu-Rays de 15GB.");
        
        System.out.println("\nToshiba de 48TB:");
        System.out.println("Equivale a " + toshiba.capacidadDvd() + " DVDs de 4.5GB.");
        System.out.println("Equivale a " + toshiba.capacidadBlueRay() + " Blu-Rays de 15GB.");
	}
}
