import java.util.Scanner;

public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("please enter the " + (i + 1) + " scores");
            scores[i] = scanner.nextInt();
        }
        int sum = calcSum(scores);
        double average = calcAverage(scores);
        System.out.println("the total score:" + sum + ",the average score:" + average);
        int max = findMax(scores);
        int min = findMin(scores);
        System.out.println("the max score:" + max + ",the min score:" + min);
        int passCount = countPass(scores);
        System.out.println("the number of passers is:" + passCount);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int s : arr) {
            if (s > max) {
                max = s;
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int s : arr) {
            if (s < min) {
                min = s;
            }
        }
        return min;
    }

    public static int countPass(int[] arr) {
        int count = 0;
        for (int s : arr) {
            if (s >= 60) {
                count++;
            }
        }
        return count;
    }

    public static int calcSum(int[] arr) {
        int sum = 0;
        for (int s : arr) {
            sum += s;
        }
        return sum;
    }

    public static double calcAverage(int[] arr) {
        return (double) calcSum(arr) / arr.length;
    }
}
