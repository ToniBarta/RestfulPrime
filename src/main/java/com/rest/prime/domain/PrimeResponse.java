package com.rest.prime.domain;

import java.util.List;

public class PrimeResponse {

    private String initial;
    private List<Integer> primes;

    public PrimeResponse(String initial, List<Integer> primes){
        this.initial = initial;
        this.primes = primes;
    }

    public String getInitial() {
        return initial;
    }

    public List<Integer> getPrimes() {
        return primes;
    }
}
