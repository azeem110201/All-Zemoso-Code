package phone;

public class FaceUnlock implements UnlockPhone{
    @Override
    public void unlockPhone() {
        System.out.println("Unlocking phone using face unlock");
    }
}
