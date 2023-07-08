 class Kittens {
    private String name;
    private String owner;
    private int age;

    public Kittens(String name,String owner){
        this.name = name;
        this.owner = owner;
        this.age = 0;


    }
public int getAge(){
    return age;
}
    public void haveBirthday(){
        age++;
    }
    public String toString(){
        return  name + "  is " + age + "  and belongs to"+ owner;
    
    }
}






public class Cats{
    public static  void main(String[] args) {
        
    Kittens kittens = new Kittens("kanyau", "Muhsyn");
    System.out.println(kittens);
        
    }
}
