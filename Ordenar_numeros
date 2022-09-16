import java.util.Scanner;

public class Main
{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        int numeros[] = new int[5], i, i2, auxiliar;
        
        System.out.println("Digite 5 números diferentes");
        for(i=0;i<5;i++){
         numeros[i] = sc.nextInt();
        }
        for(i=0;i<5;i++){
            for(i2=0;i2<5;i2++){
                if(numeros[i] < numeros[i2]){
                    auxiliar = numeros[i];
                    numeros[i] = numeros[i2];
                    numeros[i2] = auxiliar;
                }
            
            }
        }
        
        System.out.println("Estes são os números em ordem crescente");
       for(i=0;i<5;i++){
        System.out.println(numeros[i]);
        }  
         for(i=0;i<5;i++){
            for(i2=0;i2<5;i2++){
                if(numeros[i] > numeros[i2]){
                    auxiliar = numeros[i2];
                    numeros[i2] = numeros[i];
                    numeros[i] = auxiliar;
                }
            
            }
        }
         System.out.println("Estes são os números em ordem decrescente");
       for(i=0;i<5;i++){
        System.out.println(numeros[i]);
       }
