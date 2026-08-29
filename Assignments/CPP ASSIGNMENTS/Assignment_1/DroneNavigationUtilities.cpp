/*
 * Assignment_1.2.5.cpp
 *
 *  Created on: 29-Aug-2026
 *      Author: 91703
 */

#include <iostream>
#include <cmath>
using namespace std;

inline double distanceBetween(double x1, double y1, double x2, double y2){
    return sqrt(pow(x2-x1, 2) + pow(y2-y1, 2));
}

inline double toRadians(double degrees){
    return degrees * (M_PI / 180.0);
}

inline double clamp(double value, double minVal, double maxVal){
    if(value < minVal) return minVal;
    if(value > maxVal) return maxVal;
    return value;
}

inline bool isInSafeZone(double x, double y, double centerX, double centerY, double radius){
    double distance = distanceBetween(x, y, centerX, centerY);
    return distance <= radius;
}

int main9(){
    double homeX = 0.0;
    double homeY = 0.0;
    double safeRadius = 50.0;

    double waypointX[3] = {20.0, 60.0, 45.0};
    double waypointY[3] = {30.0, 10.0, 45.0};

    for(int i = 0; i < 3; i++){
        double x = waypointX[i];
        double y = waypointY[i];

        double distance = distanceBetween(homeX, homeY, x, y);
        bool safe = isInSafeZone(x, y, homeX, homeY, safeRadius);

        cout << "Waypoint " << i+1 << " (" << x << ", " << y << ")" << endl;
        cout << "  Distance from home: " << distance << endl;
        cout << "  Inside safe zone  : " << (safe ? "YES" : "NO") << endl;
    }

    return 0;
}


