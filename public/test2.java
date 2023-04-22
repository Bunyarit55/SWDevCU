public class ProductGroup
{
   private final String gloves; // จำเป็นต้องใส่
   private final String brush; // ไม่จำเป็น
   private final String bathroomcleaner; // ไม่จำเป็น
   private final String kitchenware; // ไม่จำเป็น
   private final String condiment; // ไม่จำเป็น
   private ProductGroup(ProductGroupBuilder builder) {
       this.gloves = builder.gloves;
       this.brush = builder.brush;
       this.bathroomcleaner = builder.bathroomcleaner;
       this.kitchenware = builder.kitchenware;
       this.condiment = builder.condiment;
   }
   //ต้องมี getter แต่ไม่ต้องมี setter
   public String getgloves() {
       return gloves;
   }
   public String getbrush() {
       return brush;
   }
   public String getbathroomcleaner() {
       return bathroomcleaner;
   }
   public String getkitchenware() {
       return kitchenware;
   }
   public String getcondiment() {
    return condiment;
    }
   @Override
   public String toString() {
       String order = "ProductGroup "+this.gloves + ", brush:"+this.brush+", bathroomcleaner:"+this.bathroomcleaner+", kitchenware:"+this.kitchenware;
       return order;
   }

// Builder ที่ทำหน้าที่เป็น setter
   public static class ProductGroupBuilder
   {
       private final String gloves;
       private String brush;
       private String bathroomcleaner;
       private String kitchenware;
       private String condiment;
       public ProductGroupBuilder(String gloves) {
           this.meat = meat;
       }
       public ProductGroupBuilder brush(String brush) {
           this.gloves = gloves;
           return this;
       }
       public ProductGroupBuilder bathroomcleaner(String bathroomcleaner) {
           this.bathroomcleaner = bathroomcleaner;
           return this;
       }
       public ProductGroupBuilder kitchenware(String kitchenware) {
           this.kitchenware = kitchenware;
           return this;
       }
      
       //object สุดท้ายที่จะส่งออกไป
       public ProductGroup build() {
           ProductGroup productgroup =  new ProductGroup(this);
           return productgroup;
       }
   }
}


class Main {
    public static void main(String[] args) {
      ProductGroup group1 = new ProductGroup.ProductGroupBuilder("ชุดล้างห้องน้ำ")
      .brush()
      .bathroomcleaner();
   
      System.out.println(group1);
   
      ProductGroup group2 = new ProductGroup.ProductGroupBuilder("ชุดทำอาหาร")
      .kitchenware()
      .condiment();
   
      System.out.println(group2);
   
  }
  }