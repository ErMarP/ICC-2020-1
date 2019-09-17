package geometria;
/**
 * Representa un poligono de tres lados.
 * Definido por tres puntos en el plano cartesiano.
 */
public class Triangulo {
    //atributos
    private Punto a, b, c;
    /**
     * Triangulo con todos sus lados de longitud distinta.
     */
    public static final int ESCALENO = 2;
    /**                                                                        
     * Triangulo con exactamente dos lados de la misma longitud.
     */
    public static final int ISOSCELES = 1;
    /**                                                
     * Triangulo con todos sus lados de la misma longitud.          
     */
    public static final int EQUILATERO = 0;
    /**
     * Crea un triángulo equilátero de lado 1 con vértices 
     * en (0, 0), (1, 0) y (0.5, sin(π / 3)).
     */
    public Triangulo(){
	a = new Punto(0,0);
	b = new Punto(1,0);
	c = new Punto(0.5,(Math.sin(Math.PI/3)));
    }
    /**
     * Crea un triangulo con los tres puntos dados
     * @param punto primer punto 
     * @param punto segundo punto
     * @param punto tercer punto
     */
    public Triangulo(Punto a, Punto b, Punto c){
	this.a = a;
	this.b = b;
	this.c = c;
    }
    /**
     * Determina si los vértices de este triángulo están alineados.
     * @return true si los vertices estan alineados.
     */
    public boolean tieneVerticesAlineados(){
	return a.estanAlineados(b, c);
    }
    /**
     * Regresa el tipo de este triángulo según la longitud de sus lados; 
     * puede ser equilátero, isósceles o escaleno.
     * @return El tipo de este triangulo
     */
    public int tipo(){
	double d1 = a.distancia(b);
	double d2 = b.distancia(c);
	double d3 = c.distancia(a);

	if (d1 == d2 && d2 == d3){
	    return EQUILATERO;
	}
	if (d1 == d2 || d2 == d3 || d3 == d1){
	    return ISOSCELES;
	}
	return ESCALENO;
    }
}


