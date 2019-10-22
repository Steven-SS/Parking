public class Variables {

    public enum ActStatus {
        ACTIVE, BLOCKED, UNKNOWN
    }

    public enum TicketStatus {
        ACTIVE, PAID, LOST
    }

    public class Address {
        private String streetaddr;
        private String zip;
        private String city;
        private String state;
        private String country;
    }

    public class Person {
        private String name;
        private Address addr;
        private String phone;
        private String email;

    }
}
