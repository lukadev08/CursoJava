package Generics;

import java.util.TreeSet;

public class Comparable {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        //organiza os valores do menor para o maior, utiliza o metodo comparable como forma de comparar os objetos

        nums.add(10);
        nums.add(1);
        nums.add(3);
        nums.add(6);
        nums.add(8);
        nums.add(9);
        nums.add(123);
        nums.add(-13);

        for(Integer n: nums){
            System.out.println(n);
        }
    }
}
