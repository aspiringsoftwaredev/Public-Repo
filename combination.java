import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for (int a = 0; a < T; a++)
		{
		    int N, K;
		    
		    N = scan.nextInt();
		    K = scan.nextInt();
		    
		    int j, i, x;
		    j = 0;
		    i = 1;
		    x = 0;
		    
		    while (x < N-1)
		    {
                while (i < N)
                {
                    while (j < K)
                    {
                        System.out.print("" + alphabets.charAt(j));
                        j += i;
                    }
                    System.out.println();
                    i++;
                    j = 0;
                    K++;
                }
                i++;
		    }
		}
	}
}
