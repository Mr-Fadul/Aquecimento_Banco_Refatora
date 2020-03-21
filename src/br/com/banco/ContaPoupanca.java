package br.com.banco;
import br.com.negocio.*;
import java.util.Scanner;
public class ContaPoupanca extends Conta{
    
	// variaveis
    private int aniversario;
    private float rendUltMes = 0;
    private float taxaUltRend = 0;
    private float taxaAnualAcumu = 0;
    Scanner entrada = new Scanner(System.in);
    
    // construtor vazio
    public ContaPoupanca(){
    }
    
    // contrutor passando o parametro do aniversario
    public ContaPoupanca(int aniversario){
        this.aniversario = aniversario;
    }
    
    /*************************************************************************/
      
    @Override // metrodo sacar recebendo o valor e tratando superficialmente
    public boolean sacar(float valor){
      
        if (valor <= getSaldo())  {  
            setSaldo(getSaldo() - valor);
            return true;
        } 
        else {
            return false;
        }
    }
     
            @Override // metodo depositar recebendo o valor 
    public void depositar(float saldo){
        System.out.println("Informe o valor do deposito: ");
        depositar(saldo);
    }
    
            // metodo rendimento recebendo parametros
            // criar ele com interface seria o ideal
    public void rendimento(float taxaMes, int mesAtual){
        /*????*/
    }
    
     // metodo povoar recebendo parametros
    public void povoarPoupanca(){
        System.out.print("Informe o rendimento do último mês: ");
        setRendUltMes(entrada.nextInt());
        System.out.print("Informe a taxa do último rendimento: ");
        setTaxaUltRend(entrada.nextInt());
        System.out.print("Informe a taxa anual acumulada: ");
        setTaxaAnualAcumu(entrada.nextInt());
    } 
    
    // retorna o status
    public String toString(){
        return "\nConta Poupança\nAgência: "+getNumeroAgencia()+
                "\nConta: "+getNumeroConta()+"\nSaldo: "
                +getSaldo()
                +"\n\nRendimento do último mês: "+getRendUltMes()
                +"\nTaxa do último rendimento: "+getTaxaUltRend()
                +"\nTaxa anual acumulada: "+getTaxaAnualAcumu()+"\n";
    }
    
    /*************************************************************************/

    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        this.aniversario = aniversario;
    }

    public float getRendUltMes() {
        return rendUltMes;
    }

    public void setRendUltMes(float rendUltMes) {
        this.rendUltMes = rendUltMes;
    }

    public float getTaxaUltRend() {
        return taxaUltRend;
    }

    public void setTaxaUltRend(float taxaUltRend) {
        this.taxaUltRend = taxaUltRend;
    }

    public float getTaxaAnualAcumu() {
        return taxaAnualAcumu;
    }

    public void setTaxaAnualAcumu(float taxaAnualAcumu) {
        this.taxaAnualAcumu = taxaAnualAcumu;
    }
    
    /*************************************************************************/ 
}
