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
 * A representation of the literals of the enumeration '<em><b>Units Length</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *         The units used to represent a length
 *       
 * <!-- end-model-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getUnitsLength()
 * @model extendedMetaData="name='UnitsLength'"
 * @generated
 */
@ProviderType
public enum UnitsLength implements Enumerator {
	/**
	 * The '<em><b>Ym</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yottameter SI unit.
	 * <!-- end-model-doc -->
	 * @see #YM_VALUE
	 * @generated
	 * @ordered
	 */
	YM(0, "Ym", "Ym"),

	/**
	 * The '<em><b>Zm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zettameter SI unit.
	 * <!-- end-model-doc -->
	 * @see #ZM_VALUE
	 * @generated
	 * @ordered
	 */
	ZM(1, "Zm", "Zm"),

	/**
	 * The '<em><b>Em</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  exameter SI unit.
	 * <!-- end-model-doc -->
	 * @see #EM_VALUE
	 * @generated
	 * @ordered
	 */
	EM(2, "Em", "Em"),

	/**
	 * The '<em><b>Pm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * petameter SI unit.
	 * <!-- end-model-doc -->
	 * @see #PM_VALUE
	 * @generated
	 * @ordered
	 */
	PM(3, "Pm", "Pm"),

	/**
	 * The '<em><b>Tm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * terameter SI unit.
	 * <!-- end-model-doc -->
	 * @see #TM_VALUE
	 * @generated
	 * @ordered
	 */
	TM(4, "Tm", "Tm"),

	/**
	 * The '<em><b>Gm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gigameter SI unit.
	 * <!-- end-model-doc -->
	 * @see #GM_VALUE
	 * @generated
	 * @ordered
	 */
	GM(5, "Gm", "Gm"),

	/**
	 * The '<em><b>Mm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * megameter SI unit.
	 * <!-- end-model-doc -->
	 * @see #MM_VALUE
	 * @generated
	 * @ordered
	 */
	MM(6, "Mm", "Mm"),

	/**
	 * The '<em><b>Km</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * kilometer SI unit.
	 * <!-- end-model-doc -->
	 * @see #KM_VALUE
	 * @generated
	 * @ordered
	 */
	KM(7, "km", "km"),

	/**
	 * The '<em><b>Hm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hectometer SI unit.
	 * <!-- end-model-doc -->
	 * @see #HM_VALUE
	 * @generated
	 * @ordered
	 */
	HM(8, "hm", "hm"),

	/**
	 * The '<em><b>Dam</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decameter SI unit.
	 * <!-- end-model-doc -->
	 * @see #DAM_VALUE
	 * @generated
	 * @ordered
	 */
	DAM(9, "dam", "dam"),

	/**
	 * The '<em><b>M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * meter SI unit.
	 * <!-- end-model-doc -->
	 * @see #M_VALUE
	 * @generated
	 * @ordered
	 */
	M(10, "m", "m"),

	/**
	 * The '<em><b>Dm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decimeter SI unit.
	 * <!-- end-model-doc -->
	 * @see #DM_VALUE
	 * @generated
	 * @ordered
	 */
	DM(11, "dm", "dm"),

	/**
	 * The '<em><b>Cm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * centimeter SI unit.
	 * <!-- end-model-doc -->
	 * @see #CM_VALUE
	 * @generated
	 * @ordered
	 */
	CM(12, "cm", "cm"),

	/**
	 * The '<em><b>Mm1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * millimeter SI unit.
	 * <!-- end-model-doc -->
	 * @see #MM1_VALUE
	 * @generated
	 * @ordered
	 */
	MM1(13, "mm1", "mm"),

	/**
	 * The '<em><b>Μm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * micrometer SI unit.
	 * <!-- end-model-doc -->
	 * @see #ΜM_VALUE
	 * @generated
	 * @ordered
	 */
	ΜM(14, "µm", "\u00b5m"),

	/**
	 * The '<em><b>Nm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nanometer SI unit.
	 * <!-- end-model-doc -->
	 * @see #NM_VALUE
	 * @generated
	 * @ordered
	 */
	NM(15, "nm", "nm"),

