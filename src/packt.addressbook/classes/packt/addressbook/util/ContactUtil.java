package packt.addressbook.util;

import java.util.Arrays;
import java.util.List;
import packt.addressbook.model.Contact;

public class ContactUtil {

    public List<Contact> getContacts() {
        return Arrays.asList(
                new Contact(1, "José", "Vicente", "2323"),
                new Contact(1, "Maria", "José", "2323"),
                new Contact(1, "Danial", "Alves", "2323")
        );
    }
}
