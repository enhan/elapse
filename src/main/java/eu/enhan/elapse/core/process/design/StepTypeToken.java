package eu.enhan.elapse.core.process.design;

import com.google.common.base.Preconditions;

import static com.google.common.base.Preconditions.*;

/**
 *
 */
public final class StepTypeToken {

    public enum StepType{
        CUSTOM
    }


    public static StepTypeToken customType(String stepTypeRef){
        return new StepTypeToken(stepTypeRef);
    }

    public static StepTypeToken buildInType(StepType type){
        return new StepTypeToken(type);
    }

    private final StepType type;
    private final String name;

    private StepTypeToken(StepType type) {
        checkNotNull(type);
        checkArgument(type !=  StepType.CUSTOM);
        this.type = type;
        this.name = null;
    }

    private StepTypeToken(String refId){
        checkNotNull(refId);
        this.type = StepType.CUSTOM;
        this.name = refId;
    }

    /**
     * Indicates whether the type token is custom or build in
     * @return
     */
    public boolean isBuildIn(){
        return type != StepType.CUSTOM;
    }

    public StepType getType() {
        return type;
    }

    public String getStepTypeName(){
        return isBuildIn() ? type.toString() : name;
    }





}
