public class ProgrammingLanguage {
    private String name;
    private float version;
    private int popularity;
    private Boolean staticallyTyped;
    private int jobDemand;

    public String getName() {return name;}
    public float getVersion() {return version;}
    public int getPopularity() {return popularity;}
    public Boolean getStaticallyTyped() {return staticallyTyped;}
    public int getJobDemand() {return jobDemand;}

    public void setName(String name) {this.name = name;}
    public void setVersion(float version) {this.version = version;}
    public void setPopularity(int popularity) {this.popularity = popularity;}
    public void setStaticallyTyped(Boolean staticallyTyped) {this.staticallyTyped = staticallyTyped;}
    public void setJobDemand(int jobDemand) {this.jobDemand = jobDemand;}

    @Override 
    public String toString() {
        return (
            "Name: " + name + ", Version: " + version + ", Popularity: "
            + popularity + ", Statically typed: " + staticallyTyped +
            ", Job demand: " + jobDemand
        );
    }
}