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
 * A representation of the literals of the enumeration '<em><b>Units Pressure</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *         The units used to represent a pressure
 *       
 * <!-- end-model-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getUnitsPressure()
 * @model extendedMetaData="name='UnitsPressure'"
 * @generated
 */
@ProviderType
public enum UnitsPressure implements Enumerator {
	/**
	 * The '<em><b>YPa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yottapascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #YPA_VALUE
	 * @generated
	 * @ordered
	 */
	YPA(0, "YPa", "YPa"),

	/**
	 * The '<em><b>ZPa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zettapascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #ZPA_VALUE
	 * @generated
	 * @ordered
	 */
	ZPA(1, "ZPa", "ZPa"),

	/**
	 * The '<em><b>EPa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * exapascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #EPA_VALUE
	 * @generated
	 * @ordered
	 */
	EPA(2, "EPa", "EPa"),

	/**
	 * The '<em><b>PPa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * petapascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #PPA_VALUE
	 * @generated
	 * @ordered
	 */
	PPA(3, "PPa", "PPa"),

	/**
	 * The '<em><b>TPa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * terapascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #TPA_VALUE
	 * @generated
	 * @ordered
	 */
	TPA(4, "TPa", "TPa"),

	/**
	 * The '<em><b>GPa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gigapascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #GPA_VALUE
	 * @generated
	 * @ordered
	 */
	GPA(5, "GPa", "GPa"),

	/**
	 * The '<em><b>MPa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * megapascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #MPA_VALUE
	 * @generated
	 * @ordered
	 */
	MPA(6, "MPa", "MPa"),

	/**
	 * The '<em><b>KPa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * kilopascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #KPA_VALUE
	 * @generated
	 * @ordered
	 */
	KPA(7, "kPa", "kPa"),

	/**
	 * The '<em><b>HPa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hectopascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #HPA_VALUE
	 * @generated
	 * @ordered
	 */
	HPA(8, "hPa", "hPa"),

	/**
	 * The '<em><b>Da Pa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decapascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #DA_PA_VALUE
	 * @generated
	 * @ordered
	 */
	DA_PA(9, "daPa", "daPa"),

	/**
	 * The '<em><b>Pa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * pascal SI unit.  Note the C++ enum is mixed case due to PASCAL being a macro used by the Microsoft C and C++ compiler.
	 * <!-- end-model-doc -->
	 * @see #PA_VALUE
	 * @generated
	 * @ordered
	 */
	PA(10, "Pa", "Pa"),

	/**
	 * The '<em><b>DPa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decipascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #DPA_VALUE
	 * @generated
	 * @ordered
	 */
	DPA(11, "dPa", "dPa"),

	/**
	 * The '<em><b>CPa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * centipascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #CPA_VALUE
	 * @generated
	 * @ordered
	 */
	CPA(12, "cPa", "cPa"),

	/**
	 * The '<em><b>MPa1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * millipascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #MPA1_VALUE
	 * @generated
	 * @ordered
	 */
	MPA1(13, "mPa1", "mPa"),

	/**
	 * The '<em><b>ΜPa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * micropascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #ΜPA_VALUE
	 * @generated
	 * @ordered
	 */
	ΜPA(14, "µPa", "\u00b5Pa"),

	/**
	 * The '<em><b>NPa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nanopascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #NPA_VALUE
	 * @generated
	 * @ordered
	 */
	NPA(15, "nPa", "nPa"),

	/**
	 * The '<em><b>PPa1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * picopascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #PPA1_VALUE
	 * @generated
	 * @ordered
	 */
	PPA1(16, "pPa1", "pPa"),

	/**
	 * The '<em><b>FPa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * femtopascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #FPA_VALUE
	 * @generated
	 * @ordered
	 */
	FPA(17, "fPa", "fPa"),

	/**
	 * The '<em><b>APa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * attopascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #APA_VALUE
	 * @generated
	 * @ordered
	 */
	APA(18, "aPa", "aPa"),

