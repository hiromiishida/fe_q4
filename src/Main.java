public class Main {
    public static void main(String[] args) {
        System.out.println(fee(13, 10)); // 13歳、10時の場合
        System.out.println(fee(30, 10)); // 30歳、10時の場合
        System.out.println(fee(40, 14)); // 40歳、14時の場合
    }

    private static int fee(int age, int hour){
        int ret = 0;

        if(age >= 13 && age <= 18){
            ret = 800;
        }
        else if(age >= 19) {
            ret = 1200;
        }

        if(hour <= 10) {
            ret = (int) (ret * 0.9);
        }

        return ret;
    }
}