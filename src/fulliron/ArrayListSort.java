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
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*SORTING even to the left in ascending order
*         odd to the right in descending order
*/

public class ArrayListSort {
    public static void main(String[] args) {

//Scanning and Initialisation
        Scanner in = new Scanner(System.in);

//Sorting
        List<Integer> list = IntStream.range(0, in.nextInt())
                            .mapToObj(i -> in.nextInt())
                            .sorted((n1, n2) -> {
                                if (n1 % 2 == 0 && n2 % 2 != 0) return -1;
                                if (n1 % 2 != 0 && n2 % 2 == 0) return 1;
                                if (n1 % 2 == 0 && n2 % 2 == 0) return n1 < n2 ? n1 - n2 : 0;
                                if (n1 % 2 != 0 && n2 % 2 != 0) return n2 - n1;
                                else                            return 0;
                            })
                            .collect(Collectors.toList());
//Printing
        System.out.println(list);

    }
}


