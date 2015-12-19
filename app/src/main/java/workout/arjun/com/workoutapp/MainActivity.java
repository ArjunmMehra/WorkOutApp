package workout.arjun.com.workoutapp;

import android.app.Fragment;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.internal.widget.DecorToolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WorkoutDetailsFragment detailfrag=(WorkoutDetailsFragment)getFragmentManager().findFragmentById(R.id.detailfrag);
        detailfrag.setWorkoutID(1);
    }


}
