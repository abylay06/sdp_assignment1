public class JavaBuilder implements ProgrammingLanguageBuilder {
    ProgrammingLanguage progLang = new ProgrammingLanguage();

    ProgrammingLanguage setName(String name) {
        progLang.setName("Java");
    }
    ProgrammingLanguage setVersion(int version){
        progLang.setVersion(23)
    }
    ProgrammingLanguage setPopularity(int popularity) {
        progLang.setPopularity(4)
    }
    ProgrammingLanguage setStaticallyTyped(boolean staticallyTyped) {
        progLang.setStaticallyTyped(true)
    }
    ProgrammingLanguage setJobDemand(int jobDemand) {
        progLang.setJobDemand(3)
    }

    public ProgrammingLanguage build(){
        if (progLang.getName() == null 
            || progLang.setVersion() == null 
            || progLang.getPopularity() == null 
            || progLang.getJobDemand() == null
            || progLang.getStaticallyTyped() == null)
        {
            throw new IllegalStateException("Invalid state");
        }
        return progLang;
    }
}