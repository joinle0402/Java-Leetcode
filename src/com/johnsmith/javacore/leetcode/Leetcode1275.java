package com.johnsmith.javacore.leetcode;

import java.util.Arrays;

public class Leetcode1275 {
    public static void main(String[] args) {
        System.out.println(Leetcode1275.tictactoe(new int[][]{{1,0}, {2, 0}, {0, 1}}));
    }

    public static String tictactoe(int[][] movies) {
        char[][] board = new char[3][3];
        for (int i = 0; i < movies.length; i++) {
            board[movies[i][0]][movies[i][1]] = ((i + 1) % 2 == 0) ? 'O' : 'X';
        }

        if (board[0][0] != '\0' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return board[0][0] == 'X' ? "A" : "B";
        }

        if (board[0][2] != '\0' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return board[0][2] == 'X' ? "A" : "B";
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i][0] != '\0' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return board[i][0] == 'X' ? "A" : "B";
            }

            if (board[0][i] != '\0' && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return board[0][i] == 'X' ? "A" : "B";
            }
        }

        return (movies.length == board.length * board.length) ? "Draw" : "Pending";
    }
}
