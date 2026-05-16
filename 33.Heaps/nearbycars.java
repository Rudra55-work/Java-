import java.util.*;
public class nearbycars {
    static class Car implements Comparable<Car>{
        int x;
        int y;
        int distSqr;
        int index;
        public Car(int x, int y, int distSqr, int index){
            this.x = x;
            this.y = y;
            this.distSqr = distSqr;
            this.index = index;
        }
        @Override
        public int compareTo(Car c2){
            return this.distSqr - c2.distSqr; // for min heap ascending order
        }
    }

    public static void main(String[] args) {
        int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        PriorityQueue<Car> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int x = pts[i][0];
            int y = pts[i][1];
            int distSqr = x*x + y*y;

            pq.add(new Car(x, y, distSqr, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("C"+pq.remove().index);
        }
    }
}
