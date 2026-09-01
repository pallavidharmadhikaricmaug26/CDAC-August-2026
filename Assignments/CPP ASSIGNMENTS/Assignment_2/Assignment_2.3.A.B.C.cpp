/*
 * Assignment_2.3.A.B.C
 *
 *  Created on: 02-Sept-2026
 *      Author: 91703
 */
#include <iostream>
using namespace std;

class entity{
	string name;
	int health;
	int level;
	string type;

public:
	entity& setName(const string& n){
		this->name = n;
		return *this;
	}

	entity& setHealth(int h) {
		this->health = h;
		return *this;
	}

	entity& setLevel(int l) {
	        this->level = l;
	        return *this;
	}

	entity& setType(const string& t) {
	        this->type = t;
	        return *this;
	}

	string getName() const {
		return name;
	}

	int getHealth() const {
		return health;
	}

	int getLevel() const {
		return level;
	}

	string getType() const {
		return type;
	}

	void displayInfo() const {
		cout << "Name   : " << name << endl;
		cout << "Health : " << health << endl;
		cout << "Level  : " << level << endl;
		cout << "Type   : " << type << endl;
	}
};

namespace Physics {
double clamp(double val, double min, double max) {
	if(val < min)
		return min;
	if(val > max)
		return max;
	return val;
}

double lerp(double a, double b, double t) {
	return a + (b - a) * t;
}
}

namespace GameMath {
int clamp(int val, int min, int max) {
	if(val < min)
		return min;
	if(val > max)
		return max;
	return val;
}

double lerp(double a, double b, double t) {
	return a + (b - a) * t;
}
}

int main() {
	entity player;
	entity enemy;
	entity item;

	player.setName("Aragorn");
	player.setHealth(100);
	player.setLevel(10);
	player.setType("Player");

	enemy.setName("Orc");
	enemy.setHealth(60);
	enemy.setLevel(5);
	enemy.setType("Enemy");

	 item.setName("HealthPotion");
	 item.setHealth(0);
	 item.setLevel(1);
	 item.setType("Item");

	 player.displayInfo();
	 enemy.displayInfo();
	 item.displayInfo();

	 cout << "Physics Clamp: ";
	 cout<< Physics::clamp(150.5, 0, 100) << endl;

	 cout << "GameMath Clamp: ";
	 cout<< GameMath::clamp(150, 0, 100) << endl;

	 cout << "Physics Lerp: ";
	 cout<< Physics::lerp(0, 100, 0.5) << endl;

	 cout << "GameMath Lerp: ";
	 cout<< GameMath::lerp(10, 20, 0.25) << endl;

	 int R;
	 int C;

	 cout<<" Enter Rows and Columns:"<<endl;
	 cin >> R >> C;

	 int** map = new int*[R];

	 for(int i = 0; i < R; i++){
		 map[i] = new int[C];
	 }

	 for(int i = 0; i < R; i++){
		 for(int j = 0; j < C; j++ ){
			 map[i][j] = rand()% 5;
		 }
	 }

	 cout<< "====== GAME MAP ======" <<endl;

	 for(int i = 0; i < R; i++){
		 for(int j = 0; j < C; j++ ){
			cout<< map[i][j] << " ";
		 }
		 cout << endl;
	 }

	 cout << "Legend: 0=Grass  1=Water  2=Mountain  3=Forest  4=Dungeon" << endl;

	 int count[5] = {0};
	 for(int i = 0; i < R; i++) {
		 for(int j = 0; j < C; j++) {
			 count[map[i][j]]++;
		 }
	 }

	 cout << "Tile Count:" << endl;
	 cout << "Grass    : " << count[0] << endl;
	 cout << "Water    : " << count[1] << endl;
	 cout << "Mountain : " << count[2] << endl;
	 cout << "Forest   : " << count[3] << endl;
	 cout << "Dungeon  : " << count[4] << endl;

	 for(int i = 0; i < R; i++) {
		 delete[] map[i];
	 }

	 delete[] map;

	 return 0;
}








