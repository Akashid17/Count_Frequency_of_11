#include <iostream>

using namespace std;

class Mathematics
{
    public:
        int Frequency(int*,int);
};

int Mathematics::Frequency(int iArr[], int iLength)
{
    int iCount = 0;

    for(int j = 0; j < iLength; j++)
    {
        if(iArr[j] == 11 || iArr[j] == -11)
        {
            iCount += 1;
        }
    }

    return iCount;
}

int main()
{
    int iSize = 0;
    int *p = NULL;

    cout<<"Enter Count of Elements\n";
    cin>>iSize;

    p = new int[iSize];

    if(p == NULL)
    {
        cout<<"Unable to allocate memory\n";
        return -1;
    }

    cout<<"Enter "<<iSize<<" Elements"<<endl;

    for(int i = 0; i < iSize; i++)
    {
        cin>>p[i];
    }

    Mathematics mobj;

    int iResult = mobj.Frequency(p,iSize);

    cout<<"Count of 11 = "<<iResult<<endl;

    delete []p;

    return 0;
}