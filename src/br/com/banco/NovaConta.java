package br.com.banco;
import br.com.negocio.*;
import java.util.Scanner;
import java.util.Random;
public class NovaConta extends Conta{
    
    private int opcaoConta;
    Conta[] bancoContas = new Conta[100];
    int cont = 0; /*Contador - Próxima posição disponível no banco*/ 
    Scanner entrada = new Scanner(System.in);
    Random numero = new Random();
                
    public NovaConta(){
    }
    
    public void criar(){
        
        System.out.println("Que tipo de conta deseja criar?\n");
        System.out.println("1 - Conta Corrente\n2 - Conta Especial\n3 - Conta Poupança\n");
        System.out.print("Digite um número conforme o menu: ");

        this.opcaoConta = entrada.nextInt();
        System.out.println("------------------------------------\n");

        
        while (this.opcaoConta < 1 || this.opcaoConta > 3){
            System.out.println("Número inválido, tente novamente.");
            this.opcaoConta = entrada.nextInt();
        }
        
        
        switch (this.opcaoConta) {
            case 1:
                bancoContas[cont] = new ContaCorrente();
                if(bancoContas[cont] instanceof ContaCorrente) {
                    ContaCorrente contaCorrente = (ContaCorrente) bancoContas[cont]; //casting
                    contaCorrente.povoarCorrente();
                }   povoar();
                System.out.println("Conta Corrente criada.");
                System.out.println(bancoContas[cont].toString());
                cont++;
                break;
            case 2:
                bancoContas[cont] = new ContaEspecial();
                if(bancoContas[cont] instanceof ContaEspecial) {
                    ContaEspecial contaEspecial = (ContaEspecial) bancoContas[cont]; //casting
                    contaEspecial.povoarEspecial();
                }   povoar();
                System.out.println("\nConta Especial criada.");
                System.out.println(bancoContas[cont].toString());
                cont++;
                break;
            default:
                bancoContas[cont] = new ContaPoupanca();
                if(bancoContas[cont] instanceof ContaPoupanca) {
                    ContaPoupanca contaPoupanca = (ContaPoupanca) bancoContas[cont]; //casting
                    contaPoupanca.povoarPoupanca();
                }   povoar();
                System.out.println("Conta Poupança criada.");
                System.out.println(bancoContas[cont].toString());
                cont++;
                break;
        }
    }
    
    public void povoar(){
        bancoContas[cont].setNumeroAgencia(99);
        bancoContas[cont].setNumeroConta(1 + numero.nextInt(9999));
    } 
    
    public Conta voltaConta(int cont){
        return bancoContas[cont];
    }
}
