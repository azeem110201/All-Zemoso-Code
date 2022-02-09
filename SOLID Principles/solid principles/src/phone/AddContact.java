package phone;

import java.util.Map;

public interface AddContact {
    void addContact(String name, String phoneNumber);
    Map<String, String> getAllContacts();

}
