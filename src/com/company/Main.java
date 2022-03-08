package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
	/*
	Эки setтин симметриялык айырмасын эсептеген symmetricDifference методун ишке ашырыныз.
	Метод натыйжаны жаңы set катары кайтарышы керек. Методко параметр катары берилген setтерди
	өзгөртүүгө жол берилбейт.

    Мисалы: [1, 2, 3} жана {0, 1, 2]
    Жооп: [0, 3]

    public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2) методу болушу керек
	 */

        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        System.out.println(hashSet1);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(0);
        hashSet2.add(1);
        hashSet2.add(2);
        System.out.println(hashSet2);

        System.out.println(symmetricDifference(hashSet1,hashSet2));


    }

    public static LinkedHashSet<Integer> symmetricDifference (HashSet<Integer> set1, HashSet<Integer> set2){
        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        LinkedHashSet<Integer> temporary = new LinkedHashSet<>();
        temporary.addAll(set1);
        temporary.retainAll(set2);
        result.removeAll(temporary);
        return result;
    }
}
