public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Pequeno Principe", 59.90, "Antoine de Saint-Exupéry", 300, true);
        Camisa camisa = new Camisa("Camisa do Flamengo", 200.90, "Vermelha e preta", "M", "Poliester");

        System.out.println("Informações do Livro:");
        livro.exibirInfo();

        System.out.println("\nInformações da Camisa:");
        camisa.exibirInfo();
    }
}
