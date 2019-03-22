package com.countTriplets;

public class CountTriplets {

	
	static int arr[] = new int[]{5, 1, 3, 4, 7}; 
	
	
	
	static int countTriplet(int n, int sum) {
		int ans=0;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]<sum) {
						ans++;
					}
				}
			}
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int j=countTriplet(arr.length, 12);
System.out.println(j);
	}

}
