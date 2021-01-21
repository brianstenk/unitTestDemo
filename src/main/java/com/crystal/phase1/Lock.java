package com.crystal.phase1;

public class Lock {
    private Integer keyValue;
    private boolean locked;

    public Lock(Integer keyValue) {
        this.keyValue = keyValue;
        this.locked = true;
    }

    public boolean unlock(Integer keyValue){
        if(this.keyValue == keyValue){
            locked = false;
            return true;
        }
        locked = true;
        return false;
    }

    public void lock(){
        locked = true;
    }

    public boolean isLocked(){
        return locked;
    }
    //setters and getters

    public Integer getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(Integer keyValue) {
        this.keyValue = keyValue;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
