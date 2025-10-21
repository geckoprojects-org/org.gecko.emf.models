/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package de.online.adv.namespaces.adv.sk.xml.skadv;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unit Of Measure Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Aufzählungstyp mit ausgewählten Maßeinheiten.
 * 
 * Die Aufzählungswerte wurden aus dem UCUM-Standard entnommen.
 * <!-- end-model-doc -->
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getUnitOfMeasureType()
 * @model extendedMetaData="name='UnitOfMeasureType'"
 * @generated
 */
@ProviderType
public enum UnitOfMeasureType implements Enumerator {
	/**
	 * The '<em><b>M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge: Meter
	 * <!-- end-model-doc -->
	 * @see #M_VALUE
	 * @generated
	 * @ordered
	 */
	M(0, "m", "m"),

	/**
	 * The '<em><b>Km</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge: Kilometer
	 * <!-- end-model-doc -->
	 * @see #KM_VALUE
	 * @generated
	 * @ordered
	 */
	KM(1, "km", "km"),

	/**
	 * The '<em><b>M2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fläche: Quadratmeter
	 * <!-- end-model-doc -->
	 * @see #M2_VALUE
	 * @generated
	 * @ordered
	 */
	M2(2, "m2", "m2"),

	/**
	 * The '<em><b>Km2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fläche: Quadratkilometer
	 * <!-- end-model-doc -->
	 * @see #KM2_VALUE
	 * @generated
	 * @ordered
	 */
	KM2(3, "km2", "km2"),

	/**
	 * The '<em><b>Ar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fläche: Ar = 100 Quadratmeter
	 * <!-- end-model-doc -->
	 * @see #AR_VALUE
	 * @generated
	 * @ordered
	 */
	AR(4, "ar", "ar"),

	/**
	 * The '<em><b>Har</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fläche: Hektar = 100 Ar.
	 * 
	 * Diese Einheit wird üblicherweise mit "ha" abgekürzt. In UCUM, den Benennungsregeln folgende mit "har" = Hekto-ar.
	 * <!-- end-model-doc -->
	 * @see #HAR_VALUE
	 * @generated
	 * @ordered
	 */
	HAR(5, "har", "har"),

	/**
	 * The '<em><b>M3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Volumen: Kubikmeter
	 * <!-- end-model-doc -->
	 * @see #M3_VALUE
	 * @generated
	 * @ordered
	 */
	M3(6, "m3", "m3"),

	/**
	 * The '<em><b>Km3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Volumen: Kubikkilometer
	 * <!-- end-model-doc -->
	 * @see #KM3_VALUE
	 * @generated
	 * @ordered
	 */
	KM3(7, "km3", "km3"),

	/**
	 * The '<em><b>MS2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschleunigung: Geschwindigkeitszuwachs von 1 m/s pro Sekunde
	 * <!-- end-model-doc -->
	 * @see #MS2_VALUE
	 * @generated
	 * @ordered
	 */
	MS2(8, "mS2", "m/s2"),

	/**
	 * The '<em><b>S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeit: Sekunde
	 * <!-- end-model-doc -->
	 * @see #S_VALUE
	 * @generated
	 * @ordered
	 */
	S(9, "s", "s"),

	/**
	 * The '<em><b>Rad</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Winkel: Radiant
	 * <!-- end-model-doc -->
	 * @see #RAD_VALUE
	 * @generated
	 * @ordered
	 */
	RAD(10, "rad", "rad"),

	/**
	 * The '<em><b>Gon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Winkel: Neugrad, Vollkreis=400gon
	 * <!-- end-model-doc -->
	 * @see #GON_VALUE
	 * @generated
	 * @ordered
	 */
	GON(11, "gon", "gon"),

	/**
	 * The '<em><b>Deg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Winkel: Grad, Vollkreis=360deg
	 * <!-- end-model-doc -->
	 * @see #DEG_VALUE
	 * @generated
	 * @ordered
	 */
	DEG(12, "deg", "deg");

	/**
	 * The '<em><b>M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge: Meter
	 * <!-- end-model-doc -->
	 * @see #M
	 * @model name="m"
	 * @generated
	 * @ordered
	 */
	public static final int M_VALUE = 0;

	/**
	 * The '<em><b>Km</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge: Kilometer
	 * <!-- end-model-doc -->
	 * @see #KM
	 * @model name="km"
	 * @generated
	 * @ordered
	 */
	public static final int KM_VALUE = 1;

