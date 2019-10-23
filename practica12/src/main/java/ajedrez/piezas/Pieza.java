package java.ajedrez.piezas;

import java.util.List;

import java.ajedrez.piezas.Posicion;

public abstract class Pieza {

    private Color color;
    private Posicion posicion;

    /**
     * Constructor con parametros
     * @param color el color de la pieza
     * @param posicion la posicion de inicio
     */
    public Pieza (Color color, Posicion posicion) {
        this.color = color;
        this.posicion = posicion;
    }
    public abstract List<Posicion> obtenerJugadasLegales();

    public Color obtenerColor() {
        return color;
    }

    public Posicion obtenerPosicion() {
        return posicion;
    }

    public void asiganrPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pieza otra = (Pieza) obj;
        return color == otra.color && posicion.equals(otra.obtenerPosicion());
    }
}
