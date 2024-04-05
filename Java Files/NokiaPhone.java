import java.util.Scanner;
	public class NokiaPhone {
	public static void main(String[] args){

	String menu = """
	Phone Menu
	1. Phone Book
	2. Messages
	3. Chat
	4. Call register
	5. Tones
	6. Setting
	7. Call divert
	8. Games
	9. Calculator
	10. Reminders
	11. Clock
	12. Profile
	13. SIM services
	""";

	System.out.println(menu);
	Scanner myPhone = new Scanner(System.in);
	int start = myPhone.nextInt();
	
		switch(start) {
		case 1 : System.out.print("Phone Book");
		String phoneMenu = """
		\n
		Phone Book
		1. Search
		2. Service Nos^1
		3. Add name
		4. Erase
		5. Edit
		6. Assign tone
		7. senf b'card
		8. Options
		9. Speed dials
		10. Voice tags
		""";

		System.out.println(phoneMenu);
		Scanner phone = new Scanner(System.in);
		int phoneBook = phone.nextInt();
	
		switch(phoneBook) {
		case 1 : System.out.print("Search"); 
		break ;
		case 2 : System.out.print("Service Nos^1");
		break ;
		case 3: System.out.print("Add name");
		break ;
		case 4 : System.out.print("Erase");
		break ;
		case 5 : System.out.print("Edit");
		break ;
		case 6 : System.out.print("Assign tone"); 
		break ;
		case 7 : System.out.print("senf b'card");
		break ;
		case 8: System.out.print("Options");

			String optionView = """
			\n
			1. Type of view
			2. Memory status
			""";

			System.out.println(optionView);
			Scanner newOption = new Scanner(System.in);
			int options = newOption.nextInt();
	
			switch(options) {
			case 1 : System.out.print("Type of view"); 
				break ;
			case 2 : System.out.print("Memory status");
				break ;
			}	
			break;
		case 9 : System.out.print("Speed dials");
			break ;
		case 10 : System.out.print("Voice tags");
			break ;
			}
			
			break;
	case 2 : System.out.print("Messages");

		String messageMenu = """
		\n
		Messages
		1. Write Messgaes
		2. Inbox
		3. Outbox
		4. Picture messages
		5. Templates
		6. Smileys
		7. Message settings
		8. Info service
		9. Voice mailbox number
		10. Service command editor
		""";

		System.out.println(messageMenu);
		Scanner messageInfo = new Scanner(System.in);
		int startTwo = messageInfo.nextInt();

			switch(startTwo) {
			case 1 : System.out.print("Write Messgaes"); 
			break ;
			case 2 : System.out.print("Inbox");
			break ;
			case 3: System.out.print("Outbox");
			break ;
			case 4 : System.out.print("Picture messages");
			break ;
			case 5 : System.out.print("Templates");
			break ;
			case 6 : System.out.print("Smileys"); 
			break ;
			case 7 : System.out.print("Message settings");

				String messageSetting = """
				\n
				1. Set 1
				2. Common
				""";

				System.out.println(messageSetting);
				Scanner newMessageOption = new Scanner(System.in);
				int optionsMessage = newMessageOption.nextInt();
	
					switch(optionsMessage) {
					case 1 : System.out.print("Set 1");
	
					String set = """
					\n
					1. Messgae centre number
					2. Messages sent as
					3. Message validity
					""";

					System.out.println(set);
					Scanner newSet = new Scanner(System.in);
					int optionsSet = newSet.nextInt();
	
					switch(optionsSet) {
					case 1 : System.out.print("Messgae centre number");
					break ;
					case 2 : System.out.print("Messages sent as");
					break ;
					case 3 : System.out.print("Message validity");
					break ;
					}

					break;
					case 2 : System.out.print("Common");

					String messageCommon = """
					\n
					1. Delivery reports
					2. Reply via same centre
					3. Character support
					""";

					System.out.println(messageCommon);
					Scanner newCommon = new Scanner(System.in);
					int optionsCommon = newCommon.nextInt();
	
					switch(optionsCommon) {
					case 1 : System.out.print("Delivery reports");
					break ;
					case 2 : System.out.print("Reply via same centre");
					break ;
					case 3 : System.out.print("Character support");
					break ;
					}
					}

					break;
		case 8 : System.out.print("Info service");
		break ;
		case 9 : System.out.print("Voice mailbox number"); 
		break ;
		case 10 : System.out.print("Service command editor");
		break ;
		default : System.out.print("Bye");
			break ;
		}
			break;
	case 3: System.out.print("Chat");
		break ;
	case 4 : System.out.print("Call register");

		String callRegisterList = """
		\n
		1. Missed calls
		2. Received calls
		3. Dialled numbers
		4. Erase recent call lists
		5. Show call duration
		6. Show call cost
		7. Call cost setings
		8. Prepaid credit
		""";

		System.out.println(callRegisterList);
		Scanner newCallRegister = new Scanner(System.in);
		int optionsRegister = newCallRegister.nextInt();
	
		switch(optionsRegister) {
		case 1 : System.out.print("Missed calls");
			break ;
		case 2 : System.out.print("Received calls");
			break ;
		case 3 : System.out.print("Dialled numbers");
			break ;
		case 4 : System.out.print("Erase recent call lists");
			break ;
		case 5 : System.out.print("Show call duration");

			String callDuration = """
			\n
			1. Last call duration
			2. All calls' duration
			3. Received calls' duration
			4. Dialled calls' duration
			5. Clear timers
			""";

			System.out.println(callDuration);
			Scanner newCallDuration = new Scanner(System.in);
			int optionsDuration = newCallDuration.nextInt();

			switch(optionsDuration){
			case 1 : System.out.print("Last call duration");
			break ;
			case 2 : System.out.print("All calls' duration");
			break ;
			case 3 : System.out.print("Received calls' duration");
			break ;
			case 4 : System.out.print("Dialled calls' duration");
			break ;
			case 5 : System.out.print("Clear timers");
			break ;
			}
			break;
		case 6 : System.out.print("Show call cost");

			String callShowCost = """
			\n
			1. Last call cost
			2. All calls' cost
			3. Clear counter
			""";

			System.out.println(callShowCost);
			Scanner newCallCost = new Scanner(System.in);
			int optionsCost = newCallCost.nextInt();

			switch(optionsCost) {
			case 1 : System.out.print("Last call cost");
			break ;
			case 2 : System.out.print("All calls' cost");
			break ;
			case 3 : System.out.print("Clear counter");
			break ;
			}
			break;
		case 7 : System.out.print("Call cost setings");

			String callShowCostLimit = """
			\n
			1. Call cost limit
			2. Show cost in
			""";

			System.out.println(callShowCostLimit);
			Scanner newCallLimit = new Scanner(System.in);
			int optionsLimit = newCallLimit.nextInt();

			switch(optionsLimit) {
			case 1 : System.out.print("Call cost limit");
			break ;
			case 2 : System.out.print("Show cost in");
			break ;
			}
			break;
		case 8 : System.out.print("Prepaid credit");
			break ;
		}
			break;
	case 5 : System.out.print("Tones");
		
			String callTone = """
			\n
			1. Ringing tone
			2. Ringing volume
			3. Ringing call alert
			4. Composer
			5. Message alert tone
			6. Keypad tones
			7. Warning and game tones
			8. Vibrating alert
			9. Screen saver
			""";

			System.out.println(callTone);
			Scanner newTone = new Scanner(System.in);
			int optionsTone = newTone.nextInt();

			switch(optionsTone){
			case 1 : System.out.print("Ringing tone");
			break ;
			case 2 : System.out.print("Ringing volume");
			break ;
			case 3 : System.out.print("Ringing call alert");
			break ;
			case 4 : System.out.print("Composer");
			break ;
			case 5 : System.out.print("Message alert tone");
			break ;
			case 6 : System.out.print("Keypad tones");
			break ;
			case 7 : System.out.print("Warning and game tones");
			break ;
			case 8 : System.out.print("Vibrating alert");
			break ;
			case 9 : System.out.print("Screen saver");
			break ;
			}
			break;
	case 6 : System.out.print("Setting"); 

			String callSettings = """
			\n
			1. Call Settings
			2. Phone settings
			3. Security settings
			4. Restore factory settings
			""";

			System.out.println(callSettings);
			Scanner newSettings = new Scanner(System.in);
			int optionsSettings = newSettings.nextInt();

			switch(optionsSettings){
			case 1 : System.out.print("Call Settings");

			String callRedial = """
			\n
			1. Automatic redial
			2. Speed dialling
			3. Call waiting options
			4. Own number sending
			5. Phone line in use
			6. Automatic answer
			""";

			System.out.println(callRedial);
			Scanner newCallRedial = new Scanner(System.in);
			int optionsRedial = newCallRedial.nextInt();

			switch(optionsRedial){
			case 1 : System.out.print("Automatic redial");
			break ;
			case 2 : System.out.print("Speed dialling");
			break ;
			case 3 : System.out.print("Call waiting options");
			break ;
			case 4 : System.out.print("Own number sending");
			break ;
			case 5 : System.out.print("Phone line in use");
			break ;
			case 6 : System.out.print("Automatic answer");
			break ;
			}
			
			break ;
			case 2 : System.out.print("Phone settings");

			String callPhoneSettings = """
			\n
			1. Language
			2. Cell info display
			3. Welcome note
			4. Network selection
			5. Lights
			6. Confirm access codes
			""";

			System.out.println(callPhoneSettings);
			Scanner newPhoneSettings = new Scanner(System.in);
			int optionsPhoneSettings = newPhoneSettings.nextInt();

			switch(optionsPhoneSettings){
			case 1 : System.out.print("Language");
			break ;
			case 2 : System.out.print("Cell info display");
			break ;
			case 3 : System.out.print("Welcome note");
			break ;
			case 4 : System.out.print("Network selection");
			break ;
			case 5 : System.out.print("Lights");
			break ;
			case 6 : System.out.print("Confirm access codes");
			break ;
			}
		
			break ;
			case 3 : System.out.print("Security settings");

			String securitySettings = """
			\n
			1. PIN code request
			2. Call barring service
			3. Fixed dialling
			4. Closed user group
			5. Phone security
			6. Changed access codes
			""";

			System.out.println(securitySettings);
			Scanner newPhoneSecSettings = new Scanner(System.in);
			int optionsPhoneSecSettings = newPhoneSecSettings.nextInt();

			switch(optionsPhoneSecSettings){
			case 1 : System.out.print("PIN code request");
			break ;
			case 2 : System.out.print("Call barring service");
			break ;
			case 3 : System.out.print("Fixed dialling");
			break ;
			case 4 : System.out.print("Closed user group");
			break ;
			case 5 : System.out.print("Phone security");
			break ;
			case 6 : System.out.print("Changed access codes");
			break ;
			}
			
			case 4 : System.out.print("Restore factory settings");
			break ;
			}
			
			break;
	case 7 : System.out.print("Call divert");
		break ;
	case 8 : System.out.print("Games"); 
		break ;
	case 9 : System.out.print("Calculator");
		break ;
	case 10: System.out.print("Reminders");
		break ;
	case 11 : System.out.print("Clock");
		
			String clock = """
			\n
			1. Alarm clock
			2. Clock settings
			3. Date setting
			4. Stopwatch
			5. Countdown timer
			6. Auto update of date and time
			""";

			System.out.println(clock);
			Scanner newclock = new Scanner(System.in);
			int optionsclock = newclock.nextInt();

			switch(optionsclock){
			case 1 : System.out.print("Alarm clock");
			break ;
			case 2 : System.out.print("Clock settings");
			break ;
			case 3 : System.out.print("Date setting");
			break ;
			case 4 : System.out.print("Stopwatch");
			break ;
			case 5 : System.out.print("Countdown timer");
			break ;
			case 6 : System.out.print("Auto update of date and time");
			break ;
			}
			break;
	case 12 : System.out.print("Profile");
		break ;
	case 13 : System.out.print("SIM services"); 
		break ;
	

	
	
	}
}
}

	