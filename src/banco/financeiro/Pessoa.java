package banco.financeiro;
public class Pessoa {
  
    private String datanascimento;
    private String cidade;
    private String bairro;
    private String endereço;
    
     public void setdatanascimento(String datanascimento ){
       this.datanascimento = datanascimento;  
   }
   public String getdatanascimento(){
       return this.datanascimento;
   }
   
   public void setcidade(String cidade){
       this.cidade = cidade;  
   }
   public String getcidade(){
       return this.cidade;
   }
   
   public void setbairro(String bairro ){
       this.bairro = bairro;  
   }
   public String getbairro(){
       return this.bairro;
   }
   
   public void setendereço(String endereço ){
       this.endereço = endereço;  
   }
   public String getendereço(){
       return this.endereço;
   }
}
