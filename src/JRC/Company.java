package JRC;

import java.util.List;
import java.util.ArrayList;


class Company {

    private final String name;
    private final String industry;
    private final List<Job> jobPosted;


    public Company(String name, String industry) {
        this.name = name;
        this.industry = industry;
        this.jobPosted = new ArrayList<>();
    }

    public void postJob(Job job) {
        jobPosted.add(job);
        System.out.println(name + " posted a new job: " + job.getTitle());
    }

    public String getName() {return name;}
    public String getIndustry() {return industry;}
    public List<Job> getJob() {return jobPosted;}

}
