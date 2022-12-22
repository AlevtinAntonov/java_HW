package HW_5;

public class EightQueens {
    private static int count = 0;
    private static final int n = 8;
    public static void main(String[] args) {
        String [][] arr = new String[n][n];
        eighthQueen(0, arr);
    }

    private static void eighthQueen(int row, String [][] arr) {
        if (row == n) {
            count++;
            System.out.println(" Вариант № " + count);
            for (String[] strings : arr) {
                System.out.print("|");
                for (String string : strings) {
                    System.out.print(string + "|");
                }
                System.out.println();
            }
        }else {
            String[][] newArr = new String[n][n];
            for (int i = 0; i < arr.length; i++) {
                System.arraycopy(arr[i], 0, newArr[i], 0, arr[i].length);
            }
            for (int col = 0; col < n; col++) {
                if (noQueensAbove(row, col, newArr)) {
                    for (int c = 0; c < n; c++) {
                        newArr[row][c] = " ";
                    }
                    newArr[row][col] = "Q";
                    eighthQueen(row+1, newArr);
                }
            }
        }
    }

    private static boolean noQueensAbove(int row, int col, String[][] newArr) {
        for (int r = row - 1; r >= 0 ; r--) {
            if (newArr[r][col].equals("Q")) {
                return false;
            }
        }
        for (int r = row-1, c = col - 1; r >= 0 && c >= 0; r--, c--) {
            if (newArr[r][c].equals("Q")) {
                return false;
            }
        }
        for (int r = row - 1, c = col + 1; r >= 0 && c < n ; r--, c++) {
            if (newArr[r][c].equals("Q")) {
                return false;
            }
        }
        return true;
    }
}