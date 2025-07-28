package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class TicketBooking {
	
	static int totalSeats =3, WaitingList=3 , upper=1, lower=1,
			middle=1, pId=0;
	static List<Passenger> BkdPasnList = new ArrayList<>();
	static List<Passenger> WtgPasnList = new ArrayList<>();
	
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	String choiceString ="Y";
    	while(choiceString.equalsIgnoreCase("Y")) {
    	System.out.println("Welcome to Train Booking\n1.Book ticket\n2.Cancel Ticket \n3.View ticket");
    	int choice= s.nextInt();
    	s.nextLine();
    	switch(choice){
    		case 1:
    			System.out.println("Enter Your Full Name :");
    			String name = s.nextLine();
    			System.out.println("Enter Your Prefered-Berth as [UPPER, LOWER ,MIDDLE] only");
    			String prefBerth = s.nextLine();

    		    prefBerth = prefBerth.trim().replaceAll("\\s+", "").toUpperCase();
//Passenger p = new Passenger(pid,name,Berth.valueOf(prefBerth));

    			Passenger p = new Passenger();
    			p.setName(name);
    			p.setpId(++pId);
    			p.setPrefBerth(Berth.valueOf(prefBerth));
    			bookTicket(p);
    			break;
 
    		case 2:
    			 System.out.println("Please enter id to cancel");
                  int pid = s.nextInt();
                  cancelTicket(pid);
                  break;    
    		case 3:
  			  System.out.println("Booked pasn" + BkdPasnList);
			  System.out.println("Waitinglist pasn" + WtgPasnList);
			  break;
    		default:
    			choiceString = "N";
                break;
    	}	
	}
    }
	private static void bookTicket(Passenger p) {

		if(totalSeats >0) {
			allocateBerth(p);
            System.out.println("Ticket Booked! Your Allocated Berth: " + p.getAllocatedBerth());
			BkdPasnList.add(p);
			totalSeats--;	
		}else if(WaitingList >0 ) {
			WtgPasnList.add(p); 
            System.out.println("Added to Waiting List");
			WaitingList--;
		}else {
			System.out.println("---Regret---");
			System.out.println("Available seats and Waiting List are FULLY BOOKED...");
		}

	}
	
	private static void allocateBerth(Passenger p) {
		switch(p.getPrefBerth()) {	
		case UPPER:
			if ( upper>0) {
				p.setAllocatedBerth(Berth.UPPER);
				upper--;
			}
		case LOWER:
			if (p.getAllocatedBerth()==null && lower>0) {
				p.setAllocatedBerth(Berth.LOWER);
				lower--;
			}
		case MIDDLE:
			if (p.getAllocatedBerth()==null && middle>0) {
				p.setAllocatedBerth(Berth.MIDDLE);
				middle--;
			}
			else if(p.getAllocatedBerth()==null && upper>0) {
				p.setAllocatedBerth(Berth.UPPER);
				upper--;
			}
			else if(p.getAllocatedBerth()==null && lower>0) {
				p.setAllocatedBerth(Berth.LOWER);
				lower--;
			}
		}		
	}
	private static void cancelTicket(int pid) {
		
	    Optional<Passenger> bkdPassenger = BkdPasnList.stream().filter(e -> e.getpId()==pid).findFirst();
        if(bkdPassenger.isEmpty()){
            System.out.println("Invalid passenger id");
        }else{
            if(WtgPasnList.isEmpty()){
                totalSeats++;
                increaseSeatsBaseBerth(bkdPassenger.get());
            }else{
            	WtgPasnList.get(0).setAllocatedBerth(bkdPassenger.get().getAllocatedBerth());
            	BkdPasnList.add(WtgPasnList.get(0));
                WtgPasnList.remove(0);
                WaitingList++;
            }
            BkdPasnList.removeIf(e->e.getpId()==pid);
        }
    }
	private static void increaseSeatsBaseBerth(Passenger p) {
		// TODO Auto-generated method stub
		switch(p.getAllocatedBerth()) {
		case UPPER:
			upper++;
			case LOWER:
				lower++;
				case MIDDLE:
					middle++;
		}
		
	}
		
	}
