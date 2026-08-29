/*
 * Assignment_1.2.4.cpp
 *
 *  Created on: 29-Aug-2026
 *      Author: 91703
 */
#include <iostream>
using namespace std;

bool parsePacket(const int* rawData, int size, int** outMin, int** outMax){
    if(size <= 0){
        return false;
    }

    int minIndex = 0;
    int maxIndex = 0;

    for(int i = 1; i < size; i++){
        if(rawData[i] < rawData[minIndex]){
            minIndex = i;
        }
        if(rawData[i] > rawData[maxIndex]){
            maxIndex = i;
        }
    }

    *outMin = (int*)&rawData[minIndex];
    *outMax = (int*)&rawData[maxIndex];

    return true;
}

int main8(){
    int packet[] = {45, 12, 67, 8, 55, 31};
    int* minPtr = nullptr;
    int* maxPtr = nullptr;

    if(parsePacket(packet, 6, &minPtr, &maxPtr)){
        cout << "Calibration Min : " << *minPtr << endl;
        cout << "Calibration Max : " << *maxPtr << endl;
    }

    return 0;
}
