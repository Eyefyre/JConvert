/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amack;

/**
 *
 * @author Adam
 */
public class JConvert {

    public static final int CELSIUS = 0;
    public static final int FAHRENHEIT = 1;
    public static final int KELVIN = 2;
    public static final int NANOSECOND = 3;
    public static final int MICROSECOND = 4;
    public static final int MILLISECOND = 5;
    public static final int SECOND = 6;
    public static final int MINUTE = 7;
    public static final int HOUR = 8;
    public static final int DAY = 9;
    public static final int WEEK = 10;
    public static final int MONTH = 11;
    public static final int YEAR = 12;
    public static final int DECADE = 13;
    public static final int CENTURY = 14;
    public static final int MILESPERHOUR = 15;
    public static final int FOOTPERSECOND = 16;
    public static final int METREPERSECOND = 17;
    public static final int KILOMETREPERHOUR = 18;
    public static final int KNOT = 19;
    public static final int KILOMETRE = 20;
    public static final int METRE = 21;
    public static final int CENTIMETRE = 22;
    public static final int MILLIMETRE = 23;
    public static final int MICROMETRE = 24;
    public static final int NANOMETRE = 25;
    public static final int MILE = 26;
    public static final int YARD = 27;
    public static final int FOOT = 28;
    public static final int INCH = 29;
    public static final int NAUTICALMILE = 30;
    public static final int TONNE = 31;
    public static final int KILOGRAM = 32;
    public static final int GRAM = 33;
    public static final int MILLIGRAM = 34;
    public static final int MICROGRAM = 35;
    public static final int IMPERIALTON = 36;
    public static final int USTON = 37;
    public static final int STONE = 38;
    public static final int POUND = 39;
    public static final int OUNCE = 40;
    public static final int DEGREES = 41;
    public static final int RADIANS = 42;
    public static final int ATMOSPHERE = 43;
    public static final int BAR = 44;
    public static final int PASCAL = 45;
    public static final int POUNDFORCEPERSQINCH = 46;
    public static final int TORR = 47;
    public static final int CUBICMETRE = 48;
    public static final int LITRE = 49;
    public static final int MILLILITRE = 50;
    public static final int GALLON = 51;
    public static final int QUART = 52;
    public static final int PINT = 53;
    public static final int CUP = 54;
    public static final int FLUIDOUNCE = 55;
    public static final int TABLESPOON = 56;
    public static final int TEASPOON = 57;
    public static final int CUBICFOOT = 58;
    public static final int CUBICINCH = 59;

    /**
     * Returns a value that has been converted from one speed unit to another as a double. 
     * This method should only be used to convert speed units.
     * If other units are used, method will simply return the original parameter value.
     *
     * @param from an int specifying what unit to convert from.
     * @param to an int specifying what unit to convert to.
     * @param value an int/double for what value the user wishes to convert.
     * @return double value that has been converted from one unit to another.
     * @see double
     */
    public static double ConvertSpeed(int from, int to, double value) {
        if (from == MILESPERHOUR) {
            switch (to) {
                case FOOTPERSECOND:
                    return value * 1.467;
                case METREPERSECOND:
                    return value * 2.237;
                case KILOMETREPERHOUR:
                    return value * 1.609;
                case KNOT:
                    return value / 1.151;
            }
        }
        if (from == FOOTPERSECOND) {
            switch (to) {
                case MILESPERHOUR:
                    return value / 1.467;
                case METREPERSECOND:
                    return value / 3.281;
                case KILOMETREPERHOUR:
                    return value * 1.097;
                case KNOT:
                    return value / 1.688;
            }
        }
        if (from == METREPERSECOND) {
            switch (to) {
                case MILESPERHOUR:
                    return value * 2.237;
                case FOOTPERSECOND:
                    return value * 3.281;
                case KILOMETREPERHOUR:
                    return value * 3.6;
                case KNOT:
                    return value * 1.944;
            }
        }
        if (from == KILOMETREPERHOUR) {
            switch (to) {
                case MILESPERHOUR:
                    return value / 1.609;
                case FOOTPERSECOND:
                    return value / 1.097;
                case METREPERSECOND:
                    return value / 3.6;
                case KNOT:
                    return value / 1.852;
            }
        }
        if (from == KNOT) {
            switch (to) {
                case MILESPERHOUR:
                    return value * 1.151;
                case FOOTPERSECOND:
                    return value * 1.688;
                case METREPERSECOND:
                    return value / 1.944;
                case KILOMETREPERHOUR:
                    return value * 1.852;
            }
        }
        return value;
    }

