package lombok;

public class Phone {

    public static void main(String[] args) {

//        Shop obj = new Shop("Android", 8, 5.5, 3200, 10000);
////        obj.getOs();
//
////        System.out.println(obj.getOs());
//        System.out.println(obj);


        Shop obj1 = new PhoneBuilder().setOs("Android").setCost(12000).getPhone();
        System.out.println(obj1);
    }

}
