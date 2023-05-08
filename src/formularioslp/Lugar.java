package formularioslp;

/**
 *
 * @author nicol
 */
public class Lugar {
   private String local;
   private String endereco;
   
   public String getLocal(){
       return local;
   }
   
   public String getEndereco(){
       return endereco;
   }
   
   
   public Lugar(String local, String endereco){
       this.local = local;
       this.endereco = endereco;
   }
    
}
