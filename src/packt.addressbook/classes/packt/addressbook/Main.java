
package packt.addressbook;

import java.security.KeyStore;
import java.util.Enumeration;

public class Main {
    public static void main(String[] args) throws Exception {
        
        KeyStore ks = KeyStore.getInstance("WINDOWS-MY");
        ks.load(null, null);
        Enumeration<String> aliases = ks.aliases();
        while(aliases.hasMoreElements()){
            String alias = aliases.nextElement();
            System.out.println(alias);
        }
    }
}
