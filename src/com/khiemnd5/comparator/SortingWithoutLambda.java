package com.khiemnd5.comparator;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by khiemnd5 on 9/29/17.
 */
public class SortingWithoutLambda {


    public static void main(String[] args) {

        List<Developer> listDevs = getDevelopers();

        System.out.println("Before sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        // sort by age
//        Collections.sort(listDevs, new Comparator<Developer>() {
//            @Override
//            public int compare(Developer o1, Developer o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        //sort by name
//        Collections.sort(listDevs, new Comparator<Developer>() {
//            @Override
//            public int compare(Developer o1, Developer o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        //Sort by salary
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });

        System.out.println("After sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

    }

    private static List<Developer> getDevelopers() {
        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("Ghin", new BigDecimal("7000"), 35));
        result.add(new Developer("Kieu", new BigDecimal("8000"), 32));
        result.add(new Developer("Du", new BigDecimal("10000"), 30));
        result.add(new Developer("Hien", new BigDecimal("1000"), 27));
        result.add(new Developer("Khiem", new BigDecimal("21000"), 24));

        return result;
    }
}
