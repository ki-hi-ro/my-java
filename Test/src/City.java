class Car {
    private String name;
    private String color;
    private int distance = 0;
    private int fuel = 100;
    
    public Car(String name, String color, int distance, int fuel) {
      printData(name, color, distance, fuel);
    }
    
    public static void printData(String name, String color, int distance, int fuel) {
      System.out.println("【車の情報】");
      System.out.println("名前：" + name);
      System.out.println("色：" + color);
      System.out.println("走行距離：" + distance + "km");
      System.out.println("ガソリン量：" + fuel + "L");
    }
    
    public void run(int run_distance, int run_fuel) {
      System.out.println(run_distance + "km走ります");
      if(run_distance <= fuel) {
        distance += run_distance;
        fuel -= run_distance;
      } else {
        System.out.println("ガソリンが足りません");
      }
      System.out.println("走行距離：" + distance + "km");
      System.out.println("ガソリン量：" + fuel + "L");
    }
    
    public int getFuel() {
      return this.fuel;
    }
  }