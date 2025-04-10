import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 
 public class DynamicStringListTest {
     
     @Test
    void testReturnStringAtSpecifiedIndex() {
         // Arrange
         DynamicStringList list = new DynamicStringList();
         list.add("Hello");
         list.add("World");
         // Act
         String result = list.get(1);
         // Assert
         assertEquals("World", result);
     }
 
     @Test
     void testReplacingStringAtGivenIndexWithGivenValue() {
         // Arrange
        DynamicStringList list = new DynamicStringList();
         // Act
         list.add("dog");
         list.set(0, "Cat");
         // Assert
         assertEquals("Cat", list.get(0));
     }
 
     @Test
     void testAddNewStringToEndOfList() {
         // Arrange
         DynamicStringList list = new DynamicStringList();
         // Act
         // Assert
     }
 
     @Test
     void testRemoveStringAtGivenIndex() {
         // Arrange
         // Act
         // Assert
     }
 
     @Test
     void testCurrentElementsInString   () {
         // Arrange
         // Act
         // Assert
     }
 
     @Test
     void testMaxCapacityOfArray() {
         // Arrange
         // Act
         // Assert
     }
 
 
 }