	/**
	 * The '<em><b>ZPa1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zeptopascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #ZPA1_VALUE
	 * @generated
	 * @ordered
	 */
	ZPA1(19, "zPa1", "zPa"),

	/**
	 * The '<em><b>YPa1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yoctopascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #YPA1_VALUE
	 * @generated
	 * @ordered
	 */
	YPA1(20, "yPa1", "yPa"),

	/**
	 * The '<em><b>Bar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * bar SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #BAR_VALUE
	 * @generated
	 * @ordered
	 */
	BAR(21, "bar", "bar"),

	/**
	 * The '<em><b>Mbar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * megabar SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #MBAR_VALUE
	 * @generated
	 * @ordered
	 */
	MBAR(22, "Mbar", "Mbar"),

	/**
	 * The '<em><b>Kbar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * kilobar SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #KBAR_VALUE
	 * @generated
	 * @ordered
	 */
	KBAR(23, "kbar", "kbar"),

	/**
	 * The '<em><b>Dbar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decibar SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #DBAR_VALUE
	 * @generated
	 * @ordered
	 */
	DBAR(24, "dbar", "dbar"),

	/**
	 * The '<em><b>Cbar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * centibar SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #CBAR_VALUE
	 * @generated
	 * @ordered
	 */
	CBAR(25, "cbar", "cbar"),

	/**
	 * The '<em><b>Mbar1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * millibar SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #MBAR1_VALUE
	 * @generated
	 * @ordered
	 */
	MBAR1(26, "mbar1", "mbar"),

	/**
	 * The '<em><b>Atm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * standard atmosphere SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #ATM_VALUE
	 * @generated
	 * @ordered
	 */
	ATM(27, "atm", "atm"),

	/**
	 * The '<em><b>Psi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * pound-force per square inch Imperial unit.
	 * <!-- end-model-doc -->
	 * @see #PSI_VALUE
	 * @generated
	 * @ordered
	 */
	PSI(28, "psi", "psi"),

	/**
	 * The '<em><b>Torr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * torr SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #TORR_VALUE
	 * @generated
	 * @ordered
	 */
	TORR(29, "Torr", "Torr"),

	/**
	 * The '<em><b>MTorr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * millitorr SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #MTORR_VALUE
	 * @generated
	 * @ordered
	 */
	MTORR(30, "mTorr", "mTorr"),

	/**
	 * The '<em><b>Mm Hg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * millimetre of mercury SI-derived unit
	 * <!-- end-model-doc -->
	 * @see #MM_HG_VALUE
	 * @generated
	 * @ordered
	 */
	MM_HG(31, "mmHg", "mm Hg");

	/**
	 * The '<em><b>YPa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yottapascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #YPA
	 * @model name="YPa"
	 * @generated
	 * @ordered
	 */
	public static final int YPA_VALUE = 0;

	/**
	 * The '<em><b>ZPa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zettapascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #ZPA
	 * @model name="ZPa"
	 * @generated
	 * @ordered
	 */
	public static final int ZPA_VALUE = 1;

	/**
	 * The '<em><b>EPa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * exapascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #EPA
	 * @model name="EPa"
	 * @generated
	 * @ordered
	 */
	public static final int EPA_VALUE = 2;

	/**
	 * The '<em><b>PPa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * petapascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #PPA
	 * @model name="PPa"
	 * @generated
	 * @ordered
	 */
	public static final int PPA_VALUE = 3;

	/**
	 * The '<em><b>TPa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * terapascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #TPA
	 * @model name="TPa"
	 * @generated
	 * @ordered
	 */
	public static final int TPA_VALUE = 4;

	/**
	 * The '<em><b>GPa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gigapascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #GPA
	 * @model name="GPa"
	 * @generated
	 * @ordered
	 */
	public static final int GPA_VALUE = 5;

	/**
	 * The '<em><b>MPa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * megapascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #MPA
	 * @model name="MPa"
	 * @generated
	 * @ordered
	 */
	public static final int MPA_VALUE = 6;

