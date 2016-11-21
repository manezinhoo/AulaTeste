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
public class HerancaConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Conta Corrente:");
     ContaCorrente corrente = new ContaCorrente ();
     corrente.setSaldo(2000);
     corrente.mostrasaldo();
     corrente.sacar(300);
     corrente.mostrasaldo();
     
        System.out.println("-----------------------");
        System.out.println("Conta Poupança:");
     contaPoupanca poupanca = new contaPoupanca ();
     poupanca.setSaldo(2000);
     poupanca.mostrasaldo();
     poupanca.sacar(300);
     poupanca.mostrasaldo(); 
     
    }
   
   
}
