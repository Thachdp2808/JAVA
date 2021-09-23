#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
void viethoa(char s[]){
	int i;
	int len=strlen(s);
	if(len>0){
		s[0]=toupper(s[0]);
	}
	for(i=0;i<len;i++){
		if(s[i]==' '||s[i]=='.'||s[i]=='!'||s[i]=='?'){
			s[i+1]=toupper(s[i+1]);
		}
	}
}


int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
  char s[100];
  gets(s);	

  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
  viethoa(s);
  printf("%s",s);







  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
