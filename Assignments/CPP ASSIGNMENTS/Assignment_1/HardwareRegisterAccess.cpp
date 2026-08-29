/*
 * Assignment_1.2.2.cpp
 *
 *  Created on: 29-Aug-2026
 *      Author: 91703
 */
#include <iostream>
using namespace std;

int main6(){
	int statusReg = 0b10110001;
	int controlReg = 0b00000000;
	int dataReg = 0b11001010;

	const int *regPtr1 = &statusReg;
	int *const regPtr2 = &controlReg;
	const int* const regPtr3 = &statusReg;

	cout << "regPtr1 -> " << *regPtr1 << endl;
	cout << "regPtr2 -> " << *regPtr2 << endl;
	cout << "regPtr3 -> " << *regPtr3 << endl;

	return 0;
}
/*regPtr1: read-only view of statusReg
    const int *regPtr1 = &statusReg;
    cout << "regPtr1 -> " << *regPtr1 << endl;
    *regPtr1 = 5;
    // ERROR: assignment of read-only location '*regPtr1'
   // — value is const, cannot write through this pointer
     regPtr1 = &dataReg;   // ALLOWED — pointer itself is NOT const, can repoint freely

regPtr2: fixed address, but writable value (matches controlReg's real hardware behavior)
    int *const regPtr2 = &controlReg;
    cout << "regPtr2 -> " << *regPtr2 << endl;
    *regPtr2 = 0b11111111;
    // ALLOWED — value is NOT const, firmware can write to control register
    cout << "regPtr2 after write -> " << *regPtr2 << endl;
    regPtr2 = &dataReg;
    // ERROR: assignment of read-only variable 'regPtr2'
   // — pointer address is const, cannot repoint

regPtr3: fully locked — matches ROM config (never changes, never repoints)
    const int* const regPtr3 = &statusReg;
    cout << "regPtr3 -> " << *regPtr3 << endl;
    *regPtr3 = 5;
    // ERROR: assignment of read-only location '*regPtr3'
    regPtr3 = &dataReg;
    // ERROR: assignment of read-only variable 'regPtr3'
    // — both value AND pointer are const, fully locked
    */
