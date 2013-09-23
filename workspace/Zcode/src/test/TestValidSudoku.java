package test;

import arrays.ValidateSudoku;



public class TestValidSudoku {

	public static void main(String[] args) {
		ValidateSudoku sq = new ValidateSudoku();
		char[][]  matrix={{'5','3','.','.','7','.','.','.','.'},
						  {'6','.','.','1','9','5','.','.','.'},
						  {'.','9','8','.','.','.','.','6','.'},
				          {'8','.','.','.','6','.','.','.','3'},
				          {'4','.','.','8','.','3','.','.','1'},
				          {'7','.','.','.','2','.','.','.','6'},
				          {'.','6','.','.','.','.','2','8','.'},
				          {'.','.','.','4','1','9','.','.','5'},
				          {'.','.','.','.','8','1','.','7','9'}};
		
        System.out.println(sq.isValidSudoku(matrix));
	}

}
