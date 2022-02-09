package phone;

import java.util.HashMap;
import java.util.Map;

public class Nokia implements Phone{
    private Map<String, String> contacts = new HashMap<>();
    public void calling(String phoneNumber){
        System.out.println("Calling " + phoneNumber + "........");
    }

    @Override
    public void takeHDPhotos() {
        throw new UnsupportedOperationException();
    }

    public void ringing(){
        System.out.println("Your Nokia is ringing");
    }

    public void addContact(String name, String phoneNumber){
        if(this.contacts.size() == 0){
            this.contacts.put(phoneNumber, name);
            return;
        }

        for(int i = 0; i < this.contacts.size(); i++){
            if(!(this.contacts.containsKey(phoneNumber))){
                this.contacts.put(phoneNumber, name);
                return;
            }
        }
        System.out.println("Contact with the same name exist");
    }
    public Map<String, String> getAllContacts(){
        if(this.contacts.size() == 0){
            return null;
        }
        return this.contacts;
    }
}
