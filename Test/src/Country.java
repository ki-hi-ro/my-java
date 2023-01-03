public class Country {
    private int men = 1071228;
    private int women = 64815079;

    public Country(String name, int population, int men, int women) {
        System.out.println("【国の情報】");
        System.out.println("名前:" + name);
        System.out.println("人口:" + String.format("%,d", population) + "人");
        System.out.println("男性の人口:" + String.format("%,d", men) + "人");
        System.out.println("女性の人口:" + String.format("%,d", women) + "人");
    }

    public void add_men(int add_men) {
        System.out.println("-------------------------");
        System.out.println("男性の人口が" + String.format("%,d", add_men) + "人増えました");
        men += add_men;
        System.out.println("男性の人口:" + String.format("%,d", men) + "人");
    }
}
