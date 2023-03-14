package HackerRank;

import java.util.*;
import java.util.stream.Collectors;

public class JavaSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> names = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int numberID = sc.nextInt();
            sc.next();
            String name = sc.nextLine();
            double score = sc.nextDouble();

            names.add(new Student(numberID,name,score));
        }

        List<Student> orderStudent = names.stream().sorted(Comparator.comparing(Student::getScore).reversed()).toList();
        orderStudent.forEach(System.out::println);

    }

    public static class Student{

        private Integer id;
        private String name;
        private Double score;

        public Student(Integer id, String name, Double score) {
            this.id = id;
            this.name = name;
            this.score = score;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getScore() {
            return score;
        }

        public void setScore(Double score) {
            this.score = score;
        }
        @Override
        public String toString() {
            return name;
        }
    }
}
