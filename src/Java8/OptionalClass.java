package Java8;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args){

        String st=null;
//      System.out.println(st.length()); // to avoid this kind of erro

//        Optional<String> s=Optional.of(null); // still null pointer error
//        System.out.println(s.get().length());

        Optional<String> str=Optional.ofNullable("Hello DM");
        if(str.isPresent()){
            System.out.println(str.get());
        }else{
            System.out.println("Null value");
        }


        Optional<String> name=Optional.ofNullable("Dipak Mundhe");
        Optional<String> capitalName=name.map(String::toUpperCase);
        System.out.println(capitalName.get());

        //getName by ID
        Optional<String> myName=getName(2);
        if(myName.isPresent()){
            System.out.println(myName.get());
        }else{
            System.out.println("User not found!");
        }
    }

    public static Optional<String> getName(int id){
        if(id==1){
            return Optional.of("Diapk Mundhe");
        }else{
            return Optional.empty();
        }
    }
}
