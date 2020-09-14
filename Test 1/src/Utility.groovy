/**
 * Created by Sabab on 5/6/2016.
 */
class Utility {

    public def calculateEven(int lowerLimit, int upperLimit)
    {
        def list =  []

        for(int i = lowerLimit; i <= upperLimit; i++)
        {
            if(i % 2 == 0)
                list.add(i)
        }

        return list
    }

    public def calculateOdd(int lowerLimit, int upperLimit)
    {
        def list =  []

        for(int i = lowerLimit; i <= upperLimit; i++)
        {
            if(i % 2 != 0)
                list.add(i)
        }

        return list
    }

    public def calculatePrime(int lowerLimit, int upperLimit)
    {
        def list = []

       /* for(int i = lowerLimit; i <= upperLimit; i++)
        {
            int flag = 0
            for(int j = 2; j <= (int)Math.sqrt((double)i); j++)
            {
                if(i % j == 0)
                {
                    flag = 0
                    break
                }
                else
                {
                    flag = 1
                }
            }
            if(flag == 1)
            {
                list.add(i)
            }
        } */

        // Sieve of Eratosthenes solution in Groovy
        def t = lowerLimit..upperLimit
        (2..Math.sqrt(t.last())).each { n -> t -= ((2*n)..(t.last())).step(n) }

        return t
    }
}
