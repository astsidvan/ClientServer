public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.surname = "Иванович";
        post.name = "Иван";
        post.patronymic = "Иванов";
        post.phone = "+79629648518";
        post.passport = "4212 № 152356";
        post.subscription = "true";
        post.birthday = new FormDate();
        post.birthday.day = "13";
        post.birthday.month = "02";
        post.birthday.year = "1812";
        // заполните другие поля
    }
}