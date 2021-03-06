import javax.swing.JOptionPane;
import java.util.ArrayList; // import the ArrayList class
import javax.swing.*; // importing javax swing for jtext area.

public class VehicleDriver {

              //creating UI jframe/jtextarea for displaying cars older than 10.
              JFrame displayCars = new JFrame();
              JTextArea carsDisplay = new JTextArea("Cars Collection older than 10");
             
    public static void main(String[] args) throws Exception {
        //store age of car.
          int age;
          //storing answer in  int form.  
          int answer;

          //creating arraylist to store the cars of type car.
          ArrayList<Car> cars = new ArrayList<Car>(); 


          answer = JOptionPane.showConfirmDialog(null, "Would you like to create a car");


          //while the option clicked is not no
          while (answer != JOptionPane.NO_OPTION) {
            Car c1 = new Car();
            age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age"));
            //set age of car
            c1.setAge(age);
            //add car to cars arraylist collection.
            cars.add(c1);
            //ask user do they wish to add another  car.
            answer = JOptionPane.showConfirmDialog(null, "Would you like to enter another car");
        }

        //outputing cars from the arraylist collection.
        JOptionPane.showMessageDialog(null, "Here is the ages of cars from arraylist collection" + cars);



        //using for each loop to loop over cars in our collection.
         for (Car carsCollection : cars) {
            //tracking cars
            System.out.println( carsCollection);
        }


        //calling over 10 years class.
        over10Years(cars);
        
}

        //displaying all car objects which are older than 10.
        public static void over10Years(ArrayList<Car> cars) {

            //creating new arraylist to store cars
            ArrayList<Car> carsOver10Years = new ArrayList<>();
     
        
            //using enhanced for loop to loop over orginal car collection.
            for (Car carsOver10 : cars) {
                if (carsOver10.getAge() > 10) {
                    //add cars over 10 years to new arraylist.
                    carsOver10Years.add(carsOver10);
                }
                        
            }   

                          //creating UI jframe/jtextarea for displaying cars older than 10.
                JFrame displayCars = new JFrame();
                JTextArea carsDisplay = new JTextArea("Cars Collection older than 10");
             
            
                //append arraylist to jtext area
                carsDisplay.setSize(200, 200);
                displayCars.setLocationRelativeTo(null);
                    //add cars Display to jframe.
                displayCars.add(carsDisplay);
                carsDisplay.setText(carsOver10Years.toString());
            
                //show the jframe
                displayCars.setVisible(true);
        }




      //return the oldest objects in the collection.
      
        



}
