package gainitial;

import java.util.Random;

public class GAInitial_lib {
	
	private int m, n;
	private int genetic[][];

	public GAInitial_lib(int m, int n) {
		this.m = m;
		this.n = n;
		genetic = new int[n][m];
	}
	
	public int [][] getGenetic(){
		int check[] = new int[m];
		long seed = System.currentTimeMillis(); // 現在時刻のミリ秒
		Random r = new Random(seed);
		int rn = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0 ; j< m;){
				rn = r.nextInt(m);
				if(check[rn] == 0){
					genetic[i][j] = rn+1;
					check[rn] = 1;
					j++;
				}
			}
			for(int k = 0; k < m; k++) check[k] = 0;
		}
		return genetic;
	}
	
	

}
