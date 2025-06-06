public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer() {
        if (idade < 21) {
            altura += 0.5;
        }
        idade++;
    }

    public void engordar(double quantidade) {
        peso += quantidade;
    }

    public void emagrecer(double quantidade) {
        peso -= quantidade;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " cm");
    }
}