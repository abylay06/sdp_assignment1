

public class Director {
    private static final int JAVA_JOB_DEMAND = 3;
    private static final int JAVA_POPULARITY = 4;
    private static final float JAVA_VERSION = 23;

    public ProgrammingLanguage direct(ProgrammingLanguageBuilder builder){
        builder.setName("Java")
        .setVersion(JAVA_VERSION)
        .setJobDemand(JAVA_JOB_DEMAND)
        .setPopularity(JAVA_POPULARITY)
        .setStaticallyTyped(true);

        return builder.build();
    }
}