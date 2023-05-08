package formularioslp;

/**
 *
 * @author nicol
 */
public class Pessoa {
   private String tNome;
   private String tSexo;
   private String tNacionalidade;
   
   public String getTNome(){
       return tNome;
   }
   
   public String getTSexo(){
       return tSexo;
   }
   
   public String getTNacionalidade(){
       return tNacionalidade;
   }
   
   public Pessoa(String tNome, String tSexo, String tNacionalidade){
       this.tNome = tNome;
       this.tSexo = tSexo;
       this.tNacionalidade = tNacionalidade;
   }
}
