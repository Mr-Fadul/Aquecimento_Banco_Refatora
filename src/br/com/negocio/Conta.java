package br.com.negocio;
public class Conta {
    
    private int numeroAgencia;
    private int numeroConta;
    protected float saldo;
    

    public Conta() {
        this.saldo = 0;
    }
    
    /*************************************************************************/
    
    public void deposito(float saldo){
        this.saldo += saldo;
    }
    
    public void depositar(float saldo){
        
    }
    public boolean sacar(float valor){
        return false;
    }
    
    
    public String toString(){
        return "\nAgência: "+numeroAgencia+"\nConta: "+numeroConta+"\nSaldo: "+saldo;
    }
    
    /*************************************************************************/
    
    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    /*************************************************************************/  
}
