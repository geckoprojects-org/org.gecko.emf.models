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
 * A representation of the literals of the enumeration '<em><b>Acquisition Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openmicroscopy.ome.OMEPackage#getAcquisitionModeType()
 * @model extendedMetaData="name='AcquisitionMode_._type'"
 * @generated
 */
@ProviderType
public enum AcquisitionModeType implements Enumerator {
	/**
	 * The '<em><b>Wide Field</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDE_FIELD_VALUE
	 * @generated
	 * @ordered
	 */
	WIDE_FIELD(0, "WideField", "WideField"),

	/**
	 * The '<em><b>Laser Scanning Confocal Microscopy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LASER_SCANNING_CONFOCAL_MICROSCOPY_VALUE
	 * @generated
	 * @ordered
	 */
	LASER_SCANNING_CONFOCAL_MICROSCOPY(1, "LaserScanningConfocalMicroscopy", "LaserScanningConfocalMicroscopy"),

	/**
	 * The '<em><b>Spinning Disk Confocal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPINNING_DISK_CONFOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	SPINNING_DISK_CONFOCAL(2, "SpinningDiskConfocal", "SpinningDiskConfocal"),

	/**
	 * The '<em><b>Slit Scan Confocal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLIT_SCAN_CONFOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	SLIT_SCAN_CONFOCAL(3, "SlitScanConfocal", "SlitScanConfocal"),

	/**
	 * The '<em><b>Multi Photon Microscopy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_PHOTON_MICROSCOPY_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_PHOTON_MICROSCOPY(4, "MultiPhotonMicroscopy", "MultiPhotonMicroscopy"),

	/**
	 * The '<em><b>Structured Illumination</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURED_ILLUMINATION_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURED_ILLUMINATION(5, "StructuredIllumination", "StructuredIllumination"),

	/**
	 * The '<em><b>Single Molecule Imaging</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_MOLECULE_IMAGING_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_MOLECULE_IMAGING(6, "SingleMoleculeImaging", "SingleMoleculeImaging"),

	/**
	 * The '<em><b>Total Internal Reflection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTAL_INTERNAL_REFLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	TOTAL_INTERNAL_REFLECTION(7, "TotalInternalReflection", "TotalInternalReflection"),

	/**
	 * The '<em><b>Fluorescence Lifetime</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLUORESCENCE_LIFETIME_VALUE
	 * @generated
	 * @ordered
	 */
	FLUORESCENCE_LIFETIME(8, "FluorescenceLifetime", "FluorescenceLifetime"),

	/**
	 * The '<em><b>Spectral Imaging</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECTRAL_IMAGING_VALUE
	 * @generated
	 * @ordered
	 */
	SPECTRAL_IMAGING(9, "SpectralImaging", "SpectralImaging"),

	/**
	 * The '<em><b>Fluorescence Correlation Spectroscopy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLUORESCENCE_CORRELATION_SPECTROSCOPY_VALUE
	 * @generated
	 * @ordered
	 */
	FLUORESCENCE_CORRELATION_SPECTROSCOPY(10, "FluorescenceCorrelationSpectroscopy", "FluorescenceCorrelationSpectroscopy"),

	/**
	 * The '<em><b>Near Field Scanning Optical Microscopy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEAR_FIELD_SCANNING_OPTICAL_MICROSCOPY_VALUE
	 * @generated
	 * @ordered
	 */
	NEAR_FIELD_SCANNING_OPTICAL_MICROSCOPY(11, "NearFieldScanningOpticalMicroscopy", "NearFieldScanningOpticalMicroscopy"),

	/**
	 * The '<em><b>Second Harmonic Generation Imaging</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_HARMONIC_GENERATION_IMAGING_VALUE
	 * @generated
	 * @ordered
	 */
	SECOND_HARMONIC_GENERATION_IMAGING(12, "SecondHarmonicGenerationImaging", "SecondHarmonicGenerationImaging"),

	/**
	 * The '<em><b>PALM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PALM_VALUE
	 * @generated
	 * @ordered
	 */
	PALM(13, "PALM", "PALM"),

	/**
	 * The '<em><b>STORM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORM_VALUE
	 * @generated
	 * @ordered
	 */
	STORM(14, "STORM", "STORM"),

	/**
	 * The '<em><b>STED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STED_VALUE
	 * @generated
	 * @ordered
	 */
	STED(15, "STED", "STED"),

	/**
	 * The '<em><b>TIRF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIRF_VALUE
	 * @generated
	 * @ordered
	 */
	TIRF(16, "TIRF", "TIRF"),

	/**
	 * The '<em><b>FSM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FSM_VALUE
	 * @generated
	 * @ordered
	 */
	FSM(17, "FSM", "FSM"),