	/**
	 * The '<em><b>KPa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * kilopascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #KPA
	 * @model name="kPa"
	 * @generated
	 * @ordered
	 */
	public static final int KPA_VALUE = 7;

	/**
	 * The '<em><b>HPa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hectopascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #HPA
	 * @model name="hPa"
	 * @generated
	 * @ordered
	 */
	public static final int HPA_VALUE = 8;

	/**
	 * The '<em><b>Da Pa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decapascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #DA_PA
	 * @model name="daPa"
	 * @generated
	 * @ordered
	 */
	public static final int DA_PA_VALUE = 9;

	/**
	 * The '<em><b>Pa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * pascal SI unit.  Note the C++ enum is mixed case due to PASCAL being a macro used by the Microsoft C and C++ compiler.
	 * <!-- end-model-doc -->
	 * @see #PA
	 * @model name="Pa"
	 * @generated
	 * @ordered
	 */
	public static final int PA_VALUE = 10;

	/**
	 * The '<em><b>DPa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decipascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #DPA
	 * @model name="dPa"
	 * @generated
	 * @ordered
	 */
	public static final int DPA_VALUE = 11;

	/**
	 * The '<em><b>CPa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * centipascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #CPA
	 * @model name="cPa"
	 * @generated
	 * @ordered
	 */
	public static final int CPA_VALUE = 12;

	/**
	 * The '<em><b>MPa1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * millipascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #MPA1
	 * @model name="mPa1" literal="mPa"
	 * @generated
	 * @ordered
	 */
	public static final int MPA1_VALUE = 13;

	/**
	 * The '<em><b>ΜPa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * micropascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #ΜPA
	 * @model name="µPa"
	 * @generated
	 * @ordered
	 */
	public static final int ΜPA_VALUE = 14;

	/**
	 * The '<em><b>NPa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nanopascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #NPA
	 * @model name="nPa"
	 * @generated
	 * @ordered
	 */
	public static final int NPA_VALUE = 15;

	/**
	 * The '<em><b>PPa1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * picopascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #PPA1
	 * @model name="pPa1" literal="pPa"
	 * @generated
	 * @ordered
	 */
	public static final int PPA1_VALUE = 16;

	/**
	 * The '<em><b>FPa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * femtopascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #FPA
	 * @model name="fPa"
	 * @generated
	 * @ordered
	 */
	public static final int FPA_VALUE = 17;

	/**
	 * The '<em><b>APa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * attopascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #APA
	 * @model name="aPa"
	 * @generated
	 * @ordered
	 */
	public static final int APA_VALUE = 18;

	/**
	 * The '<em><b>ZPa1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zeptopascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #ZPA1
	 * @model name="zPa1" literal="zPa"
	 * @generated
	 * @ordered
	 */
	public static final int ZPA1_VALUE = 19;

	/**
	 * The '<em><b>YPa1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yoctopascal SI unit.
	 * <!-- end-model-doc -->
	 * @see #YPA1
	 * @model name="yPa1" literal="yPa"
	 * @generated
	 * @ordered
	 */
	public static final int YPA1_VALUE = 20;

	/**
	 * The '<em><b>Bar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * bar SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #BAR
	 * @model name="bar"
	 * @generated
	 * @ordered
	 */
	public static final int BAR_VALUE = 21;

	/**
	 * The '<em><b>Mbar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * megabar SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #MBAR
	 * @model name="Mbar"
	 * @generated
	 * @ordered
	 */
	public static final int MBAR_VALUE = 22;

	/**
	 * The '<em><b>Kbar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * kilobar SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #KBAR
	 * @model name="kbar"
	 * @generated
	 * @ordered
	 */
	public static final int KBAR_VALUE = 23;

	/**
	 * The '<em><b>Dbar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decibar SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #DBAR
	 * @model name="dbar"
	 * @generated
	 * @ordered
	 */
	public static final int DBAR_VALUE = 24;

	/**
	 * The '<em><b>Cbar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * centibar SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #CBAR
	 * @model name="cbar"
	 * @generated
	 * @ordered
	 */
	public static final int CBAR_VALUE = 25;

