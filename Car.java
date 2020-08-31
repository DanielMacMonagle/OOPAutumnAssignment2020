public class Car implements Vehicle {

        //int age attribute put it as protected only to be accessed in subclasses.
        protected int age;

        //count for the number of instances
        private static int countingInstances;


        //contstructor method.,
        public Car(int age) {
            //used for parent class ie vehicle.
            this.age = age;

            //counting the number of instances when class is instantiated.
            countingInstances++;
        }

        public Car(){
            this(0);
        }


    @Override
    public int getAge() {
        // TODO Auto-generated method stub
        return age;
    }

    @Override
    public void setAge(int age) {
        // TODO Auto-generated method stub
        this.age = age;
 
    }


    //method to return the number of instances of class
    public static int getCarInstances(){
        return countingInstances;
    }

    //toString method to return age.
    public String toString()
    {
        return "\nAge :" + getAge();
    }


    
}