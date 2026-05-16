import java.util.*;

public class chocolaproblem {
    public static void main(String args[]) {

        int n = 4, m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4}; // m-1 vertical cuts
        Integer costHor[] = {4, 1, 2};       // n-1 horizontal cuts

        // Sort in descending order
        Arrays.sort(costVer, Comparator.reverseOrder());
        Arrays.sort(costHor, Comparator.reverseOrder());

        int h = 0, v = 0;
        int hp = 0, vp = 0;
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) {
                cost += costHor[h] * (vp + 1);
                hp++;
                h++;
            } else {
                cost += costVer[v] * (hp + 1);
                vp++;
                v++;
            }
        }

        // Remaining horizontal cuts
        while (h < costHor.length) {
            cost += costHor[h] * (vp + 1);
            hp++;
            h++;
        }

        // Remaining vertical cuts
        while (v < costVer.length) {
            cost += costVer[v] * (hp + 1);
            vp++;
            v++;
        }

        System.out.println("Minimum cost to cut the chocolate = " + cost);
    }
}
