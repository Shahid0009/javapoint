
class Staf {
    int stafid, phone, salary;
    String Name;

    public Staf(int id, int no, int sal, String name) {
        stafid = id;
        phone = no;
        salary = sal;
        Name = name;
    }

    void display() {
        System.out.println("______________________________________________________");
        System.out.println("Staf ID:" + " " + stafid);
        System.out.println("Staf Phone number:" + " " + phone);
        System.out.println("Staf salary:" + " " + salary);
        System.out.println("Staf Name:" + " " + Name);
    }
    // sub class(1) Teaching

    static class Teaching extends Staf {
        String domain;
        int no_of_application;

        public Teaching(int id, int no, int sal, String name, String d, int nop) {
            super(id, no, sal, name);
            domain = d;
            no_of_application = nop;
        }

      

        void Tdisplay() {
            System.out.println("___________________________________________________");
            System.out.println("Teaching staff details");
            super.display();
            System.out.println("DOmain:" + domain);
            System.out.println("no_of_application:" + no_of_application);
        }
    }

    // sub class(2) Technical

    static class Technical extends Staf {
        String skills;

        public Technical(int id, int no, int sal, String name, String sk) {
            super(id, no, sal, name);
            skills = sk;
        }

        void Tedisplay() {
            System.out.println("___________________________________________________");
            System.out.println("Tecnical staff details");
            super.display();
            System.out.println("skills:" + skills);
        }
    }

    // sub class(3) Contract

   static class contract extends Staf {
        int period;

        public contract(int id, int no, int sal, String name, int pe) {
            super(id, no, sal, name);
            period = pe;
        }

        void codisplay() {
            System.out.println("___________________________________________________");
            System.out.println("contract staff details");
            super.display();
            System.out.println("Period:" + period + "years");
        }

    }

    // main starts 
        public static void main(String[] args) {
            Teaching t1 = new Teaching(12, 78953, 7432  ,"shahid" , "cse", 90);
            t1.Tdisplay();
            Teaching t2 = new Teaching(12, 78953, 7432  ,"shahid" , "cse", 90);
            t2.Tdisplay();
            Teaching t3 = new Teaching(12, 78953, 7432  ,"shahid" , "cse", 90);
            t3.Tdisplay();



            Technical te1 = new Technical(23, 7894379, 89478, "ahmed", "java");
            te1.Tedisplay();
            Technical te2 = new Technical(23, 7894379, 89478, "ahmed", "java");
            te2.Tedisplay();
            Technical te3 = new Technical(23, 7894379, 89478, "ahmed", "java");
            te3.Tedisplay();



            contract co1 = new contract(34, 7894739, 789437, "ajju", 2);
            co1.codisplay();
            contract co2 = new contract(34, 7894739, 789437, "ajju", 2);
            co2.codisplay();
            contract co3 = new contract(34, 7894739, 789437, "ajju", 2);
            co3.codisplay();
        }
    

}
