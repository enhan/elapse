package eu.enhan.elapse.core.process.design;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

import static eu.enhan.elapse.core.process.design.StepTypeToken.*;
import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: manu
 * Date: 12/31/12
 * Time: 11:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class SequenceTypeBuilderTest {

    @Test
    public void creatingBasicSequence(){

        // Given
        SequenceType seq = new SequenceTypeBuilder().addStep(customType("TYPE1")).addStep(customType("TYPE2")).addStep(customType("TYPE3")).build();

        // Then
        assertNotNull(seq);
        Iterator<StepTypeToken> it = seq.getSequence().iterator();
        assertEquals("TYPE1",it.next().getStepTypeName());
        assertEquals("TYPE2",it.next().getStepTypeName());
        assertEquals("TYPE3",it.next().getStepTypeName());



    }
}
