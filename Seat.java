public class Seat{
private int seatNumber;
private boolean reserved;

Seat(int seatNumber){
this.seatNumber = seatNumber;

}

public boolean reserve(){
this.reserved = true;
return this.reserved;}

public boolean isReserved(){
if (this.reserved == true){
 return true;}
return false;}


public int getSeatNumber(){
return this.seatNumber;}



}