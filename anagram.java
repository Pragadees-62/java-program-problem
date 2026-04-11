import java.util.*;
public class anagram {
    public boolean isAnagram(String s1, String t1) {
        if (s1.length() != t1.length()) {
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = t1.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String t1 = scanner.nextLine();
        anagram obj = new anagram();
        boolean result = obj.isAnagram(s1, t1);
        System.out.println(result);
    }
}
