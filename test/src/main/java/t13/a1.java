package t13;

import java.util.HashMap;
import java.util.Map;

public class a1 {

    public int romanToInt(String s) {
        int num = 0;

        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        for (int i=0;i<s.length();i++){
            if( s.length() >1 && i<(s.length()-2) && ( map.get(s.substring(i)) < map.get(s.substring(i+1)) ) ){
                num += map.get(s.substring(i,i+2));
                System.out.println(map.get(s.substring(i,i+2)));
                i++;
            }else{
                num += map.get(s.substring(i,i+1));
                System.out.println(map.get(s.substring(i,i+1)));
            }
        }

        return num;
    }

    public static void main(String[] args){
        t13.a1 a = new t13.a1();
        System.out.print(a.romanToInt("MCMXCIV"));
        //System.out.print(a.romanToInt("V"));
    }

}
