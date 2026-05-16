import java.util.*;

public class WeakestSoldier {

    static class Row implements Comparable<Row> {
        int soldiers;
        int index;

        Row(int soldiers, int index) {
            this.soldiers = soldiers;
            this.index = index;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.soldiers == r2.soldiers) {
                return this.index - r2.index; // smaller index first
            }else {
            return this.soldiers - r2.soldiers; // fewer soldiers first
        }
    }
    }

    public static void kWeakest(int mat[][], int k) {
        PriorityQueue<Row> pq = new PriorityQueue<>();

        for (int i = 0; i < mat.length; i++) {
            int count = 0;

            for (int j = 0; j < mat[0].length; j++) {
                count += mat[i][j];
            }

            pq.add(new Row(count, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("RO " + pq.poll().index);
        }
    }

    public static void main(String args[]) {

        int mat[][] = {
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,1,0,0},
        
        };

        int k = 2;

        kWeakest(mat, k);
    }
}
