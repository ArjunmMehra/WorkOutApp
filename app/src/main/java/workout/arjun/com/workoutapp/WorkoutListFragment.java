package workout.arjun.com.workoutapp;


import android.app.ListFragment;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutListFragment extends ListFragment {


    public WorkoutListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ListView listview=getListView();
        ArrayAdapter<WorkOut> adapter=new ArrayAdapter<WorkOut>(getActivity(),android.R.layout.simple_list_item_activated_1,WorkOut.workouts);
        listview.setAdapter(adapter);
        return listview;
    }

    @Override
    public void onListItemClick(ListView listview,View view,int position,long viewID){

    }


}
