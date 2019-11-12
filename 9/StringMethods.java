class StringMethods
{
    public static void main(String args[]) {
        String s="Hello world";
        String a=new String(" you are awesome");
        //String a2=new String();
        System.out.println(s.toLowerCase());                  //convert the string in lowercase
        System.out.println(s.toUpperCase());                  //convert the string in uppercase
        System.out.println(s.charAt(2));                      //return charvalue at particular index 
        System.out.println(s.concat(a));                      //Concat to strings i.e s+a
        System.out.println(s.compareTo(a));                   //Compares two strings lexicographically.
        System.out.println(s.length());                       //return length of string
        System.out.println(s.contains("ello"));               //it will return of the parameter is there in the string
        System.out.println(s.isBlank());                      //Returns true if the string is empty or contains only white space codepoints, otherwise false.
        System.out.println(s.isEmpty());                      //Returns true if, and only if, length() is 0.
        System.out.println(s.hashCode());                     //Returns a hash code for this string.
    }
}