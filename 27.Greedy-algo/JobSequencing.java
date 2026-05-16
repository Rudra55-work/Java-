import java.util.*;

public class JobSequencing {

    static class Job {
        int id;
        int deadline;
        int profit;

        // Constructor
        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String args[]) {

        int jobsInfo[][] = {
            {4, 20},
            {1, 10},
            {1, 40},
            {1, 30}
        };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i + 1, jobsInfo[i][0], jobsInfo[i][1]));
        }

        // Sort jobs in descending order of profit
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;

        for (int i = 0; i < jobs.size(); i++) {
            Job currJob = jobs.get(i);
            if (time < currJob.deadline) {
                seq.add(currJob.id);
                time++;
            }
        }

        System.out.println("Number of jobs done = " + seq.size());
        System.out.print("Job Sequence: ");
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
    }
}
