/**
 * @author Celyn Johns - jvjohns1
 *  CIS175 - FALL 2023
 *  ${date}
 */

import java.util.List;
import java.util.Scanner;
import controller.ListBookHelper;
import model.ListBook;

public class StartProgram {
	// create scanner and make ListBookHelper
	static Scanner in = new Scanner(System.in);
	static ListBookHelper lih = new ListBookHelper();

	// add a book
	private static void addABook() {
		// get title and author
		System.out.print("Enter a title: ");
		String title = in.nextLine();
		System.out.print("Enter an author: ");
		String author = in.nextLine();

		// Create a ListBook object
		ListBook toAdd = new ListBook(title, author);

		// Insert the ListBook object into the database
		lih.insertBook(toAdd);
	}

	// delete a book
	private static void deleteABook() {
		// get the title and author
	    System.out.print("Enter the Title to delete: ");
	    String title = in.nextLine();
	    System.out.print("Enter the Author to delete: ");
	    String author = in.nextLine();
	    
	    // create a ListBook object
	    ListBook toDelete = new ListBook(title, author);

	    // Call the deleteBook method to remove the book from the database
	    lih.deleteBook(toDelete);
	}
	
	// edit a book
	private static void editABook() {
		// get the author and title
		System.out.println("How would you like to search? ");
		System.out.println("1 : Search by Title");
		System.out.println("2 : Search by Author");
		int searchBy = in.nextInt();
		in.nextLine();

		// search for the books
		List<ListBook> foundBooks;
		if (searchBy == 1) {
			System.out.print("Enter the Title: ");
			String titleName = in.nextLine();
			foundBooks = lih.searchForBookByTitle(titleName);
		} else {
			System.out.print("Enter the Author's Name: ");
			String authorName = in.nextLine();
			foundBooks = lih.searchForBookByAuthor(authorName);
		}
		
		// if the book exists
		if (!foundBooks.isEmpty()) {
			System.out.println("Found Results.");
			for (ListBook l : foundBooks) {
				System.out.println(l.getId() + " : " + l.toString());
			}
			System.out.print("Which ID to edit: ");
			int idToEdit = in.nextInt();
			in.nextLine();

			ListBook toEdit = lih.searchForBookById(idToEdit);
			System.out.println("Retrieved " + toEdit.getTitle() + " by " + toEdit.getAuthor());
			System.out.println("1 : Update Title");
			System.out.println("2 : Update Author");
			int update = in.nextInt();
			in.nextLine();

			if (update == 1) {
				System.out.print("New Title: ");
				String newTitle = in.nextLine();
				toEdit.setTitle(newTitle);
			} else if (update == 2) {
				System.out.print("New Author: ");
				String newAuthor = in.nextLine();
				toEdit.setAuthor(newAuthor);
			}
			lih.updateBook(toEdit);
		} else {
			System.out.println("---- No results found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runMenu();
	}
	
	// create a menu 
	public static void runMenu() {
		boolean goAgain = true;
		System.out.println("--- Welcome to the Book Store Catelog! ---");
		while (goAgain) {
			System.out.println("* Select an item:");
			System.out.println("* 1 -- Add a book");
			System.out.println("* 2 -- Edit a book");
			System.out.println("* 3 -- Delete a book");
			System.out.println("* 4 -- View the list");
			System.out.println("* 5 -- Exit the Catelog");
			System.out.print("* Your selection is: ");
			int selection = in.nextInt();
			in.nextLine();

			if (selection == 1) {
				addABook();
			} else if (selection == 2) {
				editABook();
			} else if (selection == 3) {
				deleteABook();
			} else if (selection == 4) {
				viewTheList();
			} else {
				lih.cleanUp();
				System.out.println(" Goodbye! ");
				goAgain = false;
			}
		}
	}
	
	// view the list
	private static void viewTheList() {
		List<ListBook> allBooks = lih.showAllBooks();

		for (ListBook singleBook : allBooks) {
			System.out.println(singleBook.returnBookDetails());
		}
	}
}