	/**
	 * The '<em><b>Pm1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * picometer SI unit.
	 * <!-- end-model-doc -->
	 * @see #PM1_VALUE
	 * @generated
	 * @ordered
	 */
	PM1(16, "pm1", "pm"),

	/**
	 * The '<em><b>Fm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * femtometer SI unit.
	 * <!-- end-model-doc -->
	 * @see #FM_VALUE
	 * @generated
	 * @ordered
	 */
	FM(17, "fm", "fm"),

	/**
	 * The '<em><b>Am</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * attometer SI unit.
	 * <!-- end-model-doc -->
	 * @see #AM_VALUE
	 * @generated
	 * @ordered
	 */
	AM(18, "am", "am"),

	/**
	 * The '<em><b>Zm1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zeptometer SI unit.
	 * <!-- end-model-doc -->
	 * @see #ZM1_VALUE
	 * @generated
	 * @ordered
	 */
	ZM1(19, "zm1", "zm"),

	/**
	 * The '<em><b>Ym1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yoctometer SI unit.
	 * <!-- end-model-doc -->
	 * @see #YM1_VALUE
	 * @generated
	 * @ordered
	 */
	YM1(20, "ym1", "ym"),

	/**
	 * The '<em><b>Å</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ångström SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #Å_VALUE
	 * @generated
	 * @ordered
	 */
	Å(21, "Å", "\u00c5"),

	/**
	 * The '<em><b>Thou</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * thou Imperial unit (or mil, 1/1000 inch).
	 * <!-- end-model-doc -->
	 * @see #THOU_VALUE
	 * @generated
	 * @ordered
	 */
	THOU(22, "thou", "thou"),

	/**
	 * The '<em><b>Li</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * line Imperial unit (1/12 inch).
	 * <!-- end-model-doc -->
	 * @see #LI_VALUE
	 * @generated
	 * @ordered
	 */
	LI(23, "li", "li"),

	/**
	 * The '<em><b>In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * inch Imperial unit.
	 * <!-- end-model-doc -->
	 * @see #IN_VALUE
	 * @generated
	 * @ordered
	 */
	IN(24, "in", "in"),

	/**
	 * The '<em><b>Ft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * foot Imperial unit.
	 * <!-- end-model-doc -->
	 * @see #FT_VALUE
	 * @generated
	 * @ordered
	 */
	FT(25, "ft", "ft"),

	/**
	 * The '<em><b>Yd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yard Imperial unit.
	 * <!-- end-model-doc -->
	 * @see #YD_VALUE
	 * @generated
	 * @ordered
	 */
	YD(26, "yd", "yd"),

	/**
	 * The '<em><b>Mi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * terrestrial mile Imperial unit.
	 * <!-- end-model-doc -->
	 * @see #MI_VALUE
	 * @generated
	 * @ordered
	 */
	MI(27, "mi", "mi"),

	/**
	 * The '<em><b>Ua</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * astronomical unit SI-derived unit. The official term is ua as the SI standard assigned AU to absorbance unit.
	 * <!-- end-model-doc -->
	 * @see #UA_VALUE
	 * @generated
	 * @ordered
	 */
	UA(28, "ua", "ua"),

	/**
	 * The '<em><b>Ly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * light year.
	 * <!-- end-model-doc -->
	 * @see #LY_VALUE
	 * @generated
	 * @ordered
	 */
	LY(29, "ly", "ly"),

	/**
	 * The '<em><b>Pc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * parsec.
	 * <!-- end-model-doc -->
	 * @see #PC_VALUE
	 * @generated
	 * @ordered
	 */
	PC(30, "pc", "pc"),

	/**
	 * The '<em><b>Pt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * typography point Imperial-derived unit (1/72 inch). Use of this unit should be limited to font sizes.
	 * <!-- end-model-doc -->
	 * @see #PT_VALUE
	 * @generated
	 * @ordered
	 */
	PT(31, "pt", "pt"),

