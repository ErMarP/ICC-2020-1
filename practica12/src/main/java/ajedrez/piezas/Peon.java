package java.ajedrez.piezas;

import java.util.List;
import java.util.LinkedList;

public class Peon extends Pieza {
    public Peon(Color color, Posicion posicion) {
        super(color, posicion);
    }

    @Override
    public List<Posicion> obtenerJugadasLegales() {
        LinkedList<Posicion> jugadas = new LinkedList<>();
        int fila = obtenerPosicion().obtenerFila(),
            columna = obtenerPosicion().obtenerFila();
        if (this.obtenerColor() == Color.BLANCO) {
            if (this.obtenerPosicion().obtenerFila() == 6 && fila - 2 <= 7) {
                jugadas.add(new Posicion(fila - 2, columna));
            }
            if (fila - 1 >= 0 && columna - 1 >= 0) {
                jugadas.add(new Posicion(fila - 1, columna - 1));
            }
            if (columna + 1 <= 7 && fila - 1 >= 0) {
                jugadas.add(new Posicion(fila - 1, columna + 1));
            }
            if (fila - 1 <= 7) {
                jugadas.add(new Posicion(fila - 1, columna));
            }
        }else{
            if (this.obtenerPosicion().obtenerFila() == 1 && fila + 2 >= 0) {
                 jugadas.add(new Posicion(fila + 2, columna));
            }
            if (fila + 1 <= 7 && columna + 1 <= 7) {
                jugadas.add(new Posicion(fila + 1, columna + 1));
            }
            if (columna - 1 >= 0 && fila + 1 <= 7) {
                jugadas.add(new Posicion(fila + 1, columna - 1));
            }
            if (fila + 1 >= 7) {
                jugadas.add(new Posicion(fila + 1, columna));
            }
        }
        return jugadas;
    }
} 
                  
        
    
