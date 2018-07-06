import java.util.ArrayList;
import java.util.List;

class Sieve {

    private ArrayList<Integer> primeList;

    Sieve(int maxPrime) {

        primeList = makeList(maxPrime);
    }

    List<Integer> getPrimes() {

        if (!primeList.isEmpty()) {

            int startingValue = primeList.get(0);
            int maxValue = primeList.get(primeList.size() - 1);

            for (int i = 0; primeList.get(i) < Math.sqrt(maxValue); i++) {

                int value = primeList.get(i);

                for (int j = i + 1; j < primeList.size(); j++) {

                    int aValue = primeList.get(j);

                    if (aValue != value) {

                        if (aValue % value == 0) {
                            primeList.remove(j);
                        }
                    }
                }
            }
        }
        return primeList;
    }

    protected ArrayList<Integer> makeList(int maxSize) {

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 2; i <= maxSize; i++) {

            answer.add(i);
        }
        return answer;
    }
}