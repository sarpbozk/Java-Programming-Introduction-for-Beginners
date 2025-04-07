package Fundamentals;

public class NumberDemo {
    public static void main(String[] args) {

        double firstGrade = 88.7;
        double secondGrade = 61.135;
        double thirdGrade = 78.624354;

        double avgGrade = (firstGrade + secondGrade + thirdGrade) / 3;

        String formattedAvgGrade = String.format("%.2f", avgGrade);

        System.out.println(formattedAvgGrade);
    }
}
