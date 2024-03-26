public class Rasional {
   private int pembilang, penyebut;

   public Rasional() {
      pembilang = 0;
      penyebut = 0;
   }

   public Rasional(int pbl, int pyb) {
      pembilang = pbl;
      penyebut = pyb;
   }

   // mengecek suatu bilangan adalah rasional atau bukan
   public boolean isRasional() {
      return (penyebut != 0);
   }

   // menyederhanakan bilangan rasional
   public void Sederhana() {
      int temp, A, B;
      if (penyebut == 0) {
         return;
      }
      A = (pembilang < penyebut) ? penyebut : pembilang;
      B = (pembilang < penyebut) ? pembilang : penyebut;
      // while (B != 0) {
      // temp = A % B;
      // A = B;
      // B = temp;
      // }
      for (; B != 0;) {
         temp = A % B;
         A = B;
         B = temp;
      }

      pembilang /= A;
      penyebut /= A;
   }

   public double Cast() {
      return (penyebut == 0.0) ? 0.0 : (double) pembilang / (double) penyebut;
   }

   // oprator >
   public boolean moreThan(Rasional A) {
      return (pembilang * A.penyebut > penyebut * A.pembilang);
   }

   // operator Unary- ---> A = -A
   public void negasi() {
      pembilang = -pembilang;
   }

   // operator unary += \
   public void unaryPlus(Rasional A) {
      pembilang = pembilang * A.penyebut + penyebut *
            A.pembilang;
      penyebut *= A.penyebut;
   }

   public boolean lessThan(Rasional A) {
      return (pembilang * A.penyebut < penyebut * A.pembilang);
   }

   public boolean lessThanOrEqual(Rasional A) {
      return (pembilang * A.penyebut <= penyebut * A.pembilang);
   }

   public boolean moreThanOrEqual(Rasional A) {
      return (pembilang * A.penyebut >= penyebut * A.pembilang);
   }

   public Rasional subtract(Rasional A) {
      int newPembilang = pembilang * A.penyebut - penyebut * A.pembilang;
      int newPenyebut = penyebut * A.penyebut;
      Rasional result = new Rasional(newPembilang, newPenyebut);
      result.Sederhana();
      return result;
   }

   public Rasional multiply(Rasional A) {
      int newPembilang = pembilang * A.pembilang;
      int newPenyebut = penyebut * A.penyebut;
      Rasional result = new Rasional(newPembilang, newPenyebut);
      result.Sederhana();
      return result;
   }

   public Rasional divide(Rasional A) {
      int newPembilang = pembilang * A.penyebut;
      int newPenyebut = penyebut * A.pembilang;
      Rasional result = new Rasional(newPembilang, newPenyebut);
      result.Sederhana();
      return result;
   }

   public void cetak() {
      System.out.println(pembilang + "/" + penyebut);
   }
}