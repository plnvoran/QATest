package XstreamList;



import com.thoughtworks.xstream.XStream;
 
public class Hello {
 
    public static void main(String[] args) {
 
        XStream xstream = new XStream();
        String salutation = "Hello, World!";
        String xml = xstream.toXML(salutation);
        System.out.print(xml);
        Person person = new Person();
        xml = xstream.toXML(person);
        System.out.println(xml);
    }
 
    static class Person {
 
        public String name;
 
        public Person() {
            this.name = "I am string";
        }
    }
}
