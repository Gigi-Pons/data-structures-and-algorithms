#include <iostream>

using namespace std;

void selectionSort(int nums[], int n);
void print(int nums[], int n);
void bubbleSort(int nums[], int n);

int main()
{   
    int n;
    cout << "Enter how many numbers: ";
    cin >> n;
    int nums[n];

    cout << "\nEnter the numbers: ";
    for(int i=0; i<n; i++)
        cin >> nums[i];

     for(int i=0; i<n; i++)
    {
        cout << nums[i] << " ";
    } 

    //cout << "\nCalling selection sort...\n";
    //selectionSort(nums, n);

    cout << "\nCalling bubble sort...\n";
    bubbleSort(nums, n);

    //print(nums, n);   

    for(int i=0; i<n; i++)
    {
        cout << nums[i] << " ";
    } 

    return 0;
}

void bubbleSort(int nums[], int n)
{
    for(int i=0; i<=n; i++)
    {
        for(int j=0; j<=n-2; j++)
        {
            if(nums[j] > nums[j+1])
                swap(nums[j], nums[j+1]);
        }
    }
}

void print(int nums[], int n)
{
    for(int i=0; i<n; i++)
    {
        cout << nums[i] << " ";
    }
}

void selectionSort(int nums[], int n)
{
    //Outer loop - Left most index
    for(int i=0; i<=n-2; i++)
    {
        //Smallest value [i]
        int small = i;
        //Inner loop - Right most index
        for(int j=i+1; j<n; j++)
        {
            if(nums[j] < nums[small])
                small = j;
        }
        swap(nums[i], nums[small]);
    }
}
