import java.util.ArrayList;

public class StepTracker{
int totalSteps;
int totalDays;
int numActiveDays;
int minimum;
 
StepTracker(int min){
minimum = min;
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
return numActiveDays
}

public double averageSteps(){
 
return totalSteps/(double)totalDays;

}

} 
