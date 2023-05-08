package models.mod01mod09;
 
import java.lang.reflect.Field; 
import java.util.Arrays;
import java.util.List;

public class FieldQuestionPrinter {
    public static void main() {
        // Create a list of your objects
        List<Object> objects = Arrays.asList(
                new Accounts(),
                new Person(),
                new Users()
        );
        // Print field questions for each object
        for (Object object : objects) {
            System.out.println("Object: " + object.getClass()
            .getSimpleName());
            printFieldQuestions(object);
            System.out.println();
        }
    }

    public static void printFieldQuestions(Object object) {
        // Get the class of the object
        Class<?> objectClass = object.getClass();
        // Get all the fields of the object's class
        Field[] fields = objectClass.getDeclaredFields();
        // Iterate over the fields and print out the questions
        for (Field field : fields) {
            // Get the field's type and name
            Class<?> fieldType = field.getType();
            String fieldName = field.getName();
            // Print out the question
            System.out.printf("What is the %s of"
            		+ " the [%s] field?%n", fieldType
            		.getSimpleName(),
            		fieldName);
        }
    }
}
