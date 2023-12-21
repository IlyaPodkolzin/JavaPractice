package java4.task3;

public enum Authorisations {
    BUYER1("qwerty"),
    BUYER2("asdfgh"),
    SOME_BUYER("fffdddsaq"),
    MINT_BUYER("someCoolPassword");

    private String password;

    Authorisations(String password) {
        this.password = password;
    }

    public boolean checkIfCorrect(String password) {
        return this.password.equals(password);
    }
}
