package me.bakuleva.coursework3.model;

public enum Size {
    XS(20),
    S (25),
    M (30),
    L (40),
    XL(46);
    private final int value;

    Size(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Size getValueByDigits(float size) {
        for (Size sizeObj :
                Size.values()) {
            if (sizeObj.value == size){
                return sizeObj;
            }
        }
        return null;
    }
}

