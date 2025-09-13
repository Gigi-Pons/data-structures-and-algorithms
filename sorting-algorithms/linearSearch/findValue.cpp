#include <iostream>

using namespace std;

int linearSearch(int nums[], int n, int searchNum);

int main()
{   
    int n;
    cout << "Enter how many numbers: ";
    cin >> n;
    int nums[n];

    cout << "\nEnter the numbers: ";
    for(int i=0; i<n; i++)
        cin >> nums[i];
        
    cout << "\nEnter a number to search for: ";
    int searchNum;
    cin >> searchNum;

    int posNum = linearSearch(nums, n, searchNum);
    if(posNum == -1)
        cout << "\nNumber not found";
    else   
        cout << "\nNumber found at position " << posNum;


    return 0;
}

int linearSearch(int nums[], int n, int searchNum)
{
    int posNum = -1;

    for(int i=0; i<n; i++)
    {
        if(nums[i] == searchNum)
        {
            posNum = i;
            break;
        }
    }

    return posNum;
}

