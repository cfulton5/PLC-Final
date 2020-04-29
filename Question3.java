import java.util.*; 
  
class parser {
    static String input = "variable=12+(8/7)";
    static char[] charArray = input.toCharArray();
    static int i = 0;
    static char next = charArray(i);
    
  public static void main(String[] args) {
 
  }

  public static boolean assignment(char n){
    if(variable(n)){
      if(next == '='){
        if(expression(n)){
          i++; 
		  next = charArray(i); 
		  return true;
        }
      }
    }
    return false;
  }

  public static boolean variable(char n){
    if(letter(n)){
      if(variable(n)){
        i++; 
		next = charArray(i); 
		return true;
      }
    }
    if(digit(n)){
      if(variable(n)){
        i++; 
		next = charArray(i); 
		return true;
      }
    }
    return false;
  }

  public static boolean expression(char n){
    if(next == '('){
      if(expression(n)){
        if(next == ')'){
          i++; 
		  next = charArray(i); 
		  return true;
        }
      }
    }
    else if(number(n)){
      if(operator(n)){
        if(expression(n)){
          i++; 
		  next = charArray(i); 
		  return true;
        }
      }
      else{
        i++; 
		next = charArray(i); 
		return true;
      }
    }
    return false;
  }

  public static boolean operator(char n){
    if(next == '*' || next =='/' || next =='+' ||next == '-' ||next == '%' ||next == '>' ||next == '<' ||next == '='){
      i++; 
	  next = charArray(i); 
	  return true;
    }
    return false;
  }

  public static boolean number(char n){
    if(int_literal(n)){
      i++; 
	  next = charArray(i); 
	  return true;
    }
    if(float_literal(n)){
      i++; 
	  next = charArray(i); 
	  return true;
    }
    return false;
  }

  public static boolean float_literal(char n){
    if(int_literal(n)){
      if(next == '.'){
        if(int_literal(n)){
          i++; 
		  next = charArray(i); 
		  return true;
        }
      }
    }
    return false;
  }

  public static boolean int_literal(char n){
    if(digit(n)){
      if(int_literal(n)){
        i++; 
		next = charArray(i); 
		return true;
      }
      else{
        i++; 
		next = charArray(i); 
		return true;
      }
    }
    return false;
  }

  public static boolean digit(char n){
    if(next == '0'||next =='1'||next =='2'||next =='3'||next =='4'||next =='5'||next =='6'||next =='7'||next =='8'||next =='9'){
      i++; 
	  next = charArray(i); 
	  return true;
    }
    return false;
  }

  public static boolean letter(char n){
    if(next == 'a'||next =='b'||next =='c'||next =='d'||next =='e'||next =='f'||next =='g'||next =='h'||next =='i'||next =='j'||next =='k'||next =='l'||next =='m'||next =='n'||next =='o'||next =='p'||next =='q'||next =='r'||next =='s'||next =='t'||next =='u'||next =='v'||next =='w'||next =='x'||next =='y'||next =='z'||next =='A'||next =='B'||next =='C'||next =='D'||next =='E'||next =='F'||next =='G'||next =='H'||next =='I'||next =='J'||next =='K'||next =='L'||next =='M'||next =='N'||next =='O'||next =='P'||next =='Q'||next =='R'||next =='S'||next =='T'||next =='U'||next =='V'||next =='W'||next =='X'||next =='Y'||next =='Z'){
      i++; 
	  next = charArray(i); 
	  return true;
    }
    return false;
  }
}