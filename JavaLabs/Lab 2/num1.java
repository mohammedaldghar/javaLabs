import java.util.Random;
class Arrays{
public static void main(String [] args){
Random num = new Random();
int limit =1000;
int nums[] = new int[1000];
for(int i =0;i<1000;i++){
nums[i]=num.nextInt(limit);
}
int max = nums[0],min=nums[0];
double startTime = System.nanoTime();
for (int i=0;i<1000;i++){
//System.out.println(nums[i]);
if (max <nums[i]){
max=nums[i];
}
if(min>nums[i]){
min=nums[i];
}
}
double finishedTime=System.nanoTime();
double Difference = finishedTime-startTime;
System.out.println("Time to search is "+Difference+" ns");
}
}
