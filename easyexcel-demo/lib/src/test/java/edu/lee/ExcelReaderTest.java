/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.lee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExcelReaderTest {
    @Test void testReadExcel() throws Exception {
        File excel = new File(ExcelReaderTest.class.getClassLoader().getResource("./test.xlsx").toURI());
        ExcelReader reader = new ExcelReader(excel);
        reader.readAll();

        List<String> heads = reader.getHeads();
        System.out.println("head -> " + heads);

        List<ExcelData> rows = reader.getRows();
        for(ExcelData row : rows){
            System.out.println("row -> " + row);
        }

        assertAll(
                () -> assertNotNull(heads),
                () -> assertEquals(3, heads.size()),
                () -> assertNotNull(rows),
                () -> assertEquals(2, rows.size())
        );
    }
}
