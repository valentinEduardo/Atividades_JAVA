import java.util.Arrays;
import java.util.Scanner; 

public class Main {
    
	
public static void main(String[] args) {
Scanner scanf = new Scanner(System.in);


int [] idade = new int[5];
int resultado=0;
int i=0, i2=0;
for(i=0;i<5;i++) {
	System.out.println("Digite sua idade");
	idade[i] = scanf.nextInt();
	
}
resultado = idade(idade);
   System.out.println("Esta é a idade do mais velho");
      System.out.println(resultado);
}


public static int idade(int idades[]){
    int auxiliar=0;
    int i=0, i2=0;
    for(i=0;i<5;i++){
    for(i2=0;i2<5;i2++){
       if(idades[i] < idades[i2]){
                    auxiliar = idades[i];
                    idades[i] = idades[i2];
                    idades[i2] = auxiliar;
    }
} 
}
return idades[4];
}
}
