package banco.financeiro;

public class ContaCorrenteSimplificada {
    private String agencia;
    private String nConta;
    private double saldo;
    private String Dados;
    private Pessoa pessoa;
    private Pessoa[] pessoas = new Pessoa[100];
    private int qtd = 0;
    
    public boolean adicionar(Pessoa p){
     if(qtd < 100){
         qtd++;
      pessoas[qtd] = p;
      return true;
     }
     return false;
    }
    
    
    public double depositar(double valor){
        this.saldo = this.saldo + valor;
        return this.saldo;
    }
    
    public void exibirDados(){
       
        System.out.println("AGENCIA: " + this.agencia);
        System.out.println("CONTA-CORRENTE: " + this.nConta);
       
        for(int i = 0; i < qtd; i++){
            if(this.pessoas[i] instanceof PessoaFisica){
                System.out.println("NOME: " + ((PessoaFisica) this.pessoas[i]).getNomeCompleto());
                System.out.println("RG: " + ((PessoaFisica) this.pessoas[i]).getrg());
                System.out.println("CPF: " + ((PessoaFisica) this.pessoas[i]).getcpf());
    }
            if(this.pessoas[i] instanceof PessoaJuridica){
                System.out.println("NOME: " + ((PessoaJuridica) this.pessoas[i]).getNomeFantasia());
                System.out.println("RG: " + ((PessoaJuridica) this.pessoas[i]).getRazaoSocial());
                System.out.println("CPF: " + ((PessoaJuridica) this.pessoas[i]).getCNPJ());
            }
            }
        System.out.println("SALDO: " + this.saldo);
    }
    
    public double sacar(double valor){
        if(saldo < valor){
        System.out.println("saldo insuficiente");
    }
        else{
            this.saldo = this.saldo - valor;
            }
    return this. saldo;
    }
    
    public void setAgencia(String agencia){
        this.agencia = agencia;
        
    }
    public String getAgencia(){
        return this.agencia;
    }
    
    public void setnConta(String nConta){
        this.nConta = nConta;
    }
    public String getnConta(){
        return this.nConta;
    }
    
    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;                
    }
    public Pessoa getpessoa(){
        return this.pessoa;
    }
}