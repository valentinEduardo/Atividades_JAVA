/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
   
1. Faça um programa em Java que imprima todos os números de 1 até 100.

int i;
for(i=0;i<=100;i++){
    System.out.println(i);
}


2. Faça um programa que imprima todos os números pares de 100 até 1. 


int i, verificar;

for(i=100;i>=0;i--){
    if(i%2==0){
        System.out.println(i);
    }
}


3. Faça um programa que imprima os múltiplos de 5, no intervalo de 1 até 500. 

int i;
for(i=0;i<=500;i++){
    if(i%5==0){
        System.out.println(i);
    }
}

4. Faça um programa em Java que permita entrar com o nome, a idade e o sexo de 20
pessoas. O programa deve imprimir o nome da pessoa se ela for do sexo masculino
e tiver mais de 21 anos. 

String nome;
String sexo;
int idade;
int i;

for(i=0;i<5;i++){
    System.out.println("Digite o seu Nome");
    nome = sc.nextLine();
    sc.nextLine();
    System.out.println("Digite o seu Sexo");
    sexo = sc.nextLine();
    System.out.println("Digite o sua Idade");
    idade = sc.nextInt();
    
if(sexo == "masculino" && idade > 21){
    System.out.println("Nome: "+nome+" Idade: "+idade+" sexo: "+sexo);
}
    
}

sc.close();


5. Sabendo-se que a unidade lógica e aritmética calcula o produto através de somas
sucessivas, crie um programa que calcule o produto de dois números inteiros
lidos. Suponha que os números lidos sejam positivos e que o multiplicando seja
menor do que o multiplicador.

System.out.println("Digite dois número maiores que 0");
int numero1 = sc.nextInt(), numero2 = sc.nextInt(), resultado=0, i;
if(numero1>=1 && numero2>=1){
    for(i=0;i<numero2;i++){
        
    resultado= resultado+numero1;
    }
    System.out.println(resultado);
}else{
    System.out.println("Digite um número maior que 0");
}



 6. Crie um programa em Java que imprima os 20 primeiros termos da série de Fibonacci.
Observação: os dois primeiros termos desta série são 1 e 1 e os demais são gerados
a partir da soma dos anteriores. Exemplo:
• 1 + 1 = 2, terceiro termo;
• 1 + 2 = 3, quarto termo, etc.


int[] num1 = new int[20];
int i;

num1[0] = 0;
num1[1] = 1;

for(i=0;i<20;i++){
    num1[i+2] = num1[i]+num1[i+1];
    System.out.println(num1[i]);
}



 7. Crie um programa em linguagem Java que permita entrar com o nome, a nota da
prova 1 e da prova 2 de 15 alunos. Ao final, imprimir uma listagem, contendo:
nome, nota da prova 1, nota da prova 2, e média das notas de cada aluno. Ao final,
imprimir a média geral da turma.   

 String nomes[] = new String[15];
int[]  prova1 = new int[15], prova2 = new int[15], media = new int[15];
int mediaGeral= 0, i;

for (i=0; i<15; i++){
    System.out.println("Digite o seu nome");
    nomes[i] = sc.next();
    
    System.out.println("Digite sua Primeria nota");
    prova1[i] = sc.nextInt();
    
    System.out.println("Digite sua Segunda nota");
    prova2[i] = sc.nextInt();
    
    media[i] = (prova1[i]+prova2[i])/2;
    mediaGeral = media[i]+mediaGeral;
    System.out.println("Esta é a sua média "+media[i]+"\r\n");
    
}
System.out.println("Essas foram as notas de todos os alunos desta turma: ");
for(i=0;i<15;i++){
    System.out.println("Nome: "+nomes[i]+"\r\n Prova 1: "+prova1[i]+"\r\n Prova 2: "+prova2[i]+"\r\nMédia: "+media[i]+"\r\n");
    
}
mediaGeral = mediaGeral/15;
System.out.println("Essa é a média geral da turma: "+mediaGeral);




 8. Uma pesquisa de opinião realizada em Salvador, teve as seguintes perguntas: 

• Qual o seu time de coração? 

1-Bahia;
2-Vitória;
3-Corinthians;
4-Flamengo;
5-Outros

 • Onde você mora? 

1-Salvador;
2-Lauro de freitas;
3-Outros 

• Qual o seu salário? 


Faça um programa em Java que imprima:
 • o número de torcedores por clube; 
• a média salarial dos torcedores do Bahia; 
• o número de pessoas moradoras de Lauro de freitas, torcedores de outros
clubes;
• o número de pessoas de Salvador torcedoras do Vitória  


  Obs.: O programa encerra quando se digita 0 para o time.  



