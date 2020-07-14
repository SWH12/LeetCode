package t28;

public class a1 {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0 ) return 0;
        int ind = haystack.indexOf(needle);
        return ind;
    }

    public static void main(String[] args) {
        a1 a = new a1();
        String str1 = "haaaa";
        String str2 = "ll";
        System.out.println(a.strStr(str1,str2));
    }
}
