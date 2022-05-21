import java.util.Random;

public class JavaAnonymousClass {
    public static void main(String[] args) {
        //这里匿名内部类可以调用函数参数？？

        show("jiejie", new discountWords() {
            int a = 2;
            @Override
            public String getDiscountWords(String goodsName, int hour) {
                int currentYear = 2002;
                return String.format(String.format("%d年, %s,%d", currentYear, goodsName, a));
            }
        });
    }

    public interface discountWords{
        String getDiscountWords(String goodsName,int hour);
    }

    public static void show(String goodsName, discountWords discountWords) {
        int hour = new Random().nextInt(24);
        System.out.println(discountWords.getDiscountWords(goodsName, hour));
    }
}
