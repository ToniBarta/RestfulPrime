package com.rest.prime;

import com.rest.prime.domain.PrimeResponse;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbersCommand {

    private final int untilNumber;

    public PrimeNumbersCommand(int untilNumber){
        this.untilNumber = untilNumber;
    }

    public PrimeResponse execute(){
        List<Integer> primeNumbers = primeNumbersTill(untilNumber);
        return new PrimeResponse(Integer.toString(untilNumber), primeNumbers);
    }

    private List<Integer> primeNumbersTill(int n) {
        return IntStream.rangeClosed(2, n)
                .filter(PrimeNumbersCommand::isPrime).boxed()
                .collect(Collectors.toList());
    }

    protected static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number/2)
                .noneMatch(index -> number % index == 0);
    }
}