	/**
	 * The '<em><b>LCM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LCM_VALUE
	 * @generated
	 * @ordered
	 */
	LCM(18, "LCM", "LCM"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(19, "Other", "Other"),

	/**
	 * The '<em><b>Bright Field</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRIGHT_FIELD_VALUE
	 * @generated
	 * @ordered
	 */
	BRIGHT_FIELD(20, "BrightField", "BrightField"),

	/**
	 * The '<em><b>Swept Field Confocal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWEPT_FIELD_CONFOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	SWEPT_FIELD_CONFOCAL(21, "SweptFieldConfocal", "SweptFieldConfocal"),

	/**
	 * The '<em><b>SPIM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPIM_VALUE
	 * @generated
	 * @ordered
	 */
	SPIM(22, "SPIM", "SPIM");

	/**
	 * The '<em><b>Wide Field</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDE_FIELD
	 * @model name="WideField"
	 * @generated
	 * @ordered
	 */
	public static final int WIDE_FIELD_VALUE = 0;

	/**
	 * The '<em><b>Laser Scanning Confocal Microscopy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LASER_SCANNING_CONFOCAL_MICROSCOPY
	 * @model name="LaserScanningConfocalMicroscopy"
	 * @generated
	 * @ordered
	 */
	public static final int LASER_SCANNING_CONFOCAL_MICROSCOPY_VALUE = 1;

	/**
	 * The '<em><b>Spinning Disk Confocal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPINNING_DISK_CONFOCAL
	 * @model name="SpinningDiskConfocal"
	 * @generated
	 * @ordered
	 */
	public static final int SPINNING_DISK_CONFOCAL_VALUE = 2;

	/**
	 * The '<em><b>Slit Scan Confocal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLIT_SCAN_CONFOCAL
	 * @model name="SlitScanConfocal"
	 * @generated
	 * @ordered
	 */
	public static final int SLIT_SCAN_CONFOCAL_VALUE = 3;

	/**
	 * The '<em><b>Multi Photon Microscopy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_PHOTON_MICROSCOPY
	 * @model name="MultiPhotonMicroscopy"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_PHOTON_MICROSCOPY_VALUE = 4;

	/**
	 * The '<em><b>Structured Illumination</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURED_ILLUMINATION
	 * @model name="StructuredIllumination"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURED_ILLUMINATION_VALUE = 5;

	/**
	 * The '<em><b>Single Molecule Imaging</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_MOLECULE_IMAGING
	 * @model name="SingleMoleculeImaging"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_MOLECULE_IMAGING_VALUE = 6;

	/**
	 * The '<em><b>Total Internal Reflection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTAL_INTERNAL_REFLECTION
	 * @model name="TotalInternalReflection"
	 * @generated
	 * @ordered
	 */
	public static final int TOTAL_INTERNAL_REFLECTION_VALUE = 7;

	/**
	 * The '<em><b>Fluorescence Lifetime</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLUORESCENCE_LIFETIME
	 * @model name="FluorescenceLifetime"
	 * @generated
	 * @ordered
	 */
	public static final int FLUORESCENCE_LIFETIME_VALUE = 8;

	/**
	 * The '<em><b>Spectral Imaging</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECTRAL_IMAGING
	 * @model name="SpectralImaging"
	 * @generated
	 * @ordered
	 */
	public static final int SPECTRAL_IMAGING_VALUE = 9;

	/**
	 * The '<em><b>Fluorescence Correlation Spectroscopy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLUORESCENCE_CORRELATION_SPECTROSCOPY
	 * @model name="FluorescenceCorrelationSpectroscopy"
	 * @generated
	 * @ordered
	 */
	public static final int FLUORESCENCE_CORRELATION_SPECTROSCOPY_VALUE = 10;

	/**
	 * The '<em><b>Near Field Scanning Optical Microscopy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEAR_FIELD_SCANNING_OPTICAL_MICROSCOPY
	 * @model name="NearFieldScanningOpticalMicroscopy"
	 * @generated
	 * @ordered
	 */
	public static final int NEAR_FIELD_SCANNING_OPTICAL_MICROSCOPY_VALUE = 11;

	/**
	 * The '<em><b>Second Harmonic Generation Imaging</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_HARMONIC_GENERATION_IMAGING
	 * @model name="SecondHarmonicGenerationImaging"
	 * @generated
	 * @ordered
	 */
	public static final int SECOND_HARMONIC_GENERATION_IMAGING_VALUE = 12;

	/**
	 * The '<em><b>PALM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PALM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PALM_VALUE = 13;

	/**
	 * The '<em><b>STORM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STORM_VALUE = 14;

	/**
	 * The '<em><b>STED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STED_VALUE = 15;

	/**
	 * The '<em><b>TIRF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIRF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIRF_VALUE = 16;

	/**
	 * The '<em><b>FSM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FSM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FSM_VALUE = 17;

	/**
	 * The '<em><b>LCM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LCM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LCM_VALUE = 18;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 19;

	/**
	 * The '<em><b>Bright Field</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRIGHT_FIELD
	 * @model name="BrightField"
	 * @generated
	 * @ordered
	 */
	public static final int BRIGHT_FIELD_VALUE = 20;

	/**
	 * The '<em><b>Swept Field Confocal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWEPT_FIELD_CONFOCAL
	 * @model name="SweptFieldConfocal"
	 * @generated
	 * @ordered
	 */
	public static final int SWEPT_FIELD_CONFOCAL_VALUE = 21;

	/**
	 * The '<em><b>SPIM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPIM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPIM_VALUE = 22;

	/**
	 * An array of all the '<em><b>Acquisition Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AcquisitionModeType[] VALUES_ARRAY =
		new AcquisitionModeType[] {
			WIDE_FIELD,
			LASER_SCANNING_CONFOCAL_MICROSCOPY,
			SPINNING_DISK_CONFOCAL,
			SLIT_SCAN_CONFOCAL,
			MULTI_PHOTON_MICROSCOPY,
			STRUCTURED_ILLUMINATION,
			SINGLE_MOLECULE_IMAGING,
			TOTAL_INTERNAL_REFLECTION,
			FLUORESCENCE_LIFETIME,
			SPECTRAL_IMAGING,
			FLUORESCENCE_CORRELATION_SPECTROSCOPY,
			NEAR_FIELD_SCANNING_OPTICAL_MICROSCOPY,
			SECOND_HARMONIC_GENERATION_IMAGING,
			PALM,
			STORM,
			STED,
			TIRF,
			FSM,
			LCM,
			OTHER,
			BRIGHT_FIELD,
			SWEPT_FIELD_CONFOCAL,
			SPIM,
		};

	/**
	 * A public read-only list of all the '<em><b>Acquisition Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AcquisitionModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Acquisition Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AcquisitionModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AcquisitionModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Acquisition Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AcquisitionModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AcquisitionModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Acquisition Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AcquisitionModeType get(int value) {
		switch (value) {
			case WIDE_FIELD_VALUE: return WIDE_FIELD;
			case LASER_SCANNING_CONFOCAL_MICROSCOPY_VALUE: return LASER_SCANNING_CONFOCAL_MICROSCOPY;
			case SPINNING_DISK_CONFOCAL_VALUE: return SPINNING_DISK_CONFOCAL;
			case SLIT_SCAN_CONFOCAL_VALUE: return SLIT_SCAN_CONFOCAL;
			case MULTI_PHOTON_MICROSCOPY_VALUE: return MULTI_PHOTON_MICROSCOPY;
			case STRUCTURED_ILLUMINATION_VALUE: return STRUCTURED_ILLUMINATION;
			case SINGLE_MOLECULE_IMAGING_VALUE: return SINGLE_MOLECULE_IMAGING;
			case TOTAL_INTERNAL_REFLECTION_VALUE: return TOTAL_INTERNAL_REFLECTION;
			case FLUORESCENCE_LIFETIME_VALUE: return FLUORESCENCE_LIFETIME;
			case SPECTRAL_IMAGING_VALUE: return SPECTRAL_IMAGING;
			case FLUORESCENCE_CORRELATION_SPECTROSCOPY_VALUE: return FLUORESCENCE_CORRELATION_SPECTROSCOPY;
			case NEAR_FIELD_SCANNING_OPTICAL_MICROSCOPY_VALUE: return NEAR_FIELD_SCANNING_OPTICAL_MICROSCOPY;
			case SECOND_HARMONIC_GENERATION_IMAGING_VALUE: return SECOND_HARMONIC_GENERATION_IMAGING;
			case PALM_VALUE: return PALM;
			case STORM_VALUE: return STORM;
			case STED_VALUE: return STED;
			case TIRF_VALUE: return TIRF;
			case FSM_VALUE: return FSM;
			case LCM_VALUE: return LCM;
			case OTHER_VALUE: return OTHER;
			case BRIGHT_FIELD_VALUE: return BRIGHT_FIELD;
			case SWEPT_FIELD_CONFOCAL_VALUE: return SWEPT_FIELD_CONFOCAL;
			case SPIM_VALUE: return SPIM;
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
	private AcquisitionModeType(int value, String name, String literal) {
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
	
} //AcquisitionModeType
