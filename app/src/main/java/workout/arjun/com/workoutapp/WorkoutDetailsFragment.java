package workout.arjun.com.workoutapp;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailsFragment extends Fragment {

    private long workoutID;
    public WorkoutDetailsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_details, container, false);
    }

    public void setWorkoutID(long workoutID) {
        this.workoutID = workoutID;
    }

    @Override
    public void onStart(){
        super.onStart();
        View view=getView();
        if(view!=null) {
            TextView tv1 = (TextView) view.findViewById(R.id.nametext);
            TextView tv2 = (TextView) view.findViewById(R.id.descriptiontext);
            WorkOut workouts=WorkOut.workouts[(int)workoutID];
            tv1.setText(workouts.getName());
            tv2.setText(workouts.getDescription());
        }
    }

    @Override
    public void onAttach(Context activity){
        super.onAttach(activity);
    }


}