    /**
     * Returns a value that has been converted from one length unit to another as a double. 
     * This method should only be used to convert length units.
     * If other units are used, method will simply return the original parameter value.
     *
     * @param from an int specifying what unit to convert from.
     * @param to an int specifying what unit to convert to.
     * @param value an int/double for what value the user wishes to convert.
     * @return double value that has been converted from one unit to another.
     * @see double
     */
    
    public static double ConvertLength(int from, int to, double value) {
        if (from == KILOMETRE) {
            switch (to) {
                case METRE:
                    return value * 1000;
                case CENTIMETRE:
                    return value * 100000;
                case MILLIMETRE:
                    return value * 1e+6;
                case MICROMETRE:
                    return value * 1e+9;
                case NANOMETRE:
                    return value * 1e+12;
                case MILE:
                    return value / 1.609;
                case YARD:
                    return value * 1094;
                case FOOT:
                    return value * 3281;
                case INCH:
                    return value * 39370;
                case NAUTICALMILE:
                    return value * 1.852;
            }
        }
        if (from == METRE) {
            switch (to) {
                case KILOMETRE:
                    return value / 1000;
                case CENTIMETRE:
                    return value * 100;
                case MILLIMETRE:
                    return value * 1000;
                case MICROMETRE:
                    return value * 1e+6;
                case NANOMETRE:
                    return value * 1e+9;
                case MILE:
                    return value / 1609;
                case YARD:
                    return value * 1.094;
                case FOOT:
                    return value * 3.281;
                case INCH:
                    return value * 39.37;
                case NAUTICALMILE:
                    return value * 1852;
            }
        }
        if (from == CENTIMETRE) {
            switch (to) {
                case KILOMETRE:
                    return value / 100000;
                case METRE:
                    return value / 100;
                case MILLIMETRE:
                    return value * 10;
                case MICROMETRE:
                    return value * 10000;
                case NANOMETRE:
                    return value * 1e+7;
                case MILE:
                    return value / 160934;
                case YARD:
                    return value / 91.44;
                case FOOT:
                    return value / 30.48;
                case INCH:
                    return value / 2.54;
                case NAUTICALMILE:
                    return value / 185200;
            }
        }
        if (from == MILLIMETRE) {
            switch (to) {
                case KILOMETRE:
                    return value / 1e+6;
                case METRE:
                    return value / 1000;
                case CENTIMETRE:
                    return value / 10;
                case MICROMETRE:
                    return value * 1000;
                case NANOMETRE:
                    return value * 1e+6;
                case MILE:
                    return value * 1.609e+6;
                case YARD:
                    return value / 914;
                case FOOT:
                    return value / 305;
                case INCH:
                    return value / 25.4;
                case NAUTICALMILE:
                    return value / 1.852e+6;
            }
        }
        if (from == MICROMETRE) {
            switch (to) {
                case KILOMETRE:
                    return value / 1e+9;
                case METRE:
                    return value / 1e+6;
                case CENTIMETRE:
                    return value / 10000;
                case MILLIMETRE:
                    return value / 1000;
                case NANOMETRE:
                    return value * 1000;
                case MILE:
                    return value / 1.609e+9;
                case YARD:
                    return value / 914400;
                case FOOT:
                    return value / 304800;
                case INCH:
                    return value / 25400;
                case NAUTICALMILE:
                    return value / 1.852e+9;
            }
        }
        if (from == NANOMETRE) {
            switch (to) {
                case KILOMETRE:
                    return value / 1e+12;
                case METRE:
                    return value / 1e+9;
                case CENTIMETRE:
                    return value / 1e+7;
                case MILLIMETRE:
                    return value / 1e+6;
                case MICROMETRE:
                    return value / 1000;
                case MILE:
                    return value / 1.609e+12;
                case YARD:
                    return value / 9.144e+8;
                case FOOT:
                    return value / 3.048e+8;
                case INCH:
                    return value / 2.54e+7;
                case NAUTICALMILE:
                    return value / 1.852e+12;
            }
        }
        if (from == MILE) {
            switch (to) {
                case KILOMETRE:
                    return value * 1.609;
                case METRE:
                    return value * 1609;
                case CENTIMETRE:
                    return value * 160934;
                case MILLIMETRE:
                    return value * 1.609e+6;
                case MICROMETRE:
                    return value * 1.609e+9;
                case NANOMETRE:
                    return value * 1.609e+12;
                case YARD:
                    return value * 1760;
                case FOOT:
                    return value * 5280;
                case INCH:
                    return value * 63360;
                case NAUTICALMILE:
                    return value / 1.151;
            }
        }
        if (from == YARD) {
            switch (to) {
                case KILOMETRE:
                    return value / 1094;
                case METRE:
                    return value / 1.094;
                case CENTIMETRE:
                    return value * 91.44;
                case MILLIMETRE:
                    return value * 914;
                case MICROMETRE:
                    return value * 914400;
                case NANOMETRE:
                    return value * 9.144e+8;
                case MILE:
                    return value / 1760;
                case FOOT:
                    return value * 3;
                case INCH:
                    return value * 36;
                case NAUTICALMILE:
                    return value / 2025;
            }
        }
        if (from == FOOT) {
            switch (to) {
                case KILOMETRE:
                    return value / 3281;
                case METRE:
                    return value / 3.281;
                case CENTIMETRE:
                    return value * 30.48;
                case MILLIMETRE:
                    return value * 305;
                case MICROMETRE:
                    return value * 304800;
                case NANOMETRE:
                    return value * 3.048e+8;
                case MILE:
                    return value / 5280;
                case YARD:
                    return value / 3;
                case INCH:
                    return value * 12;
                case NAUTICALMILE:
                    return value / 6076;
            }
        }
        if (from == INCH) {
            switch (to) {
                case KILOMETRE:
                    return value / 39370;
                case METRE:
                    return value / 39.37;
                case CENTIMETRE:
                    return value * 2.54;
                case MILLIMETRE:
                    return value * 25.4;
                case MICROMETRE:
                    return value * 25400;
                case NANOMETRE:
                    return value * 2.54e+7;
                case MILE:
                    return value / 63360;
                case YARD:
                    return value / 36;
                case FOOT:
                    return value / 12;
                case NAUTICALMILE:
                    return value / 72913;
            }
        }
        if (from == NAUTICALMILE) {
            switch (to) {
                case KILOMETRE:
                    return value * 1.852;
                case METRE:
                    return value * 1852;
                case CENTIMETRE:
                    return value * 185200;
                case MILLIMETRE:
                    return value * 1.852e+6;
                case MICROMETRE:
                    return value * 1.852e+9;
                case NANOMETRE:
                    return value * 1.852e+12;
                case MILE:
                    return value * 1.151;
                case YARD:
                    return value * 2025;
                case FOOT:
                    return value * 6076;
                case INCH:
                    return value * 72913;
            }
        }
        return value;
    }

