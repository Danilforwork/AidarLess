package Day1;

public class Magazine {
    public static void main(String[] args) {
        String[] products = {"Chocolate","Milk","Bread","Beef","Potato"};
        int n = products.length;
        Double[] price = {4.35,10.5,8.88,7.5,11.45};
        for (int i = 0; i < n; i++){
            System.out.println(products[i]+"-"+price[i]);
        }//GG
    }
}