	/**
	 * The '<em><b>M2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fläche: Quadratmeter
	 * <!-- end-model-doc -->
	 * @see #M2
	 * @model name="m2"
	 * @generated
	 * @ordered
	 */
	public static final int M2_VALUE = 2;

	/**
	 * The '<em><b>Km2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fläche: Quadratkilometer
	 * <!-- end-model-doc -->
	 * @see #KM2
	 * @model name="km2"
	 * @generated
	 * @ordered
	 */
	public static final int KM2_VALUE = 3;

	/**
	 * The '<em><b>Ar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fläche: Ar = 100 Quadratmeter
	 * <!-- end-model-doc -->
	 * @see #AR
	 * @model name="ar"
	 * @generated
	 * @ordered
	 */
	public static final int AR_VALUE = 4;

	/**
	 * The '<em><b>Har</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fläche: Hektar = 100 Ar.
	 * 
	 * Diese Einheit wird üblicherweise mit "ha" abgekürzt. In UCUM, den Benennungsregeln folgende mit "har" = Hekto-ar.
	 * <!-- end-model-doc -->
	 * @see #HAR
	 * @model name="har"
	 * @generated
	 * @ordered
	 */
	public static final int HAR_VALUE = 5;

	/**
	 * The '<em><b>M3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Volumen: Kubikmeter
	 * <!-- end-model-doc -->
	 * @see #M3
	 * @model name="m3"
	 * @generated
	 * @ordered
	 */
	public static final int M3_VALUE = 6;

	/**
	 * The '<em><b>Km3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Volumen: Kubikkilometer
	 * <!-- end-model-doc -->
	 * @see #KM3
	 * @model name="km3"
	 * @generated
	 * @ordered
	 */
	public static final int KM3_VALUE = 7;

	/**
	 * The '<em><b>MS2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschleunigung: Geschwindigkeitszuwachs von 1 m/s pro Sekunde
	 * <!-- end-model-doc -->
	 * @see #MS2
	 * @model name="mS2" literal="m/s2"
	 * @generated
	 * @ordered
	 */
	public static final int MS2_VALUE = 8;

	/**
	 * The '<em><b>S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeit: Sekunde
	 * <!-- end-model-doc -->
	 * @see #S
	 * @model name="s"
	 * @generated
	 * @ordered
	 */
	public static final int S_VALUE = 9;

	/**
	 * The '<em><b>Rad</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Winkel: Radiant
	 * <!-- end-model-doc -->
	 * @see #RAD
	 * @model name="rad"
	 * @generated
	 * @ordered
	 */
	public static final int RAD_VALUE = 10;

	/**
	 * The '<em><b>Gon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Winkel: Neugrad, Vollkreis=400gon
	 * <!-- end-model-doc -->
	 * @see #GON
	 * @model name="gon"
	 * @generated
	 * @ordered
	 */
	public static final int GON_VALUE = 11;

	/**
	 * The '<em><b>Deg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Winkel: Grad, Vollkreis=360deg
	 * <!-- end-model-doc -->
	 * @see #DEG
	 * @model name="deg"
	 * @generated
	 * @ordered
	 */
	public static final int DEG_VALUE = 12;

	/**
	 * An array of all the '<em><b>Unit Of Measure Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitOfMeasureType[] VALUES_ARRAY =
		new UnitOfMeasureType[] {
			M,
			KM,
			M2,
			KM2,
			AR,
			HAR,
			M3,
			KM3,
			MS2,
			S,
			RAD,
			GON,
			DEG,
		};

	/**
	 * A public read-only list of all the '<em><b>Unit Of Measure Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitOfMeasureType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Unit Of Measure Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitOfMeasureType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitOfMeasureType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit Of Measure Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitOfMeasureType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitOfMeasureType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit Of Measure Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitOfMeasureType get(int value) {
		switch (value) {
			case M_VALUE: return M;
			case KM_VALUE: return KM;
			case M2_VALUE: return M2;
			case KM2_VALUE: return KM2;
			case AR_VALUE: return AR;
			case HAR_VALUE: return HAR;
			case M3_VALUE: return M3;
			case KM3_VALUE: return KM3;
			case MS2_VALUE: return MS2;
			case S_VALUE: return S;
			case RAD_VALUE: return RAD;
			case GON_VALUE: return GON;
			case DEG_VALUE: return DEG;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private UnitOfMeasureType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //UnitOfMeasureType
