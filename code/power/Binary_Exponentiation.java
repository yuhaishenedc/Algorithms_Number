package power;

public class Binary_Exponentiation {

    //快速幂算法
    public static int pow(int a,int b){
        int ret=1;
        int base=a;
        while(b>0){
            if((b&1)!=0){
                ret*=base;
            }
            base*=base;
            b>>=1;
        }
        return ret;
    }

    //快速幂求余
    public static int pow_mod(int a,int b,int c){
        int ret=1;
        int base=a%c;
        while(b>0){
            if((b&1)!=0){
                ret=ret*base%c;
            }
            base=base*base%c;
            b>>=1;
        }
        return ret;
    }

    //需要用到的知识是如下两个：
    //(a + b) % m = (a % m+b % m) % m;
    //a * b % m = ((a % m)*(b % m)) % m;

}
