/*
 * Assignment_1.2.cpp
 *
 *  Created on: 27-Aug-2026
 *      Author: 91703
 */
#include <iostream>
using namespace std;

int main2() {
//step1
	int N;
	cout<<"Readings entered :";
	cin>>N;

	double readings[100];
	for(int i = 0;i < N;i++)
	{
		cin>>readings[i];
	}

	//step2
	int skip = 0;
	cout<<"\n Valid readings: ";
	for(int i = 0;i <N;i++)
	{
		if(readings[i] < 0)
		{
			skip++;
			continue;
		}
		cout<<readings[i]<<"\t";
	}
	cout<<"\nSkipped (errors) :"<<skip <<endl;

	//step3
	for(int i = 1;i <=N;i++)
		{
			if(readings[i] >= 45)
			{
				cout<<"First CRITICAL   : Index "<<i+1 << " → "<<readings[i]<<"C"<<endl;
				break;
			}
		}
//step 4
	double min = 0;
	double max =0;
	double sum = 0;
	for(int i = 1;i <=N;i++)
		{
			if(readings[i] < min)
			{
				min = readings[i];
			}
			if(readings[i]>max)
			{
				max=readings[i];
			}
			sum = sum + readings[i];
		}
	    double avg = sum/N;

	cout<<"min  "<<min<<endl;
	cout<<"Max  "<<max<<endl;
	cout<<"Avg  "<<avg<<endl;
//step 5
 int normalCount = 0;
 int warningCount = 0;
 int criticalCount = 0;
 int shutdownCount = 0;
 for(int i = 0;i < N;i++)
 {
	if(readings[i] <= 29){
		normalCount++;
	}else if(readings[i] <= 44){
		warningCount++;
	} else if(readings[i] <= 59){
		criticalCount++;
	} else {
		shutdownCount++;
	}
 }
 cout<<"Normal:" << normalCount<<endl;
 cout<<"Warning:" << warningCount<<endl;
 cout<<"Critical:" <<criticalCount<<endl;
 cout<<"Shutdown:" << shutdownCount <<endl;
  return 0;
}


