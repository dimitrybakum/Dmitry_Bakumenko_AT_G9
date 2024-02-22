package homework.day7;

import homework.day5.playground.essence.craft.field.types.Car;

import java.io.*;

public class MySerializable implements Serializable {
  // - создает какой-нибудь обьект класса (добавить имплементацию интерфеса Serializable)
  // из пакета playground.essence и записывает его в файл


  public static void main(String[] args) throws IOException {
    write();
  }

  public static void write() throws IOException {
    FileOutputStream fos = new FileOutputStream("MazdaCarInfo.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(new Car(1370, "Mazda"));
    oos.close();
  }
}