import java.util.*;

public class pqforobjects {

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank; // Ascending order
        }
    }

    public static void main(String args[]) {

        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 2));
        pq.add(new Student("B", 1));
        pq.add(new Student("C", 3));
        pq.add(new Student("D", 4));

        while (!pq.isEmpty()) {
            Student s = pq.peek();
            System.out.println(s.name + " with rank " + s.rank);
            pq.remove();
        }
    }
}
