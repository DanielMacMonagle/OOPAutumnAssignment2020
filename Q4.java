import javax.swing.JOptionPane;

public class Q4 {

    public static void main(String args[]){

        int memSize;
        int outofRange;

        
        try{
            memSize = Integer.parseInt(JOptionPane.showInputDialog("Enter Age"));

            if(memSize > 100 || memSize < 0){
                throw new IllegalArgumentException
                ("Out of range value, value must be between 0 - 100");
            }

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter a valid age");
        }





    }
    
}