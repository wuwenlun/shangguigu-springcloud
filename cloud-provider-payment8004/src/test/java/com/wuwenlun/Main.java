package com.wuwenlun;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author 吴文伦
 * @date 2020/3/24 14:39
 */
public class Main {
    class Super {
        int flag = 1;

        Super() {
            test();
        }

        void test() {
            System.out.println("Super.test() flag=" + flag);
        }
    }

    class Sub extends Super {
        Sub(int i) {
            flag = i;
            System.out.println("Sub.Sub()flag=" + flag);
        }

        void test() {
            System.out.println("Sub.test()flag=" + flag);
        }
    }

    public static void main(String[] args) throws MalformedURLException {
        char i = 8;
        byte ii = 87;
    }
}
