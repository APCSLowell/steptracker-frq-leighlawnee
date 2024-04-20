import java.util.ArrayList;

public class StepTracker{
int totalSteps;
int totalDays;
int numActiveDays;
int minimum;
 
StepTracker(int min){
minimum = min;
}

public void addDailySteps(int steps){
totalSteps+=steps;
totalDays++;
if(steps>min)
numActiveDays++;
}

public int activeDays(){
return numActiveDays
}

public double averageSteps(){
return totalSteps/(double)totalDays;

}

} 
