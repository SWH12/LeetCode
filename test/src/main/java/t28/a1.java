package t28;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.lang.reflect.Method;

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
        Test123 test = new Test123();

        Class testId = test.getClass();
        System.out.println(testId.getName());
        System.out.println(testId.getPackage());
        Method[] methods =  testId.getMethods();
        for (int i=0; i<methods.length; i++) {
            System.out.println(methods[i].getName());
        }
    }
}

class Test123 {
    public void pf() {
        System.out.println("print out test class!");
    }

    public void t1() {}
}
