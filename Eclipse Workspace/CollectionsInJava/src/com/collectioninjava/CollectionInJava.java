package com.collectioninjava;

public class CollectionInJava {

	public static void main(String[] args) {
		/*
		 *why we need to collection:
		 *=========================
		 *tp over come the drabacks of array  we have to go for collection
		 *
		 * draback of array:
		 * ================
		 * 1.fixed size
		 * 2.same datatype elements
		 * 3.we cannot reduce the size an array
		 * 
		 * advantge of an array
		 * ====================
		 * 1.random access
		 * 2.type safty - the element inside of the array is based on the data type
		 * 3.type casting - to print element in array 5=no need to type cast
		 * 
		 * 
		 * */
		int [] arr = new int[2];
		arr[0] =12;
		arr[1] =20;
		
		System.out.println((int)arr[0]);//no need to type casting
		System.out.println(arr[0]);
		System.out.println(arr[1]);

	}

}
