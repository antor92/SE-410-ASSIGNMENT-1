
public class student {

    private int std_id;
    private int cls;
    private Double result;
    private ma_n mainInfo;

    public int getcls() {
        return cls;
    }

    public ma_n getMainInfo() {
        return mainInfo;
    }

    public void setMainInfo(ma_n mainInfo) {
        this.mainInfo = mainInfo;
    }

    public void setcls(int cls) {
        this.cls = cls;
    }

    public Double getresult() {
        return result;
    }

    public int getStd_id() {
        return std_id;
    }

    public void setStd_id(int std_id) {
        this.std_id = std_id;
    }

    public student(ma_n mainInfo) {
        this.mainInfo = mainInfo;
    }

    public student(int std_id, int cls, Double result, ma_n mainInfo) {
        this.std_id = std_id;
        this.cls = cls;
        this.result = result;
        this.mainInfo = mainInfo;
    }
    public String toString(){
        return "STUDENT DETAILS\n | Std_id = "+ std_id + " | Class ="+ cls + " | Result = " + result +" "+mainInfo+"\n\n====================================================================================================================================";
    
    }
    public String toString2(){
        return "\n====================================================================================================================================\n";
    
    }
    
}
