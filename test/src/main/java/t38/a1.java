package t38;

public class a1 {

    public String countAndSay(int n) {
        if (n == 1) return "1";
        String f = "1";
        String tmp = "";

        for (int i=0;i<n-1;i++){
            int tmpnum = 0;
            int count =0;
            for (int j=0;j<f.length();j++){
                if( f.substring(j,j+1).equals(f.substring(tmpnum,tmpnum+1) ) ){
                    count++;
                }else{
                    tmp = tmp + count + f.substring(tmpnum,tmpnum+1);
                    count = 1;
                    tmpnum = j;
                }

            }
            tmp = tmp + count + f.substring(f.length()-1);
            f = tmp;
            tmp = "";
        }
        return f;
    }

    public static void main(String[] args) {
        a1 a = new a1();
        System.out.println(a.countAndSay(6));
    }
}
