package banco.financeiro;
public class PessoaFisica extends Pessoa {
     private String NomeCompleto;
     private String cpf;
     private String rg;
     
     public void setNomeCompleto(String NomeCompleto){
       this.NomeCompleto = NomeCompleto;  
   }
   public String getNomeCompleto(){
       return this.NomeCompleto;
   }
   
   public void setcpf(String cpf){
       this.cpf = cpf;  
   }
   public String getcpf(){
       return this.cpf;
   }
   
   public void setrg(String rg){
       this.rg = rg;  
   }
   public String getrg(){
       return this.rg;
   }
    
}
