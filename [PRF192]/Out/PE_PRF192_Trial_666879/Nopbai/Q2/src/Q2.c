#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>


int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	int n;
    scanf("%d",&n);fflush(stdin);
  int i;
  int count=0;
  int sum=0;
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
  for(i=n;i>=0;i--){
  	if(i%2==0){
  		count++;
  		sum=sum+i;
  			if(count==3){
  				break;
			  }
	  }
  }
  printf("%d",sum);
	





  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
