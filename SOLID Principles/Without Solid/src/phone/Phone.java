package phone;

import java.util.Map;

public interface Phone {
    Map<String, String> getAllContacts();
    void addContact(String name, String phoneNumber);
    void ringing();
    void calling(String phoneNumber);
    void takeHDPhotos();

}
