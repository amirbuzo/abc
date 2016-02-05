package org.abc.typecheck;

public abstract class Record {
    protected String identifier;

    protected String type;

    public Record(String identifie, String types) {
        identifier = identifie;
        type = types;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;

    }

    public boolean equals(Record record) {
        if (this.identifier.equals(record.getIdentifier()))
            return true;
        else
            return false;
    }

    public String toString() {
        return this.identifier + this.type;
    }

}
