//============================================================================
// Name        : Assignment_1CPP.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-
//============================================================================

#include <iostream>
using namespace std;

int main1() {
	double C;
	cout<<"Temperature:" <<endl;
	cin>>C;
	double F =(C*9/5)+32;
	cout<<"temprature:"<<F<<endl;

     int Status_Code;
	 if(C < 0)
	 {
		 Status_Code = -1;
	 }
	 else if(C > 0 && C<=29)
	 {
		 Status_Code = 0;
	 }else if(C > 30 && C <=44)
	 {
		 Status_Code = 1;
	 }else if(C > 45 && C<=59)
	 {
		 Status_Code = 2;
	 }else
	 {
		 Status_Code = 3;
	 }

	 switch(Status_Code){
	 case -1:
		 cout<<"SENSOR_ERROR"<<endl;
		 cout<<"Sensor fault - check wiring"<<endl;
		 break;
	 case 0:
	 		 cout<<"NORMAl"<<endl;
	 		 cout<<"No action required"<<endl;
	 		 break;
	 case 1:
	 		 cout<<"WARNING"<<endl;
	 		 cout<<"Alert sent to supervisor"<<endl;
	 		 break;
	 case 2:
	 		 cout<<"CRITICAL"<<endl;
	 		 cout<<"Cooling system triggered"<<endl;
	 		 break;
	 case 3:
	 		 cout<<"SHUTDOWN"<<endl;
	 		 cout<<"Emergency shutdown initiated"<<endl;
	 		 break;
	 }

	 cout<< "Reading:" << (C >= 25  ? "Above Average" : "Below Average");

	 return 0;
}
