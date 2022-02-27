
public class Interning{
    public static void main(String[] args){
        String s = "hello";
        char ch = s.charAt(0);
        // s.setChar(0, 'b') // Missing modification function

        s.replace('h', 'b'); // Yaha par hello hi print hoga because aap ne ise receive hi nahi kiya isliye ye hello hi printkar diya 
        System.out.println(s);

        s = s.replace('h', 'B'); // agr char replae karna ho toh pahle receive karna hoga then print karna hoga or ye new jagah par bana hai 
        System.out.println(s);

        // Hence String have poor Perforamnace in Java if you replace the any charcarter then this copy the address 
    }
}