    /**
     * Returns a value that has been converted from one mass unit to another as a double. 
     * This method should only be used to convert mass units.
     * If other units are used, method will simply return the original parameter value.
     *
     * @param from an int specifying what unit to convert from.
     * @param to an int specifying what unit to convert to.
     * @param value an int/double for what value the user wishes to convert.
     * @return double value that has been converted from one unit to another.
     * @see double
     */
    
    public static double ConvertMass(int from, int to, double value) {
        if (from == TONNE) {
            switch (to) {
                case KILOGRAM:
                    return value * 1000;
                case GRAM:
                    return value * 1e+6;
                case MILLIGRAM:
                    return value * 1e+9;
                case MICROGRAM:
                    return value * 1e+12;
                case IMPERIALTON:
                    return value * 1.016;
                case USTON:
                    return value * 1.102;
                case STONE:
                    return value * 157;
                case POUND:
                    return value * 2205;
                case OUNCE:
                    return value * 35274;
            }
        }
        if (from == KILOGRAM) {
            switch (to) {
                case TONNE:
                    return value / 1000;
                case GRAM:
                    return value * 1000;
                case MILLIGRAM:
                    return value * 1e+6;
                case MICROGRAM:
                    return value * 1e+9;
                case IMPERIALTON:
                    return value / 1016;
                case USTON:
                    return value / 907;
                case STONE:
                    return value / 6.35;
                case POUND:
                    return value * 2.205;
                case OUNCE:
                    return value * 35.274;
            }
        }
        if (from == GRAM) {
            switch (to) {
                case TONNE:
                    return value / 1e+6;
                case KILOGRAM:
                    return value / 1000;
                case MILLIGRAM:
                    return value * 1000;
                case MICROGRAM:
                    return value * 1e+6;
                case IMPERIALTON:
                    return value / 1.016e+6;
                case USTON:
                    return value / 907185;
                case STONE:
                    return value / 6350;
                case POUND:
                    return value / 454;
                case OUNCE:
                    return value / 28.35;
            }
        }
        if (from == MILLIGRAM) {
            switch (to) {
                case TONNE:
                    return value / 1e+9;
                case KILOGRAM:
                    return value / 1e+6;
                case GRAM:
                    return value / 1000;
                case MICROGRAM:
                    return value * 1000;
                case IMPERIALTON:
                    return value / 1.016e+9;
                case USTON:
                    return value / 9.072e+8;
                case STONE:
                    return value / 6.35e+6;
                case POUND:
                    return value / 453592;
                case OUNCE:
                    return value / 28350;
            }
        }
        if (from == MICROGRAM) {
            switch (to) {
                case TONNE:
                    return value / 1e+12;
                case KILOGRAM:
                    return value / 1e+9;
                case GRAM:
                    return value / 1e+6;
                case MILLIGRAM:
                    return value / 1000;
                case IMPERIALTON:
                    return value / 1.016e+12;
                case USTON:
                    return value / 9.072e+11;
                case STONE:
                    return value / 6.35e+9;
                case POUND:
                    return value / 4.536e+8;
                case OUNCE:
                    return value / 2.835e+7;
            }
        }
        if (from == IMPERIALTON) {
            switch (to) {
                case TONNE:
                    return value * 1.016;
                case KILOGRAM:
                    return value * 1016;
                case GRAM:
                    return value * 1.016e+6;
                case MILLIGRAM:
                    return value * 1.016e+9;
                case MICROGRAM:
                    return value * 1.016e+12;
                case USTON:
                    return value * 1.12;
                case STONE:
                    return value * 160;
                case POUND:
                    return value * 2240;
                case OUNCE:
                    return value * 35840;
            }
        }
        if (from == USTON) {
            switch (to) {
                case TONNE:
                    return value / 1.102;
                case KILOGRAM:
                    return value * 907;
                case GRAM:
                    return value * 907185;
                case MILLIGRAM:
                    return value * 9.072e+8;
                case MICROGRAM:
                    return value * 9.072e+11;
                case IMPERIALTON:
                    return value / 1.12;
                case STONE:
                    return value * 143;
                case POUND:
                    return value * 2000;
                case OUNCE:
                    return value * 32000;
            }
        }
        if (from == STONE) {
            switch (to) {
                case TONNE:
                    return value / 157;
                case KILOGRAM:
                    return value * 6.35;
                case GRAM:
                    return value * 6350;
                case MILLIGRAM:
                    return value * 6.35e+6;
                case MICROGRAM:
                    return value * 6.35e+9;
                case IMPERIALTON:
                    return value / 160;
                case USTON:
                    return value / 143;
                case POUND:
                    return value * 14;
                case OUNCE:
                    return value * 224;
            }
        }
        if (from == POUND) {
            switch (to) {
                case TONNE:
                    return value / 2205;
                case KILOGRAM:
                    return value / 22.05;
                case GRAM:
                    return value * 454;
                case MILLIGRAM:
                    return value * 453592;
                case MICROGRAM:
                    return value * 4.536e+8;
                case IMPERIALTON:
                    return value / 2240;
                case USTON:
                    return value / 2000;
                case STONE:
                    return value / 14;
                case OUNCE:
                    return value * 16;
            }
        }
        if (from == OUNCE) {
            switch (to) {
                case TONNE:
                    return value / 35274;
                case KILOGRAM:
                    return value / 35.274;
                case GRAM:
                    return value * 28.35;
                case MILLIGRAM:
                    return value * 28350;
                case MICROGRAM:
                    return value * 2.835e+7;
                case IMPERIALTON:
                    return value / 35840;
                case USTON:
                    return value / 32000;
                case STONE:
                    return value / 224;
                case POUND:
                    return value / 16;
            }
        }
        return value;
    }

