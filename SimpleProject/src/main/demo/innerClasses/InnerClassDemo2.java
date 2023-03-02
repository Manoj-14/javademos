package main.demo.innerClasses;

public class InnerClassDemo2 {
	public static void main(String[] args) {
		Car car = new Car("blue");
		car.start();
		
		Car.MusicSystem ms = car.new MusicSystem(8);
		ms.displayDetails();
		ms.playSomeMusic();
	}
}


class Car{
	private static String model = "Hyundai T20 Automatic";
	private String color;
	
	Car(String color){
		this.color = color ;
	}
	
	void start() {
		System.out.println("Car is started....");
	}
	
	class MusicSystem{
		private int numOfChannel;
		
		public MusicSystem(int numChannel) {
			this.numOfChannel = numChannel;
		}
		
		void displayDetails() {
			System.out.println("Model of the car: "+Car.model);
			System.out.println("Color of the car: "+Car.this.color);
			System.out.println("No of Music Channel: "+this.numOfChannel);
		}
		
		void playSomeMusic() {
			System.out.println("Play Some Music...");
			
			class Channel{
				int frequency;
				void getCurrentPlayingSong() {
					System.out.println("Current Playing Song...");
				}
			}
			
			Channel channel = new Channel();
			channel.getCurrentPlayingSong();
		}
	}
}