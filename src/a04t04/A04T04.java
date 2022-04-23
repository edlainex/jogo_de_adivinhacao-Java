/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a04t04;

import javax.swing.JOptionPane;

/**
 *
 * @author Edlaine
 */
public class A04T04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Desenvolva um jogo que faça com que usuário adivinhe o número sorteado,
        nele o usuário terá 3 tentativas para acertar o número. A cada 
        tentativa dele, fonecerá uma dica mostrando se o número é maior ou menor. 
        Quando descobrir mostrará uma mensagem de que ele acertou, caso erre nas 
        três tentativas será mostrado o número que foi sorteado.*/
        JOptionPane.showMessageDialog(null,"Jogo de Adivinha! Escolha a seguir um número de 0 á 20.","JOGO",1);
        JOptionPane.showMessageDialog(null, "OBSERVAÇÃO: Você só terá 3 tentativas.","IMPORTANTE",2);
        //Aqui foi usado a classe Math.random irá sortear o número de 0 á 20 armazenando na variável int numSorteado
        int numSorteado = (int) (Math.random() * 20);
        //tentativas começa em 1
        int tentativas = 1;
        do{
            String num = JOptionPane.showInputDialog("Já pensei. Qual número você acha que é?");
            //Método de conversão de String para Inteiro
            int numEscolhido = Integer.parseInt(num);
            
            if(numEscolhido == numSorteado){
                JOptionPane.showMessageDialog(null,"Uau!!! Você ACERTOU! O número pensado era: " + numSorteado, "Parabéns",1);
                break;
            }
            else{
                if(numEscolhido > numSorteado){
                    JOptionPane.showMessageDialog(null,"Você errou! Seu chute é maior que o número pensado!","ERROU",1);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Você errou! Seu chute é menor que o número pensado!","ERROU",1);
                }
            }
            //adiciona mais uma tentativa, caso erre.
            tentativas++;
            //será mostrado o número se errou nas três tentativas
            if(tentativas > 3){
                JOptionPane.showMessageDialog(null,"O número pensado era: " + numSorteado, "Número", 1);
            }
            
        }while(tentativas <= 3);
        
        JOptionPane.showMessageDialog(null, "FIM!", "ACABOU",1);
        
        
    }
    
}
