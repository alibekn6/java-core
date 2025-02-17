package JRC;

class Application {
    Job job;
    Candidate candidate;
    String status;

    public Application(Job job, Candidate candidate) {
        this.job = job;
        this.candidate = candidate;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Application status for " + candidate.getName() + " is " + status);
    }


    public Job getJob () {return job;}
    public Candidate getCandidate () {return candidate;}
    public String getStatus () {return status;}



}
