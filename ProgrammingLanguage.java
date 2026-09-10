public class ProgrammingLanguage {
    private String name;
    private int version;
    private int popularity;
    private boolean staticallyTyped;
    private int jobDemand;

    public String getName() {return name;}
    public int getVersion() {return version;}
    public int getPopularity() {return popularity;}
    public boolean getStaticallyTyped() {return staticallyTyped;}
    private int getJobDemand() {return jobDemand;}

    public void setName(String name) {this.name = name;}
    public void setVersion(int version) {this.version = version}
    public void setPopularity(int popularity) {this.popularity = popularity}
    public void setStaticallyTyped(boolean staticallyTyped) {this.staticallyTyped = staticallyTyped}
    public void setJobDemand(int jobDemand) {this.jobDemand = jobDemand}

    @Override 
    public String toString() {
        return (
            "Name: " name + ", Version: " + version + ", Popularity: "
            + popularity + ", Statically typed: " + staticallyTyped +
            ", Job demand: " + jobDemand
        );
    }
}