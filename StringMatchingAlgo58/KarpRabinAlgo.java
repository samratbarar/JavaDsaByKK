package StringMatchingAlgo58;

public class KarpRabinAlgo {
    private final int PRIME = 101;
    private final int Q = 31;
    private final int MODULO_INVERSE = 4;

    private long modularPower(int base, int exponent) {
        long power = 1;

        for (int i = 0; i < exponent; i++) {
            power = (power * base) % Q;
        }

        return power;
    }

    private long calculateHash(String str) {
        long hash = 0;
        long power = 1;
        for (int i = 0; i < str.length(); i++) {
            hash += str.charAt(i) * power;
            power = (power * PRIME) % Q;
            hash %= Q;
        }

        return hash % Q;
    }

    private long updateHash(long prevHash, char oldChar, char newChar, int patternLength, long modularPow) {
        long newHash = (prevHash - oldChar) * MODULO_INVERSE;
        newHash = (newHash + newChar * modularPow) % Q;
        return ((newHash % Q) + Q) % Q;
    }

    public void search(String text, String pattern) {
        int patternLength = pattern.length();
        int textLength = text.length();

        if (patternLength == 0) {
            System.out.println("Pattern is empty");
            return; 
        }

        if (patternLength > textLength) {
            System.out.println("Pattern is longer than text hence it can never present in text");
            return;
        }

        long patternHash = calculateHash(pattern);
        long textHash = calculateHash(text.substring(0, patternLength));
        long modularPow = modularPower(PRIME, patternLength - 1);

        for (int i = 0; i <= textLength - patternLength; i++) {
            if (textHash == patternHash) {
                if (text.substring(i, i + patternLength).equals(pattern)) {
                    System.out.println("Pattern found at " + i);
                }
            }

            if (i < textLength - patternLength) {
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i + patternLength), patternLength, modularPow);
            }
        }
    }
    public static void main(String[] args) {
        KarpRabinAlgo algo = new KarpRabinAlgo();
        algo.search("I am Samrat Barar", "Samrat");
    }
}