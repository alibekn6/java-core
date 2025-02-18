package JRC;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company google = new Company("Google", "Tech");
        Company spacex = new Company("Space X", "Rocket tech");

        Job se = new Job("Software eng", "Develop software solutions", 9999, google);
        Job ae = new Job("Aerospace eng", "Develop aero solustions", 8932, spacex);

        google.postJob(se);
        spacex.postJob(ae);

        List<Job> list = google.getJob();
        for (Job a:list) {
            a.displayJobInfo();
        }

        System.out.println("jsjsjsjs");


    }
}
