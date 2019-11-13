class String_Buffer
{
    public static void main(String args[]) {
        StringBuffer s=new StringBuffer("Hello ");
        int length = s.length();           // Returns the length of the character sequence
        System.out.println(length);            
        int capacity=s.capacity();         //Returns the length of this character sequence
        System.out.println(capacity);
        s.append("there ");                 //Appends the specified string to the character sequence
        System.out.println(s);
        s.insert(0, "Void ");              //inserts the string into the character sequence.
        System.out.println(s);
        s.deleteCharAt(3);                 //Removes the char at the specified position in the sequence
        System.out.println(s);
        s.reverse();                       //reverse the string.
        System.out.println(s);
    }
}