package org.example.pltw.medialib;

/**
 * Maintain a collection of song, movie, and book titles.
 *
 * @author ckinnard
 * @version 3/5/16
 */
public class MediaLib
{
    public static void main(String args[]) {
        double totalCost = 0.0;
        double totalRating = 0;
        int numSongs = 0;
        double aveCost;
        double aveRating;

           System.out.println("Welcome to your Media Library");
    // according to Billboard's greatest songs...
    song song1 =  new song("The Twist", 1.29, 10);
    numSongs = numSongs + 1;
    totalCost = totalCost + song1.getPrice();
    totalRating = totalRating + song1.getRating();
        MediaFile.writeString(song1.getTitle() + "|" + song1.getRating());

    song song2 =  new song("Smooth", .99, 9);
    numSongs = numSongs + 1;
    totalCost = totalCost + song2.getPrice();
    totalRating = totalRating + song2.getRating();
        MediaFile.writeString(song2.getTitle() + "|" + song2.getRating());

    song song3 =  new song("Mack the Knife", 1.29, 8);
    numSongs = numSongs + 1;
    totalCost = totalCost + song3.getPrice();
    totalRating = totalRating + song3.getRating();
        MediaFile.writeString(song3.getTitle() + "|" + song3.getRating());

    song song4 =  new song("How Do I Live", 99, 7);
    numSongs = numSongs + 1;
    totalCost = totalCost + song4.getPrice();
    totalRating = totalRating + song4.getRating();
        MediaFile.writeString(song4.getTitle() + "|" + song4.getRating());

    song song5 =  new song("Party Rock Anthem", 1.29, 6);
    numSongs = numSongs + 1;
    totalCost = totalCost + song5.getPrice();
    totalRating = totalRating + song5.getRating();
        MediaFile.writeString(song5.getTitle() + "|" + song5.getRating());

    song song6 =  new song("I Gotta Feeling", .99, 7);
    numSongs = numSongs + 1;
    totalCost = totalCost + song6.getPrice();
    totalRating = totalRating + song6.getRating();
        MediaFile.writeString(song6.getTitle() + "|" + song6.getRating());

    song song7 =  new song("Macaren", 1.29, 8);
    numSongs = numSongs + 1;
    totalCost = totalCost + song7.getPrice();
    totalRating = totalRating + song7.getRating();
        MediaFile.writeString(song7.getTitle() + "|" + song7.getRating());

    song song8 =  new song("Physical", .99, 9);
    numSongs = numSongs + 1;
    totalCost = totalCost + song8.getPrice();
    totalRating = totalRating + song8.getRating();
        MediaFile.writeString(song8.getTitle() + "|" + song8.getRating());

    song song9 =  new song("You Light Up My Life", 1.29, 10);
    numSongs = numSongs + 1;
    totalCost = totalCost + song9.getPrice();
    totalRating = totalRating + song9.getRating();
        MediaFile.writeString(song9.getTitle() + "|" + song9.getRating());

    song song10 =  new song("Hey Jude", .99, 9);
    numSongs = numSongs + 1;
    totalCost = totalCost + song10.getPrice();
    totalRating = totalRating + song10.getRating();
        MediaFile.writeString(song10.getTitle() + "|" + song10.getRating());

        MediaFile.saveAndClose();
    /**** test code is commented out
     double testVal = 109.41;
     double testResult  = testVal / 10;
     System.out.println("Testing Result:");
     System.out.println(testResult);
     *****/

        System.out.println("Number of songs:");
        System.out.println(numSongs);

        System.out.println("Total cost:");
        System.out.println(totalCost);

    aveCost = totalCost / numSongs;
        System.out.println("Average cost:");
        System.out.println(aveCost);

    aveRating = totalRating / numSongs;
        System.out.println("Average rating:");
        System.out.println(aveRating);

    Movie movie1 = new Movie();
        movie1.setTitle("Young Frankenstein");
        System.out.println(movie1.getTitle());
        movie1.setDuration(134);
        movie1.showHoursMinutes();

        System.out.println("NumSongsInLibrary "+ song10.getNumSongsInLibrary()
                + " should equal " + numSongs);

}
}
