import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Bicycle bicycle = new Bicycle("ビアンキ","緑",0);
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();
    bicycle.run(i);
    
    System.out.println("=================");
    Car car = new Car("フェラーリ","赤",0,100);
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    Scanner car_scanner = new Scanner(System.in);
    int car_i = car_scanner.nextInt();
    car.run(car_i,car.getFuel());
  }
}