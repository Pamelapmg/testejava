import java.util.Scanner;
public class imcPeso {
    public static void main(String[] args) {
	Scanner in= new Scanner (System.in);
	double peso, altura,imc;
	System.out.println("Cálculo IMC ");
	System.out.println("Digite seu peso:");
	peso= in.nextDouble();
	System.out.println("Digite sua altura:");
	altura=in.nextDouble();
	imc= peso/(Math.pow(altura, 2));
	if (imc<18.6) {
	    System.out.println("Classificação = magreza");
	    System.out.println("Nível de obesidade = 0");
	    System.out.printf("Seu IMC é: %.1f ", imc);
	}
	if (imc>18.5 && imc<25.0) {
	    System.out.println("Classificação = normal");
            System.out.println("Nível de obesidade = 0");
	    System.out.printf("Seu IMC é: %.1f ", imc);
	}
	if (imc>25.1 && imc<30.0){
	    System.out.println("Classificação = sobrepeso");
	    System.out.println("Nível de obesidade = I");
	    System.out.printf("Seu IMC é: %.1f ", imc);
	}
	if (imc>30.1 && imc<40.0){
	    System.out.println("Classificação = obesidade ");
	    System.out.println("Nível de obesidade = II");
	    System.out.printf("Seu IMC é: %.1f ", imc);
	}
        if(imc>39.9){
           System.out.println("Classificação = obesidade grave");
	   System.out.println("Nível de obesidade = III");
	   System.out.printf("Seu IMC é: %.1f ", imc);
        }
	in.close();
    }
}
