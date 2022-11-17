import house.Flat;
import house.Hostel;
import house.Hotel;
import house.Person;

public class Main {
    public static void main(String[] args) {

        // 1. Уй-булолор квартирада, общежитиеде жана гостиницада жашашат
        //2. Квартирада жашагандар ком услуга толошот
        //3. Общежитие менен гостиницада жашагандар аренда толошот
        //4. Уй-булолор бир канча адамдан турушат
        //5. Кайсы жерде канча адам жашаганын консольго чыгарыныз
        //6. Жашоо демек озунун адресин корсотуу
        //Hint: кыймыл аракеттерди интерфейс аркылуу реализация кыласыздар,квартира бул класстар,
        // уй було бул массив, адам бул класс.

        Person person1 = new Person("Bolot",23);
        Person person2 = new Person("Bektemir",15);
        Person person3 = new Person("Fatima",20);
        Person person4 = new Person("Aisha",35);
        Person person5 = new Person("Abdulahad",10);

        Hostel hostel = new Hostel("Ihlas",250,new Person[]{person1,person2});
        Flat flat = new Flat("Yntymak",4,new Person[]{person1,person2,person3});
        Hotel hotel = new Hotel("Amir",20,new Person[]{person1,person2,person3,person4});

        System.out.println(flat);
        flat.comUsluga(flat.getPeople());
        flat.livePerson();

        System.out.println(hostel);
        hostel.arenda(hostel.getPeople());
        hostel.livePerson();

        System.out.println(hotel);
        hotel.arenda(hotel.getPeople());
        hotel.livePerson();




    }
}