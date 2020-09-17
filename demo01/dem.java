package mod.one;

public class Demo1 {

    public static void main(String[] args){
      //  person per =new person();
        System.out.println("++++++++++++");
        person per =new person("赵丽颖",20);
        System.out.println("姓名："+per.getName()+",年龄"+per.getAge());
         per.setAge(22);
        System.out.println("姓名："+per.getName()+",年龄："+per.getAge());

    }
}
