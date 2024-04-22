import java.util.ArrayList;

public class StepTracker{
private int totalSteps;
private int totalDays;
private int numActiveDays;
private int minimum;
 
public StepTracker(int mini){
 minimum = mini;
 totalSteps = 0;
 totalDays = 0;
 numActiveDays = 0;
}

public void addDailySteps(int steps){
 totalSteps+=steps;
totalDays++;
 if(steps>=minimum)
numActiveDays++;
}

public int activeDays(){
return numActiveDays;
}

public double averageSteps(){ 
if(totalDays == 0)
            return 0.0;

        return totalSteps / (double) days;

}

} 
