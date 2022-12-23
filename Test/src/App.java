class App {
    public static void main(String[] args) {
        Pref aichiPref = new Pref("愛知県");
        aichiPref.Hello();

        Pref gihuPref = new Pref("岐阜県");
        gihuPref.Hello();

        Pref miePref = new Pref("三重県");
        miePref.Hello();
    }
}