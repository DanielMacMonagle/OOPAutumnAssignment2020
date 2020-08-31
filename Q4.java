import javax.swing.JOptionPane;

public class Q4 {

    public static void main(String args[]){

        int memSize;

        
        try{
            memSize = Integer.parseInt(JOptionPane.showInputDialog("Enter Age"));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter a valid age");
        }



    }
    
}