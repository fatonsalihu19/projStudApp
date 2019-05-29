public class Maker {
   public int nrS=100;
   public int[] id = new int[nrS];
   private String[] emri =new String[nrS];
   private String[] mbiemri = new String[nrS];
   public Student[] stud = new Student[nrS];
   private Input inp= new Input();
   String e="";
    public Maker() {}
	//RegN ben Lidhjen e Cdo emri dhe mbiemri te studentit duke krijuar Obijekt per secilin Student
   public void RegN() {
      for(int i = 0 ; i<id.length;i++) {
         if(stud[i]==null) {
            this.Reg();
            if(e.equals("S")) { 
               break;
            }
         }
         else {
            continue;}
         stud[i]= new Student(id[i],emri[i],mbiemri[i]);	
      }
   }  
	//Regjistrimi i Nxensave
   public void Reg() {
      e= inp.getString("Regjistro \n Sheno Emri e Studentit \n S-Ndalo Regjistrimin e Studenteve");
      if(!e.equals("S")) {
         String m= inp.getString("Regjistro \n Sheno Mbiemri e Studentit");
      
         for(int i = 0; i<nrS;i++) {
         
            id[i]=i+1;
            emri[i]=e;
            mbiemri[i]=m;
         }
      }
   } 
 //Lista Paraqet Studentet
   public String Lista() {
      String s = "";
      for(int i=0; i<stud.length; i++)
      { 
         if(stud[i]==null) {
         		  
            continue;		   
         }
         s=s+stud[i].getF()+"\n";
      }
      return s;
   }
	//StudentAction sherben per t'ia vedosur nxenseve noten ne ndonje lende
   public String studentAction()
   {
      int a=inp.getNr("Sheno Id e studentit");
      if(stud[a-1]==null) {
         return "Studenti nuk Ekziston";}
      String sb= inp.getString("Cilen nga lendet po deshiron me ja vendos noten \n 1.Diskrete \n 2.Elementare \n 3.Programim \n 4.Hyrje \n 5.Anglisht");
      int b=0;
      int c= inp.getNr("Sheno noten \"6-10\""); 
      if(c<5||c>10) { c= inp.getNr("Sheno noten perseri \"6-10\""); }
      if(sb.equals("D")||sb.equals("1")) {b=1;}
      else if(sb.equals("E")||sb.equals("2")){b=2;}
      else if(sb.equals("P")||sb.equals("3")){b=3;}
      else if(sb.equals("H")||sb.equals("4")){b=4;}
      else if(sb.equals("A")||sb.equals("5")){b=5;}
   
      stud[a-1].notat[b-1]=c; 
      return (stud[a-1].getF()+", "+stud[a-1].lendet[b-1]+", "+stud[a-1].notat[b-1]);
   }
	//seeGrades sherben per tia par te gjitha notat stidentit
   public String seeGrades() {
      int a= inp.getNr("Sheno Id e Studentit per tia shiquar notat");
      if(stud[a-1]==null) {
         return "Studenti nuk Ekziston";}
      return (stud[a-1].getF()+"\n"+"\n Lendet dhe Notat"+"\n "+stud[a-1].lendet[0]+"---"+stud[a-1].notat[0]+
         	"\n "+stud[a-1].lendet[1]+"---"+stud[a-1].notat[1]+
         	"\n "+stud[a-1].lendet[2]+"---"+stud[a-1].notat[2]+
         	"\n "+stud[a-1].lendet[3]+"---"+stud[a-1].notat[3]+
         	"\n "+stud[a-1].lendet[4]+"---"+stud[a-1].notat[4]);
   }
	//Aberage Sherben per gjetjen e notes mesatare
   public String Average() {
   	
      int a= inp.getNr("Sheno Id e Studentit per tia shiquar noten Mesatare");
      if(stud[a-1]==null) {
         return "Studenti nuk Ekziston";}
      return stud[a-1].getF()+" "+((stud[a-1].notat[0]+stud[a-1].notat[1]+stud[a-1].notat[2]+stud[a-1].notat[3]+stud[a-1].notat[4])/stud[a-1].notat.length)+
         	"."+((stud[a-1].notat[0]+stud[a-1].notat[1]+stud[a-1].notat[2]+stud[a-1].notat[3]+stud[a-1].notat[4])%stud[a-1].notat.length);
   
   }
	
   public void deleteStudent() {
      int a= inp.getNr("Sheno Id e Studentit per fshir")-1;
      for(int i = 0; i <stud.length; i++)
      {
         if(i==a) {
            stud[i]=null;
         	
         }
      }
   }
}

