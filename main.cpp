#include <iostream>
#include <string>

using namespace std;

int main()
{
    string anime = "";
    cout << "What is the name of the anime?: \n";
    getline(cin,anime);

    int metascore = 0;
    cout << "What is the rating for " << anime << "?\n";
    cin >> metascore;


    return 0;
}
