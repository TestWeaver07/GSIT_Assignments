package day14_abstract_Interfaces;


		interface camera{
			
			abstract void takephoto() ;
			abstract void recordvideo() ;
			
		}
		interface musicplayer{
			
			
			abstract void playMusic();
			abstract void stopMusic() ;
			
		}
		class smartphone implements camera,musicplayer
		{
			 public void takephoto() {
				
				System.out.println("Photo captured successfully.");
			}
			 public void recordvideo() {
				
				System.out.println("Video recording started.");
			}
			 public void playMusic(){
				
				System.out.println("Music is playing.");
			}
			public void stopMusic() {
				
				System.out.println("Music stopped.");
			}
			
			public void makecall() {
				System.out.println("Making a phone call.");
			}
		}
		
		
		
		
		
		public class Daily_Assignment_Interfaces {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				smartphone sm= new smartphone();
				
				sm.takephoto();
				sm.recordvideo();
				sm.playMusic();
				sm.stopMusic();
				sm.makecall();
				

	}

}
