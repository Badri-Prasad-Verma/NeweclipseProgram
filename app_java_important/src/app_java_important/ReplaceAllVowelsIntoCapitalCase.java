package app_java_important;

public class ReplaceAllVowelsIntoCapitalCase {
    public static void main(String[] args) {
     String string = "intelcore";
  
  String str = replaceAllVowelsIntoCapitalCase(string);
  System.out.println("original string : "+string);
  System.out.println("toUpperCase string : "+str);
  
  }
  
  private static String replaceAllVowelsIntoCapitalCase(String string){
    
    StringBuilder result=new StringBuilder();
    for(char ch : string.toCharArray()){
      if("aeiou".indexOf(ch)!=-1){
        result.append(Character.toUpperCase(ch));
      }else{
        result.append(ch);
      }
    }
    
    return result.toString();
  }
}