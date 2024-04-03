public class AddNumbers {
    public <T extends Number> T  addnumbers(T num1, T num2){
      if (num1==null || num2==null){
          throw new IllegalArgumentException("Input cannot be null");

      }
      if (num1 instanceof Integer){
          return (T) Integer.valueOf(num1.intValue()+ num2.intValue());
      }
      else if (num1 instanceof Double){
            return (T) Double.valueOf(num1.doubleValue()+ num2.shortValue());
    }
      else if (num1 instanceof Short){
            return (T) Float.valueOf(num1.floatValue()+ num2.floatValue());
      }
      else if (num1 instanceof Long){
            return (T) Long.valueOf(num1.longValue()+ num2.longValue());
        }
      else
          throw new IllegalArgumentException("Unsupported numeric type");
    }

}
