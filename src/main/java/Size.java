public enum Size {
    S("this is a small"),
    M("this is a medium"),
    L(" "),
    X("");

private final String description;


    Size(String description) {
        this.description = description;
    }



    public String getDescription() {
        return description;
    }
}
