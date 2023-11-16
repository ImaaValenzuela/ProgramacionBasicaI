package pb1.trabajo.practico6.dominio;

public class Destornillador {
    private final char TIPO_DE_CABEZA;

    public Destornillador(char tipoDeCabeza) {
        this.TIPO_DE_CABEZA = tipoDeCabeza;
    }

    public void desatornillar(Tornillo tornillo) {
        if (tornillo != null && TIPO_DE_CABEZA == tornillo.getTipoDeCabeza()) {
            // Implementa la lógica para desatornillar
            int posicionInicial = tornillo.getPosicionActual();
            tornillo.girar('2', posicionInicial);
        } else {
            System.out.println("No se puede desatornillar con este destornillador o no hay un tornillo.");
        }
    }

    public void atornillar(Tornillo tornillo) {
        if (tornillo != null && TIPO_DE_CABEZA == tornillo.getTipoDeCabeza()) {
            // Implementa la lógica para atornillar
            int posicionFinal = tornillo.getCantidadRosca();
            tornillo.girar('1', posicionFinal);
        } else {
            System.out.println("No se puede atornillar con este destornillador o no hay un tornillo.");
        }
    }

    public void desatornillar(Tornillo tornillo, Tarugo tarugo) {
        if (tornillo != null && tarugo != null && TIPO_DE_CABEZA == tornillo.getTipoDeCabeza()) {
            // Implementa la lógica para desatornillar con tarugo
            int posicionInicial = tornillo.getPosicionActual();
            int longitudTarugo = tarugo.getLONGITUD();
            tornillo.girar('2', posicionInicial + longitudTarugo);
        } else {
            System.out.println("No se puede desatornillar con este destornillador, no hay un tornillo o no hay tarugo.");
        }
    }

    public void atornillar(Tornillo tornillo, Tarugo tarugo) {
        if (tornillo != null && tarugo != null && TIPO_DE_CABEZA == tornillo.getTipoDeCabeza()) {
            // Implementa la lógica para atornillar con tarugo
            int posicionFinal = tornillo.getCantidadRosca();
            int longitudTarugo = tarugo.getLONGITUD();
            tornillo.girar('1', posicionFinal - longitudTarugo);
        } else {
            System.out.println("No se puede atornillar con este destornillador, no hay un tornillo o no hay tarugo.");
        }
    }
}
