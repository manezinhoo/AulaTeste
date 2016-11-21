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
public class contaPoupanca extends conta {
    String data ;
    
    public void sacar (double valor){
    saldo = saldo - valor*0.5;}
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public void mostradados(){
        System.out.println("data:"+data);}
}
