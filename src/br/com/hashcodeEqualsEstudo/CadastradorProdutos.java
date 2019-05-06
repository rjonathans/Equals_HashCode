package br.com.hashcodeEqualsEstudo;


import java.util.*;


public class CadastradorProdutos {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        System.out.println("##### Cadastro de produtos #####\n");

        Scanner entrada = new Scanner(System.in);
            String continuar = "s";
            while ("s".equalsIgnoreCase(continuar)) { //Compara ignorando o "case" (maiúsculas e minusculas):
                System.out.print("SKU: ");
                String sku = entrada.nextLine();

                System.out.print("Nome: ");
                String nome = entrada.nextLine();

                Produto produto = new Produto(sku, nome);
                if (produtos.contains(produto))	{
                    System.err.println("Esse produto já foi adicionado. Utilize outro SKU!");
                    System.err.flush();
                } else {
                    produtos.add(produto);
                    System.out.println("Produto adicionado.");
                }

                System.out.print("\nDeseja adicionar mais algum produto? (s/n) ");

                continuar = entrada.nextLine();

        }

        produtos.forEach(System.out::println);

        System.out.println("Fim");
    }

}
