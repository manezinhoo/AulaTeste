/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancaconta;

/**
 *
 * @author aluno
 */
public class conta {
    int numero;
    double saldo;
    int agencia;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSsaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void mostrasaldo (){
        System.out.println(saldo);
        
}   public void sacar (double valor){
    saldo = saldo - valor;
            
}
}
