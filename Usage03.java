public class Usage03 {
 
    // ②、④
    Usage03() {
 
        int data = 100;
        data = method1(data);
        System.out.println(“data = ” + data);
 
    }
 
    // ①
    public static void main(String[] args) {
 
        Usage03 usage = new Usage03();
 
    }
 
    // 戻り値の型指定されてる！！
    int method1(int data) {
 
        data++;
        return data;
 
    }
 
}
