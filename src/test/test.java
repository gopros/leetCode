package test;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

public class test {

    public void swap(int a,int b){
        int c = a;
        a = b;
        b = c;
        return;

    }

    public static void main(String[] args) {


        test t =new test();
        int a=1,b=2;
        t.swap(1,2);
        System.out.println(a+" "+b);















    }

}
