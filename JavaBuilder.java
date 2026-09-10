public class JavaBuilder implements ProgrammingLanguageBuilder {
    ProgrammingLanguage progLang = new ProgrammingLanguage();

    public ProgrammingLanguageBuilder setName(String name) {
        progLang.setName(name);
        return this;
    }
    public ProgrammingLanguageBuilder setVersion(float version){
        progLang.setVersion(version);
        return this;
    }
    public ProgrammingLanguageBuilder setPopularity(int popularity) {
        progLang.setPopularity(popularity);
        return this;
    }
    public ProgrammingLanguageBuilder setStaticallyTyped(Boolean staticallyTyped) {
        progLang.setStaticallyTyped(staticallyTyped);
        return this;
    }
    public ProgrammingLanguageBuilder setJobDemand(int jobDemand) {
        progLang.setJobDemand(jobDemand);
        return this;
    }

    public ProgrammingLanguage build(){
        if (progLang.getName() == null 
            || progLang.getVersion() == 0
            || progLang.getPopularity() == 0 
            || progLang.getJobDemand() == 0
            || progLang.getStaticallyTyped() == null)
        {
            throw new IllegalStateException("Invalid state");
        }
        return progLang;
    }
}