	/**
	 * The '<em><b>Mbar1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * millibar SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #MBAR1
	 * @model name="mbar1" literal="mbar"
	 * @generated
	 * @ordered
	 */
	public static final int MBAR1_VALUE = 26;

	/**
	 * The '<em><b>Atm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * standard atmosphere SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #ATM
	 * @model name="atm"
	 * @generated
	 * @ordered
	 */
	public static final int ATM_VALUE = 27;

	/**
	 * The '<em><b>Psi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * pound-force per square inch Imperial unit.
	 * <!-- end-model-doc -->
	 * @see #PSI
	 * @model name="psi"
	 * @generated
	 * @ordered
	 */
	public static final int PSI_VALUE = 28;

	/**
	 * The '<em><b>Torr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * torr SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #TORR
	 * @model name="Torr"
	 * @generated
	 * @ordered
	 */
	public static final int TORR_VALUE = 29;

	/**
	 * The '<em><b>MTorr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * millitorr SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #MTORR
	 * @model name="mTorr"
	 * @generated
	 * @ordered
	 */
	public static final int MTORR_VALUE = 30;

	/**
	 * The '<em><b>Mm Hg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * millimetre of mercury SI-derived unit
	 * <!-- end-model-doc -->
	 * @see #MM_HG
	 * @model name="mmHg" literal="mm Hg"
	 * @generated
	 * @ordered
	 */
	public static final int MM_HG_VALUE = 31;

	/**
	 * An array of all the '<em><b>Units Pressure</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitsPressure[] VALUES_ARRAY =
		new UnitsPressure[] {
			YPA,
			ZPA,
			EPA,
			PPA,
			TPA,
			GPA,
			MPA,
			KPA,
			HPA,
			DA_PA,
			PA,
			DPA,
			CPA,
			MPA1,
			ΜPA,
			NPA,
			PPA1,
			FPA,
			APA,
			ZPA1,
			YPA1,
			BAR,
			MBAR,
			KBAR,
			DBAR,
			CBAR,
			MBAR1,
			ATM,
			PSI,
			TORR,
			MTORR,
			MM_HG,
		};

	/**
	 * A public read-only list of all the '<em><b>Units Pressure</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitsPressure> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Units Pressure</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsPressure get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsPressure result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Pressure</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsPressure getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsPressure result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Pressure</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsPressure get(int value) {
		switch (value) {
			case YPA_VALUE: return YPA;
			case ZPA_VALUE: return ZPA;
			case EPA_VALUE: return EPA;
			case PPA_VALUE: return PPA;
			case TPA_VALUE: return TPA;
			case GPA_VALUE: return GPA;
			case MPA_VALUE: return MPA;
			case KPA_VALUE: return KPA;
			case HPA_VALUE: return HPA;
			case DA_PA_VALUE: return DA_PA;
			case PA_VALUE: return PA;
			case DPA_VALUE: return DPA;
			case CPA_VALUE: return CPA;
			case MPA1_VALUE: return MPA1;
			case ΜPA_VALUE: return ΜPA;
			case NPA_VALUE: return NPA;
			case PPA1_VALUE: return PPA1;
			case FPA_VALUE: return FPA;
			case APA_VALUE: return APA;
			case ZPA1_VALUE: return ZPA1;
			case YPA1_VALUE: return YPA1;
			case BAR_VALUE: return BAR;
			case MBAR_VALUE: return MBAR;
			case KBAR_VALUE: return KBAR;
			case DBAR_VALUE: return DBAR;
			case CBAR_VALUE: return CBAR;
			case MBAR1_VALUE: return MBAR1;
			case ATM_VALUE: return ATM;
			case PSI_VALUE: return PSI;
			case TORR_VALUE: return TORR;
			case MTORR_VALUE: return MTORR;
			case MM_HG_VALUE: return MM_HG;
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
	private UnitsPressure(int value, String name, String literal) {
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
	
} //UnitsPressure
