#include <stdio.h>

int main(void) {
  int j,i;
  j = -3;
  for (i = 0; i < 3; i++) {
    j = j + 2;
      if(j == 3){}
      else if(j ==2){
        j--; 
      }
      else if(j == 0){
        j += 2; 
      }
      else{
        j = 0;
      }
    if (j > 0){ 
      goto gotoStatement;
    }
    else{
      j = 3 - i;
    }
  }
  gotoStatement:
  return 0;
}