public class Manufacturer {
    private String name;
    private String contact;

    public Manufacturer() {
    }
        public Manufacturer (String name , String contact){
            this.name = name;
            this.contact=contact;
        }
        public String getName(){
            return name;
        }
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
    }

