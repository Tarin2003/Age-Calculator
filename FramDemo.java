package framdemo;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FramDemo extends JFrame{
    private JLabel title, n,mon,ye,da,current;
    private JButton Calculate;
    
    private JTextField y,m,d,name,year,month,day,ctf,k;
    private Container c;
     
    
    int birth_year,birth_day,birth_month;
   int Current_year,Current_month,Current_day;
    FramDemo()
    {
        initComponents();     
    }
    void initComponents()
    { 
       
        this.setTitle("Age calculate");
        c = this.getContentPane();
        c.setLayout(null);
       
        Font font = new Font("Arial",Font.BOLD,24);
        title = new JLabel("Age Calculator");
        title.setFont(font);
        title.setBounds(500, 10, 300, 50);
        c.add(title);
        
         n = new JLabel("Name");
        n.setFont(font);
        n.setBounds(140, 80, 250, 50);
        c.add(n); 
        name = new JTextField(" ");
        name.setFont(font);
        name.setBounds(320, 80, 500, 50);
        c.add(name);
        
        ye = new JLabel("Year of birth");
        ye.setFont(font);
        ye.setBounds(140, 150, 250, 50);
        c.add(ye);
        year = new JTextField();
        year.setFont(font);
        year.setBounds(320, 150, 500, 50);
        c.add(year);
        
         mon = new JLabel("Month of birth");
        mon.setFont(font);
        mon.setBounds(140, 220, 250, 50);
        c.add(mon);
         month = new JTextField("");
        month.setFont(font);
        month.setBounds(320, 220, 500, 50);
        c.add(month);
        
         da = new JLabel("Day of birth");
        da.setFont(font);
        da.setBounds(140, 290, 250, 50);
        c.add(da);
         day = new JTextField("");
        day.setFont(font);
        day.setBounds(320, 290, 500, 50);
        c.add(day);
        
        
        LocalDate currentDate = LocalDate.now();
      Current_year = currentDate.getYear();
    Current_month = currentDate.getMonthValue(); 
      Current_day = currentDate.getDayOfMonth();
        
         current = new JLabel("Current date");
        current.setFont(font);
        current.setBounds(140, 360, 150, 50);
        c.add(current);
         ctf = new JTextField(Integer.toString(Current_day)+"-"+Integer.toString(Current_month)+"-"+Integer.toString(Current_year));
        ctf.setFont(font);
        ctf.setBounds(320, 360, 500, 50);
        ctf.setEditable(false);
        
        c.add(ctf);
        
       Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
         
        Calculate = new JButton("Calculate Age");
        Calculate.setFont(font);
        Calculate.setBounds(320, 500, 500, 50);
        Calculate.setCursor(cursor);
        c.add(Calculate);
        
       
      
          
              
          k = new JTextField("");
        
        k.setFont(font);
        k.setBounds(140,600,700, 50);
       k.setEditable(false);
      
        c.add(k);   
        
        Calculate.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               
          
       
       
        
         
        birth_year = Integer.parseInt(year.getText());
         birth_month = Integer.parseInt(month.getText());
          birth_day = Integer.parseInt(day.getText());
    
        if(birth_day>Current_day){
          Current_day = Current_day + 30  ;
          Current_month = Current_month-1;
        }
         if(birth_month>Current_month){
            Current_month = Current_month +12;
            Current_year = Current_year -1;
        }
            
       int Year = Current_year - birth_year;
      int Month = Current_month - birth_month;
       int Day = Current_day - birth_day;
        k.setText(name.getText()+" Your Age :  "+Integer.toString(Year)+" Year "+Integer.toString(Month)+" Month "+Integer.toString(Day)+" Day");
     
    }      
        });
        
    }    
        
    
    public static void main(String[] args) {
        FramDemo  frame = new FramDemo();
        frame.setVisible(true);   
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(1,1,1100, 1000);
    }   
}



