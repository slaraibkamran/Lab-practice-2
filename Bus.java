public class Bus{
private String busNumber;
private Seat seats[][];
private int count = 1;
Bus(){
this("BUS-101",2);

}

Bus(String busNumber, int rows){
this.busNumber = busNumber;
this.seats = new Seat[rows][4];

for(int i=0; i<rows; i++){
   for(int j=0; j<4; j++){
    seats[i][j] = new Seat(count++);}
}
}

public void displaySeats(){
for(int r=0; r<this.seats.length; r++){
System.out.print("Row "+ (r+1) + ": ");
  for(int i=0; i<4; i++){
   System.out.printf("%02d ", seats[r][i].getSeatNumber());
   if(i == 1){
     System.out.print(" || ");
 }}
System.out.println(" ");}
}

public void

}