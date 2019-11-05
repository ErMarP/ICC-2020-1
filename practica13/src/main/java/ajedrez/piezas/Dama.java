package ajedrez.piezas;

import ajedrez.Tablero;
import java.util.List;
import java.util.LinkedList;

public class Dama extends Pieza {
    public Dama(Color color, Posicion posicion) {
        super(color, posicion); 
    }
    
    @Override
    public List<Posicion> obtenerJugadasLegales() {
        LinkedList<Posicion> jugadas = new LinkedList<>();
        int fila = obtenerPosicion().obtenerFila(),
            columna = obtenerPosicion().obtenerColumna();
            Tablero tab = Tablero.obtenerInstancia();
            
        for (int i = fila + 1; i <= 7; i ++){
            Pieza p = tab.obtenerPieza(i, columna);
            if(p == null){
                jugadas.add(new Posicion(fila + i, columna));
            }else{
                if(this.obtenerColor() == p.obtenerColor()){
                    break;
                }else{
                    jugadas.add(new Posicion(fila + (p.obtenerPosicion().obtenerFila()), columna)); 
                    break;                     
                }
            }
        }

        for (int i = fila,j = columna; i <= 7 && j <= 7; i ++, j ++){
            Pieza h = tab.obtenerPieza(i, j);
            if(h == null){
                jugadas.add(new Posicion(fila + i, columna + j));
            }else{
                if(this.obtenerColor() == h.obtenerColor()){
                    break;
                }else{
                    jugadas.add(new Posicion(fila + (h.obtenerPosicion().obtenerFila()), columna + h.obtenerPosicion().obtenerColumna())); 
                    break;                     
                }
            }
        } 

        for (int i = fila - 1; i >= 0; i --){
            Pieza f = tab.obtenerPieza(i, columna);
            if(f == null){
                jugadas.add(new Posicion(fila - i, columna));
            }else{
                if(this.obtenerColor() == f.obtenerColor()){
                    break;
                }else{
                    jugadas.add(new Posicion(fila - (f.obtenerPosicion().obtenerFila()), columna));  
                    break;                    
                }
            }
        }

        for (int i = fila,j = columna; i >= 0 && j >= 0; i --, j --){
            Pieza e = tab.obtenerPieza(i, j);
            if(e == null){
                jugadas.add(new Posicion(fila - i, columna - j));                 
            }else{
                if(this.obtenerColor() == e.obtenerColor()){
                    break;
                }else{
                    jugadas.add(new Posicion(fila - (e.obtenerPosicion().obtenerFila()), columna - e.obtenerPosicion().obtenerColumna())); 
                    break;                     
                }
            }
        }

        for (int i = columna - 1; i >= 0; i --){
            Pieza d = tab.obtenerPieza(fila, i);
            if(d == null){
                jugadas.add(new Posicion(fila, columna - i));
            }else{
                if(this.obtenerColor() == d.obtenerColor()){
                    break;
                }else{
                    jugadas.add(new Posicion(fila, columna - (d.obtenerPosicion().obtenerFila()))); 
                    break;                     
                }
            }

        } 

        for (int i = fila,j = columna; i >= 0 && j <= 7; i --, j ++){
            Pieza c = tab.obtenerPieza(i, j);
            if(c == null){
                jugadas.add(new Posicion(fila - i, columna + j));       
            }else{
                if(this.obtenerColor() == c.obtenerColor()){
                    break;
                }else{
                    jugadas.add(new Posicion(fila - (c.obtenerPosicion().obtenerFila()), columna + c.obtenerPosicion().obtenerColumna())); 
                    break;                     
                }
            }
        }

        for (int i = columna + 1; i <= 7; i ++){
            Pieza b = tab.obtenerPieza(fila, i);
            if(b == null){
                jugadas.add(new Posicion(fila, columna + i));
            }else{
                if(this.obtenerColor() == b.obtenerColor()){
                    break;
                }else{
                    jugadas.add(new Posicion(fila, columna + (b.obtenerPosicion().obtenerFila()))); 
                    break;
                }
            }
        }   
        
        for (int i = fila,j = columna; i <= 7 && j >= 0; i ++, j --){
            Pieza a = tab.obtenerPieza(i, j);
            if(a == null){
                jugadas.add(new Posicion(fila + i, columna - j));                 
            }else{
                if(this.obtenerColor() == a.obtenerColor()){
                    break;
                }else{
                    jugadas.add(new Posicion(fila + (a.obtenerPosicion().obtenerFila()), columna - a.obtenerPosicion().obtenerColumna()));   
                    break;                   
                }
            }
        }
        return jugadas;
    }
}