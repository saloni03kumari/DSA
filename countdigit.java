import java.util.*;
public class countdigit {
    public static void main(String[] args) {
        // int n=15699999;
        // int count=0;
        // while(n>0){
        //     //int l=n%10;
        //     count++;
        //     n=n/10;
        // }    
        // System.out.println(count);
        //pallindrome
        // int n=120;
        // int l=n;
        // int rev=0;
        // while(l>0){
        //     int d=l%10;
        //      rev=rev*10+d;
        //     l=l/10;

        // }
        // if(rev==n){
        //     System.out.println("True");
        // }else{
        //     System.out.println("False");
        // }
        //armstrong number
//         int n=947;
//         int l=n;
//         int count=Countdigit(l);
//         int sum=0;
//         while(l>0){
//             int r=l%10;
//             sum+=Math.pow(r,count);
//             l=l/10;
//         }
//         if(sum==n){
//             System.out.println("true");
//         }else{
//             System.out.println("false");
//         }
            

    
//     }
//     public static int Countdigit(int n){
//             int count=0;

//             while(n>0){
//                 count++;
//                 n=n/10;
//             }
//             return count;
//         }
// }
//divisions
// ArrayList<Integer>ls=new ArrayList<>();
// int n=36;
// for(int i=1;i<Math.sqrt(n);i++){
//     if(n%i==0){
//         ls.add(i);
    
//     if((n/i)!=i){
//         ls.add(n/i);
//     }
// }

// }
// Collections.sort(ls);
// for(int i=0;i<ls.size();i++){
//     System.out.println(ls.get(i));
// }

//     }
// }
//simply gcd
int n1=20;
int n2=15;
int gcd=-1;
for(int i=1;i<Math.min(n1,n2);i++){
    if(n1%i==0&&n2%i==0){
        gcd=i;
    }
}
System.out.println(gcd);
    }
}
//gcd using euclidean 
// int a=20;
// int b=40;
// while(a>0&&b>0){
//     if(a>b){
//         a=a%b;
//     }else{
//         b=b%a;
//     }
// }
// if(a==0){
//     System.out.println(b);
// }else{
//     System.out.println(a);
// }
//     }
// }


