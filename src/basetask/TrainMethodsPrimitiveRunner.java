package basetask;

public class TrainMethodsPrimitiveRunner {
  public static void main(String[] args) {
    TrainMethodsPrimitive trainMethodsPrimitive = new TrainMethodsPrimitive();
    trainMethodsPrimitive.printLong((long) 777657845L);
    trainMethodsPrimitive.printInt(777);
    trainMethodsPrimitive.printChar(trainMethodsPrimitive.c1);
    trainMethodsPrimitive.printFloat(0.05f);
    trainMethodsPrimitive.printDouble(32.46784568585888);
    trainMethodsPrimitive.printShort((short) 6);
    trainMethodsPrimitive.printByte((byte) 4);
    trainMethodsPrimitive.printBoolean(true);
  }
}
