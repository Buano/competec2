package competec.aula1_ramificacoes;

// 1. Se estiver chovendo E relampejando, eu não sairei de casa. Tente fazer essa comparação lógica no código
// 2. Se tiver macarrão ou estrogonofe hoje no almoço, vou ficar muito feliz! Tente fazer essa comparação lógica no código.

public class Exercicio3 {
    public static void main(String[] args) {
        // Escreva seu código aqui ⬇️
        boolean chovendo = true; 
        boolean relampejando = false;
        boolean comparacao = chovendo && relampejando;
        System.out.println(comparacao); 
        boolean macarrão = true; 
        boolean estrogonofe = false;
        boolean comparacao2 = macarrão || estrogonofe;
        System.out.println(comparacao2);
    }
}
