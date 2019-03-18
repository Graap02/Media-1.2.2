package org.example.pltw.medialib;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private song[] songs;
    private ListView songListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView welcomeText = (TextView) findViewById(R.id.welcomeTextView);

    }

    /**
     * This method is called when the Show Contents button is clicked
     **/
    public void showMedia(View v) {

        TextView outputText = (TextView) findViewById(R.id.mediaLibText);
        outputText.append(" Welcome to your media library.\n");

        outputText.append(" Songs: \n");

        song song1 = new song();
        song1.setTitle(" Song 1: It's the end of the world as we know \n it.\n");
        outputText.append(song1.getTitle());

        song song2 = new song();
        song2.setTitle(" Song 2: Get Shwifty.\n");
        outputText.append(song2.getTitle());

        song song3 = new song();
        song3.setTitle(" Song 3: My Lover Is A Day.\n");
        outputText.append(song3.getTitle());

        song song4 = new song();
        song4.setTitle(" Song 4: Don't Stop Me Now.\n");
        outputText.append(song4.getTitle());

        song song5 = new song();
        song5.setTitle(" Song 5: Life On Mars?.\n");
        outputText.append(song5.getTitle());

        song song6 = new song();
        song6.setTitle(" Song 6: Comfortably Numb.\n");
        outputText.append(song6.getTitle());

        song song7 = new song();
        song7.setTitle(" Song 7: Creep.\n");
        outputText.append(song7.getTitle());

        song song8 = new song();
        song8.setTitle(" Song 8: Stand By Me.\n");
        outputText.append(song8.getTitle());

        song song9 = new song();
        song9.setTitle( " Song 9: Diamond Jack.\n");
        outputText.append(song9.getTitle());

        song song10 = new song();
        song10.setTitle(" Song 10: Never Gonna Give You Up.\n");
        outputText.append(song10.getTitle());

        outputText.append(" Movies: \n");

        Movie movie1 = new Movie();
        movie1.setTitle(" Movie 1: Plan Bee.\n");
        outputText.append(movie1.getTitle());

        Movie movie2 = new Movie();
        movie2.setTitle(" Movie 2: Scooby doo the movie.\n");
        outputText.append(movie2.getTitle());

        Movie movie3 = new Movie();
        movie3.setTitle(" Movie 3: Stewart little.\n");
        outputText.append(movie3.getTitle());

        Movie movie4 = new Movie();
        movie4.setTitle(" Movie 4: La La Land.\n");
        outputText.append(movie3.getTitle());

        Movie movie5 = new Movie();
        movie5.setTitle(" Movie 5: Tomorrow Land.\n");
        outputText.append(movie5.getTitle());
    }
}
