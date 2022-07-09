public class PersonFactory {

    public static Person createPerson(String type, String msg){
        Person p = null;
        if(type.equalsIgnoreCase("male")){
            p = new Male();
        } else if (type.equalsIgnoreCase("Female")) {
            p = new Female();
        }

        p.wish(msg);

        return p;
    }

}
