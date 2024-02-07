package task4.q2;
public class VoterAge {
        int voterId;
        String name;
        int age;

        public VoterAge(int voterId, String name, int age) {
            this.voterId = voterId;
            this.name = name;
            this.age = age;
        }
        public void ageCheck(){
            try{
                if (age<18){
                    System.out.println("Invalid age for voter");
                }
                else{
                    System.out.println("valid age");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

    }

