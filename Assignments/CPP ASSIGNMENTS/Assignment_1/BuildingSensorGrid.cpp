#include <iostream>
using namespace std;

int main3(){

	double arr1[3][3];

	cout<<"Enter the Elements of Array:" <<endl;
	for(int i = 0; i < 3; i++ ){
		for(int j = 0; j < 3; j++){
			cin>>arr1[i ][ j];
			}
	}
	cout<<"\n\tRoom1\tRoom2\tRoom3\n";
		for (int i = 0; i < 3; i++){
			cout<< "Floor "<< i + 1 <<" : ";
			for(int j = 0; j < 3; j++){
				cout<<arr1[ i ][ j]<<"\t";
			}
			cout<<endl;
		}

		double hottestroom = arr1[0][0];
		int hottestFloor = 0;
		int hottestRoom = 0;

		for (int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(arr1[i][j] > hottestroom){
					hottestroom = arr1[i][j];
					hottestFloor = i;
					hottestRoom = j;
				}
			}
		}
		cout<<"Hottest Room : Floor"<<hottestFloor + 1
		     <<" Room "<<hottestRoom +1
		     <<" --> "<<hottestroom <<"C"<<endl;

		double bestAvg = -1;
		int bestFloor = 0;

		for(int i = 1;i < 3;i++){
			double sum = 0;
			for(int j = 0; j < 3 ;j++){
			sum = sum + arr1[i][j];
			}
			double avg = sum/3;
			if(avg >bestAvg){
			 bestAvg = avg;
			 bestFloor = i;
			}
		}
		 cout<<"Hottest Floor: Floor "<<bestFloor + 1<<"(avg" << bestAvg<<"c)"<<endl;

		 int warningCount = 0;

		 for(int i = 0; i < 3; i++){
		     for(int j = 0; j < 3; j++){
		         if( arr1[i][j] >= 30 ){
		             warningCount++;
		         }
		     }
		 }

		 cout << "Rooms at WARNING or above : " << warningCount << endl;

	}
