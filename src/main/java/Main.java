public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();

        post.birthday.day = 6;
        post.birthday.month = 8;
        post.birthday.year = 1992;

        post.name = "Алексей";
        post.passport = "4014 №42659748";
        post.patronymic = "Геннадьевич";
        post.phone = "+7 999 232 32 32";
        post.surname = "Коробейников";
        post.subscription = true;

    }
}
