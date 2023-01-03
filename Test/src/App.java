import java.util.Scanner;

class App {
    public static void main(String[] args) {
        City city = new City("名古屋", 2296000, 1071228);
        System.out.print("男性の人口はどれだけ増えましたか？:");
        try (Scanner scanner = new Scanner(System.in)) {
            int i = scanner.nextInt();
            city.add_men(i);
        }

        System.out.println("================================");
        Country country = new Country("日本", 125700000, 0, 64815079);
    }
}