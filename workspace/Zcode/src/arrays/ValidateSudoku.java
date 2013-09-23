package arrays;

public class ValidateSudoku {
	  public boolean isValidSudoku(char[][] board) {
	        int n = board.length;
	        int m = board[0].length;
	        if(n!=9||m!=n) return false;
	        boolean[] set= new boolean[9];
	        for(int i =0;i<9;i++){
	        	for (int j = 0;j<9;j++){
	        		int  temp = (int) (board[i][j] -'0')-1;
	        		if(temp>=0 && temp<9){
	        			if(set[temp])
	        				return false;
	        			else
	        				set[temp]=true;
	        		}
	        	}
		        reset(set);
	        }
	        reset(set);
	        
	        for(int j =0;j<9;j++){
	        	for (int i = 0;i<9;i++){
	        		int  temp = (int) (board[i][j] -'0')-1;
	        		if(temp>=0 && temp<9){
	        			if (set[temp])
	        				return false;
	        			else
	        				set[temp] = true;
	        		}
	        	}
	        	reset(set);
	        }
	        reset(set);
	        
	        for(int x=0;x<9;x=x+3){
	        	for(int y=0;y<9;y=y+3){
	        		for(int i =0;i<3;i++){
	        			for(int j =0;j<3;j++){
	        				int  temp = (int) (board[x+i][y+j] -'0')-1;
	        				if(temp>=0 && temp<9){
	        					if(set[temp])
	        						return false;
	        					else
	        						set[temp]=true;
	        				}
	        			}
	        		}
	        		reset(set);
	        	}
	        }	        
	        return true;
	    }

	private void reset(boolean[] set) {
    	for(int a =0;a<9;a++)
        	set[a]= false;		
	}
}
