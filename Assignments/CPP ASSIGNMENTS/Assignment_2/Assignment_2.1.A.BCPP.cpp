//============================================================================
// Name        : cpp.cpp
// Author      : Pallavi
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Product{

	int productId;
	string name;
	double price;
	int quantity;

	public:

	void acceptDetails(){
		cout<<"Enter a Details: "<<endl;
		cin >>productId >> name >> price >> quantity ;
		}

	void displayDetails() const {
		cout<<"Product ID:" <<productId<<endl;
		cout<<"Name : " <<name << endl;
		cout<<"Price : "<<price<<endl;
		cout<<"Quantity: "<<quantity<<endl;
	}

	double totalValue() const {
		double Total = price * quantity;
		return Total;
	}

	bool isLowStock(int threshold) const{
		return threshold > quantity;

	}

};

double reorderCost(int qty, double unitPrice) {
    return qty * unitPrice;
}

double reorderCost(double qty, double unitPrice) {
    return qty * unitPrice;
}

double reorderCost(int qty, double unitPrice, double taxRate) {
    double cost = qty * unitPrice;
    return cost + (cost * taxRate / 100);
}

double applyDiscount(double price, double discountPercent = 10.0) {
    return price - (price * discountPercent / 100);
}

int main1() {

	Product P[5];

	for(int i= 0; i < 5; i++){
		cout<<" Enter details of product :" << i+1 << endl;
		P[i].acceptDetails();
	}

	cout<<"\n====== INVENTORY REPORT ======" <<endl;
	for(int i = 0; i < 5; i++){
		P[i].displayDetails();
		 cout << "Total Value:"
				 <<P[i].totalValue()<<endl;

	}

	int HighestVal = 0;
	for(int i = 1; i < 5; i++){
		if(P[i].totalValue() > P[HighestVal].totalValue()){
			HighestVal = i;
		}
	}

	cout << "\n Highest Total Value Product:"<<endl;
	P[HighestVal].displayDetails();
	cout << "Total Value: " ;
	     cout<< P[HighestVal].totalValue() << endl;

	     int threshold;

	     cout << "Enter threshold: ";
	     cin >> threshold;

	     for(int i = 0; i < 5; i++) {
	         if(P[i].isLowStock(threshold)) {
	             P[i].displayDetails();
	         }
	     }

	     cout << reorderCost(10, 101.50) << endl;
	     cout << reorderCost(40.54, 121.70) << endl;
	     cout << reorderCost(88, 303.58, 20.22) << endl;

	     cout << applyDiscount(700) << endl;
	     cout << applyDiscount(500, 20) << endl;

	return 0;
}
