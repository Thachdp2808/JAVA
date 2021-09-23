
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>


int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	int arr[100];
	int i;
	for(i=0;i<7;i++){
		scanf("%d",&arr[i]);
	}
  
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
	int j;
	for(i=0;i<=7-2;i++){
		for(j=i+1;j<=7-1;j++){
			if(arr[i]>arr[j]){
				int tg=arr[i];
				arr[i]=arr[j];
				arr[j]=tg;
			}
		}
	}
	for(i=0;i<7;i++){
		printf("%d ",arr[i]);
	}







  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
