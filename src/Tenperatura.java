import java.util.Scanner;

public class Tenperatura {

    double Celsius;
    double Fahrenheit;
    double Kelvin;


    public void ObiterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        Celsius = leitor.nextDouble();

        CalculoDeTenpratura();
    }

    public void CalculoDeTenpratura(){

        Fahrenheit = (Celsius * 9/5) + 32;
        Kelvin = Celsius +  273.15;

        ExibirDados();
    }

    public void ExibirDados(){
        System.out.println(Celsius + " Celsius equivalem a: " +  Fahrenheit + "(Fahrenheit)");
        System.out.println("e " + Celsius + " Celsius equivalem a: " + Kelvin + "(Kelvin)");
    }

}