int questoes;
int i=-1, i2=0, resultado=0;
int[][] respostas = new int[5][3];
float[] salario = new float[5];
double i3=0, media=0;
while(i!=0){
System.out.println("Qual o seu time?\r\n1-Bahia\r\n2-Vitória\r\n3-Corinthians\r\n4-Flamengo\r\n5-Outros\r\n0-Sair");
i = sc.nextInt();
if(i!=0 && i>0 && i<6){
    
System.out.println("\r\nOnde você mora?\r\n1-Salvador\r\n2-Lauro de freitas\r\n3-Outros");
i2 = sc.nextInt();
respostas[i-1][i2-1]+=1;

System.out.println("\r\nQual o seu salário?");
i3 = sc.nextInt();

salario[i] += i3;

}else{
    System.out.println("Digite um número válido\r\n");
}
}
for(i=0;i<5;i++){
    for(i2=0;i2<3;i2++){
    resultado += respostas[i][i2];
    if(i==0 && i2==2){
        System.out.println("O Bahia tem "+resultado+" torcedores");
        media = salario[0]/resultado;
        System.out.println("Essa é a média salárial dos torcedores do Bahia"+media);
        
        resultado=0;
        
    }else if(i==1 && i2==2){
        System.out.println("O Vitória tem "+resultado+" torcedores");
        System.out.println(respostas[1][0]+"Residem em Salvador");
        resultado=0;
    
    }else if(i==2 && i2==2){
        System.out.println("O Corinthians tem "+resultado+" torcedores");
        resultado=0;
        
    
    }else if(i==3 && i2==2){
        System.out.println("O Flamengo tem "+resultado+" torcedores");
        resultado=0;
        
    
    }else if(i==4 && i2==2){
        System.out.println("Outros times tem "+resultado+" torcedores");
        resultado=0;
    }
    }
}

 9. Em uma universidade cada aluno possui os seguintes dados: 

• Renda pessoal; 
• Renda familiar; 
• Total gasto com alimentação; 
• Total gasto com outras despesas; 

Faça um programa que imprima a porcentagem dos alunos que gasta acima de
R$200,00 com outras despesas. O número de alunos com renda pessoal maior
que a renda familiar e a porcentagem gasta com alimentação e outras despesas
em relação às rendas pessoal e familiar.
Obs.: O programa encerra quando se digita 0 para a renda pessoal.  


float[] pessoal = new float[10], familiar = new float[10], alimentação = new float[10], despesas = new float[10];
int i=-1, i2, contador=0, contador2=0, contador3=0, porcentagem1=0, porcentagem2=0;
float total, media, n=-1;
while (n!=0){

System.out.println("Qual sua renda pessoal?");
n = sc.nextFloat();
if(n!=0 && i<10){
i++;
pessoal[i]= n;
System.out.println("Qual sua renda familiar?");
familiar[i] = sc.nextFloat();
System.out.println("Qual seu gasto com alimentação?");
alimentação[i] = sc.nextFloat();
System.out.println("Quais seus outros gastos?");
despesas[i] = sc.nextFloat();
}
}
for(i2=0;i2<=i;i2++){
    if(despesas[i2]>200){
        contador++;
    }
    if(pessoal[i2]>familiar[i2]){
        contador2++;
    }
}
porcentagem1 = (contador*100)/(i+1);
porcentagem2 = (contador2*100)/(i+1);
System.out.println("%"+porcentagem1+" dos alunos gastam mais que R$200 em outras despesas");
System.out.println("%"+porcentagem2+" dos alunos possuem renda pessoal maior que a renda familiar");
for(i2=0;i2<=i;i2++){
total = pessoal[i2] + familiar[i2];
media = (despesas[i2]*100)/total;
System.out.println("O aluno "+(i2+1)+" gasta %"+media+" da renda em despesas");
media = (alimentação[i2]*100)/total;
System.out.println("e gasta %"+media+" da renda em alimentação");
}


 10. Foi feita uma pesquisa de audiência de canal de TV em várias casas de uma
certa cidade, em um determinado dia. Para cada casa visitada foram fornecidos o
número do canal (4, 5, 7, 12) e o número de pessoas que estavam assistindo a ele
naquela casa. Se a televisão estivesse desligada, nada seria anotado, ou seja, esta
casa não entraria na pesquisa. 

Criar um programa que:
• Leia um número indeterminado de dados, isto é, o número do canal e o
número de pessoas que estavam assistindo;
• Calcule e imprima a porcentagem de audiência em cada canal. 

Obs.: Para encerrar a entrada de dados, digite o número do canal zero.	

int[] pessoas = new int[4];
int i=0, total=0, media=0;
System.out.println("Quantas pessoas estavam assistindo o canal 4?");
pessoas[i] = sc.nextInt();
i++;
System.out.println("Quantas pessoas estavam assistindo o canal 5?");
pessoas[i] = sc.nextInt();
i++;
System.out.println("Quantas pessoas estavam assistindo o canal 7?");
pessoas[i] = sc.nextInt();
i++;
System.out.println("Quantas pessoas estavam assistindo o canal 12?");
pessoas[i] = sc.nextInt();


for(i=0;i<4;i++){
    total += pessoas[i];
}
i=0;
  media = (pessoas[i]*100)/total;
System.out.println("o canal 4 tem %"+media); 
i++;
  media = (pessoas[i]*100)/total;
System.out.println("o canal 5 tem %"+media); 
i++;
  media = (pessoas[i]*100)/total;
System.out.println("o canal 7 tem %"+media); 
i++;
  media = (pessoas[i]*100)/total;
System.out.println("o canal 12 tem %"+media); 



	}
}
