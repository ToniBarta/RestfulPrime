package com.rest.prime;

import com.rest.prime.domain.PrimeResponse;
import org.junit.Assert;
import org.junit.Test;

public class PrimeNumbersCommandTest {

    @Test
    public void checkIfNumberIsPrime(){
        Assert.assertTrue(PrimeNumbersCommand.isPrime(2));
        Assert.assertTrue(PrimeNumbersCommand.isPrime(3));
        Assert.assertTrue(PrimeNumbersCommand.isPrime(7));

        Assert.assertFalse(PrimeNumbersCommand.isPrime(20));
    }

    @Test
    public void checkIfAllNumbersAlPrimeUntil(){
        PrimeNumbersCommand primeNumbersCommand = new PrimeNumbersCommand(15);
        PrimeResponse primeResponse = primeNumbersCommand.execute();

        Assert.assertEquals(primeResponse.getInitial(), "15");
        Assert.assertEquals(primeResponse.getPrimes().size(), 6);
        Assert.assertEquals(primeResponse.getPrimes().get(0).intValue(), 2);
        Assert.assertEquals(primeResponse.getPrimes().get(1).intValue() , 3);
        Assert.assertEquals(primeResponse.getPrimes().get(2).intValue(), 5);
        Assert.assertEquals(primeResponse.getPrimes().get(3).intValue(), 7);
        Assert.assertEquals(primeResponse.getPrimes().get(4).intValue(), 11);
        Assert.assertEquals(primeResponse.getPrimes().get(5).intValue(), 13);
    }

}
