package JRC;

class Job {
    private String title;
    private String description;
    private int salary;
    private Company company;

    public Job (String title, String description, int salary, Company company) {
        this.title = title;
        this.description = description;
        this.salary = salary;
        this.company = company;
    }

    public void displayJobInfo () {
        System.out.println("Job Title: " + title);
        System.out.println("Company: " + company.getName());
        System.out.println("Description: " + description);
        System.out.println("Salary: $" + salary);
        System.out.println("-------------------------------");
    }

    public String getTitle() {
        return title;
    }

    public Company getCompany() {
        return company;
    }
}
