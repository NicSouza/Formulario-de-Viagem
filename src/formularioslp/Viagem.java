package formularioslp;

/**
 *
 * @author nicol
 */
public class Viagem {
   private String origem;
   private String destino;
   
   public String getOrigem(){
       return origem;
   }
   
   public String getDestino(){
       return destino;
   }
   
   
   public Viagem(String origem, String destino){
       this.origem = origem;
       this.destino = destino;
   }
}