	/**
	 * The '<em><b>Pixel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * pixel abstract unit.  This is not convertible to any other length unit without a calibrated scaling factor. Its use should should be limited to ROI objects, and converted to an appropriate length units using the PhysicalSize units of the Image the ROI is attached to.
	 * <!-- end-model-doc -->
	 * @see #PIXEL_VALUE
	 * @generated
	 * @ordered
	 */
	PIXEL(32, "pixel", "pixel"),

	/**
	 * The '<em><b>Reference Frame</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * reference frame abstract unit.  This is not convertible to any other length unit without a scaling factor.  Its use should be limited to uncalibrated stage positions, and converted to an appropriate length unit using a calibrated scaling factor.
	 * <!-- end-model-doc -->
	 * @see #REFERENCE_FRAME_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCE_FRAME(33, "referenceFrame", "reference frame");

	/**
	 * The '<em><b>Ym</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yottameter SI unit.
	 * <!-- end-model-doc -->
	 * @see #YM
	 * @model name="Ym"
	 * @generated
	 * @ordered
	 */
	public static final int YM_VALUE = 0;

	/**
	 * The '<em><b>Zm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zettameter SI unit.
	 * <!-- end-model-doc -->
	 * @see #ZM
	 * @model name="Zm"
	 * @generated
	 * @ordered
	 */
	public static final int ZM_VALUE = 1;

	/**
	 * The '<em><b>Em</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  exameter SI unit.
	 * <!-- end-model-doc -->
	 * @see #EM
	 * @model name="Em"
	 * @generated
	 * @ordered
	 */
	public static final int EM_VALUE = 2;

	/**
	 * The '<em><b>Pm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * petameter SI unit.
	 * <!-- end-model-doc -->
	 * @see #PM
	 * @model name="Pm"
	 * @generated
	 * @ordered
	 */
	public static final int PM_VALUE = 3;

	/**
	 * The '<em><b>Tm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * terameter SI unit.
	 * <!-- end-model-doc -->
	 * @see #TM
	 * @model name="Tm"
	 * @generated
	 * @ordered
	 */
	public static final int TM_VALUE = 4;

	/**
	 * The '<em><b>Gm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gigameter SI unit.
	 * <!-- end-model-doc -->
	 * @see #GM
	 * @model name="Gm"
	 * @generated
	 * @ordered
	 */
	public static final int GM_VALUE = 5;

	/**
	 * The '<em><b>Mm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * megameter SI unit.
	 * <!-- end-model-doc -->
	 * @see #MM
	 * @model name="Mm"
	 * @generated
	 * @ordered
	 */
	public static final int MM_VALUE = 6;

	/**
	 * The '<em><b>Km</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * kilometer SI unit.
	 * <!-- end-model-doc -->
	 * @see #KM
	 * @model name="km"
	 * @generated
	 * @ordered
	 */
	public static final int KM_VALUE = 7;

	/**
	 * The '<em><b>Hm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hectometer SI unit.
	 * <!-- end-model-doc -->
	 * @see #HM
	 * @model name="hm"
	 * @generated
	 * @ordered
	 */
	public static final int HM_VALUE = 8;

	/**
	 * The '<em><b>Dam</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decameter SI unit.
	 * <!-- end-model-doc -->
	 * @see #DAM
	 * @model name="dam"
	 * @generated
	 * @ordered
	 */
	public static final int DAM_VALUE = 9;

	/**
	 * The '<em><b>M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * meter SI unit.
	 * <!-- end-model-doc -->
	 * @see #M
	 * @model name="m"
	 * @generated
	 * @ordered
	 */
	public static final int M_VALUE = 10;

	/**
	 * The '<em><b>Dm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decimeter SI unit.
	 * <!-- end-model-doc -->
	 * @see #DM
	 * @model name="dm"
	 * @generated
	 * @ordered
	 */
	public static final int DM_VALUE = 11;

	/**
	 * The '<em><b>Cm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * centimeter SI unit.
	 * <!-- end-model-doc -->
	 * @see #CM
	 * @model name="cm"
	 * @generated
	 * @ordered
	 */
	public static final int CM_VALUE = 12;

