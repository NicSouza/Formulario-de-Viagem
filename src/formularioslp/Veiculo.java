package formularioslp;

/**
 *
 * @author nicol
 */
public class Veiculo {
   private String tipo;
   private String cor;
   private String modelo;
   
   public String getTipo(){
       return tipo;
   }
   
   public String getCor(){
       return cor;
   }
   
   public String getModelo(){
       return modelo;
   }
   
   public Veiculo(String tipo, String cor, String modelo){
       this.tipo = tipo;
       this.cor = cor;
       this.modelo = modelo;
   } 
}