    /**
     * Returns a value that has been converted from one angle unit to another as a double. 
     * This method should only be used to convert angle units.
     * If other units are used, method will simply return the original parameter value.
     *
     * @param from an int specifying what unit to convert from.
     * @param to an int specifying what unit to convert to.
     * @param value an int/double for what value the user wishes to convert.
     * @return double value that has been converted from one unit to another.
     * @see double
     */
    
    public static double ConvertAngle(int from, int to, double value) {
        if (from == DEGREES) {
            switch (to) {
                case RADIANS:
                    return value * Math.PI / 180;
            }
        }
        if (from == RADIANS) {
            switch (to) {
                case DEGREES:
                    return value * 180 / Math.PI;
            }
        }
        return value;
    }

    /**
     * Returns a value that has been converted from one pressure unit to another as a double. 
     * This method should only be used to convert pressure units.
     * If other units are used, method will simply return the original parameter value.
     *
     * @param from an int specifying what unit to convert from.
     * @param to an int specifying what unit to convert to.
     * @param value an int/double for what value the user wishes to convert.
     * @return double value that has been converted from one unit to another.
     * @see double
     */
    public static double ConvertPressure(int from, int to, double value) {
        if (from == ATMOSPHERE) {
            switch (to) {
                case BAR:
                    return value * 1.013;
                case PASCAL:
                    return value * 101325;
                case POUNDFORCEPERSQINCH:
                    return value * 14.696;
                case TORR:
                    return value * 760;
            }
        }
        if (from == BAR) {
            switch (to) {
                case ATMOSPHERE:
                    return value / 1.013;
                case PASCAL:
                    return value * 100000;
                case POUNDFORCEPERSQINCH:
                    return value * 14.504;
                case TORR:
                    return value * 750;
            }
        }
        if (from == PASCAL) {
            switch (to) {
                case ATMOSPHERE:
                    return value / 101325;
                case BAR:
                    return value / 100000;
                case POUNDFORCEPERSQINCH:
                    return value / 6895;
                case TORR:
                    return value / 133;
            }
        }
        if (from == POUNDFORCEPERSQINCH) {
            switch (to) {
                case ATMOSPHERE:
                    return value / 14.696;
                case BAR:
                    return value / 14.504;
                case PASCAL:
                    return value * 6895;
                case TORR:
                    return value * 51.715;
            }
        }
        if (from == TORR) {
            switch (to) {
                case ATMOSPHERE:
                    return value / 760;
                case BAR:
                    return value / 750;
                case PASCAL:
                    return value * 133;
                case POUNDFORCEPERSQINCH:
                    return value / 51.715;
            }
        }
        return value;
    }

