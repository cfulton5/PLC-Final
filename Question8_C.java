class Main {
  public static void main(String[] args) {

    int j = -3;
    for (int i = 0; i < 3; i++) {
      j=j+2;
        if(j==3){}
        else if(j==2){
          j=j-1;
        }
        else if(j==0){
          j += 2; 
        }
        else{
          j=0;
        }
      if (j > 0){
        break;
      }
      else{
        j = 3 - i;
      }
    }
  }
}