package com.azeem;

import phone.Iphone;
import phone.Nokia;

public class Main {
    public static void main(String[] args) {
        //Nokia class
//        Nokia nokiaPhone = new Nokia();
//        nokiaPhone.calling("9849826526");
//        nokiaPhone.ringing();
//        nokiaPhone.addContact("azeem", "2349236496");
//        nokiaPhone.addContact("rohan", "4982598236");
//        nokiaPhone.addContact("john", "3837923886");
//
//        System.out.println(nokiaPhone.getAllContacts());
//
//        nokiaPhone.takeHDPhotos();


        //IPhone class
        Iphone iphone = new Iphone();
        iphone.calling("9849826526");
        iphone.ringing();
        iphone.addContact("azeem", "2349236496");
        iphone.addContact("rohan", "4982598236");
        iphone.addContact("john", "3837923886");

        System.out.println(iphone.getAllContacts());

        iphone.takeHDPhotos();
        iphone.takeUltraWideAngelPhotos();

    }
}
