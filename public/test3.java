public class SupportFacade {
    public void incedentRequest(String UserName, String Product) {
      System.out.println("สินค้าที่ท่านเพิ่มการแจ้งเตือน คือ"+Product);
 }

 class Main {
    public static void main(String[] args) {
        SupportFacade UserName = new incedentRequest();
    }
   }