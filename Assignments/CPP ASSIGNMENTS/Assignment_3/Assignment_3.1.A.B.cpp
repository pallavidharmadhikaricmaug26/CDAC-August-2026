//============================================================================
// Name        : B.cpp
// Author      : Pallavi
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <vector>
#include <utility>
using namespace std;


enum class HttpStatus{
	OK             = 200,
	Created        = 201,
	BadRequest     = 400,
	Unauthorized   = 401,
	NotFound       = 404,
	ServerError    = 500
};

void handleResponse(HttpStatus status, const string& endpoint){
	switch (static_cast<int>(status)){
	case 200:
		cout<<"[" <<endpoint<< "] -> 200 OK : Request succeeded." <<endl;
		break;
	case 201:
		cout<<"[" <<endpoint<< "] -> 201 Created." <<endl;
		break;
	case 400:
		cout<<"[" <<endpoint<< "] -> 400 BadRequest." <<endl;
		break;
	case 401:
		cout<<"[" <<endpoint<< "] -> 401 Unauthorized : Authentication required." <<endl;
		break;
	case 404:
		cout<<"[" <<endpoint<< "] -> 404 NotFound : Endpoint does not exist." <<endl;
		break;
	case 500:
		cout<<"[" <<endpoint<< "] -> 500 Server Error : Internal server error - retry later."<<endl;
		break;
	}
}

using Header     = pair<string, string>;
using HeaderList = vector<Header>;
using Port       = unsigned int;
using IPAddress  = string;

typedef unsigned long long RequestId;

void printHeaders(const HeaderList& headers){
	cout<< "Headers:" <<endl;
	for(int i = 0; i < headers.size();i++){
		cout << " " << headers[i].first << " : " << headers[i].second <<endl;
	}
}

int main1() {
	handleResponse(HttpStatus::OK, "GET / api/users");
	handleResponse(HttpStatus::Unauthorized, "POST / api/login");
	handleResponse(HttpStatus::NotFound, "GET /api/products/99");
	handleResponse(HttpStatus::ServerError, "POST /api/order");

	RequestId reqId = 1748293847;
	Port serverPort = 8080;

	HeaderList headers;
	headers.push_back(Header("Content-Type", "application/json"));
	headers.push_back(Header("Authorization","Bearer eyJhbGci...."));
	headers.push_back(Header("Accept-Language","en-US"));

	cout <<"Request ID  :" <<reqId <<endl;
	cout << "Server Port : " <<serverPort <<endl;

	printHeaders(headers);

	return 0;
}
