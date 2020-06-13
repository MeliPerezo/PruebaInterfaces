package cr.ac.ulead.logic;

import cr.ac.ulead.cr.ac.ulead.interfaces.CalculadoraInteresSimple;
import cr.ac.ulead.cr.ac.ulead.interfaces.cr.ac.ulead.implementaciones.CalculadoraInteresAnual;
import cr.ac.ulead.cr.ac.ulead.interfaces.cr.ac.ulead.implementaciones.CalculadoraInteresDiario;
import cr.ac.ulead.cr.ac.ulead.interfaces.cr.ac.ulead.implementaciones.CalculadoraInteresMensual;
import cr.ac.ulead.cr.ac.ulead.ui.UIHelper;

public class GestorDeCalculo {
    UIHelper ui = new UIHelper();

    public void calcularInteres(float monto, float interes, int timePeriod, String tipoPeriodo) {
        try {
            CalculadoraInteresSimple calculadora = getCalculadoraInteresSimple(tipoPeriodo);
            float resultado = calculadora.calcular(monto,interes,timePeriod);
            ui.printResult(resultado, tipoPeriodo);
        } catch(Exception e) {
            ui.printMessage(e.getMessage());
        }
    }

    private CalculadoraInteresSimple getCalculadoraInteresSimple(String tipoPeriodo) throws Exception {
        if (tipoPeriodo.equals("dias")) {
            return new CalculadoraInteresDiario();
        }
        if (tipoPeriodo.equals("meses")) {
            return new CalculadoraInteresMensual();
        }
        if (tipoPeriodo.equals("annos")) {
            return new CalculadoraInteresAnual();
        } else {
            throw new Exception("periodo de tiempo indeterminado");
        }

    }
}
