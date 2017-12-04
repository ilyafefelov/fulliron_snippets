/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package fulliron;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListSort {
    public static void main(String[] args) {

//Scanning and Initialisation
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {list.add(in.nextInt());}
//------------

//Sorting
        Collections.sort(list, (n1, n2) -> {
            if(n1 % 2 == 0 && n2 % 2 != 0) {return -1;}
            if(n1 % 2 != 0 && n2 % 2 == 0) {return 1;}
            if(n1 % 2 == 0 && n2 % 2 == 0) {
                if(n1<n2){ return n1-n2;}
                else{ return 0;}
            }
            if(n1%2!=0 && n2%2!=0){return n2-n1;}
            else {return 0;}
        });
//-----------------

//Printing
        System.out.println(list);
    }
}


