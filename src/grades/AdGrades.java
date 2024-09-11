
package grades;
public class AdGrades {
     String name;
    int  id;
    double p, m, pf, f;
    
    public void addGrades(String sname,int sid, double sp, double sm, double spf, double sf){ 
    this.name = sname;
   this.id = sid;
   this.p = sp;
   this.m = sm;
   this.pf = spf;
   this.f = sf;
    }
 public void viewGrades(){
     double total = this.p + this.pf + this.f;
     double avarage = total / 4;
     String remarks = (avarage > 3.0) ? "Faild" : "Passed:";
             
             
             
     System.out.printf("%-10s | %-10.2f |%-10.2f |%-10.2f |%-10.2f |%-10.2f | ", this.name, this.id, this.p, this.m, this.pf, this.f);
     
 
   
 }
}
