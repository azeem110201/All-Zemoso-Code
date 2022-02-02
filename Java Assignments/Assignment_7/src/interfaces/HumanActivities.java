package interfaces;

public class HumanActivities extends HumanActivitiesAbstract{
    @Override
    void brush() {
        System.out.println("Human is brushing");
    }

    @Override
    void getToWork() {
        System.out.println("Human is at work");
    }
}
