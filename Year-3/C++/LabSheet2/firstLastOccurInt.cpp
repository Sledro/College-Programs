/*
@author Daniel Hayden
Student Number: C00137009
Date: November '16
Purpose: Find the first and last occurancce positions in an array of integers.
*/

#include "stdafx.h"
#include <iostream>
using namespace std;

int main()
{

	int valueArray[] = {2, 78, 104, 19, 12, 8, 4, 25, 148, 256, 512, 64, 82, 88, 1, 46, 5, 33, 77, 12, 90};
	int firstOccur=-1;
	int lastOccur=-1;

	for (int index = 0; index < 20; index++) {

		if (valueArray[index] == 12 && firstOccur==-1) {
			firstOccur = index;
		}
		if (valueArray[index] == 12) {
			lastOccur = index;
		}
	}

	if (firstOccur!= -1 && lastOccur!= -1) {
		cout << "The firs occurance of 12 was at index position: " << firstOccur << endl;
		cout << "The last occurance of 12 was at index position: " << lastOccur << endl;
	}else if (lastOccur != -1) {
		cout << "The last occurance of 12 was at index position: " << lastOccur << endl;
	}else if (firstOccur != -1) {
		cout << "The first occurance of 12 was at index position: " << firstOccur << endl;
	}else{
		cout << "Number 12 was not found: " << -1 << endl;
	}
	
	system("pause");
    return 0;
}