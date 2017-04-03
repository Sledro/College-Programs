#include "rand.h"
#include <algorithm>
#include <iostream>
#include <random>
#include <vector>
#include <cassert>

class rand
{
private:
	// data
	std::vector<int> m_iVec;

public:
	rand() {}

	int exec()
	{
		std::vector<int> iVec;

		gen10();

		for (int i = 0; i<10; ++i)
		{
			int nxtRandom = uniqueRandomInt();
			std::cout << nxtRandom << std::endl;
		}
		return(0);
	}


private: // methods

	void gen10() // fills data attribute with 10 digits
	{
		for (int i = 0; i <= 9; ++i)
			m_iVec.push_back(i);

		std::random_device rd;
		std::mt19937_64 gen(rd());
		std::shuffle(m_iVec.begin(), m_iVec.end(), gen);
		// m_iVec now contains 10 unique numbers, 
		// range 0..9, in random order
	}

	int uniqueRandomInt()
	{
		assert(m_iVec.size());
		int retVal = m_iVec.back(); // gets last element in vector
		m_iVec.pop_back();          // removes last element
		return(retVal);
	}

}; // class T455_t