package Classroom;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Volunteer extends Employee {
    public Volunteer(String Info) {
        String[] parts =Info.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
/*            Scanner scan = new Scanner(Info);
            scan.useDelimiter(",");
            scan.next();
            this.setFirstName(scan.next());
            this.setLastName(scan.next());
            this.setAddress(scan.next());
            this.setPhone(scan.next());
            this.setSalary(scan.nextDouble());
            this.setBonus(scan.nextDouble());
            this.setCategory(scan.next());
            this.setEmployeeType(scan.next());
            if(scan.hasNext()){
                DateFormat formatter = new SimpleDateFormat("dd'th' MMM, yyyy", Locale.ENGLISH);
                Date date;
                try {
                    date = formatter.parse(scan.next());
                    this.setBonusDate(date);
                } catch (ParseException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
  */        
        this.setEmpID(Integer.parseInt(parts[0]));
        this.setFirstName(parts[1]);
        this.setLastName(parts[2]);
        this.setAddress(parts[3]);
        this.setPhone(parts[4]);
        this.setSalary(Integer.parseInt(parts[5]));
        if(parts[6].length()>0){
        this.setBonus(Integer.parseInt(parts[6]));
        }
        this.setCategory(parts[7]);
        this.setEmployeeType(parts[8]);

        if(!parts[9].isEmpty()){
            DateFormat formatter = new SimpleDateFormat("dd'th' MMM, yyyy", Locale.ENGLISH);
            Date date;
            try {
                date = formatter.parse(parts[9]);
                this.setBonusDate(date);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    @Override
    public IEmployee getEmployee() {

            // TODO Auto-generated method stub
            return this;
    }

    @Override
    public Iperson getPerson() {
        return this;
    }

    @Override
    public double claculateGrossSalary(TimeSheet t){
      return 0;  
    }
    
}
