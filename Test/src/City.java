public class City {
    private int men = 1071228;

    public City(String name, int population, int men) {
        System.out.println("【都市の情報】");
        System.out.println("名前:" + name);
        System.out.println("人口:" + String.format("%,d", population) + "人");
        System.out.println("男性の人口:" + String.format("%,d", men) + "人");
    }

    public void add_men(int add_men) {
        System.out.println("-------------------------");
        System.out.println("男性の人口が" + String.format("%,d", add_men) + "人増えました");
        men += add_men;
        System.out.println("男性の人口:" + String.format("%,d", men) + "人");
    }
}
