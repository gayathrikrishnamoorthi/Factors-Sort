package sample;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
	public static void factorsort(int array[],int n) {
		 for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (factor_count(array[j]) > factor_count(array[j+1])) {
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }

	public static int factor_count(int num) {
	int count=0;
	        for(int i=1;i<Math.sqrt(num);i++){
	            if(num%i==0){
	                count++;
	            }
	        }
	        return count;
	        }
	 
	
		 public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        int[] array = new int[n];

		        for(int i=0;i<n;i++){
		            array[i]=sc.nextInt();
		        }
		        factorsort(array,n);
		        System.out.println(Arrays.toString(array));
		       

		}
	}


