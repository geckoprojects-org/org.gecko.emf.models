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
package org.cyclonedx.schema.bom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Energy Source Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getEnergySourceType()
 * @model extendedMetaData="name='energySource_._type'"
 * @generated
 */
@ProviderType
public enum EnergySourceType implements Enumerator {
	/**
	 * The '<em><b>Coal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Energy produced by types of coal.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #COAL_VALUE
	 * @generated
	 * @ordered
	 */
	COAL(0, "coal", "coal"),

	/**
	 * The '<em><b>Oil</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Petroleum products (primarily crude oil and its derivative fuel oils).
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #OIL_VALUE
	 * @generated
	 * @ordered
	 */
	OIL(1, "oil", "oil"),

	/**
	 * The '<em><b>Natural Gas</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Hydrocarbon gas liquids (HGL) that occur as gases at atmospheric pressure and as liquids under higher pressures including Natural gas (C5H12 and heavier), Ethane (C2H6), Propane (C3H8), etc.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #NATURAL_GAS_VALUE
	 * @generated
	 * @ordered
	 */
	NATURAL_GAS(2, "naturalGas", "natural-gas"),

	/**
	 * The '<em><b>Nuclear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Energy produced from the cores of atoms (i.e., through nuclear fission or fusion).
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #NUCLEAR_VALUE
	 * @generated
	 * @ordered
	 */
	NUCLEAR(3, "nuclear", "nuclear"),

	/**
	 * The '<em><b>Wind</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Energy produced from moving air.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #WIND_VALUE
	 * @generated
	 * @ordered
	 */
	WIND(4, "wind", "wind"),

	/**
	 * The '<em><b>Solar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Energy produced from the sun (i.e., solar radiation).
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #SOLAR_VALUE
	 * @generated
	 * @ordered
	 */
	SOLAR(5, "solar", "solar"),

	/**
	 * The '<em><b>Geothermal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Energy produced from heat within the earth.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #GEOTHERMAL_VALUE
	 * @generated
	 * @ordered
	 */
	GEOTHERMAL(6, "geothermal", "geothermal"),

	/**
	 * The '<em><b>Hydropower</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Energy produced from flowing water.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #HYDROPOWER_VALUE
	 * @generated
	 * @ordered
	 */
	HYDROPOWER(7, "hydropower", "hydropower"),

	/**
	 * The '<em><b>Biofuel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Liquid fuels produced from biomass feedstocks (i.e., organic materials such as plants or animals).
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #BIOFUEL_VALUE
	 * @generated
	 * @ordered
	 */
	BIOFUEL(8, "biofuel", "biofuel"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The energy source is unknown.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(9, "unknown", "unknown"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     An energy source that is not listed.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(10, "other", "other");

	/**
	 * The '<em><b>Coal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Energy produced by types of coal.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #COAL
	 * @model name="coal"
	 * @generated
	 * @ordered
	 */
	public static final int COAL_VALUE = 0;

	/**
	 * The '<em><b>Oil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Petroleum products (primarily crude oil and its derivative fuel oils).
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #OIL
	 * @model name="oil"
	 * @generated
	 * @ordered
	 */
	public static final int OIL_VALUE = 1;

	/**
	 * The '<em><b>Natural Gas</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Hydrocarbon gas liquids (HGL) that occur as gases at atmospheric pressure and as liquids under higher pressures including Natural gas (C5H12 and heavier), Ethane (C2H6), Propane (C3H8), etc.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #NATURAL_GAS
	 * @model name="naturalGas" literal="natural-gas"
	 * @generated
	 * @ordered
	 */
	public static final int NATURAL_GAS_VALUE = 2;

	/**
	 * The '<em><b>Nuclear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Energy produced from the cores of atoms (i.e., through nuclear fission or fusion).
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #NUCLEAR
	 * @model name="nuclear"
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_VALUE = 3;

	/**
	 * The '<em><b>Wind</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Energy produced from moving air.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #WIND
	 * @model name="wind"
	 * @generated
	 * @ordered
	 */
	public static final int WIND_VALUE = 4;

	/**
	 * The '<em><b>Solar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Energy produced from the sun (i.e., solar radiation).
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #SOLAR
	 * @model name="solar"
	 * @generated
	 * @ordered
	 */
	public static final int SOLAR_VALUE = 5;

	/**
	 * The '<em><b>Geothermal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Energy produced from heat within the earth.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #GEOTHERMAL
	 * @model name="geothermal"
	 * @generated
	 * @ordered
	 */
	public static final int GEOTHERMAL_VALUE = 6;

	/**
	 * The '<em><b>Hydropower</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Energy produced from flowing water.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #HYDROPOWER
	 * @model name="hydropower"
	 * @generated
	 * @ordered
	 */
	public static final int HYDROPOWER_VALUE = 7;

	/**
	 * The '<em><b>Biofuel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Liquid fuels produced from biomass feedstocks (i.e., organic materials such as plants or animals).
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #BIOFUEL
	 * @model name="biofuel"
	 * @generated
	 * @ordered
	 */
	public static final int BIOFUEL_VALUE = 8;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The energy source is unknown.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 9;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     An energy source that is not listed.
	 *                                 
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 10;

	/**
	 * An array of all the '<em><b>Energy Source Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnergySourceType[] VALUES_ARRAY =
		new EnergySourceType[] {
			COAL,
			OIL,
			NATURAL_GAS,
			NUCLEAR,
			WIND,
			SOLAR,
			GEOTHERMAL,
			HYDROPOWER,
			BIOFUEL,
			UNKNOWN,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Energy Source Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnergySourceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Energy Source Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnergySourceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnergySourceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Energy Source Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnergySourceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnergySourceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Energy Source Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnergySourceType get(int value) {
		switch (value) {
			case COAL_VALUE: return COAL;
			case OIL_VALUE: return OIL;
			case NATURAL_GAS_VALUE: return NATURAL_GAS;
			case NUCLEAR_VALUE: return NUCLEAR;
			case WIND_VALUE: return WIND;
			case SOLAR_VALUE: return SOLAR;
			case GEOTHERMAL_VALUE: return GEOTHERMAL;
			case HYDROPOWER_VALUE: return HYDROPOWER;
			case BIOFUEL_VALUE: return BIOFUEL;
			case UNKNOWN_VALUE: return UNKNOWN;
			case OTHER_VALUE: return OTHER;
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
	private EnergySourceType(int value, String name, String literal) {
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
	
} //EnergySourceType
