package herancaconta;


import herancaconta.conta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class ContaCorrente extends conta {
    double limite;
    
   public void sacar (double valor){
    saldo = saldo - valor*1.1;}

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
      
  
      public void mostraDados (){
        System.out.println("limite:"+limite);}
}
