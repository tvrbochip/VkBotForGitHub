import com.petersamokhin.bots.sdk.clients.Group;
import com.petersamokhin.bots.sdk.objects.Message;

public class Main {
	
	private static final String token = ;
	private static final int grpID = ;

	public static void main(String[] args) {
		
		Group group = new Group(grpID, token);
		
		
			group.onSimpleTextMessage(message ->
		     new Message()
		         .from(group)
		         .to(message.authorId())
		         .text("Привет ")
		         
		         .send()
		);

		group.onPhotoMessage(message ->
		    new Message()
		         .from(group)
		         .to(message.authorId())
		         .text("Уже лучше. Но я тоже так могу. Что дальше?")
		         .photo("C:\\Users\\Tvrbochip\\Desktop\\mem.jpg")
		         .send()
		);

		group.onVoiceMessage(message ->
		    new Message()
		         .from(group)
		         .to(message.authorId())
		         .text("Не охота мне голосовые твои слушать.")
		         .doc("https://vk.com/doc62802565_447117479")
		         .send()
		);
			
			
		}
		
		
		
		
		
		
	    
		


}


