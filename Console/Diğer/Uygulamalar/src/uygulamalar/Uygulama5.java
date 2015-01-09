/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uygulamalar;

import java.util.*;

/**
 *
 * @author yasin
 */
public class Uygulama5 {

    public static boolean Uygunluk(int[] q, int n) {
        for (int i = 0; i < n; i++) {
            if (q[i] == q[n]) {
                return false;
            }
            if ((q[i] - q[n]) == (n - i)) {
                return false;
            }
            if ((q[n] - q[i]) == (n - i)) {
                return false;
            }
        }
        return true;
    }

    public static void Yazdir(int[] q) {
        int N = q.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (q[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void Say(int N) {
        int[] a = new int[N];
        Say(a, 0);
    }

    public static void Say(int[] q, int n) {
        int N = q.length;
        if (n == N) {
            Yazdir(q);
        } else {
            for (int i = 0; i < N; i++) {
                q[n] = i;
                if (Uygunluk(q, n)) {
                    Say(q, n + 1);
                }
            }
        }
    }

}
