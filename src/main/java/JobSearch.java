public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancies("1 vacancies");
        jobSite.addVacancies("2 vacancies");
        jobSite.addVacancies("3 vacancies");

        Observer firstSubscriner = new Subscriber("First");
        Observer secondSubscriner = new Subscriber("Second");

        jobSite.addObserver(firstSubscriner);
        jobSite.addObserver(secondSubscriner);

        jobSite.addVacancies("4 vacancies");
        jobSite.removeVacancies("1 vacancies");
    }
}
