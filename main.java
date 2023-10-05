/*
Farmer john has some cows on his computer
Each of his cows have n number of spots
The more spots you have, the more important you are
Cows can see who has more spots than them
Cows like the other cows who have more spots than them, dislike those that have less
Farmer John wants to check if his sixth cow likes his 4th cow and if his 4th cow likes his sixth cow
*/
import java.util.Random;


public class main {
    public static void main(String[] args){
        Random rand = new Random();
        //rand.nextInt(highest possible value you want)
        Cow[] seaOfCows = new Cow[10];
        
        for (int cowI=0;cowI < 10;++cowI){
            seaOfCows[cowI] = new Cow(rand.nextInt(50));
            System.out.println(seaOfCows[cowI].spots);
        }
        System.out.println(seaOfCows[5].compare(seaOfCows[3]));
        System.out.println(seaOfCows[3].compare(seaOfCows[5]));


        newCow[] storeNewCows = new newCow[20];
        for (int newCowI = 0;newCowI < 20;++newCowI){
            storeNewCows[newCowI] = new newCow(72,rand.nextInt(2)>0.5);
            System.out.println(storeNewCows[newCowI].spots);
            System.out.println(storeNewCows[newCowI].checkApples());
        }
    }
}

class Cow{
    public int spots;
    public Cow(int m_spots){
        this.spots = m_spots;
    }
    public boolean compare(Cow otherCow){
        if (otherCow.spots > this.spots){
            return true;
        }
        else{
            return false;
        }
    }
}
/*
 * Theres a new generation of cows
 * New generation of cows like the cows that have less spots than them and dislike those that have more
 * The new generation likes apples (true) or they don't like apples (false)
 * Farmer John's cows can be forced to like apples or not
 */
class newCow extends Cow{
    private boolean likesApples;
    public newCow(int spots, boolean m_likesApples){
        super(spots);
        this.likesApples = m_likesApples;
    }
    @Override
    public boolean compare(Cow otherCow){
        if (otherCow.spots > this.spots){
            return false;        
        }
        else{
            return true;
        }
    }
    public boolean checkApples(){
        return likesApples;
    }
    public void forceApples(boolean likesApples){
        this.likesApples = likesApples;
    }
}