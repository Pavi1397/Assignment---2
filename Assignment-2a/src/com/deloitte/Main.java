package com.deloitte;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID,Name, Showdate, Showtime, Status");
			int id1 = sc.nextInt();
			String mname1 = sc.next();
			String date1 = sc.next();
			String time1 = sc.next();
			String status1 = sc.next();
			Movie m = new Movie(id1,mname1,date1,time1,status1);
			System.out.println("Enter ID,Name, Showdate, Showtime, Status");
			int id2 = sc.nextInt();
			String mname2 = sc.next();
			String date2 = sc.next();
			String time2 = sc.next();
			String status2 = sc.next();
			Movie m2 = new Movie(id2,mname2,date2,time2,status2);
			
			ArrayList<Movie> mov1=new ArrayList<Movie>();
			mov1.add(m);
			mov1.add(m2);
			
			System.out.println("Enter Movie ID to display movie details");
			
			int choice = sc.nextInt();
			switch (choice) {
			case 101 :
					System.out.println(mov1.get(0));
				break;
			case 102 :
					System.out.println(mov1.get(1));
				break;
			default : 
				System.out.println("Invalid ID");
			}
			sc.close();
		}

	}



