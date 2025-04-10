import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
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
         list.add("X");
         list.add("Y");
         list.add("Z");
         // Assert
         assertEquals(3, list.size());
         assertEquals("X", list.get(0));
         assertEquals("Y", list.get(1));
         assertEquals("Z", list.get(2));
     }
 
     @Test
     void testRemoveStringAtGivenIndex() {
         // Arrange
         DynamicStringList list = new DynamicStringList();
         list.add("Person");
         list.add("Beta");
         // Act
         String removed = list.remove(1);
         // Assert
         assertEquals("Beta", removed);
         assertEquals(1, list.size());

     }
 
     @Test
     void testCurrentElementsInString   () {
         // Arrange
         DynamicStringList list = new DynamicStringList();
         list.add("me");
         list.add("him");
         list.add("her");
         // Act
         
         // Assert
         assertEquals("me", list.get(0));
         assertEquals("him", list.get(1));
         assertEquals("her", list.get(2));
     }
 
     @Test
     void testMaxCapacityOfArray() {
         // Arrange
         DynamicStringList list = new DynamicStringList();
         // Act
         for (int i = 0; i < 10; i++) {
            list.add("Item" + i);
         }
         
         // Assert
         assertTrue(list.capacity() >=10);

         assertEquals(10, list.size());
         assertEquals("Item0", list.get(0));
     }
 
 
 }