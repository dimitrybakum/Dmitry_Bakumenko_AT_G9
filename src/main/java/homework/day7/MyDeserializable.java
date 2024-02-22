package homework.day7;

import homework.day5.playground.essence.craft.field.types.Car;

import java.io.*;

public class MyDeserializable implements Serializable{
  // - читает какой-нибудь обьект класса (добавить имплементацию интерфеса Serializable)
  // из пакета playground.essence из файла (например, записанный в предыдущем задании)
  // и записывает в другой текстовый файл
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    readAndRewrite();
  }

  public static void readAndRewrite() throws IOException, ClassNotFoundException {
    FileInputStream fis = new FileInputStream("MazdaCarInfo.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Car car = (Car) ois.readObject();
    ois.close();

    System.out.println(car);

    FileOutputStream fos = new FileOutputStream("anotherMazdaCarInfo.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(car);
    oos.close();
  }
}
