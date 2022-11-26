import org.example.StringListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class StringListImplTest {
    StringListImpl stringList;
    String[] array;
    int size;

    @BeforeEach
    public void setUp() {
        stringList = new StringListImpl(10);
        array = new String[]{"kllkd", "mkdlwek", "kewjdnejkwn", "dnkjewndk", "wednwen", "dqwmldwqml", "dkenekwjdnk", null, null};
    stringList.setArray(array);
        stringList.setSize(7);
    }

    @Test
    public void getSize() {
        int sizeExpected = stringList.size();
        Assertions.assertEquals(size, sizeExpected);
    }

    @Test
    public void set() {
        stringList.set(1, "aaaaa");
        String[] expected = {"kllkd", "aaaaa", "kewjdnejkwn", "dnkjewndk", "wednwen", "dqwmldwqml", "dkenekwjdnk", null, null};
        assertThat(stringList.getArray()).isEqualTo(expected);
    }

    @Test
    public void addNotIndex() {
        stringList.add("kllkd2");
        String[] expected = {"kllkd", "mkdlwek", "kewjdnejkwn", "dnkjewndk", "wednwen", "dqwmldwqml", "dkenekwjdnk","kllkd2", null};
        assertThat(stringList.getArray()).isEqualTo(expected);
    }

    @Test
    public void addWithIndex() {
        stringList.add(1, "kllkd");
        String[] expected = {"kllkd","kllkd", "mkdlwek", "kewjdnejkwn", "dnkjewndk", "wednwen", "dqwmldwqml", "dkenekwjdnk", null};
        assertThat(stringList.getArray()).isEqualTo(expected);
    }
    @Test
    public void removeNotIndex(){
        stringList.remove("kllkd");
        String[] expected = {"mkdlwek", "kewjdnejkwn", "dnkjewndk", "wednwen", "dqwmldwqml", "dkenekwjdnk", null, null, null};
        assertThat(stringList.getArray()).isEqualTo(expected);
    }
    @Test
    public void removeWithIndex(){
        stringList.remove(1);
        String[] expected = {"kllkd", "kewjdnejkwn", "dnkjewndk", "wednwen", "dqwmldwqml", "dkenekwjdnk", null, null, null};
        assertThat(stringList.getArray()).isEqualTo(expected);
    }
    @Test
    public void containsElement(){
        boolean a =  stringList.contains("kllkd");
        Assertions.assertTrue(a);
    }
    @Test
    public void indexOf(){
       int index= stringList.indexOf("dnkjewndk");
        assertThat(index).isEqualTo(3);
    }
    @Test
    public void lastIndexOf(){
        int index= stringList.indexOf("dnkjewndk");
        assertThat(index).isEqualTo(3);
    }
    @Test
    public void isEmpty(){
        boolean b= stringList.isEmpty();
        Assertions.assertFalse(b);
    }

}
