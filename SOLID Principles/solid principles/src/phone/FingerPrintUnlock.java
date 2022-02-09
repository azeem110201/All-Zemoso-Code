package phone;

public class FingerPrintUnlock implements UnlockPhone{
    @Override
    public void unlockPhone() {
        System.out.println("Unlocking phone using Finger print");
    }
}
