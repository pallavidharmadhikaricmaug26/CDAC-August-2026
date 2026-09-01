/*
 * Assignment_2.2.cpp
 *
 *  Created on: 01-Sept-2026
 *      Author: 91703
 */

#include <iostream>
using namespace std;

class Patient{
	int patientId;
	string name;
	int age;
	string ward;
	const string bloodGroup;

public:
	Patient():patientId(0), name("unknown"),age(0),ward("General"),bloodGroup("o+"){
		cout<<"Default Consturtor."<<endl;
	}

	Patient(int id, const string& n) : patientId(id), name(n), age(0),ward("Emergency"), bloodGroup("o+"){
		cout<<"Emergency Admission:" <<name<<endl;
	}

	Patient(int id, const string& n, int a, const string& w, const string& bg) : patientId(id), name(n), age(a),ward(w), bloodGroup(bg) {
		cout << "Full admission Details: " << name << endl;
	}

	~Patient(){
		cout << "Patient " << name << " discharged." << endl;
    }

	void displayRecord() const{
		 cout << "Patient ID: " << patientId << endl;
		 cout << "Name: " << name << endl;
		 cout << "Age: " << age << endl;
		 cout << "Ward: " << ward << endl;
		 cout << "Blood Group: " << bloodGroup << endl;
	}

	void transferWard(const string& newWard){
		ward = newWard;
	}
};

int main2(){
{
	Patient p1;
	Patient p2( 01 ,"Raj Patel");
	Patient p3(1001 ,"Meera Joshi", 34 , "Cardiology", "B+");

	Patient* p = new Patient[4];

	for(int i = 0; i < 4; i++)
		p[i].displayRecord();

	p[0].transferWard("ICU");

	delete[] p;
}
	return 0;
}





