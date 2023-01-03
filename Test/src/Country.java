class Bicycle  {
    private String name;
    private String color;
    private int distance = 0;
    
    public Bicycle(String name, String color, int distance) {
      printData(name, color, distance);
    }
    
    public static void printData(String name, String color, int distance) {
      System.out.println("【自転車の情報】");
      System.out.println("名前：" + name);
      System.out.println("色：" + color);
      System.out.println("走行距離：" + distance + "km");
    }
    
    public void run(int run_distance) {
      System.out.println(run_distance + "km走ります");
      distance += run_distance;
      System.out.println("走行距離:" + distance + "km");
    }
  }