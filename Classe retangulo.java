import java.util.Scanner;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void alterarDimensoes(double novaLargura, double novaAltura) {
        this.largura = novaLargura;
        this.altura = novaAltura;
    }

    public double obterLargura() {
        return largura;
    }

    public double obterAltura() {
        return altura;
    }

    public double calcularSuperficie() {
        return largura * altura;
    }

    public double calcularContorno() {
        return 2 * (largura + altura);
    }
}

public class Aplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as medidas do espaço:");
        System.out.print("Largura: ");
        double largura = scanner.nextDouble();
        System.out.print("Altura: ");
        double altura = scanner.nextDouble();

        Retangulo espaco = new Retangulo(largura, altura);

        System.out.println("\nDetalhes do retângulo:");
        System.out.println("Largura: " + espaco.obterLargura() + " unidades");
        System.out.println("Altura: " + espaco.obterAltura() + " unidades");
        System.out.println("Superfície: " + espaco.calcularSuperficie() + " unidades quadradas");
        System.out.println("Contorno: " + espaco.calcularContorno() + " unidades");

        scanner.close();
    }
}