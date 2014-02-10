package DP;

import java.util.ArrayList;

public class Triangle {
	public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        for(int i=1;i<triangle.size();i++){
			ArrayList<Integer> prev= triangle.get(i-1);
            ArrayList<Integer> cur= triangle.get(i);
            for(int j=0;j<cur.size();j++){
                int min=0;
                if(j==0){
                    min=prev.get(j);
                }
                else if(j==cur.size()-1){
                    min=prev.get(j-1);
                }
                else{
                    min=prev.get(j)<prev.get(j-1)?prev.get(j):prev.get(j-1);
                }
                cur.set(j,min+cur.get(j));
            }
        }
        ArrayList<Integer> cur= triangle.get(triangle.size()-1);
        int ret=cur.get(0);
        for(int i:cur){
            ret=i<ret?i:ret;
        }
        return ret;
    }
}
