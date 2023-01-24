/*
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
For Example String str=hello =>l
 */
package class12.HomeWork_Class12;
public class Task001_Strings {
    public static void main(String[] args) {
        String name ="Joseph1";
        if(!name.isEmpty()) {
            if(!(name.length()%2==0) && name.length()>3){
                System.out.println(name.charAt((name.length()-1)/2));
                System.out.println(name.length());
            }
        }
    }
}
