import java.util.*; 
class Main {
  public static void main(String[] args) {
    //For custom input for state diagram
    //Scanner scan = new Scanner(System.in); 
    //String systemInput = scan.nextLine(); 

    String input1 = "variable1=12345";
    String input2 = "variable2=1.2345";
    String input3 = "variable3=\"Hello There\"";
    String input4 = "badVar1=1234five";
    String input5 = "badVar2=12.345.6";
    String input6 = "badVar3=12.345??6";
    String input7 = "badVar3=Hello There\"";

    //printer(systemInput);
    printer(input1);
    printer(input2);
    printer(input3);
    printer(input4);
    printer(input5);
    printer(input6);
    printer(input7);

  }
  public static void printer(String a){
    System.out.println();
    System.out.println("Variable Name: "+variableName(a));
    System.out.println("Literal being analyzed: "+literals(a));
    System.out.println("Type found: "+typeFinder(literals(a)));
    System.out.println();
  }

  public static String variableName(String x){
    int ioIndex = x.indexOf("=");
    String subString = null;
    if (ioIndex != -1) {
      subString= x.substring(0 , ioIndex);
    }
    return subString;
  }

  public static String literals(String y){
    int ioIndex = y.indexOf("=");
    String literal = y.substring(ioIndex+1 , y.length());
    return literal;
  }

  public static String typeFinder(String z){
    if(z.charAt(0) == '\"'){
      if(z.charAt(z.length()-1) == '\"'){
        return "String Literal";
      }
      else{
        return "Error: no closing quotation mark for type: String Literal";
      }
    }
    if(Character.isLetter(z.charAt(0))){
      return "Error: missing quotation mark for type: String Literal";
    }
    if(Character.isDigit(z.charAt(0))){
      int decimalCounter = 0;
      for(int i = 0; i < z.length(); i++){
        char c = z.charAt(i);
        if(c == '.'){
          decimalCounter++;
        }
        else if(!Character.isDigit(c)){
          return "Error: non-digit character found in type: Float Literal or Integer Literal";
        }
      }
      if(decimalCounter == 1){
        return "Float Literal";
      }
      if(decimalCounter > 1){
        return "Error: too many decimal points for type: Float Literal";
      }
      else{
        return "Integer Literal";
      }
    }
    else{
      return "Error";
    }
  }
}
