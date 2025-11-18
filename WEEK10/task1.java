class Person {
    String name;
    int phone;

    public Person(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }
    

    class Address { //Inner class and non static so belongs to a specific person
        int house_no;
        String street;
        String city, state;

        public Address(int house_no, String street, String city, String state) {
            this.house_no = house_no;
            this.street = street;
            this.city = city;
            this.state = state;
        }

        void displayAddr() {
            System.out.println("Address: " + house_no + ", " + street + ", " + city + ", " + state);
        }
    }

    class DateOfBirth {     //Inner class
        int day, month, year;

        DateOfBirth(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        void displayDOB() {
            System.out.println("Date of Birth: " + day + "/" + month + "/" + year);
        }
    }

    void display(Address addr, DateOfBirth dob) {
        System.out.println("Name = " + name);
        System.out.println("Phone = " + phone);
        addr.displayAddr();
        dob.displayDOB();
    }

    public static void main(String[] args) {
        Person p = new Person("Atika", 753684494);

        Person.Address obj1 = p.new Address(12, "Umeshpuri", "Narora", "U.P");
        Person.DateOfBirth obj2 = p.new DateOfBirth(30, 10, 2004);

        p.display(obj1, obj2);
    }
}