    /**
     * Returns a value that has been converted from one temperature unit to another as a double. 
     * This method should only be used to convert temperature units.
     * If other units are used, method will simply return the original parameter value.
     *
     * @param from an int specifying what unit to convert from.
     * @param to an int specifying what unit to convert to.
     * @param value an int/double for what value the user wishes to convert.
     * @return double value that has been converted from one unit to another.
     * @see double
     */
    
    public static double ConvertTemperature(int from, int to, double value) {
        if (from == CELSIUS) {
            switch (to) {
                case FAHRENHEIT:
                    return (value * 9 / 5) + 32;
                case KELVIN:
                    return value + 273.15;
            }
        }
        if (from == FAHRENHEIT) {
            switch (to) {
                case CELSIUS:
                    return (value - 32) * 5 / 9;
                case KELVIN:
                    return (value - 32) * 5 / 9 + 273.15;
            }
        }
        if (from == KELVIN) {
            switch (to) {
                case CELSIUS:
                    return value - 273.15;
                case FAHRENHEIT:
                    return (value - 273.15) * 9 / 5 + 32;
            }

        }
        return value;
    }

    /**
     * Returns a value that has been converted from one time unit to another as a double. 
     * This method should only be used to convert time units.
     * If other units are used, method will simply return the original parameter value.
     *
     * @param from an int specifying what unit to convert from.
     * @param to an int specifying what unit to convert to.
     * @param value an int/double for what value the user wishes to convert.
     * @return double value that has been converted from one unit to another.
     * @see double
     */
    
