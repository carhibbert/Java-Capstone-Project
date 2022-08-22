import java.util.*;

public class addressBook {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    static Scanner input = new Scanner(System.in);

    public void addressBookEntry(String firstName, String lastName, String phoneNumber, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
	    return firstName;
	}

	public void setFirstName(String firstName) {
	    this.firstName = firstName;
	}

	public String getLastName() {
	    return lastName;
	}

	public void setLastName(String lastName) {
	    this.lastName = lastName;
	}

	public String getPhoneNumber() {
	    return phoneNumber;
	}

	public void setPhone(String phoneNumber) {
	    this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
	    return email;
	}

	public void setEmail(String email) {
	    this.email = email;
	}

    // Create an arraylist of entry objects
    static ArrayList<addressBookEntry> Book = new ArrayList<addressBookEntry>();

    // public void addressBookEntry(){
    //     System.out.println("This is the display method of superclass addressBookEntry");
    // }

    // Main menu for address book
    public static void printMenu(){
        
        int choice;

        System.out.println("1) Add an entry\n" +
                            "2) Remove an entry\n" +
                            "3) Search for a specific entry\n" +
                            "4) Print Address Book\n" +
                            "5) Delete Book\n" +
                            "6) Quit\n"+
                            "Please choose what you'd like to do with the database: ");

        // Assign choice variable to user input 
        choice = input.nextInt();
        if (choice == 1){
            addEntry();
        }
            else if (choice == 2){
                removeEntry();
            }
            else if (choice == 3){
                searchBook();
            }
            else if (choice == 4){
                printBook();
            }
            else if (choice == 5){
                deleteBook();
            }
            else if (choice == 6){
                quitBook();
            }
        //     // If choice != ints 1-6, reset and ask user for choice again.
            else {
                System.out.println("Invalid entry! Please try again.");
                printMenu();
            }
    }

    // Allows user to add an entry
    public static void addEntry(){
       Scanner entry = new Scanner(System.in);
            System.out.println("Please enter the following:");
                System.out.println("First Name: ");
                String firstName = entry.nextLine();
                System.out.println("Last Name: ");
                String lastName = entry.nextLine();
                System.out.println("Phone number: ");
                String phoneNumber = entry.nextLine();
                System.out.println("Email address: ");
                String email = entry.nextLine();
            
            Book.add(new addressBookEntry(firstName, lastName, phoneNumber, email));
        

        System.out.println("\nAdded new entry!\n");
        printMenu();
        
    }

    // Allows user to remove an entry
    public static void removeEntry(){
        Scanner removeEmail = new Scanner(System.in);
        System.out.println("Enter an entry's email to remove");
        String remove = removeEmail.nextLine();
        for (int i = 0; i<Book.size(); i++){
            if (Book.get(i).getEmail() == remove){
                System.out.println("Deleted the following entry:");
                System.out.println("****************************");
                System.out.println(Book.get(i));
                System.out.println("****************************");
                Book.remove(i);
            }
        }
        printMenu();
    }

    // // Allows user to search for an entry
    public static void searchBook(){
        
        System.out.println("Search address book: \n");
        System.out.println("1) First Name\n" +
                            "2) Last Name\n" +
                            "3) Phone Number\n" +
                            "4) Email Address\n" +
                            "Choose a search type: \n");
        int choice = input.nextInt();
        if (choice == 1){
            System.out.println("Please enter First Name: \n");
            String firstName = input.nextLine();
            for (int i = 0; i < Book.size(); i++) {
                if (Book.get(i).getFirstName().equals(firstName)) {
                    System.out.println(Book.get(i));
                    printMenu();
                }
            }
        }
            else if (choice == 2){
                System.out.println("Please enter Last Name: \n");
                String lastName = input.nextLine();
                for (int i = 0; i < Book.size(); i++) {
                    if (Book.get(i).getLastName().equals(lastName)) {
                        System.out.println(Book.get(i));
                        printMenu();
                    }
                }
            }
            else if (choice == 3){
                System.out.println("Please enter phone number: \n");
                String phone = input.nextLine();
                for (int i = 0; i < Book.size(); i++) {
                    if (Book.get(i).getPhoneNumber().equals(phone)) {
                        System.out.println(Book.get(i));
                        printMenu();
                    }
                }
            }
            else if (choice == 4){
                System.out.println("Please enter email: \n");
                String email = input.nextLine();
                for (int i = 0; i < Book.size(); i++) {
                    if (Book.get(i).getEmail().equals(email)) {
                        System.out.println(Book.get(i));
                        printMenu();
                    }
                }
            }
        
    }

    // Print out all entries in address book
    public static void printBook(){
      
        if(Book.size() == 0){
            System.out.println("Address book is empty!\n");
            printMenu();
        }
        for(int i = 0; i<Book.size(); i++){
            System.out.println("****************************");
            addressBookEntry curr = Book.get(i);
            System.out.println(curr.toString());
            System.out.println("****************************");
        }
        printMenu();
    }

    // // Remove all entries in address book
    public static void deleteBook(){
        Book.clear();
        System.out.println("Address book cleared!\n");
        printMenu();
    }

    // // Allows user to quit program
    public static void quitBook(){
        System.out.println("Quit book");
    }

    public static void main (String[] args){

        printMenu();
       

    }
}