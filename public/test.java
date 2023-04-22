class Main {
    public static void main(String[] args) {
        SalesOrder salesorder = new SalesOrder();
    
        // ซื้อน้ำปลา
        Sales order1 = Cashier.order("น้ำปลา");
    
        // ได้น้ำปลา
        order1.brew();
    
        // ซื้อถุงมือ
        Sales order2 = Cashier.order("ถุงมือ");
    
        // ได้ถุงมือ
        order2.brew();
    
        // ซื้อหน้ากาก N95
        Sales order3 = Cashier.order("หน้ากากN95");
    
        // ได้หน้ากาก N95
        order3.brew();
     }
   }
   

   public class Cashier {
 
    public Sales order(String SalesType) {
    
      if (SalesType.equals("น้ำปลา")) {
        return new FishSauce();
    
      } else if (beverageType.equals("ถุงมือ")) {
        return new Glove();
    
      } else if (beverageType.equals("หน้ากากN95")) {
        return new Mask();
      }
    
      return null;
    }
   }

   public interface Sales {
    void brew();
  }