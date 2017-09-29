package com.khiemnd5.comparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by khiemnd5 on 9/29/17.
 */
public class SortingWithLambda {

    public static void main(String[] args) {
        List<Developer> listDevs = getDevelopers();

        System.out.println("Before sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        System.out.println("After sort");

        //lambda here
//        listDevs.sort((Developer o1, Developer o2)->o1.getAge() - o2.getAge());

        // lambda also
        listDevs.sort((o1, o2)->o1.getSalary().compareTo(o2.getSalary()));

        //java 8 only, lambda alse, to print the list
        listDevs.forEach((developer) -> System.out.println(developer) );

        System.out.println("Reversed");
        Comparator<Developer> salaryComparator = (o1, o2)->o1.getSalary().compareTo(o2.getSalary());
        listDevs.sort(salaryComparator.reversed());

        listDevs.forEach((developer) -> System.out.println(developer) );

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