    public static double ConvertTime(int from, int to, double value) {
        if (from == NANOSECOND) {
            switch (to) {
                case MICROSECOND:
                    return value / 1000;
                case MILLISECOND:
                    return value / 1e+6;
                case SECOND:
                    return value / 1e+9;
                case MINUTE:
                    return value / 6e+10;
                case HOUR:
                    return value / 3.6e+12;
                case DAY:
                    return value / 8.64e+13;
                case WEEK:
                    return value / 6.048e+14;
                case MONTH:
                    return value / 2.628e+15;
                case YEAR:
                    return value / 3.154e+16;
                case DECADE:
                    return value / 3.154e+17;
                case CENTURY:
                    return value / 3.154e+18;
            }
        }
        if (from == MICROSECOND) {
            switch (to) {
                case NANOSECOND:
                    return value * 1000;
                case MILLISECOND:
                    return value / 1000;
                case SECOND:
                    return value / 1e+6;
                case MINUTE:
                    return value / 6e+7;
                case HOUR:
                    return value / 3.6e+9;
                case DAY:
                    return value / 8.64e+10;
                case WEEK:
                    return value / 6.048e+11;
                case MONTH:
                    return value / 2.628e+12;
                case YEAR:
                    return value / 3.154e+13;
                case DECADE:
                    return value / 3.154e+14;
                case CENTURY:
                    return value / 3.154e+15;
            }
        }
        if (from == MILLISECOND) {
            switch (to) {
                case NANOSECOND:
                    return value * 1e+6;
                case MICROSECOND:
                    return value * 1000;
                case SECOND:
                    return value / 1000;
                case MINUTE:
                    return value / 60000;
                case HOUR:
                    return value / 3.6e+6;
                case DAY:
                    return value / 8.64e+7;
                case WEEK:
                    return value / 6.048e+8;
                case MONTH:
                    return value / 2.628e+9;
                case YEAR:
                    return value / 3.154e+10;
                case DECADE:
                    return value / 3.154e+11;
                case CENTURY:
                    return value / 3.154e+12;
            }
        }
        if (from == SECOND) {
            switch (to) {
                case NANOSECOND:
                    return value * 1e+9;
                case MICROSECOND:
                    return value * 1e+6;
                case MILLISECOND:
                    return value * 1000;
                case MINUTE:
                    return value / 60;
                case HOUR:
                    return value / 3600;
                case DAY:
                    return value / 86400;
                case WEEK:
                    return value / 604800;
                case MONTH:
                    return value / 2.628e+6;
                case YEAR:
                    return value / 3.154e+7;
                case DECADE:
                    return value / 3.154e+8;
                case CENTURY:
                    return value / 3.154e+9;
            }
        }
        if (from == MINUTE) {
            switch (to) {
                case NANOSECOND:
                    return value * 6e+10;
                case MICROSECOND:
                    return value * 6e+7;
                case MILLISECOND:
                    return value * 60000;
                case SECOND:
                    return value * 60;
                case HOUR:
                    return value / 60;
                case DAY:
                    return value / 1440;
                case WEEK:
                    return value / 10080;
                case MONTH:
                    return value / 43800;
                case YEAR:
                    return value / 525600;
                case DECADE:
                    return value / 5.256e+6;
                case CENTURY:
                    return value / 5.256e+7;
            }
        }
        if (from == HOUR) {
            switch (to) {
                case NANOSECOND:
                    return value * 3.6e+12;
                case MICROSECOND:
                    return value * 3.6e+9;
                case MILLISECOND:
                    return value * 3.6e+6;
                case SECOND:
                    return value * 3600;
                case MINUTE:
                    return value * 60;
                case DAY:
                    return value / 24;
                case WEEK:
                    return value / 168;
                case MONTH:
                    return value / 730;
                case YEAR:
                    return value / 8760;
                case DECADE:
                    return value / 87600;
                case CENTURY:
                    return value / 876000;
            }
        }
        if (from == DAY) {
            switch (to) {
                case NANOSECOND:
                    return value * 8.64e+13;
                case MICROSECOND:
                    return value * 8.64e+10;
                case MILLISECOND:
                    return value * 8.64e+7;
                case SECOND:
                    return value * 86400;
                case MINUTE:
                    return value * 1440;
                case HOUR:
                    return value * 24;
                case WEEK:
                    return value / 7;
                case MONTH:
                    return value / 30.417;
                case YEAR:
                    return value / 365;
                case DECADE:
                    return value / 3650;
                case CENTURY:
                    return value / 36500;
            }
        }
        if (from == WEEK) {
            switch (to) {
                case NANOSECOND:
                    return value * 6.048e+14;
                case MICROSECOND:
                    return value * 6.048e+11;
                case MILLISECOND:
                    return value * 6.048e+8;
                case SECOND:
                    return value * 604800;
                case MINUTE:
                    return value * 10080;
                case HOUR:
                    return value * 168;
                case DAY:
                    return value * 7;
                case MONTH:
                    return value / 4.345;
                case YEAR:
                    return value / 52.143;
                case DECADE:
                    return value / 521;
                case CENTURY:
                    return value / 5214;
            }
        }
        if (from == MONTH) {
            switch (to) {
                case NANOSECOND:
                    return value * 2.628e+15;
                case MICROSECOND:
                    return value * 2.628e+12;
                case MILLISECOND:
                    return value * 2.628e+9;
                case SECOND:
                    return value * 2.628e+6;
                case MINUTE:
                    return value * 43800;
                case HOUR:
                    return value * 730;
                case DAY:
                    return value * 30.417;
                case WEEK:
                    return value * 4.345;
                case YEAR:
                    return value / 12;
                case DECADE:
                    return value / 120;
                case CENTURY:
                    return value / 1200;
            }
        }
        if (from == YEAR) {
            switch (to) {
                case NANOSECOND:
                    return value * 3.154e+16;
                case MICROSECOND:
                    return value * 3.154e+13;
                case MILLISECOND:
                    return value * 3.154e+10;
                case SECOND:
                    return value * 3.154e+7;
                case MINUTE:
                    return value * 525600;
                case HOUR:
                    return value * 8760;
                case DAY:
                    return value * 365;
                case WEEK:
                    return value * 52.143;
                case MONTH:
                    return value * 12;
                case DECADE:
                    return value / 10;
                case CENTURY:
                    return value / 100;
            }
        }
        if (from == DECADE) {
            switch (to) {
                case NANOSECOND:
                    return value * 3.154e+17;
                case MICROSECOND:
                    return value * 3.154e+14;
                case MILLISECOND:
                    return value * 3.154e+11;
                case SECOND:
                    return value * 3.154e+8;
                case MINUTE:
                    return value * 5.256e+6;
                case HOUR:
                    return value * 87600;
                case DAY:
                    return value * 3650;
                case WEEK:
                    return value * 521;
                case MONTH:
                    return value * 120;
                case YEAR:
                    return value * 10;
                case CENTURY:
                    return value / 10;
            }
        }
        if (from == CENTURY) {
            switch (to) {
                case NANOSECOND:
                    return value * 3.154e+18;
                case MICROSECOND:
                    return value * 3.154e+15;
                case MILLISECOND:
                    return value * 3.154e+12;
                case SECOND:
                    return value * 3.154e+9;
                case MINUTE:
                    return value * 5.256e+7;
                case HOUR:
                    return value * 876000;
                case DAY:
                    return value * 36500;
                case WEEK:
                    return value * 5214;
                case MONTH:
                    return value * 1200;
                case YEAR:
                    return value * 100;
                case DECADE:
                    return value * 10;
            }
        }
        return value;
    }

