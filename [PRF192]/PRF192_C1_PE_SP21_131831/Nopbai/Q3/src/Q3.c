#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
int CheckSNT(int n)
{
		int i;
		int count=0;
		for(i=1;i<=n/2;i++){
			if(n%i==0){
				count++;
			}
		}
		return count;
}


int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
  int n;
  scanf("%d",&n);
  
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
  if(CheckSNT(n)==1){
  	printf("%d is a prime number",n);
  }else{
  	printf("%d is not a prime number",n);
  }







  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
