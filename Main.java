public class Main {
    public static void main(String[] args){
        ProgrammingLanguage progLang = new Director().direct(new JavaBuilder());
        System.out.println(progLang);
    }
}
