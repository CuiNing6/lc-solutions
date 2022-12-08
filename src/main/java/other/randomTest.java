package other;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class randomTest {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//        System.out.println(list.size());
        for (int i = 0; i < 10000; i++) {
            int randomIndex = new Random().nextInt(6);
            if (randomIndex == 5) {
                System.out.println(randomIndex);
            }

//            System.out.println(randomIndex);
        }
        System.out.println("end");

    }



}