	/**
	 * The '<em><b>Mm1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * millimeter SI unit.
	 * <!-- end-model-doc -->
	 * @see #MM1
	 * @model name="mm1" literal="mm"
	 * @generated
	 * @ordered
	 */
	public static final int MM1_VALUE = 13;

	/**
	 * The '<em><b>Μm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * micrometer SI unit.
	 * <!-- end-model-doc -->
	 * @see #ΜM
	 * @model name="µm"
	 * @generated
	 * @ordered
	 */
	public static final int ΜM_VALUE = 14;

	/**
	 * The '<em><b>Nm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nanometer SI unit.
	 * <!-- end-model-doc -->
	 * @see #NM
	 * @model name="nm"
	 * @generated
	 * @ordered
	 */
	public static final int NM_VALUE = 15;

	/**
	 * The '<em><b>Pm1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * picometer SI unit.
	 * <!-- end-model-doc -->
	 * @see #PM1
	 * @model name="pm1" literal="pm"
	 * @generated
	 * @ordered
	 */
	public static final int PM1_VALUE = 16;

	/**
	 * The '<em><b>Fm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * femtometer SI unit.
	 * <!-- end-model-doc -->
	 * @see #FM
	 * @model name="fm"
	 * @generated
	 * @ordered
	 */
	public static final int FM_VALUE = 17;

	/**
	 * The '<em><b>Am</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * attometer SI unit.
	 * <!-- end-model-doc -->
	 * @see #AM
	 * @model name="am"
	 * @generated
	 * @ordered
	 */
	public static final int AM_VALUE = 18;

	/**
	 * The '<em><b>Zm1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zeptometer SI unit.
	 * <!-- end-model-doc -->
	 * @see #ZM1
	 * @model name="zm1" literal="zm"
	 * @generated
	 * @ordered
	 */
	public static final int ZM1_VALUE = 19;

	/**
	 * The '<em><b>Ym1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yoctometer SI unit.
	 * <!-- end-model-doc -->
	 * @see #YM1
	 * @model name="ym1" literal="ym"
	 * @generated
	 * @ordered
	 */
	public static final int YM1_VALUE = 20;

	/**
	 * The '<em><b>Å</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ångström SI-derived unit.
	 * <!-- end-model-doc -->
	 * @see #Å
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int Å_VALUE = 21;

	/**
	 * The '<em><b>Thou</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * thou Imperial unit (or mil, 1/1000 inch).
	 * <!-- end-model-doc -->
	 * @see #THOU
	 * @model name="thou"
	 * @generated
	 * @ordered
	 */
	public static final int THOU_VALUE = 22;

	/**
	 * The '<em><b>Li</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * line Imperial unit (1/12 inch).
	 * <!-- end-model-doc -->
	 * @see #LI
	 * @model name="li"
	 * @generated
	 * @ordered
	 */
	public static final int LI_VALUE = 23;

	/**
	 * The '<em><b>In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * inch Imperial unit.
	 * <!-- end-model-doc -->
	 * @see #IN
	 * @model name="in"
	 * @generated
	 * @ordered
	 */
	public static final int IN_VALUE = 24;

	/**
	 * The '<em><b>Ft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * foot Imperial unit.
	 * <!-- end-model-doc -->
	 * @see #FT
	 * @model name="ft"
	 * @generated
	 * @ordered
	 */
	public static final int FT_VALUE = 25;

	/**
	 * The '<em><b>Yd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * yard Imperial unit.
	 * <!-- end-model-doc -->
	 * @see #YD
	 * @model name="yd"
	 * @generated
	 * @ordered
	 */
	public static final int YD_VALUE = 26;

	/**
	 * The '<em><b>Mi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * terrestrial mile Imperial unit.
	 * <!-- end-model-doc -->
	 * @see #MI
	 * @model name="mi"
	 * @generated
	 * @ordered
	 */
	public static final int MI_VALUE = 27;

	/**
	 * The '<em><b>Ua</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * astronomical unit SI-derived unit. The official term is ua as the SI standard assigned AU to absorbance unit.
	 * <!-- end-model-doc -->
	 * @see #UA
	 * @model name="ua"
	 * @generated
	 * @ordered
	 */
	public static final int UA_VALUE = 28;

