import java.util.*;
public class Main{
public static void main(String[] args) {
    String a="abcdefgh";
    String b="xyzpq";
    String s="";
    int k=a.length();
    int k2=b.length();
    int min=Math.min(k,k2);
    for(int i=0;i<min;i++){
        s+=a.charAt(i);
        s+=b.charAt(i);
    }
    if(a.length()>b.length()){
        int max=a.length()-min;
        for(int i=max+1;i<a.length();i++){
            s+=a.charAt(i);
        }

    }
    if(b.length()>a.length()){
        int max=b.length()-min;
        for(int i=max+1;i<b.length();i++){
            s+=b.charAt(i);

        }
    }
    // int p=Math.max(a.length(),b.length());
    // int q=p-min;
    // for(int i=p;i<q;i++){
    //     s+=
    // }
    System.out.println(s);
}
}