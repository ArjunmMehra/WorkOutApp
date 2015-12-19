package workout.arjun.com.workoutapp;

/**
 * Created by Suraj on 19-12-2015.
 */
public class WorkOut {

    private String name;
    private String description;

    public static WorkOut [] workouts={new WorkOut("The Limb Loosener","5 Handstand push-ups \n 10 1-legged squats \n 15 Pull-ups"),
            new WorkOut("Core Agony","100 Push-ips \n100 Sit-ups \n100 Push-ups \n100 Squats"),
            new WorkOut("The Wimp Special","5 Push-ups \n 10 Pull-ups \n15 Squats"),
            new WorkOut("Strength and Length","500 meter run \n21 x 1.5b pood kettleball Swing \n21 x Pull=ups"),};

    public WorkOut(String name,String description){
        this.name=name;
        this.description=description;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString(){
        return name;
    }


}
