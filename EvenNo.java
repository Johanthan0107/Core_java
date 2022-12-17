package com.jojuskilss;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNo {
	 static void storeEvenNumbers (List<Integer> al) {

		List<Integer>EvenNumbers=al.stream().filter(n->n%2==0).collect(Collectors.toList());      
		//void storeEvenNumbers(int N) {
		System.out.println(EvenNumbers);

			}}
//[14, 15, 16, 17]
//[14, 16]
