/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.openmicroscopy.ome;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Laser Medium Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getLaserMediumType()
 * @model extendedMetaData="name='LaserMedium_._type'"
 * @generated
 */
@ProviderType
public enum LaserMediumType implements Enumerator {
	/**
	 * The '<em><b>Cu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CU_VALUE
	 * @generated
	 * @ordered
	 */
	CU(0, "Cu", "Cu"),

	/**
	 * The '<em><b>Ag</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AG_VALUE
	 * @generated
	 * @ordered
	 */
	AG(1, "Ag", "Ag"),

	/**
	 * The '<em><b>Ar Fl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AR_FL_VALUE
	 * @generated
	 * @ordered
	 */
	AR_FL(2, "ArFl", "ArFl"),

	/**
	 * The '<em><b>Ar Cl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AR_CL_VALUE
	 * @generated
	 * @ordered
	 */
	AR_CL(3, "ArCl", "ArCl"),

	/**
	 * The '<em><b>Kr Fl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KR_FL_VALUE
	 * @generated
	 * @ordered
	 */
	KR_FL(4, "KrFl", "KrFl"),

	/**
	 * The '<em><b>Kr Cl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KR_CL_VALUE
	 * @generated
	 * @ordered
	 */
	KR_CL(5, "KrCl", "KrCl"),

	/**
	 * The '<em><b>Xe Fl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XE_FL_VALUE
	 * @generated
	 * @ordered
	 */
	XE_FL(6, "XeFl", "XeFl"),

	/**
	 * The '<em><b>Xe Cl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XE_CL_VALUE
	 * @generated
	 * @ordered
	 */
	XE_CL(7, "XeCl", "XeCl"),

	/**
	 * The '<em><b>Xe Br</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XE_BR_VALUE
	 * @generated
	 * @ordered
	 */
	XE_BR(8, "XeBr", "XeBr"),

	/**
	 * The '<em><b>N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #N_VALUE
	 * @generated
	 * @ordered
	 */
	N(9, "N", "N"),

	/**
	 * The '<em><b>Ar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AR_VALUE
	 * @generated
	 * @ordered
	 */
	AR(10, "Ar", "Ar"),

	/**
	 * The '<em><b>Kr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KR_VALUE
	 * @generated
	 * @ordered
	 */
	KR(11, "Kr", "Kr"),

	/**
	 * The '<em><b>Xe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XE_VALUE
	 * @generated
	 * @ordered
	 */
	XE(12, "Xe", "Xe"),

	/**
	 * The '<em><b>He Ne</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HE_NE_VALUE
	 * @generated
	 * @ordered
	 */
	HE_NE(13, "HeNe", "HeNe"),

	/**
	 * The '<em><b>He Cd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HE_CD_VALUE
	 * @generated
	 * @ordered
	 */
	HE_CD(14, "HeCd", "HeCd"),

	/**
	 * The '<em><b>CO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_VALUE
	 * @generated
	 * @ordered
	 */
	CO(15, "CO", "CO"),

	/**
	 * The '<em><b>CO2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO2_VALUE
	 * @generated
	 * @ordered
	 */
	CO2(16, "CO2", "CO2"),

	/**
	 * The '<em><b>H2O</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H2O_VALUE
	 * @generated
	 * @ordered
	 */
	H2O(17, "H2O", "H2O"),

	/**
	 * The '<em><b>HFl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HFL_VALUE
	 * @generated
	 * @ordered
	 */
	HFL(18, "HFl", "HFl"),

	/**
	 * The '<em><b>Nd Glass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ND_GLASS_VALUE
	 * @generated
	 * @ordered
	 */
	ND_GLASS(19, "NdGlass", "NdGlass"),

	/**
	 * The '<em><b>Nd YAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ND_YAG_VALUE
	 * @generated
	 * @ordered
	 */
	ND_YAG(20, "NdYAG", "NdYAG"),

	/**
	 * The '<em><b>Er Glass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ER_GLASS_VALUE
	 * @generated
	 * @ordered
	 */
	ER_GLASS(21, "ErGlass", "ErGlass"),

	/**
	 * The '<em><b>Er YAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ER_YAG_VALUE
	 * @generated
	 * @ordered
	 */
	ER_YAG(22, "ErYAG", "ErYAG"),

	/**
	 * The '<em><b>Ho YLF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HO_YLF_VALUE
	 * @generated
	 * @ordered
	 */
	HO_YLF(23, "HoYLF", "HoYLF"),

	/**
	 * The '<em><b>Ho YAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HO_YAG_VALUE
	 * @generated
	 * @ordered
	 */
	HO_YAG(24, "HoYAG", "HoYAG"),

	/**
	 * The '<em><b>Ruby</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUBY_VALUE
	 * @generated
	 * @ordered
	 */
	RUBY(25, "Ruby", "Ruby"),

	/**
	 * The '<em><b>Ti Sapphire</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TI_SAPPHIRE_VALUE
	 * @generated
	 * @ordered
	 */
	TI_SAPPHIRE(26, "TiSapphire", "TiSapphire"),

