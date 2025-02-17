package JRC;

import java.util.ArrayList;
import java.util.List;

class Candidate {
    private final String name;
    private final String email;
    private List<Job> appliedJob;

    public Candidate(String name, String email) {
        this.name = name;
        this.email = email;
        this.appliedJob = new ArrayList<>();
    }

    // method to apply for a job
    public void applyForJob(Job job) {
        appliedJob.add(job);
        System.out.println(name + " is applied for " + job.getTitle() + " at " + job.getCompany());
    }

    public String getName() {return name;}

    public String getEmail() {return email;}

    public List<Job> getAppliedJobs() {
        return appliedJob;
    }
}
