/*
 Escreva um programa que leia dois valores reais e apresente a diferença do
maior para o menor. Um método chamado diferenca deverá ser implementado para realizar
o cálculo e exibir o resultado.

 */
package exerc2;

import javax.swing.JOptionPane;

/**
 *
 * @author Vitor Fonseca
 */
public class Exerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int y=0, maior=0, menor=0;
        int n=0;
        for(int i=0; i<2;i++){
            n = lernum();
           if(y==0){
               maior=n;
               menor=n;
               y++;
           }else if(n<menor){
               menor=n;
           }else if(n>maior){
               maior=n;
           }
        }
        System.out.println("A diferença entre:"+maior+" e "+menor+": "+diferença(maior, menor));
    }
    static int diferença(int m1, int m2){
        int diferença = 0;
        diferença =m1-m2;
        return diferença;
    }
    static int lernum(){
        int num=0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        return num;
    }    
   }
