package hdu;

import java.util.Scanner;

public class MaxSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();  
        int n,i,j,u,max;
        int[] sum;
        int[] a;
        int[] b;
        for(u=0 ;u<t ;u++){  
             n = sc.nextInt();  
             a=new int[n];
             for(i=0;i<n;i++)
            	 a[i]=sc.nextInt();
             max=0;j=0;
             sum=new int[n];
             b=new int[n];
             sum[0]=a[0];
             max=sum[0];
             b[0]=0;
             for(i=1;i<n;i++){
            	 if(a[i]>a[i]+sum[i-1]){
            		 sum[i]=a[i];
            		 b[i]=i;
            	 }
            	 else{
            		 sum[i]=sum[i-1]+a[i];
            		 b[i]=b[i-1];
            	 }
            	 if(sum[i]>max){
            		 max=sum[i];j=i;
            	 }
             }
             System.out.println("Case "+(u+1)+":");
             System.out.println(max+" "+(b[j]+1)+" "+(j+1));
             if(u!=t-1)
               System.out.println();
        }
	}
}
