import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker{
    public static boolean isAnagram(String str1,String str2){
        if(str1.length() != str2.length()){
            return  false;
        }
        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First String");
        String str1 = scanner.nextLine();

        System.out.println("Enter Second String");
        String str2 = scanner.nextLine();

        if(isAnagram(str1, str2)){
            System.out.println("Output:true");
        }
        else{
            System.out.println("Output:false");
        }

    }
}
