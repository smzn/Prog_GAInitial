package gainitial;

import java.util.Arrays;
import java.util.Scanner;

public class GAInitial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input length of genetic m > ");
		int m = Integer.parseInt(scan.next());

		System.out.print("Input number of genetic n > ");
		int n = Integer.parseInt(scan.next());
		
		int genetic[][] = new int[n][m];
		GAInitial_lib gainitial_lib = new GAInitial_lib(m,n);
		genetic = gainitial_lib.getGenetic();
		
		System.out.println(Arrays.deepToString(genetic));
	}

}
