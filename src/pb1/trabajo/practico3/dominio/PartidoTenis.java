package pb1.trabajo.practico3.dominio;

import java.util.Random;

public class PartidoTenis {
    private String jugador1;
    private String jugador2;
    private int setsGanadosJugador1;
    private int setsGanadosJugador2;
    private int setsJugados;
    private Random random;

    public PartidoTenis(String jugador1, String jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.setsGanadosJugador1 = 0;
        this.setsGanadosJugador2 = 0;
        this.setsJugados = 0;
        this.random = new Random();
    }

    public void jugarSet() {
        int resultadoSet = random.nextInt(2);
        if (resultadoSet == 0) {
            setsGanadosJugador1++;
        } else {
            setsGanadosJugador2++;
        }
        setsJugados++;
    }

    public String getGanador() {
        int setsGanadosJugador1 = 0;
        int setsGanadosJugador2 = 0;

        for (int i = 0; i < setsJugados; i++) {
            String ganador = (i % 2 == 0) ? jugador1 : jugador2;
            if (ganador.equals(jugador1)) {
                setsGanadosJugador1++;
            } else {
                setsGanadosJugador2++;
            }
        }

        if (setsGanadosJugador1 > setsGanadosJugador2) {
            return jugador1;
        } else {
            return jugador2;
        }
    }

    public String obtenerResultadoSet() {
        int ultimoResultado = setsJugados - 1;
        String ganador = (ultimoResultado % 2 == 0) ? jugador1 : jugador2;
        return ganador;
    }

    public String obtenerHistorial() {
        String historial = "Historial de sets:\n";
        for (int i = 0; i < setsJugados; i++) {
            String ganador = (i % 2 == 0) ? jugador1 : jugador2;
            historial += "Set " + (i + 1) + ": " + ganador + "\n";
        }
        return historial;
    }


	public void setJugador1(String jugador1) {
		this.jugador1 = jugador1;
	}


	public void setJugador2(String jugador2) {
		this.jugador2 = jugador2;
	}

}