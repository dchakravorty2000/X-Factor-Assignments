import java.util.Scanner;
class ClockAngle{
    static double angle(int hr, int min)
    {
        double min_angle = 360.0*min/60.0;
        double hr_angle = 360.0*hr/12.0 + 30*min/60.0;
        double ans;
        if(hr_angle>min_angle)
            ans = hr_angle - min_angle;
        else
            ans = min_angle - hr_angle;
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int hr = input.nextInt();
        int min = input.nextInt();
        System.out.println(angle(hr, min));        
    }
}
