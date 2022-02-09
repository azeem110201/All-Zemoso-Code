package com.azeem;

import phone.*;

public class Main {
    public static void main(String[] args) {
        // below is the working of Nokia
        AddContact addContact = new AddContactNokia();
//        Nokia nokia = new Nokia(addContact);
//
//        nokia.calling("6369623693");
//        nokia.ringing();
//
//        System.out.println(nokia.getAllContacts());
//
//        addContact.addContact("azeem", "83582985620");
//        addContact.addContact("john", "835829858340");
//        System.out.println(nokia.getAllContacts());
//
//        System.out.println("******************************************************");



        // below is the working of IPhone
        addContact = new AddContactInIphone();
        Iphone iphone = new Iphone(addContact);

        iphone.calling("6369623693");
        iphone.ringing();

        System.out.println(iphone.getAllContacts());

        addContact.addContact("sameer","1234554544");
        addContact.addContact("azeem","838927947294");

        System.out.println(iphone.getAllContacts());

        Camera camera = new TakeUltraWideAngelPhotos();
        iphone.openCamera(camera);

        camera = new TakeHDPhotos();
        iphone.openCamera(camera);

        UnlockPhone unlockPhone = new FingerPrintUnlock();
        iphone.unlockPhone(unlockPhone);

        unlockPhone = new FaceUnlock();
        iphone.unlockPhone(unlockPhone);


    }
}
