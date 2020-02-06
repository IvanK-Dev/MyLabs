package laba15.abstract_class;

 class Mobile extends Phone {
    private int simCount;
    private String display;

    @Override
    void call() {
       System.out.println("Выбираем контакт из меню, звоним");
    }

    @Override
    void powerOn() {
       System.out.println("Зажимаем кнопку включения. Мобильный телефон запускается.");
    }

    @Override
    public void powerOff() {
       System.out.println("Зажимаем кнопку включения. Мобильный телефон выключается.");

    }
}
