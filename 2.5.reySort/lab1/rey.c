#include "stdio.h"
#include "string.h"

#define MAX 50
#define NLEN 70















int findMax (int marks[], int start, int end) {

    int index = start;
    int max = marks[start];

    for (int i=start; i< end; i++)
    {
        if (max < marks[i])
        {
            max = marks[i];
            index = i;
        }
    }
    
    return index;
}


void topN    (char names[][NLEN], int marks[], int count, 
              int n)
{
    char name2[count][NLEN];
    int marks2[count];

    int max = 0;

    for(int i = 0; i <  count; i++)
    {
        int index = findMax(marks, i, count);

        int tmp = marks[i];
        marks[i] = marks[index];
        marks[index] = tmp;

        char tempName[NLEN];
        strcpy(tempName, names[i]);
        strcpy(names[i], names[index]);
        strcpy(names[index], tempName);
    }
}