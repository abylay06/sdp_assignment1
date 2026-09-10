public class Director {
    public ProgrammingLanguage direct(ProgrammingLanguageBuilder builder){
        builder.setName("Java")
        .setVersion(23)
        .setJobDemand(3)
        .setPopularity(4)
        .setStaticallyTyped(true);

        return builder.build();
    }
}