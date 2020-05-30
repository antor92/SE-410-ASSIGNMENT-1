public class main implements interface_o, interface_t {
    public static void main(String[] args) {
    interface_o Int_o = new main();
    interface_t Int_t = new main();
    Int_o.laugh();
    Int_t.cry();

    }
    public void laugh(){
        System.out.println("====================================\n");
        System.out.println("Multiple Inheritance");
    }
    public void cry(){
        System.out.println("Second Multiple Inheritance");
    }


}