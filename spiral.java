import java.util.Scanner;

class Spiral{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int c = in.nextInt();
		int[][] arr = new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j]=in.nextInt();
			}
		}
		spi(arr);

	}

	public static void spi(int[][] arr){
		int l=0;
		int r=arr[0].length-1;
		int t=0;
		int b=arr.length-1;

		int i=0;
		int j=0;
		while(true){
			while(j<=r){
				System.out.println("top");
				System.out.print(arr[i][j]+" ");
				j++;

			}
			j--;
			t++;
			i++;
			if(i>b||i<t||j>r||j<l){return;}

			while(i<=b){
				System.out.println("right");
				System.out.print(arr[i][j]+" ");
				i++;
			}
			i--;
			r--;
			j--;
			if(i>b||i<t||j>r||j<l){return;} 
			
			while(j>=l){
				System.out.println("bottom");
				System.out.print(arr[i][j]+" ");
				j--;
			}
			j++;
			b++;
			i--;
			System.out.println(i+" "+j);
			if(i>b||i<t||j>r||j<l){return;}
			
			while(i>=t){
				System.out.println("left");
				System.out.print(arr[i][j]+" ");
				i--;
			}
			i++;
			j++;
			l++;
			if(i>b||i<t||j>r||j<l){return;}
		}
	}
}