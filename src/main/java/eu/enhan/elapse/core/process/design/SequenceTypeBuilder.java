package eu.enhan.elapse.core.process.design;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

import static com.google.common.base.Preconditions.*;

/**
 * Build a sequence type which will then be interpreted as a sequence order by the engine
 */
public class SequenceTypeBuilder {


    private final ImmutableList.Builder<StepTypeToken> seqBuilder = ImmutableList.builder();


    public SequenceTypeBuilder addStep(StepTypeToken stepToken){
        checkNotNull(stepToken);
        seqBuilder.add(stepToken);
        return this;
    }

    public SequenceType build(){
        return  new SequenceType(seqBuilder.build());
    }




}
