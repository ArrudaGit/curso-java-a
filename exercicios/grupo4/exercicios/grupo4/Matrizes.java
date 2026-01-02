package exercicios.grupo4.exercicios.grupo4;

public class Matrizes {
    public static void main(String[] args) {
        int[][] tabela = new int[10][10];

        // 1. Preencher a Matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabela[i][j] = (i + 1) * (j + 1);
            }
        }

        // 2. Mostrar a Matriz na tela
        for (int i = 0; i < 10; i++) {
            System.out.print("\nTabuada do " + (i + 1) + ": ");
            for (int j = 0; j < 10; j++) {
                System.out.print(tabela[i][j] + "\t"); // \t serve para alinhar as colunas
            }
        }
    }
}

// public class Matrizes {
//     public static void main(String[] args) {
//         int[][] tabela = new int[10][10];

//         // 1. Preencher a Matriz
//         for (int i = 0; i < 10; i++) {
//             for (int j = 0; j < 10; j++) {
//                 tabela[i][j] = (i + 1) * (j + 1);
//             }
//         }

//         // 2. Mostrar a Matriz na tela
//         for (int i = 0; i < 10; i++) {
//             System.out.print("\nTabuada do " + (i + 1) + ": ");
//             for (int j = 0; j < 10; j++) {
//                 System.out.print(tabela[i][j] + "\t"); // \t serve para alinhar as colunas
//             }
//         }
//     }
// }