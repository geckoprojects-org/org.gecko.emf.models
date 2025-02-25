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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detector Settings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.DetectorSettingsType#getBinning <em>Binning</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DetectorSettingsType#getGain <em>Gain</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DetectorSettingsType#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DetectorSettingsType#getIntegration <em>Integration</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DetectorSettingsType#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DetectorSettingsType#getReadOutRate <em>Read Out Rate</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DetectorSettingsType#getReadOutRateUnit <em>Read Out Rate Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DetectorSettingsType#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DetectorSettingsType#getVoltageUnit <em>Voltage Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DetectorSettingsType#getZoom <em>Zoom</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getDetectorSettingsType()
 * @model extendedMetaData="name='DetectorSettings_._type' kind='empty'"
 * @generated
 */
@ProviderType
public interface DetectorSettingsType extends Settings {
	/**
	 * Returns the value of the '<em><b>Binning</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.Binning}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Represents the number of pixels that are combined to form larger pixels. {used:CCD,EMCCD}
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binning</em>' attribute.
	 * @see org.openmicroscopy.ome.Binning
	 * @see #isSetBinning()
	 * @see #unsetBinning()
	 * @see #setBinning(Binning)
	 * @see org.openmicroscopy.ome.OMEPackage#getDetectorSettingsType_Binning()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Binning'"
	 * @generated
	 */
	Binning getBinning();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getBinning <em>Binning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binning</em>' attribute.
	 * @see org.openmicroscopy.ome.Binning
	 * @see #isSetBinning()
	 * @see #unsetBinning()
	 * @see #getBinning()
	 * @generated
	 */
	void setBinning(Binning value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getBinning <em>Binning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBinning()
	 * @see #getBinning()
	 * @see #setBinning(Binning)
	 * @generated
	 */
	void unsetBinning();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getBinning <em>Binning</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Binning</em>' attribute is set.
	 * @see #unsetBinning()
	 * @see #getBinning()
	 * @see #setBinning(Binning)
	 * @generated
	 */
	boolean isSetBinning();

	/**
	 * Returns the value of the '<em><b>Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The Gain of the detector. [units:none] {used:CCD,EMCCD,PMT}
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gain</em>' attribute.
	 * @see #isSetGain()
	 * @see #unsetGain()
	 * @see #setGain(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getDetectorSettingsType_Gain()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='Gain'"
	 * @generated
	 */
	float getGain();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getGain <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gain</em>' attribute.
	 * @see #isSetGain()
	 * @see #unsetGain()
	 * @see #getGain()
	 * @generated
	 */
	void setGain(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getGain <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGain()
	 * @see #getGain()
	 * @see #setGain(float)
	 * @generated
	 */
	void unsetGain();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getGain <em>Gain</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gain</em>' attribute is set.
	 * @see #unsetGain()
	 * @see #getGain()
	 * @see #setGain(float)
	 * @generated
	 */
	boolean isSetGain();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getDetectorSettingsType_ID()
	 * @model dataType="org.openmicroscopy.ome.DetectorID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Integration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 This is the number of sequential frames that get averaged,
	 *                 to improve the signal-to-noise ratio. [units:none] {used:CCD,EMCCD}
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Integration</em>' attribute.
	 * @see #isSetIntegration()
	 * @see #unsetIntegration()
	 * @see #setIntegration(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getDetectorSettingsType_Integration()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveInt"
	 *        extendedMetaData="kind='attribute' name='Integration'"
	 * @generated
	 */
	int getIntegration();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getIntegration <em>Integration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integration</em>' attribute.
	 * @see #isSetIntegration()
	 * @see #unsetIntegration()
	 * @see #getIntegration()
	 * @generated
	 */
	void setIntegration(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getIntegration <em>Integration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntegration()
	 * @see #getIntegration()
	 * @see #setIntegration(int)
	 * @generated
	 */
	void unsetIntegration();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getIntegration <em>Integration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Integration</em>' attribute is set.
	 * @see #unsetIntegration()
	 * @see #getIntegration()
	 * @see #setIntegration(int)
	 * @generated
	 */
	boolean isSetIntegration();

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The Offset of the detector. [units none] {used:CCD,EMCCD}
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #setOffset(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getDetectorSettingsType_Offset()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='Offset'"
	 * @generated
	 */
	float getOffset();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOffset()
	 * @see #getOffset()
	 * @see #setOffset(float)
	 * @generated
	 */
	void unsetOffset();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getOffset <em>Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Offset</em>' attribute is set.
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @see #setOffset(float)
	 * @generated
	 */
	boolean isSetOffset();

	/**
	 * Returns the value of the '<em><b>Read Out Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The speed at which the detector can count pixels.  {used:CCD,EMCCD}
	 *                 This is the bytes per second that
	 *                 can be read from the detector (like a baud rate).
	 *                 Units are set by ReadOutRateUnit.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Out Rate</em>' attribute.
	 * @see #isSetReadOutRate()
	 * @see #unsetReadOutRate()
	 * @see #setReadOutRate(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getDetectorSettingsType_ReadOutRate()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='ReadOutRate'"
	 * @generated
	 */
	float getReadOutRate();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getReadOutRate <em>Read Out Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Out Rate</em>' attribute.
	 * @see #isSetReadOutRate()
	 * @see #unsetReadOutRate()
	 * @see #getReadOutRate()
	 * @generated
	 */
	void setReadOutRate(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getReadOutRate <em>Read Out Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReadOutRate()
	 * @see #getReadOutRate()
	 * @see #setReadOutRate(float)
	 * @generated
	 */
	void unsetReadOutRate();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getReadOutRate <em>Read Out Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Read Out Rate</em>' attribute is set.
	 * @see #unsetReadOutRate()
	 * @see #getReadOutRate()
	 * @see #setReadOutRate(float)
	 * @generated
	 */
	boolean isSetReadOutRate();

	/**
	 * Returns the value of the '<em><b>Read Out Rate Unit</b></em>' attribute.
	 * The default value is <code>"MHz"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsFrequency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the ReadOutRate - default:megahertz[Hz].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Out Rate Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsFrequency
	 * @see #isSetReadOutRateUnit()
	 * @see #unsetReadOutRateUnit()
	 * @see #setReadOutRateUnit(UnitsFrequency)
	 * @see org.openmicroscopy.ome.OMEPackage#getDetectorSettingsType_ReadOutRateUnit()
	 * @model default="MHz" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ReadOutRateUnit'"
	 * @generated
	 */
	UnitsFrequency getReadOutRateUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getReadOutRateUnit <em>Read Out Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Out Rate Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsFrequency
	 * @see #isSetReadOutRateUnit()
	 * @see #unsetReadOutRateUnit()
	 * @see #getReadOutRateUnit()
	 * @generated
	 */
	void setReadOutRateUnit(UnitsFrequency value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getReadOutRateUnit <em>Read Out Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReadOutRateUnit()
	 * @see #getReadOutRateUnit()
	 * @see #setReadOutRateUnit(UnitsFrequency)
	 * @generated
	 */
	void unsetReadOutRateUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getReadOutRateUnit <em>Read Out Rate Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Read Out Rate Unit</em>' attribute is set.
	 * @see #unsetReadOutRateUnit()
	 * @see #getReadOutRateUnit()
	 * @see #setReadOutRateUnit(UnitsFrequency)
	 * @generated
	 */
	boolean isSetReadOutRateUnit();

	/**
	 * Returns the value of the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The Voltage of the detector. {used:PMT}
	 *                 Units are set by VoltageUnit.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Voltage</em>' attribute.
	 * @see #isSetVoltage()
	 * @see #unsetVoltage()
	 * @see #setVoltage(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getDetectorSettingsType_Voltage()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='Voltage'"
	 * @generated
	 */
	float getVoltage();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getVoltage <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage</em>' attribute.
	 * @see #isSetVoltage()
	 * @see #unsetVoltage()
	 * @see #getVoltage()
	 * @generated
	 */
	void setVoltage(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getVoltage <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVoltage()
	 * @see #getVoltage()
	 * @see #setVoltage(float)
	 * @generated
	 */
	void unsetVoltage();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getVoltage <em>Voltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Voltage</em>' attribute is set.
	 * @see #unsetVoltage()
	 * @see #getVoltage()
	 * @see #setVoltage(float)
	 * @generated
	 */
	boolean isSetVoltage();

	/**
	 * Returns the value of the '<em><b>Voltage Unit</b></em>' attribute.
	 * The default value is <code>"V"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsElectricPotential}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The units of the Voltage of the detector - default:volts[V]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Voltage Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsElectricPotential
	 * @see #isSetVoltageUnit()
	 * @see #unsetVoltageUnit()
	 * @see #setVoltageUnit(UnitsElectricPotential)
	 * @see org.openmicroscopy.ome.OMEPackage#getDetectorSettingsType_VoltageUnit()
	 * @model default="V" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='VoltageUnit'"
	 * @generated
	 */
	UnitsElectricPotential getVoltageUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getVoltageUnit <em>Voltage Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsElectricPotential
	 * @see #isSetVoltageUnit()
	 * @see #unsetVoltageUnit()
	 * @see #getVoltageUnit()
	 * @generated
	 */
	void setVoltageUnit(UnitsElectricPotential value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getVoltageUnit <em>Voltage Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVoltageUnit()
	 * @see #getVoltageUnit()
	 * @see #setVoltageUnit(UnitsElectricPotential)
	 * @generated
	 */
	void unsetVoltageUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getVoltageUnit <em>Voltage Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Voltage Unit</em>' attribute is set.
	 * @see #unsetVoltageUnit()
	 * @see #getVoltageUnit()
	 * @see #setVoltageUnit(UnitsElectricPotential)
	 * @generated
	 */
	boolean isSetVoltageUnit();

	/**
	 * Returns the value of the '<em><b>Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The Zoom or "Confocal Zoom" or "Scan Zoom" for a detector. [units:none] {used:PMT}
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zoom</em>' attribute.
	 * @see #isSetZoom()
	 * @see #unsetZoom()
	 * @see #setZoom(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getDetectorSettingsType_Zoom()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='Zoom'"
	 * @generated
	 */
	float getZoom();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getZoom <em>Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zoom</em>' attribute.
	 * @see #isSetZoom()
	 * @see #unsetZoom()
	 * @see #getZoom()
	 * @generated
	 */
	void setZoom(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getZoom <em>Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZoom()
	 * @see #getZoom()
	 * @see #setZoom(float)
	 * @generated
	 */
	void unsetZoom();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.DetectorSettingsType#getZoom <em>Zoom</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zoom</em>' attribute is set.
	 * @see #unsetZoom()
	 * @see #getZoom()
	 * @see #setZoom(float)
	 * @generated
	 */
	boolean isSetZoom();

} // DetectorSettingsType
