package t9;

public class a1 {

    public boolean isPalindrome(int x) {
        boolean flag = false;
        int a = 0;

        if (x<0 || (x % 10 == 0 && x != 0)){
            return flag;
        }
        if (x==0 ){
            flag = true;
            return flag;
        }

        int tmpx = x;
        while(tmpx!=0){
            a = a * 10  + tmpx % 10;
            tmpx /= 10;
        }
        if(a == x){
            flag = true;
        }
        return flag;
    }

//    public boolean isPalindrome(int x) {
//        boolean flag = false;
//        int a = 0;
//
//        int tmpx = x;
//        while(tmpx!=0){
//            a = a * 10  + tmpx % 10;
//            tmpx /= 10;
//        }
//        System.out.println(a);
//        if( (a == x && x > 0) || x == 0 ){
//            flag = true;
//        }
//        return flag;
//    }

    public static void main(String[] args){
        a1 a = new a1();
        System.out.println(a.isPalindrome(120));
    }

}
