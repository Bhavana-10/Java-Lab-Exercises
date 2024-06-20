package interfaces;
import java.util.Scanner;
interface Playable
{
	void play();
	void pause();
	void stop();
}
class MusicPlayer implements Playable {
	@Override
	public void play()
	{
		System.out.println("Play music.");
	}
	@Override
	public void pause() {
		System.out.println("Pause music.");
	}
	@Override
	public void stop() {
		System.out.println("Stop music.");
	}
}
class VideoPlayer implements Playable {
	@Override
	public void play() {
		System.out.println("Play video.");
	}
	@Override
	public void pause() {
		System.out.println("Pause video.");
	}
	@Override
	public void stop() {
		System.out.println("Stop video.");
	}
}

public class PlayableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Choose a player:");
        System.out.println("1. MusicPlayer");
        System.out.println("2. VideoPlayer");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();
        Playable player=null;
        if(choice==1)
        {
            player=new MusicPlayer();
        } 
        else if(choice==2) 
        {
            player=new VideoPlayer();
        } 
        else 
        {
            System.out.println("Invalid choice. Exiting program.");
        }
        player.play();
        player.pause();
        player.stop();

	}
}
