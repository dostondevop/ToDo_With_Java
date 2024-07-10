import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Deliver> delivers = new ArrayList<>(;)
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setGender(Gender.FEMALE);
//        Gender gender =  student.getGender();
//

        DeliverType plane = DeliverType.PLANE;
        System.out.println(plane);
        System.out.println(plane.getName());

        isPlane(DeliverType.PLANE);




    }
    private static boolean isPlane( DeliverType deliverType) {
        return deliverType == DeliverType.PLANE;
    }
    private static int getTotalAmountByTotalPlane(DeliverType deliverType) {
       int totalAmount = 0;
        for (Deliver deliver : delivers) {
            if (deliver.getDeliverType() == DeliverType.PLANE) {
                totalAmount = DeliverType.PLANE.getAmount();
            }
        }
        return totalAmount;
    }

}