import java.util.Scanner;
public class Main
{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Digite um número decimal para ser transformado em binario");
	  
	  int decimais = sc.nextInt();
	  int  i=0, i2;
	  int binarios[] = new int[255];
	  int restos, calculos;
	
	  do{
	      restos = decimais%2;
	      if(restos==1 ||restos==0){
	          binarios[i] = restos;
	          i++;
	      }
	      calculos = decimais/2;
	      decimais = calculos;
	  }while(calculos!=0);
	  
	  i2=i-1;
	 for(i=0;i<=i2;i++){
	   System.out.print(binarios[i]);
	 }
    }
}
