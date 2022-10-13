import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
public class App { 
      public static Scanner sc = new Scanner(System.in);
       
         public static Integer diaChekin= null;
       public   static Integer mesChekin= null;
       public static  Integer diaChekout= null;
      public static  Integer mesCheckout= null;  
      public static Integer numeroQuarto= null;    
       public static Exception e;
       public static int opcao;
       public static Integer AlterarDia=null;
       public static Integer AlterarMes=null;


      public static  Integer i; 
      public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      
/*Fazer um programa em java para ler os dados de uma reserva de hotel (número do quarto, data de entrada e data de saída) e mostrar os dados da reserva, inclusive sua duração em dias. 
Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar novamente a reserva com os dados atualizados. 
 */
/*O programa não deve aceitar dados inválidos para a reserva, conforme as seguintes regras:
 Alterações de reserva só podem ocorrer para datas futuras
 A data de saída deve ser maior que a data de entrada */
    public static void main(String[] args) throws Exception {
   do{
    System.out.println("1-FAZER RESERVA");
        System.out.println("2- ALTERAR RESERVA");
   opcao= sc.nextInt();
   if(opcao==1){
    pegarInfoDia();
     pegarInfoMes();
pegarInfoQuarto();
 Tryzao();
   }else{
pegarInfoDiaAlterar();
pegarInfoMesAlterar();

   }
    }while(opcao!=0);
        

     

    }

public static void pegarInfoDia() {
    System.out.println("Digite o dia do checkin");
        diaChekin = sc.nextInt();

   System.out.println("Digite o mes do checkin");
        mesChekin = sc.nextInt();

}
public static void pegarInfoMes() {
       
System.out.println("Digite o dia do checkout");
        diaChekout = sc.nextInt();

        System.out.println("Digite o mes do checkout");
        mesCheckout = sc.nextInt();

}
public static void pegarInfoDiaAlterar() {
       
System.out.println("Digite o dia do checkin");
        AlterarDia = sc.nextInt();

        System.out.println("Digite o mes do checkin");
        AlterarMes = sc.nextInt();

}

public static void pegarInfoQuarto() {
    System.out.println("Digite o quarto");
    numeroQuarto = sc.nextInt();  
}
 
public  static void Ifzao() {
    if(opcao==1){
         if(mesChekin==mesCheckout){
        if(diaChekin>=diaChekout){
            e.getStackTrace();
        }
    }else if(mesChekin>mesCheckout){
        e.getStackTrace();
    }else{
        System.out.println("Reserva com sucesso");
    }
    }else if(opcao==2){
        if(AlterarMes==mesCheckout){
            if(AlterarDia<diaChekin){
                e.getStackTrace();
            }
        }

    }
   
  
}

public static void Tryzao(){

try {
    Ifzao();
} catch (Exception e) {
    System.out.println("ERROR_ERROR");
    System.out.println("DATA_INVÁLIDA");
}
}
}
