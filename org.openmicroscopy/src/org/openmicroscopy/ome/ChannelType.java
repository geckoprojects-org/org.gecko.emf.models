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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getLightSourceSettings <em>Light Source Settings</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getDetectorSettings <em>Detector Settings</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getFilterSetRef <em>Filter Set Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getLightPath <em>Light Path</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getAcquisitionMode <em>Acquisition Mode</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getColor <em>Color</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getContrastMethod <em>Contrast Method</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getEmissionWavelength <em>Emission Wavelength</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getEmissionWavelengthUnit <em>Emission Wavelength Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getExcitationWavelength <em>Excitation Wavelength</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getExcitationWavelengthUnit <em>Excitation Wavelength Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getFluor <em>Fluor</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getIlluminationType <em>Illumination Type</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getName <em>Name</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getNDFilter <em>ND Filter</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getPinholeSize <em>Pinhole Size</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getPinholeSizeUnit <em>Pinhole Size Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getPockelCellSetting <em>Pockel Cell Setting</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ChannelType#getSamplesPerPixel <em>Samples Per Pixel</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getChannelType()
 * @model extendedMetaData="name='Channel_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ChannelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Light Source Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Source Settings</em>' containment reference.
	 * @see #setLightSourceSettings(LightSourceSettingsType)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_LightSourceSettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LightSourceSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	LightSourceSettingsType getLightSourceSettings();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getLightSourceSettings <em>Light Source Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Source Settings</em>' containment reference.
	 * @see #getLightSourceSettings()
	 * @generated
	 */
	void setLightSourceSettings(LightSourceSettingsType value);

	/**
	 * Returns the value of the '<em><b>Detector Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This holds the setting applied to a detector as well as a
	 *         reference to the detector.
	 *         The ID is the detector used in this case.
	 *         The values stored in DetectorSettings represent the variable values,
	 *         fixed values not modified during the acquisition go in Detector.
	 * 
	 *         Each attribute now has an indication of what type of detector
	 *         it applies to. This is preparatory work for cleaning up and
	 *         possibly splitting this object into sub-types.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detector Settings</em>' containment reference.
	 * @see #setDetectorSettings(DetectorSettingsType)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_DetectorSettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DetectorSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	DetectorSettingsType getDetectorSettings();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getDetectorSettings <em>Detector Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detector Settings</em>' containment reference.
	 * @see #getDetectorSettings()
	 * @generated
	 */
	void setDetectorSettings(DetectorSettingsType value);

	/**
	 * Returns the value of the '<em><b>Filter Set Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Set Ref</em>' containment reference.
	 * @see #setFilterSetRef(FilterSetRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_FilterSetRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FilterSetRef' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterSetRefType getFilterSetRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getFilterSetRef <em>Filter Set Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Set Ref</em>' containment reference.
	 * @see #getFilterSetRef()
	 * @generated
	 */
	void setFilterSetRef(FilterSetRefType value);

	/**
	 * Returns the value of the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.AnnotationRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The AnnotationRef element is a reference to an element derived
	 *         from the CommonAnnotation element.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_AnnotationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnnotationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationRefType> getAnnotationRef();

	/**
	 * Returns the value of the '<em><b>Light Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the light path
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Light Path</em>' containment reference.
	 * @see #setLightPath(LightPathType)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_LightPath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LightPath' namespace='##targetNamespace'"
	 * @generated
	 */
	LightPathType getLightPath();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getLightPath <em>Light Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Path</em>' containment reference.
	 * @see #getLightPath()
	 * @generated
	 */
	void setLightPath(LightPathType value);

	/**
	 * Returns the value of the '<em><b>Acquisition Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.AcquisitionModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             AcquisitionMode describes the type of microscopy performed for each channel
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acquisition Mode</em>' attribute.
	 * @see org.openmicroscopy.ome.AcquisitionModeType
	 * @see #isSetAcquisitionMode()
	 * @see #unsetAcquisitionMode()
	 * @see #setAcquisitionMode(AcquisitionModeType)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_AcquisitionMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='AcquisitionMode'"
	 * @generated
	 */
	AcquisitionModeType getAcquisitionMode();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getAcquisitionMode <em>Acquisition Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acquisition Mode</em>' attribute.
	 * @see org.openmicroscopy.ome.AcquisitionModeType
	 * @see #isSetAcquisitionMode()
	 * @see #unsetAcquisitionMode()
	 * @see #getAcquisitionMode()
	 * @generated
	 */
	void setAcquisitionMode(AcquisitionModeType value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ChannelType#getAcquisitionMode <em>Acquisition Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAcquisitionMode()
	 * @see #getAcquisitionMode()
	 * @see #setAcquisitionMode(AcquisitionModeType)
	 * @generated
	 */
	void unsetAcquisitionMode();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ChannelType#getAcquisitionMode <em>Acquisition Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Acquisition Mode</em>' attribute is set.
	 * @see #unsetAcquisitionMode()
	 * @see #getAcquisitionMode()
	 * @see #setAcquisitionMode(AcquisitionModeType)
	 * @generated
	 */
	boolean isSetAcquisitionMode();

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             A color used to render this channel - encoded as RGBA
	 *             The default value "-1" is #FFFFFFFF so solid white (it is a signed 32 bit value)
	 *             NOTE: Prior to the 2012-06 schema the default value was incorrect and produced a transparent red not solid white.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #isSetColor()
	 * @see #unsetColor()
	 * @see #setColor(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_Color()
	 * @model default="-1" unsettable="true" dataType="org.openmicroscopy.ome.Color"
	 *        extendedMetaData="kind='attribute' name='Color'"
	 * @generated
	 */
	int getColor();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #isSetColor()
	 * @see #unsetColor()
	 * @see #getColor()
	 * @generated
	 */
	void setColor(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ChannelType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColor()
	 * @see #getColor()
	 * @see #setColor(int)
	 * @generated
	 */
	void unsetColor();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ChannelType#getColor <em>Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Color</em>' attribute is set.
	 * @see #unsetColor()
	 * @see #getColor()
	 * @see #setColor(int)
	 * @generated
	 */
	boolean isSetColor();

	/**
	 * Returns the value of the '<em><b>Contrast Method</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.ContrastMethodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             ContrastMethod describes the technique used to achieve contrast for each channel
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contrast Method</em>' attribute.
	 * @see org.openmicroscopy.ome.ContrastMethodType
	 * @see #isSetContrastMethod()
	 * @see #unsetContrastMethod()
	 * @see #setContrastMethod(ContrastMethodType)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_ContrastMethod()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ContrastMethod'"
	 * @generated
	 */
	ContrastMethodType getContrastMethod();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getContrastMethod <em>Contrast Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrast Method</em>' attribute.
	 * @see org.openmicroscopy.ome.ContrastMethodType
	 * @see #isSetContrastMethod()
	 * @see #unsetContrastMethod()
	 * @see #getContrastMethod()
	 * @generated
	 */
	void setContrastMethod(ContrastMethodType value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ChannelType#getContrastMethod <em>Contrast Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContrastMethod()
	 * @see #getContrastMethod()
	 * @see #setContrastMethod(ContrastMethodType)
	 * @generated
	 */
	void unsetContrastMethod();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ChannelType#getContrastMethod <em>Contrast Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contrast Method</em>' attribute is set.
	 * @see #unsetContrastMethod()
	 * @see #getContrastMethod()
	 * @see #setContrastMethod(ContrastMethodType)
	 * @generated
	 */
	boolean isSetContrastMethod();

	/**
	 * Returns the value of the '<em><b>Emission Wavelength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Wavelength of emission for a particular channel. Units are set by EmissionWavelengthUnit.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Emission Wavelength</em>' attribute.
	 * @see #isSetEmissionWavelength()
	 * @see #unsetEmissionWavelength()
	 * @see #setEmissionWavelength(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_EmissionWavelength()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveFloat"
	 *        extendedMetaData="kind='attribute' name='EmissionWavelength'"
	 * @generated
	 */
	float getEmissionWavelength();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getEmissionWavelength <em>Emission Wavelength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emission Wavelength</em>' attribute.
	 * @see #isSetEmissionWavelength()
	 * @see #unsetEmissionWavelength()
	 * @see #getEmissionWavelength()
	 * @generated
	 */
	void setEmissionWavelength(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ChannelType#getEmissionWavelength <em>Emission Wavelength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEmissionWavelength()
	 * @see #getEmissionWavelength()
	 * @see #setEmissionWavelength(float)
	 * @generated
	 */
	void unsetEmissionWavelength();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ChannelType#getEmissionWavelength <em>Emission Wavelength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Emission Wavelength</em>' attribute is set.
	 * @see #unsetEmissionWavelength()
	 * @see #getEmissionWavelength()
	 * @see #setEmissionWavelength(float)
	 * @generated
	 */
	boolean isSetEmissionWavelength();

	/**
	 * Returns the value of the '<em><b>Emission Wavelength Unit</b></em>' attribute.
	 * The default value is <code>"nm"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the wavelength of emission - default:nanometres[nm].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Emission Wavelength Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetEmissionWavelengthUnit()
	 * @see #unsetEmissionWavelengthUnit()
	 * @see #setEmissionWavelengthUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_EmissionWavelengthUnit()
	 * @model default="nm" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='EmissionWavelengthUnit'"
	 * @generated
	 */
	UnitsLength getEmissionWavelengthUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getEmissionWavelengthUnit <em>Emission Wavelength Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emission Wavelength Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetEmissionWavelengthUnit()
	 * @see #unsetEmissionWavelengthUnit()
	 * @see #getEmissionWavelengthUnit()
	 * @generated
	 */
	void setEmissionWavelengthUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ChannelType#getEmissionWavelengthUnit <em>Emission Wavelength Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEmissionWavelengthUnit()
	 * @see #getEmissionWavelengthUnit()
	 * @see #setEmissionWavelengthUnit(UnitsLength)
	 * @generated
	 */
	void unsetEmissionWavelengthUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ChannelType#getEmissionWavelengthUnit <em>Emission Wavelength Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Emission Wavelength Unit</em>' attribute is set.
	 * @see #unsetEmissionWavelengthUnit()
	 * @see #getEmissionWavelengthUnit()
	 * @see #setEmissionWavelengthUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetEmissionWavelengthUnit();

	/**
	 * Returns the value of the '<em><b>Excitation Wavelength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Wavelength of excitation for a particular channel. Units are set by ExcitationWavelengthUnit.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excitation Wavelength</em>' attribute.
	 * @see #isSetExcitationWavelength()
	 * @see #unsetExcitationWavelength()
	 * @see #setExcitationWavelength(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_ExcitationWavelength()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveFloat"
	 *        extendedMetaData="kind='attribute' name='ExcitationWavelength'"
	 * @generated
	 */
	float getExcitationWavelength();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getExcitationWavelength <em>Excitation Wavelength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excitation Wavelength</em>' attribute.
	 * @see #isSetExcitationWavelength()
	 * @see #unsetExcitationWavelength()
	 * @see #getExcitationWavelength()
	 * @generated
	 */
	void setExcitationWavelength(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ChannelType#getExcitationWavelength <em>Excitation Wavelength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExcitationWavelength()
	 * @see #getExcitationWavelength()
	 * @see #setExcitationWavelength(float)
	 * @generated
	 */
	void unsetExcitationWavelength();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ChannelType#getExcitationWavelength <em>Excitation Wavelength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Excitation Wavelength</em>' attribute is set.
	 * @see #unsetExcitationWavelength()
	 * @see #getExcitationWavelength()
	 * @see #setExcitationWavelength(float)
	 * @generated
	 */
	boolean isSetExcitationWavelength();

	/**
	 * Returns the value of the '<em><b>Excitation Wavelength Unit</b></em>' attribute.
	 * The default value is <code>"nm"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the wavelength of excitation - default:nanometres[nm].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excitation Wavelength Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetExcitationWavelengthUnit()
	 * @see #unsetExcitationWavelengthUnit()
	 * @see #setExcitationWavelengthUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_ExcitationWavelengthUnit()
	 * @model default="nm" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ExcitationWavelengthUnit'"
	 * @generated
	 */
	UnitsLength getExcitationWavelengthUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getExcitationWavelengthUnit <em>Excitation Wavelength Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excitation Wavelength Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetExcitationWavelengthUnit()
	 * @see #unsetExcitationWavelengthUnit()
	 * @see #getExcitationWavelengthUnit()
	 * @generated
	 */
	void setExcitationWavelengthUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ChannelType#getExcitationWavelengthUnit <em>Excitation Wavelength Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExcitationWavelengthUnit()
	 * @see #getExcitationWavelengthUnit()
	 * @see #setExcitationWavelengthUnit(UnitsLength)
	 * @generated
	 */
	void unsetExcitationWavelengthUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ChannelType#getExcitationWavelengthUnit <em>Excitation Wavelength Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Excitation Wavelength Unit</em>' attribute is set.
	 * @see #unsetExcitationWavelengthUnit()
	 * @see #getExcitationWavelengthUnit()
	 * @see #setExcitationWavelengthUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetExcitationWavelengthUnit();

	/**
	 * Returns the value of the '<em><b>Fluor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The Fluor attribute is used for fluorescence images.
	 *             This is the name of the fluorophore used to produce this channel [plain text string]
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fluor</em>' attribute.
	 * @see #setFluor(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_Fluor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Fluor'"
	 * @generated
	 */
	String getFluor();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getFluor <em>Fluor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fluor</em>' attribute.
	 * @see #getFluor()
	 * @generated
	 */
	void setFluor(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_ID()
	 * @model dataType="org.openmicroscopy.ome.ChannelID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Illumination Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.IlluminationTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The method of illumination used to capture the channel.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Illumination Type</em>' attribute.
	 * @see org.openmicroscopy.ome.IlluminationTypeType
	 * @see #isSetIlluminationType()
	 * @see #unsetIlluminationType()
	 * @see #setIlluminationType(IlluminationTypeType)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_IlluminationType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='IlluminationType'"
	 * @generated
	 */
	IlluminationTypeType getIlluminationType();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getIlluminationType <em>Illumination Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Illumination Type</em>' attribute.
	 * @see org.openmicroscopy.ome.IlluminationTypeType
	 * @see #isSetIlluminationType()
	 * @see #unsetIlluminationType()
	 * @see #getIlluminationType()
	 * @generated
	 */
	void setIlluminationType(IlluminationTypeType value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ChannelType#getIlluminationType <em>Illumination Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIlluminationType()
	 * @see #getIlluminationType()
	 * @see #setIlluminationType(IlluminationTypeType)
	 * @generated
	 */
	void unsetIlluminationType();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ChannelType#getIlluminationType <em>Illumination Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Illumination Type</em>' attribute is set.
	 * @see #unsetIlluminationType()
	 * @see #getIlluminationType()
	 * @see #setIlluminationType(IlluminationTypeType)
	 * @generated
	 */
	boolean isSetIlluminationType();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             A name for the channel that is suitable for presentation to the user.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>ND Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The NDfilter attribute is used to specify the combined effect of any neutral density filters used.
	 *             The amount of light the filter transmits at a maximum [units:none]
	 *             A fraction, as a value from 0.0 to 1.0.
	 * 
	 *             NOTE: This was formerly described as "units optical density expressed as a PercentFraction".
	 *             This was how the field had been described in the schema from the beginning but all
	 *             the use of it has been in the opposite direction, i.e. as a amount transmitted,
	 *             not the amount blocked. This change has been made to make the model reflect this usage.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ND Filter</em>' attribute.
	 * @see #isSetNDFilter()
	 * @see #unsetNDFilter()
	 * @see #setNDFilter(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_NDFilter()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='NDFilter'"
	 * @generated
	 */
	float getNDFilter();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getNDFilter <em>ND Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ND Filter</em>' attribute.
	 * @see #isSetNDFilter()
	 * @see #unsetNDFilter()
	 * @see #getNDFilter()
	 * @generated
	 */
	void setNDFilter(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ChannelType#getNDFilter <em>ND Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNDFilter()
	 * @see #getNDFilter()
	 * @see #setNDFilter(float)
	 * @generated
	 */
	void unsetNDFilter();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ChannelType#getNDFilter <em>ND Filter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ND Filter</em>' attribute is set.
	 * @see #unsetNDFilter()
	 * @see #getNDFilter()
	 * @see #setNDFilter(float)
	 * @generated
	 */
	boolean isSetNDFilter();

	/**
	 * Returns the value of the '<em><b>Pinhole Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The optional PinholeSize attribute allows specifying adjustable
	 *             pin hole diameters for confocal microscopes. Units are set by PinholeSizeUnit.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pinhole Size</em>' attribute.
	 * @see #isSetPinholeSize()
	 * @see #unsetPinholeSize()
	 * @see #setPinholeSize(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_PinholeSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='PinholeSize'"
	 * @generated
	 */
	float getPinholeSize();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getPinholeSize <em>Pinhole Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pinhole Size</em>' attribute.
	 * @see #isSetPinholeSize()
	 * @see #unsetPinholeSize()
	 * @see #getPinholeSize()
	 * @generated
	 */
	void setPinholeSize(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ChannelType#getPinholeSize <em>Pinhole Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPinholeSize()
	 * @see #getPinholeSize()
	 * @see #setPinholeSize(float)
	 * @generated
	 */
	void unsetPinholeSize();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ChannelType#getPinholeSize <em>Pinhole Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pinhole Size</em>' attribute is set.
	 * @see #unsetPinholeSize()
	 * @see #getPinholeSize()
	 * @see #setPinholeSize(float)
	 * @generated
	 */
	boolean isSetPinholeSize();

	/**
	 * Returns the value of the '<em><b>Pinhole Size Unit</b></em>' attribute.
	 * The default value is <code>"\u00b5m"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the pin hole diameter for confocal microscopes - default:microns[µm].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pinhole Size Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetPinholeSizeUnit()
	 * @see #unsetPinholeSizeUnit()
	 * @see #setPinholeSizeUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_PinholeSizeUnit()
	 * @model default="\u00b5m" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='PinholeSizeUnit'"
	 * @generated
	 */
	UnitsLength getPinholeSizeUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getPinholeSizeUnit <em>Pinhole Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pinhole Size Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetPinholeSizeUnit()
	 * @see #unsetPinholeSizeUnit()
	 * @see #getPinholeSizeUnit()
	 * @generated
	 */
	void setPinholeSizeUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ChannelType#getPinholeSizeUnit <em>Pinhole Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPinholeSizeUnit()
	 * @see #getPinholeSizeUnit()
	 * @see #setPinholeSizeUnit(UnitsLength)
	 * @generated
	 */
	void unsetPinholeSizeUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ChannelType#getPinholeSizeUnit <em>Pinhole Size Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pinhole Size Unit</em>' attribute is set.
	 * @see #unsetPinholeSizeUnit()
	 * @see #getPinholeSizeUnit()
	 * @see #setPinholeSizeUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetPinholeSizeUnit();

	/**
	 * Returns the value of the '<em><b>Pockel Cell Setting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The PockelCellSetting used for this channel. This is the amount the polarization of the beam is rotated by. [units:none]
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pockel Cell Setting</em>' attribute.
	 * @see #isSetPockelCellSetting()
	 * @see #unsetPockelCellSetting()
	 * @see #setPockelCellSetting(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_PockelCellSetting()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='PockelCellSetting'"
	 * @generated
	 */
	int getPockelCellSetting();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getPockelCellSetting <em>Pockel Cell Setting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pockel Cell Setting</em>' attribute.
	 * @see #isSetPockelCellSetting()
	 * @see #unsetPockelCellSetting()
	 * @see #getPockelCellSetting()
	 * @generated
	 */
	void setPockelCellSetting(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ChannelType#getPockelCellSetting <em>Pockel Cell Setting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPockelCellSetting()
	 * @see #getPockelCellSetting()
	 * @see #setPockelCellSetting(int)
	 * @generated
	 */
	void unsetPockelCellSetting();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ChannelType#getPockelCellSetting <em>Pockel Cell Setting</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pockel Cell Setting</em>' attribute is set.
	 * @see #unsetPockelCellSetting()
	 * @see #getPockelCellSetting()
	 * @see #setPockelCellSetting(int)
	 * @generated
	 */
	boolean isSetPockelCellSetting();

	/**
	 * Returns the value of the '<em><b>Samples Per Pixel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The number of samples the detector takes to form each pixel value. [units:none]
	 *             Note: This is not the same as "Frame Averaging" - see Integration in DetectorSettings
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Samples Per Pixel</em>' attribute.
	 * @see #isSetSamplesPerPixel()
	 * @see #unsetSamplesPerPixel()
	 * @see #setSamplesPerPixel(int)
	 * @see org.openmicroscopy.ome.OMEPackage#getChannelType_SamplesPerPixel()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveInt"
	 *        extendedMetaData="kind='attribute' name='SamplesPerPixel'"
	 * @generated
	 */
	int getSamplesPerPixel();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ChannelType#getSamplesPerPixel <em>Samples Per Pixel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Samples Per Pixel</em>' attribute.
	 * @see #isSetSamplesPerPixel()
	 * @see #unsetSamplesPerPixel()
	 * @see #getSamplesPerPixel()
	 * @generated
	 */
	void setSamplesPerPixel(int value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.ChannelType#getSamplesPerPixel <em>Samples Per Pixel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSamplesPerPixel()
	 * @see #getSamplesPerPixel()
	 * @see #setSamplesPerPixel(int)
	 * @generated
	 */
	void unsetSamplesPerPixel();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.ChannelType#getSamplesPerPixel <em>Samples Per Pixel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Samples Per Pixel</em>' attribute is set.
	 * @see #unsetSamplesPerPixel()
	 * @see #getSamplesPerPixel()
	 * @see #setSamplesPerPixel(int)
	 * @generated
	 */
	boolean isSetSamplesPerPixel();

} // ChannelType
