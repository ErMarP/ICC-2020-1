package java.ajedrez.piezas;

import java.util.List;
import java.util.LinkedList;


public class Rey extends Pieza {
    public Rey(Color color, Posicion posicion) {
        super(color, posicion);
    }

    @Override
    public List<Posicion> obtenerJugadasLegales() {
            LinkedList<Posicion> jugadas = new LinkedList<>();
            int fila = obtenerPosicion().obtenerFila(),
                columna = obtenerPosicion().obtenerFila();
            if (fila - 1 >= 0 && columna - 1 >= 0) {
                jugadas.add(new Posicion(fila - 1, columna - 1));
            }
            if (columna + 1 <= 7) {
                jugadas.add(new Posicion(fila, columna + 1));
            }
            if (fila + 1 <= 7) {
                jugadas.add(new Posicion(fila + 1, columna));
            }
            return jugadas;
    }
}
