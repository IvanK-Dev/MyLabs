package laba15.abstract_class;

public class Multicooker extends AbstractMulticooker {
    void switchProgram(int program) {
        switch (program){
            case 1:
                System.out.println("Готовить суп");
                break;
            case 2:
                System.out.println("Готовить кашу");
                break;
        }
        powerOff();
    }

    @Override
    public void cook() {
        System.out.println("Мультиварка готовит 1-ю программу");
        switchProgram(1);
    }
}
