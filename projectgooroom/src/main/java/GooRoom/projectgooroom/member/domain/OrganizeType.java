package GooRoom.projectgooroom.member.domain;

public enum OrganizeType {
    NOW(0),
    TODAY(1),
    TOMORROW(2);

    private final int value;

    OrganizeType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
