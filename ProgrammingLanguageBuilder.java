class ProgrammingLanguageBuilder() {
    ProgrammingLanguage setName(String name);
    ProgrammingLanguage setVersion(int version);
    ProgrammingLanguage setPopularity(int popularity);
    ProgrammingLanguage setStaticallyTyped(boolean staticallyTyped);
    ProgrammingLanguage setJobDemand(int jobDemand);

    public ProgrammingLanguage build();
}