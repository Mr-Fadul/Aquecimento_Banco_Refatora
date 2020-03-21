package br.com.banco;
import br.com.negocio.*;
import java.util.Scanner;

public class ContaEspecial extends Conta{
    
	// variaveis 
    private float limiteCheque = 100;
    private float saldoCheque;
    Scanner entrada = new Scanner(System.in);

    // construtor vazio, cria o objeto na memoria 
    public ContaEspecial(){
    }
    
    // construtor com parametro limite
    public ContaEspecial(float limiteCheque){
        System.out.println("Inforome o limite desejado para sua conta: ");
        this.limiteCheque = limiteCheque;
        this.saldoCheque = limiteCheque;
    }
     
    /*************************************************************************/
      
    @Override	// metodo sacar recebe o valor e abate no saldo
    public boolean sacar(float valor){
      
        if (valor <= getSaldo()){
            setSaldo(getSaldo() - valor);
            return true;
        }
        else if (valor <= (getSaldo()+getSaldoCheque()))  {  
            setSaldoCheque(getSaldoCheque()-(valor-getSaldo()));
            setSaldo(0);
            return true;
        }
        else {
            return false;
        }
    }
    
        @Override // metodo depositar seta o saldo recebido ao ja armazenado
    public void depositar(float saldo){
        System.out.println("Informe o valor do deposito: ");
        depositar(saldo);
    }
    
        // seta diretamente o limite do cheque e coloca o limite no saldoCheque
    public void povoarEspecial(){
        System.out.print("Informe o limite de Cheque Especial para sua conta: ");
        setLimiteCheque(entrada.nextInt());
        setSaldoCheque(getLimiteCheque());
    } 
    
    // retorna o status
    public String toString(){
        return "\nConta Especial\nAgência: "+getNumeroAgencia()+
                "\nConta: "+getNumeroConta()+"\nSaldo: "
                +getSaldo()+"\nLimite de Cheque Especial: "
                +getLimiteCheque()+"\nSaldo Disponível de Cheque Espcial "
                +getSaldoCheque()+"\n";
    }
    
    /*************************************************************************/
    
    /**
     *
     * @return
     */
    public float getLimiteCheque() {
        return limiteCheque;
    }

    public void setLimiteCheque(float limiteCheque) {
        this.limiteCheque = limiteCheque;
    }
    
    public float getSaldoCheque() {
        return saldoCheque;
    }

    public void setSaldoCheque(float saldoCheque) {
        this.saldoCheque = saldoCheque;
    }
    
    /*************************************************************************/
}
