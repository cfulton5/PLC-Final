class Main {
  public static void main(String[] args) {
    int first,second,third,max,mid,min;  
    //random testing values:
    first = 4;
    second = 6;
    third = 9;

    //******************NESTED IF SOLUTION: **********************
    if(first>second){
      if(first>third){
        if(second>third){ //first>second>third
          max = first;
          mid = second;
          min = third;
        }
        else{ //first>third>second
          max = first;
          mid = third;
          min = second;
        }
      }
      else{ //third>first>second
          max = third;
          mid = first;
          min = second;
      }
    }
    else{ //second>first
        if(second>third){  
          if(first>third){  //second>first>third
            max = second;
            mid = first;
            min = third;
          }
          else{ //second>third>first
            max = second;
            mid = third;
            min = first;
          }
        }
        else{ //third>second>first
            max = third;
            mid = second;
            min = first;
          }
        }


  
  //**********NON-NESTED SOLUTION******************
  if(first>second && second>third){
    max = first;
    mid = second;
    min = third;  
  }
  if(first>second && third>second){
    max=first;
    mid=third;
    min=second;
  }
  if(third>first && first>second){
    max = third;
    mid = first;
    min = second;
  }
  if(second>first && first>third){
    max = second;
    mid = first;
    min = third;
  }
  if(second>third && third>first){
    max = second;
    mid = third;
    min = first;
  }
  if(third>second && second>first){
    max = third;
    mid = second;
    min = first
  }
}
}