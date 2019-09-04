package banco.financeiro;
public class Principal {
  public static void main(String[]args){
  
  ContaCorrenteSimplificada conta1;
  
  conta1 = new ContaCorrenteSimplificada(); 
  
  PessoaFisica p1 = new PessoaFisica();
  conta1.setAgencia("123");
  conta1.setnConta("5558-8");
  
  
  p1.setcpf("123.456.789.22");
  p1.setrg("55789-6");
  p1.setNomeCompleto("JOÃO DA SILVA SAURO");
  
  conta1.setPessoa(p1);
  
   double resultado = conta1.depositar(200 - 50);
  double saldofinal = conta1.sacar(1000);
  System.out.println(saldofinal);
  System.out.println("===========================");
  conta1.exibirDados();
  
  System.out.println("===========================");
  ContaCorrenteSimplificada conta2;
  
  conta2 = conta1;
  PessoaFisica p2 = new PessoaFisica();
  p2.setNomeCompleto("MARIA PEREIRA DA SILVA SAURO");
  p2.setcpf("222.333.444-56");
  p2.setrg("12345-6");
  
  conta2.setPessoa(p2);
  conta2.exibirDados();
  
  System.out.println("==========================");
  conta1.exibirDados();
  
  PessoaJuridica pessoaJuridica = new PessoaJuridica();
  pessoaJuridica.setNomeFantasia("ITEGO");
  pessoaJuridica.setRazaoSocial("ITEGO Sebastião de Siqueira");
  pessoaJuridica.setCNPJ("123.852.789/0001-25");
  
  ContaCorrenteSimplificada conta3 = new ContaCorrenteSimplificada();
  conta3.depositar(100000);
  conta3.setPessoa(pessoaJuridica);
  conta3.exibirDados();
  
  PessoaFisica p3 = new PessoaFisica();
  p3.setcpf("123.456.789.22");
  p3.setrg("55789-6");
  p3.setNomeCompleto("JUAN CHARLISTON");
  
  PessoaJuridica p4 = new PessoaJuridica();
  p4.setNomeFantasia("ITEGO");
  p4.setRazaoSocial("ITEGO SdS");
  p4.setCNPJ("123.456.789/0002-26");
  
  conta1.adicionar(p3);
  conta1.adicionar(p4);
  conta1.exibirDados();
  }
  }
