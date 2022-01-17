package javaTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPrime {

	public static void main(String[] args) {
        List<Integer> numToCheck = Arrays.asList(5,7,66,88,71,99);
        
        
        List<Integer> primeNo = numToCheck.stream().filter(x -> {
            if (x <= 1) {
                return false;
            }else {
                for (int i = 2; i < Math.sqrt(x); i++) {
                    if (x % i == 0) {
                        return false;
                    }
                }

            }
            return true;

        }).collect(Collectors.toList());
        System.out.println(primeNo);
    }
}
