/**
 * Programa para obtener libro
 * @author Erick Martinez Piza
 * @version 1.0
 */
public class Libro {
    String titulo, autor;
    int año;
      /**
       * Constructor default
       */
      public Libro(){
	  titulo = "";
	  autor = "";
	  año = 0;
       }
      /**
       * constructor con variables predefinidas
       * @param titulo default
       * @param autor default
       * @param año default
       */  
      public Libro (String titulo, String autor, int año) {
	  this.titulo = titulo;
	  this.autor = autor;
	  this.año = año;
      }
      /**
       * asigna nuevo titulo
       * @param titulo nuevo titulo
       */
      public void setTitulo(String titulo){
	  this.titulo = titulo;
      }
      /**                                                                                                                                 
       * asigna nuevo autor                                                                                                                   
       * @param autor nuevo autor                                                                                                            
       */
      public void setAutor(String autor){
          this.autor = autor;
      }
      /**                                                                                                                                 
       * asigna nuevo año                                                                                                                   
       * @param año nuevo año publicacion                                                                                                      
       */
      public void setAño(int año){
          this.año = año;
      }
      /**
       * ver el titulo
       * @return el titulo
       */ 
      public String getTitulo() {
	  return titulo;
      }
      /**                                                                                                                                 
       * ver el autor                                                                                                                      
       * @return el autor
       */
      public String getAutor() {
          return autor;
      }
      /**                                                                                                                                      
       * ver el año                                                                                                                      
       * @return el año
       */
      public int getAño() {
          return año;
      }   
}