	/**
	 * The '<em><b>Alexandrite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALEXANDRITE_VALUE
	 * @generated
	 * @ordered
	 */
	ALEXANDRITE(27, "Alexandrite", "Alexandrite"),

	/**
	 * The '<em><b>Rhodamine6 G</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHODAMINE6_G_VALUE
	 * @generated
	 * @ordered
	 */
	RHODAMINE6_G(28, "Rhodamine6G", "Rhodamine6G"),

	/**
	 * The '<em><b>Coumarin C30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUMARIN_C30_VALUE
	 * @generated
	 * @ordered
	 */
	COUMARIN_C30(29, "CoumarinC30", "CoumarinC30"),

	/**
	 * The '<em><b>Ga As</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GA_AS_VALUE
	 * @generated
	 * @ordered
	 */
	GA_AS(30, "GaAs", "GaAs"),

	/**
	 * The '<em><b>Ga Al As</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GA_AL_AS_VALUE
	 * @generated
	 * @ordered
	 */
	GA_AL_AS(31, "GaAlAs", "GaAlAs"),

	/**
	 * The '<em><b>EMinus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMINUS_VALUE
	 * @generated
	 * @ordered
	 */
	EMINUS(32, "EMinus", "EMinus"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(33, "Other", "Other");

	/**
	 * The '<em><b>Cu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CU
	 * @model name="Cu"
	 * @generated
	 * @ordered
	 */
	public static final int CU_VALUE = 0;

	/**
	 * The '<em><b>Ag</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AG
	 * @model name="Ag"
	 * @generated
	 * @ordered
	 */
	public static final int AG_VALUE = 1;

	/**
	 * The '<em><b>Ar Fl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AR_FL
	 * @model name="ArFl"
	 * @generated
	 * @ordered
	 */
	public static final int AR_FL_VALUE = 2;

	/**
	 * The '<em><b>Ar Cl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AR_CL
	 * @model name="ArCl"
	 * @generated
	 * @ordered
	 */
	public static final int AR_CL_VALUE = 3;

	/**
	 * The '<em><b>Kr Fl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KR_FL
	 * @model name="KrFl"
	 * @generated
	 * @ordered
	 */
	public static final int KR_FL_VALUE = 4;

	/**
	 * The '<em><b>Kr Cl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KR_CL
	 * @model name="KrCl"
	 * @generated
	 * @ordered
	 */
	public static final int KR_CL_VALUE = 5;

	/**
	 * The '<em><b>Xe Fl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XE_FL
	 * @model name="XeFl"
	 * @generated
	 * @ordered
	 */
	public static final int XE_FL_VALUE = 6;

	/**
	 * The '<em><b>Xe Cl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XE_CL
	 * @model name="XeCl"
	 * @generated
	 * @ordered
	 */
	public static final int XE_CL_VALUE = 7;

	/**
	 * The '<em><b>Xe Br</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XE_BR
	 * @model name="XeBr"
	 * @generated
	 * @ordered
	 */
	public static final int XE_BR_VALUE = 8;

	/**
	 * The '<em><b>N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #N
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int N_VALUE = 9;

	/**
	 * The '<em><b>Ar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AR
	 * @model name="Ar"
	 * @generated
	 * @ordered
	 */
	public static final int AR_VALUE = 10;

	/**
	 * The '<em><b>Kr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KR
	 * @model name="Kr"
	 * @generated
	 * @ordered
	 */
	public static final int KR_VALUE = 11;

	/**
	 * The '<em><b>Xe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XE
	 * @model name="Xe"
	 * @generated
	 * @ordered
	 */
	public static final int XE_VALUE = 12;

	/**
	 * The '<em><b>He Ne</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HE_NE
	 * @model name="HeNe"
	 * @generated
	 * @ordered
	 */
	public static final int HE_NE_VALUE = 13;

	/**
	 * The '<em><b>He Cd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HE_CD
	 * @model name="HeCd"
	 * @generated
	 * @ordered
	 */
	public static final int HE_CD_VALUE = 14;

	/**
	 * The '<em><b>CO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CO_VALUE = 15;

	/**
	 * The '<em><b>CO2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CO2_VALUE = 16;

	/**
	 * The '<em><b>H2O</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H2O
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int H2O_VALUE = 17;

	/**
	 * The '<em><b>HFl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HFL
	 * @model name="HFl"
	 * @generated
	 * @ordered
	 */
	public static final int HFL_VALUE = 18;

	/**
	 * The '<em><b>Nd Glass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ND_GLASS
	 * @model name="NdGlass"
	 * @generated
	 * @ordered
	 */
	public static final int ND_GLASS_VALUE = 19;

	/**
	 * The '<em><b>Nd YAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ND_YAG
	 * @model name="NdYAG"
	 * @generated
	 * @ordered
	 */
	public static final int ND_YAG_VALUE = 20;

	/**
	 * The '<em><b>Er Glass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ER_GLASS
	 * @model name="ErGlass"
	 * @generated
	 * @ordered
	 */
	public static final int ER_GLASS_VALUE = 21;

	/**
	 * The '<em><b>Er YAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ER_YAG
	 * @model name="ErYAG"
	 * @generated
	 * @ordered
	 */
	public static final int ER_YAG_VALUE = 22;

	/**
	 * The '<em><b>Ho YLF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HO_YLF
	 * @model name="HoYLF"
	 * @generated
	 * @ordered
	 */
	public static final int HO_YLF_VALUE = 23;

	/**
	 * The '<em><b>Ho YAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HO_YAG
	 * @model name="HoYAG"
	 * @generated
	 * @ordered
	 */
	public static final int HO_YAG_VALUE = 24;

	/**
	 * The '<em><b>Ruby</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUBY
	 * @model name="Ruby"
	 * @generated
	 * @ordered
	 */
	public static final int RUBY_VALUE = 25;

	/**
	 * The '<em><b>Ti Sapphire</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TI_SAPPHIRE
	 * @model name="TiSapphire"
	 * @generated
	 * @ordered
	 */
	public static final int TI_SAPPHIRE_VALUE = 26;

	/**
	 * The '<em><b>Alexandrite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALEXANDRITE
	 * @model name="Alexandrite"
	 * @generated
	 * @ordered
	 */
	public static final int ALEXANDRITE_VALUE = 27;

	/**
	 * The '<em><b>Rhodamine6 G</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHODAMINE6_G
	 * @model name="Rhodamine6G"
	 * @generated
	 * @ordered
	 */
	public static final int RHODAMINE6_G_VALUE = 28;

	/**
	 * The '<em><b>Coumarin C30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUMARIN_C30
	 * @model name="CoumarinC30"
	 * @generated
	 * @ordered
	 */
	public static final int COUMARIN_C30_VALUE = 29;

	/**
	 * The '<em><b>Ga As</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GA_AS
	 * @model name="GaAs"
	 * @generated
	 * @ordered
	 */
	public static final int GA_AS_VALUE = 30;

	/**
	 * The '<em><b>Ga Al As</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GA_AL_AS
	 * @model name="GaAlAs"
	 * @generated
	 * @ordered
	 */
	public static final int GA_AL_AS_VALUE = 31;

	/**
	 * The '<em><b>EMinus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMINUS
	 * @model name="EMinus"
	 * @generated
	 * @ordered
	 */
	public static final int EMINUS_VALUE = 32;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 33;

	/**
	 * An array of all the '<em><b>Laser Medium Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LaserMediumType[] VALUES_ARRAY =
		new LaserMediumType[] {
			CU,
			AG,
			AR_FL,
			AR_CL,
			KR_FL,
			KR_CL,
			XE_FL,
			XE_CL,
			XE_BR,
			N,
			AR,
			KR,
			XE,
			HE_NE,
			HE_CD,
			CO,
			CO2,
			H2O,
			HFL,
			ND_GLASS,
			ND_YAG,
			ER_GLASS,
			ER_YAG,
			HO_YLF,
			HO_YAG,
			RUBY,
			TI_SAPPHIRE,
			ALEXANDRITE,
			RHODAMINE6_G,
			COUMARIN_C30,
			GA_AS,
			GA_AL_AS,
			EMINUS,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Laser Medium Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LaserMediumType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Laser Medium Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LaserMediumType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LaserMediumType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Laser Medium Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LaserMediumType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LaserMediumType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Laser Medium Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LaserMediumType get(int value) {
		switch (value) {
			case CU_VALUE: return CU;
			case AG_VALUE: return AG;
			case AR_FL_VALUE: return AR_FL;
			case AR_CL_VALUE: return AR_CL;
			case KR_FL_VALUE: return KR_FL;
			case KR_CL_VALUE: return KR_CL;
			case XE_FL_VALUE: return XE_FL;
			case XE_CL_VALUE: return XE_CL;
			case XE_BR_VALUE: return XE_BR;
			case N_VALUE: return N;
			case AR_VALUE: return AR;
			case KR_VALUE: return KR;
			case XE_VALUE: return XE;
			case HE_NE_VALUE: return HE_NE;
			case HE_CD_VALUE: return HE_CD;
			case CO_VALUE: return CO;
			case CO2_VALUE: return CO2;
			case H2O_VALUE: return H2O;
			case HFL_VALUE: return HFL;
			case ND_GLASS_VALUE: return ND_GLASS;
			case ND_YAG_VALUE: return ND_YAG;
			case ER_GLASS_VALUE: return ER_GLASS;
			case ER_YAG_VALUE: return ER_YAG;
			case HO_YLF_VALUE: return HO_YLF;
			case HO_YAG_VALUE: return HO_YAG;
			case RUBY_VALUE: return RUBY;
			case TI_SAPPHIRE_VALUE: return TI_SAPPHIRE;
			case ALEXANDRITE_VALUE: return ALEXANDRITE;
			case RHODAMINE6_G_VALUE: return RHODAMINE6_G;
			case COUMARIN_C30_VALUE: return COUMARIN_C30;
			case GA_AS_VALUE: return GA_AS;
			case GA_AL_AS_VALUE: return GA_AL_AS;
			case EMINUS_VALUE: return EMINUS;
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
	private LaserMediumType(int value, String name, String literal) {
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
	
} //LaserMediumType
