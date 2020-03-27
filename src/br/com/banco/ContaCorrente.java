package br.com.banco;
import br.com.negocio.*;
import com.sun.media.sound.EmergencySoundbank;
import java.util.Scanner;
import java.util.Random;

public class ContaCorrente extends Conta{
    
    Scanner entrada = new Scanner(System.in);

    // Construtor ContaCorrente vazio
    public ContaCorrente(){
    }
    
    // Construtor ContaCorrente com deposito inicial somado ao saldo
    public ContaCorrente(float depositoInicial){
        this.saldo += depositoInicial;
    }
    // contrutor com conta
//    public ContaCorrente(String[] dadosConta){
//        this.saldo = toFloat(dadosConta['saldo']);
//        this.numeroAgencia = dadosConta['agencia'].EmergencySoundbank.toFloat(doubles);
//        this.numeroConta = dadosConta['conta'];
//    }
//    
    @Override // metodo depositar recebendo o saldo pelo Scanner
    public void depositar(float saldo){
        System.out.println("Informe o valor do deposito: ");
        deposito(entrada.nextFloat());    
    }
    
    @Override // metodo sacar recebendo e tratando o valor do saldo
    public boolean sacar(float valor){
      
        if (valor <= getSaldo())  {  
            setSaldo(getSaldo() - valor);
            return true;
        }
        else {
            return false;
        }
    
    }
    
    // seta o saldo direto sem soma sem tratamentos
    public void povoarCorrente(){
        System.out.println("Deseja realzar um depósito inicial?");
        System.out.print("Informe um valor ou digite 0 para pular: ");
        setSaldo(entrada.nextInt());
    }
    
    
    @Override // retorna o status
        public String toString(){
        return "\nConta Corrente\nNúmero Agência: "+getNumeroAgencia()+
                "\nConta: "+getNumeroConta()+
                "\nSaldo: "+getSaldo()+"\n";
    }
    
}
