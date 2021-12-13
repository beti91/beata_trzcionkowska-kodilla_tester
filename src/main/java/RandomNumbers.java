import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {

    }
    public int WyslosujLiczbe() {
        Random random = new Random();
        int b;
        int c;
        int liczba = 0;
        int sum = 0;
        while (sum < 5000) {
            int a = random.nextInt(30);
            sum = sum + a;
            liczba++;
        }
        return liczba;

        }
    }









