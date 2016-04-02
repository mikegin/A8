import java.util.Scanner;
public class A8 {
	public static int L;
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		for(int j = 0; j<k; j++){
			L = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			int a[] = new int[n];
			for(int h = 0; h<n; h++){
				a[h] = sc.nextInt();
			}
			
			//System.out.println();
			if(j != k-1){
				System.out.println(fill( L,  w, n, a));
			}
			else{
				System.out.print(fill( L, w, n, a));
			}
		}
	}
	public static int fill(int l, int w, int i, int[] a){
		//System.out.println(l + " " + w + " " + i + " ");
		if(w < 1){
			return L;
		}
		else if(i < 1){
			return 0;
		}
		else{
			if(l - a[a.length - i] > 0){
				return fill(l - a[a.length - i], w, i-1, a);
			}
			else if(l - a[a.length - i] == 0){
				return fill(L, w-1, i-1, a);
			}
			else{
				return Math.min(fill(L-(a[a.length - i]-l), w-1, i-1, a) + 1, fill(L-a[a.length - i], w-1, i-1, a));
			}
		}
	}
	
}
