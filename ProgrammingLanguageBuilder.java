public interface ProgrammingLanguageBuilder  {
    ProgrammingLanguageBuilder setName(String name);
    ProgrammingLanguageBuilder setVersion(float version);
    ProgrammingLanguageBuilder setPopularity(int popularity);
    ProgrammingLanguageBuilder setStaticallyTyped(Boolean staticallyTyped);
    ProgrammingLanguageBuilder setJobDemand(int jobDemand);

    ProgrammingLanguage build();
}