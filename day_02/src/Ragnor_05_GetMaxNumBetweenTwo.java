import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Ragnor_05_GetMaxNumBetweenTwo {
    public static void main(String[] args) {
        getMaxNumBetweenTwo(5, 9);
    }

    public static void getMaxNumBetweenTwo(int a, int b){
        if (a > b){
            System.out.println(a + "is bigger than" + b);
        }else if(a == b){
            System.out.println(a + "is equal to" + b);
        }else {
            System.out.println(a + " is thinner than" + b);
            }
        }
    }
