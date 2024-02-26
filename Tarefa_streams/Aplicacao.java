package cap22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        System.out.println("Por favor digite o nome e o gênero, separados por traço e vírgula.");

        System.out.println("Digite aqui --> ");
        String entrada = scanner.nextLine();
        entrada = entrada.toLowerCase();
        String[] pessoas = entrada.split(",");

        for (String pessoa : pessoas) {
            lista.add(pessoa);
        }

        List<String> listaMulheres = lista.stream()
                .filter(p -> p.split("-")[1].equals("feminino"))
                .toList();

        System.out.println("Lista das Mulheres: ");
        listaMulheres.forEach(System.out::println);
        scanner.close();

	}

}
