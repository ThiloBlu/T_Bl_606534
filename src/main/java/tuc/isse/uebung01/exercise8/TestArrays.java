package tuc.isse.uebung01.exercise8;

import static org.junit.Assert.* ;

import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

 

public class TestArrays {
    HashSet<Integer> fehlend = new HashSet<Integer>(Set.of(1));
    HashSet<Integer> wiederholung = new HashSet<Integer>(Set.of(4));

    @Test
    public void test(){
        assertEquals(SpassMitArrays.Monat.MAI, SpassMitArrays.StringToMonat("Mai"));
        assertEquals(31, SpassMitArrays.anzahlTage(SpassMitArrays.Monat.JANUAR));
        assertEquals(4, SpassMitArrays.findeGroesstesElement(new int[]{3, 4, 4,1}));
        assertArrayEquals(new int[]{4, 4, 4, 3}, SpassMitArrays.splitEvenOdd(new int[]{4,3,4,4}));
        assertEquals(fehlend, SpassMitArrays.findeFehlendesElement (new int[]{3, 4, 4,1}, new int[]{4,3,4,4}));
        assertEquals(wiederholung, SpassMitArrays.findeWiederholung (new int[]{3, 4, 4,1}));
        assertArrayEquals(new int[]{3,4}, SpassMitArrays.findeGemeinsameElemente(new int[]{3, 4, 4,1}, new int[]{4,3,4,4}));
    }
    
}

