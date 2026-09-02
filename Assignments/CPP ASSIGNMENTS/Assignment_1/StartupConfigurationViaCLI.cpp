#include <iostream>
using namespace std;

int main4(int argc, char* argv[]){

    if(argc < 4){
        cout << "Usage   : ./sensor_monitor <warn_threshold> <critical_threshold> <num_readings>" << endl;
        cout << "Error   : Missing arguments." << endl;
        return 1;
    }

    int warn = stoi(argv[1]);
    int critical = stoi(argv[2]);
    int numReadings = stoi(argv[3]);


    if(warn >= critical){
        cout << "Error   : warn_threshold must be less than critical_threshold." << endl;
        return 1;
    }

    if(numReadings < 1 || numReadings > 500){
        cout << "Error   : num_readings must be between 1 and 500." << endl;
        return 1;
    }

    int shutdown = critical + (critical - warn);

    int normal = 0;
    int warning = 0;
    int criticalCount = 0;
    int shutdownCount = 0;

    for(int i = 0; i < numReadings; i++){
        int temperature = rand() % 70;

        if(temperature < warn){
            normal++;
        } else if(temperature < critical){
            warning++;
        } else if(temperature < shutdown){
            criticalCount++;
        } else {
            shutdownCount++;
        }
    }

    cout << "Config  : Warn=" << warn << "C  Critical=" << critical<<endl;
    cout << "C  Readings=" << numReadings << endl;
    cout << "Results : Normal:" << normal << "  Warning:" << warning<<endl;
    cout<< "  Critical:" << criticalCount << "  Shutdown:" << shutdownCount << endl;

    return 0;
}
