class Job{
    int id;
    int profit;
    int deadline;
    Job(int id, int profit, int deadline){
        this.id = id;
        this.profit = profit;
        this.deadline = deadline;
    }
}
class Solution {

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n = deadline.length;
        Job[] jobs = new Job[n];
        for(int i = 0; i < n; i++){
            jobs[i] = new Job(i + 1, profit[i], deadline[i]);
        }
        // Sort by profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        boolean slots[] = new boolean[n + 1];
        int countJobs = 0;
        int maxProfit = 0;
        
        for(Job job : jobs){
            for(int j = job.deadline; j > 0; j--){
                if(!slots[j]){
                    slots[j] = true;
                    countJobs++;
                    maxProfit += job.profit;
                    break;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(countJobs);
        list.add(maxProfit);
        return list;
    }
}
