import java.util.ArrayList;
import java.util.List;

public class WordSearchGridArray {

    static boolean validCoord(int x, int y, int m, int n) {
        if (x >= 0 && x < m && y >= 0 && y < n)
            return true;
        return false;
    }

    // This function searches for the given word
    // in a given direction from the coordinate.
    static boolean findWord(int index, String word, char[][] grid,
                            int x, int y, int dirX, int dirY) {

        // if word has been found
        if (index == word.length()) return true;

        // if the current coordinate is
        // valid and characters match, then
        // check the next index
        if (validCoord(x, y, grid.length, grid[0].length) &&
                word.charAt(index) == grid[x][y])
            return findWord(index + 1, word, grid,
                    x + dirX, y + dirY, dirX, dirY);

        return false;
    }

    static int[][] searchWord(char[][] grid, String word) {
        int m = grid.length;
        int n = grid[0].length;

        List<int[]> ans = new ArrayList<>();

        // x and y are used to set the direction in which
        // word needs to be searched.
        int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // Search in all 8 directions
                for (int k = 0; k < 8; k++) {

                    // If word is found, then append the
                    // coordinates into answer and break.
                    if (findWord(0, word, grid, i, j, x[k], y[k])) {
                        ans.add(new int[] { i, j });
                        break;
                    }
                }
            }
        }

        return ans.toArray(new int[0][]);
    }


    static void printResult(int[][] ans) {
        for (int[] a : ans) {
            System.out.print( "{" + a[0] + "," + a[1] + "}" + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char[][] grid = { { 'a', 'b', 'a', 'b' },
                { 'a', 'b', 'e', 'b' },
                { 'e', 'b', 'e', 'b' } };
        String word = "abe";

        int[][] ans = searchWord(grid, word);

        printResult(ans);
    }
}
