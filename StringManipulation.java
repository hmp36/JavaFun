StringManipulator manipulator = new StringManipulator();
String str = manipulator.trimAndConcat("    Hello     ","     World    ");
System.out.println(str); // HelloWorld 

public String TrimAndConcat(string A, string B) 
{
        string3 = A.concat(B)     

Return string3
}

Integer getIndexOrNull(String, char){
if (string.indexOf(char) = -1){
    return null
}else{
Return string.indexOf(char) 

}

StringManipulator manipulator = new StringManipulator();
char letter = 'o';
Integer a = manipulator.getIndexOrNull("Coding", letter);
Integer b = manipulator.getIndexOrNull("Hello World", letter);
Integer c = manipulator.getIndexOrNull("Hi", letter);
System.out.println(a); // 1
System.out.println(b); // 4
System.out.println(c); // null





Integer getIndexOrNull(String, String)
if (string.indexOf(string) = -1){
    return null
}else{
Return string.indexOf(string) 

}

StringManipulator manipulator = new StringManipulator();
String word = "Hello";
String subString = "llo";
String notSubString = "world";
Integer a = manipulator.getIndexOrNull(word, subString);
Integer b = manipulator.getIndexOrNull(word, notSubString);
System.out.println(a); // 2
System.out.println(b); // null





String concatSubstring(String, int, int, String){

       System.out.println(str.substring(1, 2));
}

StringManipulator manipulator = new StringManipulator();
String word = manipulator.concatSubstring("Hello", 1, 2, "world");
System.out.println(word); // eworld




