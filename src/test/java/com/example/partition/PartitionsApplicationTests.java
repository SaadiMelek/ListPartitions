package com.example.partition;

import com.example.partition.utils.Practitioner;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PartitionsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void partitionList_nominalTest() {
        List<Integer> intList = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<List<Integer>> partitions = Practitioner.partition(intList, 3);
        assertNotNull(partitions);
        assertEquals(4, partitions.size());
        assertNotNull(partitions.get(0));
        assertEquals(3, partitions.get(0).size());
        assertNotNull(partitions.get(3));
        assertEquals(1, partitions.get(3).size());
        System.err.println(partitions);
    }

}
