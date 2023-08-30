
public class InnerLibro {
    String titulo;
    String autor;
    int numPaguinas;
   
   public Libro(String titulo, String autor, int numPagina){
       this.titulo= titulo;
       this.autor= autor;
       this.numPaguinas = numPagina;
   }

   public String resumen(){
       return "titulo:" + titulo + "\nautor "+ autor +"\n numero de paginas" + numPaguinas;
   }
   public static void main(String[] args) {
       Libro milibro = new Libro("el gran gasbi ", "f. scot fitzegal", 180 );
       System.out.print(milibro.resumen());
   }

}
