package io.baraka._12_classes.inheritance;

public class Main {
    public static void main(String[] args) {
        Student sam = new Student("samson", "sam@gmail.com", "123Asd",
                "IST005", "Android Development", 4.0, 40000);

        System.out.println(sam.getGpa());
        System.out.println(sam);

        Trainer baraka  = new Trainer("baraka", "baraka@gmail.com",
                "1234456", "IST9021",
                new String[]{"Android", "Web Development", "ICDL", "Redhat"});
        System.out.println(baraka.getCourses());
    }
}
