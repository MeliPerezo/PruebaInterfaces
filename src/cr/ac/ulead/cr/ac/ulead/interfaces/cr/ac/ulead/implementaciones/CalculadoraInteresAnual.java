package cr.ac.ulead.cr.ac.ulead.interfaces.cr.ac.ulead.implementaciones;

import cr.ac.ulead.cr.ac.ulead.interfaces.CalculadoraInteresSimple;

public class CalculadoraInteresAnual implements CalculadoraInteresSimple {


    @Override
    public float calcular(float c, float r, float t) {
        return (c * r * t)/100;
    }
}
