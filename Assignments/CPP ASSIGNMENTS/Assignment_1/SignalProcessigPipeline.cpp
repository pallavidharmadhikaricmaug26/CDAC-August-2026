/*
 * Assignment_1.2.2.cpp
 *
 *  Created on: 29-Aug-2026
 *      Author: 91703
 */
#include <iostream>
#include <cmath>
using namespace std;

double computeRMS(double* signal, int n){
	double sum = 0;
	for(int i = 0;i < n; i++){
		double num = *(signal + i);
		sum += num * num;
	}
	return sqrt(sum / n);
}

void normalise(double* signal ,int n){
	    double maxVal = 0;
		for(int i = 0;i < n; i++){
		 double num = abs(*(signal + i));
		 if(num > maxVal){
		 maxVal = num;
		 }
		}
		for(int i = 0;i < n; i++){
			*(signal + i) = *(signal + i)/ maxVal;

		}
}

int countZeroCrossings(double* signal , int n){
	int count = 0;
	for (int i = 0; i < n-1;i++){
		if((*(signal + i)) * (*(signal + i + 1 )) < 0){
			count++;
		}
	}
	return count;
}

void applyGain(double* signal, int n, double gainFactor){
    for(int i = 0; i < n; i++){
        *(signal + i) = *(signal + i) * gainFactor;
    }
}

int main7(){
    int n;
    cout<<"Enter Number:";
    cin>> n;

    double signal[100];
    cout<< "Enter "<< n << " signal values:" <<endl;
    for(int i = 0; i<n; i++){
    	cin >>signal[i];
    }

    cout<<"RMS:" << computeRMS(signal , n) <<endl;

    cout<<"before normalise:";
    for (int i = 0; i < n; i++) cout << signal[i]<< " ";
    cout <<endl;

    normalise(signal, n);

    cout<<"After normalise:";
    for(int i= 0; i < n ; i++) cout<< signal[i]<<" ";
    cout << endl;

    cout << "Zero crossings:" <<countZeroCrossings(signal , n) <<endl;

    double gainFactor;
    cout << "Enter gain Factor:";
    cin >> gainFactor;

    applyGain(signal , n , gainFactor);

    cout << "After applyGain:";
    for(int i = 0; i < n; i++) cout <<signal[i] << " ";
    cout <<endl;

    return 0;
}



