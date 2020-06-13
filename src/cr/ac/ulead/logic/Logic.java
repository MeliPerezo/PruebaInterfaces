package cr.ac.ulead.logic;

import cr.ac.ulead.cr.ac.ulead.ui.UIHelper;

public class Logic {

    UIHelper ui = new UIHelper();
    GestorDeCalculo gestor = new GestorDeCalculo();

    public void execute(int option) {
        float monto = ui.readAmount();
        float interes = ui.readInteres();
        int timePeriod;
        switch (option) {
            case 1:
                timePeriod = getPeriodLength("dias");
                gestor.calcularInteres(monto,interes,timePeriod,"dias");
                break;
            case 2:
                timePeriod = getPeriodLength("meses");
                gestor.calcularInteres(monto,interes,timePeriod,"dias");
                break;
            case 3:
                timePeriod = getPeriodLength("annos");
                gestor.calcularInteres(monto,interes,timePeriod,"dias");
                break;
            default:
                ui.wrongOption();
        }
    }

    private int getPeriodLength(String timePeriod) {
        return ui.getPeriodSize(timePeriod);
    }


}
