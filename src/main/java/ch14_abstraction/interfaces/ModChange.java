package ch14_abstraction.interfaces;

public class ModChange extends Button{
    private boolean mod;
    @Override
    public void onPressed() {
        if (mod) {
            mod = false;
            System.out.println("냉방으로 바뀝니다.");
        } else {
            mod = true;
            System.out.println("난방으로 바뀝니다.");
        }
    }
}
