package java1;

public class String1 {



    public static void main(String1[] args) {
        String name = "Alok";
        String city = "Kolkata";
        String Area = "Airport";
        String Apartment = "  no12 ";
        char ch = ' ';
        System.out.println(city.length());
        System.out.println(city.toLowerCase());
        System.out.println(Area.toUpperCase());
        System.out.println(Apartment.trim());
        System.out.println(name + ch + "A");
        System.out.println(name.substring(7));
        System.out.println(name.replace('k', 'o'));
        System.out.println(name);
        System.out.println(city.charAt(4));
        System.out.println(city.equals(Area));
    }
}