	/**
	 * The '<em><b>Ly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * light year.
	 * <!-- end-model-doc -->
	 * @see #LY
	 * @model name="ly"
	 * @generated
	 * @ordered
	 */
	public static final int LY_VALUE = 29;

	/**
	 * The '<em><b>Pc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * parsec.
	 * <!-- end-model-doc -->
	 * @see #PC
	 * @model name="pc"
	 * @generated
	 * @ordered
	 */
	public static final int PC_VALUE = 30;

	/**
	 * The '<em><b>Pt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * typography point Imperial-derived unit (1/72 inch). Use of this unit should be limited to font sizes.
	 * <!-- end-model-doc -->
	 * @see #PT
	 * @model name="pt"
	 * @generated
	 * @ordered
	 */
	public static final int PT_VALUE = 31;

	/**
	 * The '<em><b>Pixel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * pixel abstract unit.  This is not convertible to any other length unit without a calibrated scaling factor. Its use should should be limited to ROI objects, and converted to an appropriate length units using the PhysicalSize units of the Image the ROI is attached to.
	 * <!-- end-model-doc -->
	 * @see #PIXEL
	 * @model name="pixel"
	 * @generated
	 * @ordered
	 */
	public static final int PIXEL_VALUE = 32;

	/**
	 * The '<em><b>Reference Frame</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * reference frame abstract unit.  This is not convertible to any other length unit without a scaling factor.  Its use should be limited to uncalibrated stage positions, and converted to an appropriate length unit using a calibrated scaling factor.
	 * <!-- end-model-doc -->
	 * @see #REFERENCE_FRAME
	 * @model name="referenceFrame" literal="reference frame"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_FRAME_VALUE = 33;

	/**
	 * An array of all the '<em><b>Units Length</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitsLength[] VALUES_ARRAY =
		new UnitsLength[] {
			YM,
			ZM,
			EM,
			PM,
			TM,
			GM,
			MM,
			KM,
			HM,
			DAM,
			M,
			DM,
			CM,
			MM1,
			ΜM,
			NM,
			PM1,
			FM,
			AM,
			ZM1,
			YM1,
			Å,
			THOU,
			LI,
			IN,
			FT,
			YD,
			MI,
			UA,
			LY,
			PC,
			PT,
			PIXEL,
			REFERENCE_FRAME,
		};

	/**
	 * A public read-only list of all the '<em><b>Units Length</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitsLength> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Units Length</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsLength get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsLength result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Length</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsLength getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsLength result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Length</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitsLength get(int value) {
		switch (value) {
			case YM_VALUE: return YM;
			case ZM_VALUE: return ZM;
			case EM_VALUE: return EM;
			case PM_VALUE: return PM;
			case TM_VALUE: return TM;
			case GM_VALUE: return GM;
			case MM_VALUE: return MM;
			case KM_VALUE: return KM;
			case HM_VALUE: return HM;
			case DAM_VALUE: return DAM;
			case M_VALUE: return M;
			case DM_VALUE: return DM;
			case CM_VALUE: return CM;
			case MM1_VALUE: return MM1;
			case ΜM_VALUE: return ΜM;
			case NM_VALUE: return NM;
			case PM1_VALUE: return PM1;
			case FM_VALUE: return FM;
			case AM_VALUE: return AM;
			case ZM1_VALUE: return ZM1;
			case YM1_VALUE: return YM1;
			case Å_VALUE: return Å;
			case THOU_VALUE: return THOU;
			case LI_VALUE: return LI;
			case IN_VALUE: return IN;
			case FT_VALUE: return FT;
			case YD_VALUE: return YD;
			case MI_VALUE: return MI;
			case UA_VALUE: return UA;
			case LY_VALUE: return LY;
			case PC_VALUE: return PC;
			case PT_VALUE: return PT;
			case PIXEL_VALUE: return PIXEL;
			case REFERENCE_FRAME_VALUE: return REFERENCE_FRAME;
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
	private UnitsLength(int value, String name, String literal) {
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
	
} //UnitsLength
