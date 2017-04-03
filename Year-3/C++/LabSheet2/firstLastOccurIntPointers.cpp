/*
@author Daniel Hayden
Student Number: C00137009
Date: November '16
Purpose: Find the first and last occurancce positions in an array of integers using pointers*
*/

#include "stdafx.h"
#include <iostream>
using namespace std;

int main()
{

	int valueArray[] = { 2, 78, 104, 19, 12, 8, 4, 25, 148, 256, 512, 64, 82, 88, 1, 46, 5, 33, 12, 90 };
	int *firstOccur = NULL;
	int *lastOccur = NULL;

	//points to the first element in the array
	int *indexPointer;
	indexPointer = valueArray;

	for (int index = 0; index < 20; index++) {

		if (*indexPointer == 12){

			if (firstOccur == NULL){	
				firstOccur = indexPointer;
			}
		
			lastOccur = indexPointer;
		}
		//Move to the next address / element in the array
		indexPointer++;
	}

	if (firstOccur != NULL && lastOccur != NULL) {
		cout << "The firs occurance of 12 was at index position: " << (firstOccur - valueArray) << endl;
		cout << "The last occurance of 12 was at index position: " << (lastOccur - valueArray) << endl;
	}
	else if (lastOccur != NULL) {
		cout << "The last occurance of 12 was at index position: " << (lastOccur - valueArray) << endl;
	}
	else if (firstOccur != NULL) {
		cout << "The first occurance of 12 was at index position: " << (firstOccur - valueArray) << endl;
	}
	else {
		cout << "Number 12 was not found: " << -1 << endl;
	}

	system("pause");
	return 0;
}