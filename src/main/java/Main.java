public class Main {
    public static void main(String[] args) {
        FormDate birthday = new FormDate();
        Post post = new Post();

        birthday.day = 6;
        birthday.month = 8;
        birthday.year = 1992;
        post.name = "Алексей";
        post.passport = "4014 №42659748";
        post.patronymic = "Геннадьевич";
        post.phone = "+7 999 232 32 32";
        post.surname = "Коробейников";
        post.subscription = "true";

        System.out.println(birthday.day);

    }
}
