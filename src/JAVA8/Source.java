package JAVA8;

@FunctionalInterface
interface StringSpace {
    String addSpace(String s);
}

public class Source {
    String insertSpace(String s) {
        StringSpace sp = (s1) -> {
            return s1.replace("", "").trim();
        };
        return sp.addSpace(s);
    }
    public static void main(String[] args) {
        Source se = new Source();
        System.out.println(se.insertSpace("HelloWorld"));

        StringSpace spaceAdder = (s) -> s.replace("", "").trim();
        System.out.println(spaceAdder.addSpace("capgemini"));
    }
}