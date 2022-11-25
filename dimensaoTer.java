import java.text.NumberFormat;
import java.util.Scanner;
public class dimensaoTer {
    public static void main(String[] args) {
    Scanner in= new Scanner (System.in);
    int esquerda,direita,frente,fundo,soma1,soma2,total1;
    int lado1,lado2,total2;
    double metros,vale,custo;
    System.out.println("Cálculo de quantos metros quadrados possui os diferentes terrenos");
    System.out.println("o terreno é irregular? (quando possui as 4 medidas diferentes) ");
    System.out.println("Responda com sim ou não.");
    String sn= in.nextLine();
    if ("sim".equalsIgnoreCase(sn)) {
	System.out.println("Digite quanto tem em cada lado.");
	System.out.println("Digite os dois primeiros lados: ");
	esquerda = in.nextInt();
	direita = in.nextInt();
	soma1= (esquerda+direita)/2;
	System.out.println("Digite os dois ultimos: ");
	frente = in.nextInt();
	fundo = in.nextInt();
	soma2= (frente+fundo)/2;
	total1= soma1*soma2;
	System.out.printf("O total em metros quadrados é %d m²\n", total1);
    }else{
	System.out.println("ok, seu terreno é regular.");
	System.out.println("Digite o quanto ele tem em cada lado");
	System.out.println("Digite o primeiro lado:");
	lado1= in.nextInt();
	System.out.println("Digite o segundo lado:");
	lado2= in.nextInt();
	total2= lado1*lado2;
	System.out.printf("O total em metros quadrados é %d m²\n", total2);
    }
    System.out.println("Deseja calcular quanto custa um terreno? (sim) ou (não)");
    String nova= in.next();
    if ("sim".equalsIgnoreCase(nova)) {
	System.out.println("Quantos metros quadrados possui?");
	metros = in.nextDouble();
	System.out.println("Quanto vale o metro quadrado deste terreno?");
	vale = in.nextDouble();
	custo = metros*vale;
	System.out.println("O custo final é de: R$  " +  NumberFormat.getCurrencyInstance().format(custo));
    }else{
	System.out.println("Obrigada!");
    }
    in.close();
    }
}
