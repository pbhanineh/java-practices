public class Main {
    public static void main(String[] args) {
            // Exemple de grille de bingo
            int[] grid = {
                    -1, -1, -1, -1, -1,
                    10, 11, 12, 13, 14,
                    15, 16, 17, 18, 19,
                    20, 21, 22, 23, 24,
                    25, 26, 27, 28, 29
            };

            // Vérifier si la grille est gagnante
            if (isWinning(grid)) {
                System.out.println("La grille est gagnante !");
            } else {
                System.out.println("La grille n'est pas encore gagnante.");
            }
        }

    public static boolean isWinning (int[] grid){
        int gridSize = 5;

        for(int i =0; i<gridSize; i++) {
            boolean rowWin = true;
            for (int j = 0; j < gridSize; j++) {
                if (grid[i * gridSize + j] != -1) {
                    rowWin = false;
                    break;
                }
            }
            if (rowWin) {
                return true;
            }
        }
        for (int i = 0; i < gridSize; i++) {
            boolean colWin = true;
            for (int j = 0; j < gridSize; j++) {
                if(grid[j*gridSize + i] != -1) {
                    colWin = false;
                    break;
                }
            }
            if (colWin) {
                return true;
            }
        }
        return false;
    }
}