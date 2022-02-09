package phone;

import java.security.InvalidParameterException;
import java.util.Map;

public class Iphone implements SmartPhone{
    private final AddContact addContact;
    public Iphone(AddContact addContact){
        this.addContact = addContact;
    }
    public Map<String, String> getAllContacts(){
        if(this.addContact.getAllContacts() != null)
            return this.addContact.getAllContacts();

        return null;
    }
    public void calling(String phoneNumber){

        System.out.println("Calling " + phoneNumber + "........");
    }

    public void ringing(){

        System.out.println("Your Iphone is ringing");
    }
    public void openCamera(Camera camera){
        if(camera == null){
            throw new InvalidParameterException("Cannot open camera. App crashed! Please try again");
        }

        camera.takePhoto();
    }
    public void unlockPhone(UnlockPhone unlockPhone){
        if(unlockPhone == null){
            throw new InvalidParameterException("Cannot the phone.");
        }

        unlockPhone.unlockPhone();
    }
}
