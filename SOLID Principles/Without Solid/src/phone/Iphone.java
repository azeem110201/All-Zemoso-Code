package phone;


import java.util.HashMap;
import java.util.Map;

public class Iphone implements Phone{
    private Map<String, String> contacts = new HashMap<>();
    public void calling(String phoneNumber){
        System.out.println("Calling " + phoneNumber + "........");
    }

    @Override
    public void takeHDPhotos() {
        TakeHDPhotos takeHDPhotos = new TakeHDPhotos();
        takeHDPhotos.takePhoto();
    }

    public void takeUltraWideAngelPhotos() {
        TakeUltraWideAngelPhotos takeUltraWideAngelPhotos = new TakeUltraWideAngelPhotos();
        takeUltraWideAngelPhotos.takePhoto();
    }

    @Override
    public Map<String, String> getAllContacts() {
        if(this.contacts.size() == 0){
            return null;
        }
        return this.contacts;
    }

    @Override
    public void addContact(String name, String phoneNumber) {
        if(this.contacts.size() == 0){
            this.contacts.put(phoneNumber, name);
            return;
        }

        for(int i = 0; i < this.contacts.size(); i++){
            if(!this.contacts.containsKey(phoneNumber)){
                this.contacts.put(phoneNumber, name);
                return;
            }
        }
        System.out.println("Contact already in the contact list");
    }

    public void ringing(){
        System.out.println("Your Iphone is ringing");
    }


}