    /**
     * Returns a value that has been converted from one volume unit to another as a double. 
     * This method should only be used to convert volume units.
     * If other units are used, method will simply return the original parameter value.
     *
     * @param from an int specifying what unit to convert from.
     * @param to an int specifying what unit to convert to.
     * @param value an int/double for what value the user wishes to convert.
     * @return double value that has been converted from one unit to another.
     * @see double
     */
    
    public static double ConvertVolume(int from, int to, double value) {
        if (from == CUBICMETRE) {
            switch (to) {
                case LITRE:
                    return value * 1000;
                case MILLILITRE:
                    return value * 1e+6;
                case GALLON:
                    return value * 220;
                case QUART:
                    return value * 880;
                case PINT:
                    return value * 1760;
                case CUP:
                    return value * 3520;
                case FLUIDOUNCE:
                    return value * 35195;
                case TABLESPOON:
                    return value * 56312;
                case TEASPOON:
                    return value * 168936;
                case CUBICFOOT:
                    return value * 35.315;
                case CUBICINCH:
                    return value * 61024;
            }
        }
        if (from == LITRE) {
            switch (to) {
                case CUBICMETRE:
                    return value / 1000;
                case MILLILITRE:
                    return value * 1000;
                case GALLON:
                    return value / 4.546;
                case QUART:
                    return value / 1.137;
                case PINT:
                    return value * 1.76;
                case CUP:
                    return value * 3.52;
                case FLUIDOUNCE:
                    return value * 35.195;
                case TABLESPOON:
                    return value * 56.312;
                case TEASPOON:
                    return value * 169;
                case CUBICFOOT:
                    return value / 28.317;
                case CUBICINCH:
                    return value * 61.024;
            }
        }
        if (from == MILLILITRE) {
            switch (to) {
                case CUBICMETRE:
                    return value / 1e+6;
                case LITRE:
                    return value / 1000;
                case GALLON:
                    return value / 4546;
                case QUART:
                    return value / 1137;
                case PINT:
                    return value / 568;
                case CUP:
                    return value / 284;
                case FLUIDOUNCE:
                    return value / 28.413;
                case TABLESPOON:
                    return value / 17.758;
                case TEASPOON:
                    return value / 5.919;
                case CUBICFOOT:
                    return value / 28317;
                case CUBICINCH:
                    return value / 16.387;
            }
        }
        if (from == GALLON) {
            switch (to) {
                case CUBICMETRE:
                    return value / 220;
                case LITRE:
                    return value * 4.546;
                case MILLILITRE:
                    return value * 4546;
                case QUART:
                    return value * 4;
                case PINT:
                    return value * 8;
                case CUP:
                    return value * 16;
                case FLUIDOUNCE:
                    return value * 160;
                case TABLESPOON:
                    return value * 256;
                case TEASPOON:
                    return value * 768;
                case CUBICFOOT:
                    return value / 6.229;
                case CUBICINCH:
                    return value * 277;
            }
        }
        if (from == QUART) {
            switch (to) {
                case CUBICMETRE:
                    return value / 880;
                case LITRE:
                    return value * 1.137;
                case MILLILITRE:
                    return value * 1137;
                case GALLON:
                    return value / 4;
                case PINT:
                    return value * 2;
                case CUP:
                    return value * 4;
                case FLUIDOUNCE:
                    return value * 40;
                case TABLESPOON:
                    return value * 64;
                case TEASPOON:
                    return value * 192;
                case CUBICFOOT:
                    return value / 24.915;
                case CUBICINCH:
                    return value * 69.355;
            }
        }
        if (from == PINT) {
            switch (to) {
                case CUBICMETRE:
                    return value / 1760;
                case LITRE:
                    return value / 1.76;
                case MILLILITRE:
                    return value * 568;
                case GALLON:
                    return value / 8;
                case QUART:
                    return value / 2;
                case CUP:
                    return value * 2;
                case FLUIDOUNCE:
                    return value * 20;
                case TABLESPOON:
                    return value * 32;
                case TEASPOON:
                    return value * 96;
                case CUBICFOOT:
                    return value / 49.831;
                case CUBICINCH:
                    return value * 34.677;
            }
        }
        if (from == CUP) {
            switch (to) {
                case CUBICMETRE:
                    return value / 3520;
                case LITRE:
                    return value / 3.52;
                case MILLILITRE:
                    return value * 284;
                case GALLON:
                    return value / 16;
                case QUART:
                    return value / 4;
                case PINT:
                    return value / 2;
                case FLUIDOUNCE:
                    return value * 10;
                case TABLESPOON:
                    return value * 16;
                case TEASPOON:
                    return value * 48;
                case CUBICFOOT:
                    return value / 99.661;
                case CUBICINCH:
                    return value * 17.339;
            }
        }
        if (from == FLUIDOUNCE) {
            switch (to) {
                case CUBICMETRE:
                    return value / 35195;
                case LITRE:
                    return value / 35.195;
                case MILLILITRE:
                    return value * 28.413;
                case GALLON:
                    return value / 160;
                case QUART:
                    return value / 40;
                case PINT:
                    return value / 20;
                case CUP:
                    return value / 10;
                case TABLESPOON:
                    return value * 1.6;
                case TEASPOON:
                    return value * 4.8;
                case CUBICFOOT:
                    return value / 997;
                case CUBICINCH:
                    return value * 1.734;
            }
        }
        if (from == TABLESPOON) {
            switch (to) {
                case CUBICMETRE:
                    return value / 56312;
                case LITRE:
                    return value / 56.312;
                case MILLILITRE:
                    return value * 17.758;
                case GALLON:
                    return value / 256;
                case QUART:
                    return value / 64;
                case PINT:
                    return value / 32;
                case CUP:
                    return value / 16;
                case FLUIDOUNCE:
                    return value / 1.6;
                case TEASPOON:
                    return value / 3;
                case CUBICFOOT:
                    return value / 1595;
                case CUBICINCH:
                    return value * 1.084;
            }
        }
        if (from == TEASPOON) {
            switch (to) {
                case CUBICMETRE:
                    return value / 168936;
                case LITRE:
                    return value / 169;
                case MILLILITRE:
                    return value * 5.919;
                case GALLON:
                    return value / 768;
                case QUART:
                    return value / 192;
                case PINT:
                    return value / 96;
                case CUP:
                    return value / 48;
                case FLUIDOUNCE:
                    return value / 4.8;
                case TABLESPOON:
                    return value / 3;
                case CUBICFOOT:
                    return value / 4784;
                case CUBICINCH:
                    return value / 2.768;
            }
        }
        if (from == CUBICFOOT) {
            switch (to) {
                case CUBICMETRE:
                    return value / 35.315;
                case LITRE:
                    return value * 28.317;
                case MILLILITRE:
                    return value * 28317;
                case GALLON:
                    return value * 6.229;
                case QUART:
                    return value * 24.915;
                case PINT:
                    return value * 49.831;
                case CUP:
                    return value * 99.661;
                case FLUIDOUNCE:
                    return value * 997;
                case TABLESPOON:
                    return value * 1595;
                case TEASPOON:
                    return value * 4784;
                case CUBICINCH:
                    return value * 1728;
            }
        }
        if (from == CUBICINCH) {
            switch (to) {
                case CUBICMETRE:
                    return value / 61024;
                case LITRE:
                    return value / 61.024;
                case MILLILITRE:
                    return value * 16.387;
                case GALLON:
                    return value / 277;
                case QUART:
                    return value / 69.355;
                case PINT:
                    return value / 34.677;
                case CUP:
                    return value / 17.339;
                case FLUIDOUNCE:
                    return value / 1.734;
                case TABLESPOON:
                    return value / 1.084;
                case TEASPOON:
                    return value * 2.768;
                case CUBICFOOT:
                    return value / 1728;
            }
        }
        return value;
    }

}
