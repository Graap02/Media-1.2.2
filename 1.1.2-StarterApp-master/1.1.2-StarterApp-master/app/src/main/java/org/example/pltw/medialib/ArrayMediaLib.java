package org.example.pltw.medialib;
import java.lang.reflect.Array;

public class ArrayMediaLib {

    public static void main(String args[]) {

        String[] sharingFriends =
                {"Donald",
                        "Thaddeus",
                        "Skyler",
                        "Hunter",
                        "Nicolas"
                };
        for (int i = 0; i < sharingFriends.length; i++) {
            System.out.println(sharingFriends[i]);
        }
        int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
        int total = 0;
        for (int val: daysBtwnPurchase)
        {
            total = total + val;
        }
        song[] topTenSongs = {
                new song("The Twist"),
                new song("Smooth"),
                new song("Mack the Knife"),
                new song("How Do I Live"),
                new song("Party Rock Anthem"),
                new song("I gotta feeling"),
                new song("Macarena"),
                new song("Physical"),
                new song("You Light Up My Life"),
                new song("Hey Jude")
        };

        System.out.println("---------------");
        int count = 1;
        for (song s: topTenSongs)
        {
            if (count % 3 == 0)
            { s.setPrice(.99);
                System.out.println(s.getTitle() + " - Price: " + s.getPrice());
            }
            else {s.setPrice(1.29);
                System.out.println(s.getTitle() + " - Price: " + s.getPrice());

            }

            ++count;

        }


    }
}

