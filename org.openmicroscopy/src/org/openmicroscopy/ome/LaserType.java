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
 * A representation of the model object '<em><b>Laser Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.LaserType#getPump <em>Pump</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LaserType#getFrequencyMultiplication <em>Frequency Multiplication</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LaserType#getLaserMedium <em>Laser Medium</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LaserType#isPockelCell <em>Pockel Cell</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LaserType#getPulse <em>Pulse</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LaserType#getRepetitionRate <em>Repetition Rate</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LaserType#getRepetitionRateUnit <em>Repetition Rate Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LaserType#isTuneable <em>Tuneable</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LaserType#getType <em>Type</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LaserType#getWavelength <em>Wavelength</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LaserType#getWavelengthUnit <em>Wavelength Unit</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getLaserType()
 * @model extendedMetaData="name='Laser_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LaserType extends LightSource {
	/**
	 * Returns the value of the '<em><b>Pump</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   The Laser element may contain a Pump sub-element which refers to
	 *                   a LightSource used as a laser pump.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pump</em>' containment reference.
	 * @see #setPump(PumpType)
	 * @see org.openmicroscopy.ome.OMEPackage#getLaserType_Pump()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Pump' namespace='##targetNamespace'"
	 * @generated
	 */
	PumpType getPump();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LaserType#getPump <em>Pump</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pump</em>' containment reference.
	 * @see #getPump()
	 * @generated
	 */
	void setPump(PumpType value);

	/**
	 * Returns the value of the '<em><b>Frequency Multiplication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 FrequencyMultiplication that may be specified. [units:none]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency Multiplication</em>' attribute.
	 * @see #isSetFrequencyMultiplication()
	 * @see #unsetFrequencyMultiplication()
	 * @see #setFrequencyMultiplication(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getLaserType_FrequencyMultiplication()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveInt"
	 *        extendedMetaData="kind='attribute' name='FrequencyMultiplication'"
	 * @generated
	 */
	int getFrequencyMultiplication();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LaserType#getFrequencyMultiplication <em>Frequency Multiplication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Multiplication</em>' attribute.
	 * @see #isSetFrequencyMultiplication()
	 * @see #unsetFrequencyMultiplication()
	 * @see #getFrequencyMultiplication()
	 * @generated
	 */
	void setFrequencyMultiplication(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LaserType#getFrequencyMultiplication <em>Frequency Multiplication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrequencyMultiplication()
	 * @see #getFrequencyMultiplication()
	 * @see #setFrequencyMultiplication(int)
	 * @generated
	 */
	void unsetFrequencyMultiplication();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LaserType#getFrequencyMultiplication <em>Frequency Multiplication</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frequency Multiplication</em>' attribute is set.
	 * @see #unsetFrequencyMultiplication()
	 * @see #getFrequencyMultiplication()
	 * @see #setFrequencyMultiplication(int)
	 * @generated
	 */
	boolean isSetFrequencyMultiplication();

	/**
	 * Returns the value of the '<em><b>Laser Medium</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.LaserMediumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The Medium attribute specifies the actual lasing medium
	 *                 for a given laser type.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Laser Medium</em>' attribute.
	 * @see org.openmicroscopy.ome.LaserMediumType
	 * @see #isSetLaserMedium()
	 * @see #unsetLaserMedium()
	 * @see #setLaserMedium(LaserMediumType)
	 * @see org.openmicroscopy.ome.OMEPackage#getLaserType_LaserMedium()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='LaserMedium'"
	 * @generated
	 */
	LaserMediumType getLaserMedium();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LaserType#getLaserMedium <em>Laser Medium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laser Medium</em>' attribute.
	 * @see org.openmicroscopy.ome.LaserMediumType
	 * @see #isSetLaserMedium()
	 * @see #unsetLaserMedium()
	 * @see #getLaserMedium()
	 * @generated
	 */
	void setLaserMedium(LaserMediumType value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LaserType#getLaserMedium <em>Laser Medium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLaserMedium()
	 * @see #getLaserMedium()
	 * @see #setLaserMedium(LaserMediumType)
	 * @generated
	 */
	void unsetLaserMedium();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LaserType#getLaserMedium <em>Laser Medium</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Laser Medium</em>' attribute is set.
	 * @see #unsetLaserMedium()
	 * @see #getLaserMedium()
	 * @see #setLaserMedium(LaserMediumType)
	 * @generated
	 */
	boolean isSetLaserMedium();

	/**
	 * Returns the value of the '<em><b>Pockel Cell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 If true the laser has a PockelCell to rotate the polarization of the beam. [flag]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pockel Cell</em>' attribute.
	 * @see #isSetPockelCell()
	 * @see #unsetPockelCell()
	 * @see #setPockelCell(boolean)
	 * @see org.openmicroscopy.ome.OMEPackage#getLaserType_PockelCell()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='PockelCell'"
	 * @generated
	 */
	boolean isPockelCell();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LaserType#isPockelCell <em>Pockel Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pockel Cell</em>' attribute.
	 * @see #isSetPockelCell()
	 * @see #unsetPockelCell()
	 * @see #isPockelCell()
	 * @generated
	 */
	void setPockelCell(boolean value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LaserType#isPockelCell <em>Pockel Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPockelCell()
	 * @see #isPockelCell()
	 * @see #setPockelCell(boolean)
	 * @generated
	 */
	void unsetPockelCell();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LaserType#isPockelCell <em>Pockel Cell</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pockel Cell</em>' attribute is set.
	 * @see #unsetPockelCell()
	 * @see #isPockelCell()
	 * @see #setPockelCell(boolean)
	 * @generated
	 */
	boolean isSetPockelCell();

	/**
	 * Returns the value of the '<em><b>Pulse</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.PulseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The Pulse mode of the laser.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pulse</em>' attribute.
	 * @see org.openmicroscopy.ome.PulseType
	 * @see #isSetPulse()
	 * @see #unsetPulse()
	 * @see #setPulse(PulseType)
	 * @see org.openmicroscopy.ome.OMEPackage#getLaserType_Pulse()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Pulse'"
	 * @generated
	 */
	PulseType getPulse();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LaserType#getPulse <em>Pulse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pulse</em>' attribute.
	 * @see org.openmicroscopy.ome.PulseType
	 * @see #isSetPulse()
	 * @see #unsetPulse()
	 * @see #getPulse()
	 * @generated
	 */
	void setPulse(PulseType value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LaserType#getPulse <em>Pulse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPulse()
	 * @see #getPulse()
	 * @see #setPulse(PulseType)
	 * @generated
	 */
	void unsetPulse();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LaserType#getPulse <em>Pulse</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pulse</em>' attribute is set.
	 * @see #unsetPulse()
	 * @see #getPulse()
	 * @see #setPulse(PulseType)
	 * @generated
	 */
	boolean isSetPulse();

	/**
	 * Returns the value of the '<em><b>Repetition Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The is the rate in Hz at which the laser pulses if
	 *                 the Pulse type is 'Repetitive'. hertz[Hz]
	 *                 Units are set by RepetitionRateUnit.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repetition Rate</em>' attribute.
	 * @see #isSetRepetitionRate()
	 * @see #unsetRepetitionRate()
	 * @see #setRepetitionRate(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getLaserType_RepetitionRate()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='RepetitionRate'"
	 * @generated
	 */
	float getRepetitionRate();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LaserType#getRepetitionRate <em>Repetition Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetition Rate</em>' attribute.
	 * @see #isSetRepetitionRate()
	 * @see #unsetRepetitionRate()
	 * @see #getRepetitionRate()
	 * @generated
	 */
	void setRepetitionRate(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LaserType#getRepetitionRate <em>Repetition Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepetitionRate()
	 * @see #getRepetitionRate()
	 * @see #setRepetitionRate(float)
	 * @generated
	 */
	void unsetRepetitionRate();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LaserType#getRepetitionRate <em>Repetition Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Repetition Rate</em>' attribute is set.
	 * @see #unsetRepetitionRate()
	 * @see #getRepetitionRate()
	 * @see #setRepetitionRate(float)
	 * @generated
	 */
	boolean isSetRepetitionRate();

	/**
	 * Returns the value of the '<em><b>Repetition Rate Unit</b></em>' attribute.
	 * The default value is <code>"Hz"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsFrequency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the RepetitionRate - default:hertz[Hz].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repetition Rate Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsFrequency
	 * @see #isSetRepetitionRateUnit()
	 * @see #unsetRepetitionRateUnit()
	 * @see #setRepetitionRateUnit(UnitsFrequency)
	 * @see org.openmicroscopy.ome.OMEPackage#getLaserType_RepetitionRateUnit()
	 * @model default="Hz" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='RepetitionRateUnit'"
	 * @generated
	 */
	UnitsFrequency getRepetitionRateUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LaserType#getRepetitionRateUnit <em>Repetition Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetition Rate Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsFrequency
	 * @see #isSetRepetitionRateUnit()
	 * @see #unsetRepetitionRateUnit()
	 * @see #getRepetitionRateUnit()
	 * @generated
	 */
	void setRepetitionRateUnit(UnitsFrequency value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LaserType#getRepetitionRateUnit <em>Repetition Rate Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepetitionRateUnit()
	 * @see #getRepetitionRateUnit()
	 * @see #setRepetitionRateUnit(UnitsFrequency)
	 * @generated
	 */
	void unsetRepetitionRateUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LaserType#getRepetitionRateUnit <em>Repetition Rate Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Repetition Rate Unit</em>' attribute is set.
	 * @see #unsetRepetitionRateUnit()
	 * @see #getRepetitionRateUnit()
	 * @see #setRepetitionRateUnit(UnitsFrequency)
	 * @generated
	 */
	boolean isSetRepetitionRateUnit();

	/**
	 * Returns the value of the '<em><b>Tuneable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Whether or not the laser is Tuneable [flag]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tuneable</em>' attribute.
	 * @see #isSetTuneable()
	 * @see #unsetTuneable()
	 * @see #setTuneable(boolean)
	 * @see org.openmicroscopy.ome.OMEPackage#getLaserType_Tuneable()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Tuneable'"
	 * @generated
	 */
	boolean isTuneable();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LaserType#isTuneable <em>Tuneable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuneable</em>' attribute.
	 * @see #isSetTuneable()
	 * @see #unsetTuneable()
	 * @see #isTuneable()
	 * @generated
	 */
	void setTuneable(boolean value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LaserType#isTuneable <em>Tuneable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTuneable()
	 * @see #isTuneable()
	 * @see #setTuneable(boolean)
	 * @generated
	 */
	void unsetTuneable();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LaserType#isTuneable <em>Tuneable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tuneable</em>' attribute is set.
	 * @see #unsetTuneable()
	 * @see #isTuneable()
	 * @see #setTuneable(boolean)
	 * @generated
	 */
	boolean isSetTuneable();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.TypeType3}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Type is the general category of laser.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.openmicroscopy.ome.TypeType3
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType3)
	 * @see org.openmicroscopy.ome.OMEPackage#getLaserType_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	TypeType3 getType();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LaserType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.openmicroscopy.ome.TypeType3
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType3 value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LaserType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType3)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LaserType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType3)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Wavelength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The Wavelength of the laser. Units are set by WavelengthUnit.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wavelength</em>' attribute.
	 * @see #isSetWavelength()
	 * @see #unsetWavelength()
	 * @see #setWavelength(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getLaserType_Wavelength()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveFloat"
	 *        extendedMetaData="kind='attribute' name='Wavelength'"
	 * @generated
	 */
	float getWavelength();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LaserType#getWavelength <em>Wavelength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wavelength</em>' attribute.
	 * @see #isSetWavelength()
	 * @see #unsetWavelength()
	 * @see #getWavelength()
	 * @generated
	 */
	void setWavelength(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LaserType#getWavelength <em>Wavelength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWavelength()
	 * @see #getWavelength()
	 * @see #setWavelength(float)
	 * @generated
	 */
	void unsetWavelength();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LaserType#getWavelength <em>Wavelength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wavelength</em>' attribute is set.
	 * @see #unsetWavelength()
	 * @see #getWavelength()
	 * @see #setWavelength(float)
	 * @generated
	 */
	boolean isSetWavelength();

	/**
	 * Returns the value of the '<em><b>Wavelength Unit</b></em>' attribute.
	 * The default value is <code>"nm"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the Wavelength - default:nanometres[nm].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wavelength Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetWavelengthUnit()
	 * @see #unsetWavelengthUnit()
	 * @see #setWavelengthUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getLaserType_WavelengthUnit()
	 * @model default="nm" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='WavelengthUnit'"
	 * @generated
	 */
	UnitsLength getWavelengthUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LaserType#getWavelengthUnit <em>Wavelength Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wavelength Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetWavelengthUnit()
	 * @see #unsetWavelengthUnit()
	 * @see #getWavelengthUnit()
	 * @generated
	 */
	void setWavelengthUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LaserType#getWavelengthUnit <em>Wavelength Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWavelengthUnit()
	 * @see #getWavelengthUnit()
	 * @see #setWavelengthUnit(UnitsLength)
	 * @generated
	 */
	void unsetWavelengthUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LaserType#getWavelengthUnit <em>Wavelength Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wavelength Unit</em>' attribute is set.
	 * @see #unsetWavelengthUnit()
	 * @see #getWavelengthUnit()
	 * @see #setWavelengthUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetWavelengthUnit();

} // LaserType
