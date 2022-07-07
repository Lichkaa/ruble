public class Main {
    public static void main(String[] args) {
        int score = 250;
        int deposits = 1200;
        int ruble;
        int finalScore;
        if (deposits > 1000) {
            ruble = deposits / 100;
        } else {
            ruble = 0;
        }
        finalScore = score + deposits + ruble;
        System.out.println(" Сумма баланаса: " + finalScore);
    }
}
