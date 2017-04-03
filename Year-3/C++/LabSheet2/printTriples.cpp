/*
@author Daniel Hayden
Student Number: C00137009
Date: November '16
Purpose: Write a function to print out all occurrences of pairs of any 2 number in an array of integers whose product 
	     (numbers multiplied together)  is equal to a given Number
*/

#include "stdafx.h"
#include <cstdlib>
#include <iostream>
using namespace std;

void printTriples(int product, int array[], int arrSize)
{
	int index; 
	int index2;
	int *pointer;
	int *pointer2;
	pointer = array;
	pointer2 = pointer + 1;

	for (index = 0; index < arrSize; index++){
		
		for (index2 = index + 1; index2 < arrSize; index2++){
			
			if (*pointer2 * *pointer == product){
				
				cout << *pointer << "*" << *pointer2 << " \n";
			}
			
			pointer2++;
		}
		
		pointer++;
		pointer2 = pointer;
	}
}

int main(void)
{
	int input = 20;
	int myArray[] = { 2, 78, 104, 19, 12, 8, 4, 25, 148, 256, 512, 64, 82, 88, 1, 46, 5, 33, 12, 90 };
	int arraySize = sizeof(myArray) / sizeof(int);

	printTriples(input, myArray, arraySize);

	system("pause");
}



