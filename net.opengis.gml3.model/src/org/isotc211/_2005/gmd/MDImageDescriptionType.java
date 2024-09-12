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
package org.isotc211._2005.gmd;

import org.isotc211._2005.gco.BooleanPropertyType;
import org.isotc211._2005.gco.IntegerPropertyType;
import org.isotc211._2005.gco.RealPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Image Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about an image's suitability for use
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDImageDescriptionType#getIlluminationElevationAngle <em>Illumination Elevation Angle</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDImageDescriptionType#getIlluminationAzimuthAngle <em>Illumination Azimuth Angle</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDImageDescriptionType#getImagingCondition <em>Imaging Condition</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDImageDescriptionType#getImageQualityCode <em>Image Quality Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDImageDescriptionType#getCloudCoverPercentage <em>Cloud Cover Percentage</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDImageDescriptionType#getProcessingLevelCode <em>Processing Level Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDImageDescriptionType#getCompressionGenerationQuantity <em>Compression Generation Quantity</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDImageDescriptionType#getTriangulationIndicator <em>Triangulation Indicator</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDImageDescriptionType#getRadiometricCalibrationDataAvailability <em>Radiometric Calibration Data Availability</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDImageDescriptionType#getCameraCalibrationInformationAvailability <em>Camera Calibration Information Availability</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDImageDescriptionType#getFilmDistortionInformationAvailability <em>Film Distortion Information Availability</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDImageDescriptionType#getLensDistortionInformationAvailability <em>Lens Distortion Information Availability</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDImageDescriptionType()
 * @model extendedMetaData="name='MD_ImageDescription_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDImageDescriptionType extends MDCoverageDescriptionType {
	/**
	 * Returns the value of the '<em><b>Illumination Elevation Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Illumination Elevation Angle</em>' containment reference.
	 * @see #setIlluminationElevationAngle(RealPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDImageDescriptionType_IlluminationElevationAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='illuminationElevationAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	RealPropertyType getIlluminationElevationAngle();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDImageDescriptionType#getIlluminationElevationAngle <em>Illumination Elevation Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Illumination Elevation Angle</em>' containment reference.
	 * @see #getIlluminationElevationAngle()
	 * @generated
	 */
	void setIlluminationElevationAngle(RealPropertyType value);

	/**
	 * Returns the value of the '<em><b>Illumination Azimuth Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Illumination Azimuth Angle</em>' containment reference.
	 * @see #setIlluminationAzimuthAngle(RealPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDImageDescriptionType_IlluminationAzimuthAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='illuminationAzimuthAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	RealPropertyType getIlluminationAzimuthAngle();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDImageDescriptionType#getIlluminationAzimuthAngle <em>Illumination Azimuth Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Illumination Azimuth Angle</em>' containment reference.
	 * @see #getIlluminationAzimuthAngle()
	 * @generated
	 */
	void setIlluminationAzimuthAngle(RealPropertyType value);

	/**
	 * Returns the value of the '<em><b>Imaging Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imaging Condition</em>' containment reference.
	 * @see #setImagingCondition(MDImagingConditionCodePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDImageDescriptionType_ImagingCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imagingCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	MDImagingConditionCodePropertyType getImagingCondition();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDImageDescriptionType#getImagingCondition <em>Imaging Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imaging Condition</em>' containment reference.
	 * @see #getImagingCondition()
	 * @generated
	 */
	void setImagingCondition(MDImagingConditionCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Image Quality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Quality Code</em>' containment reference.
	 * @see #setImageQualityCode(MDIdentifierPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDImageDescriptionType_ImageQualityCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imageQualityCode' namespace='##targetNamespace'"
	 * @generated
	 */
	MDIdentifierPropertyType getImageQualityCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDImageDescriptionType#getImageQualityCode <em>Image Quality Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Quality Code</em>' containment reference.
	 * @see #getImageQualityCode()
	 * @generated
	 */
	void setImageQualityCode(MDIdentifierPropertyType value);

	/**
	 * Returns the value of the '<em><b>Cloud Cover Percentage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Cover Percentage</em>' containment reference.
	 * @see #setCloudCoverPercentage(RealPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDImageDescriptionType_CloudCoverPercentage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cloudCoverPercentage' namespace='##targetNamespace'"
	 * @generated
	 */
	RealPropertyType getCloudCoverPercentage();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDImageDescriptionType#getCloudCoverPercentage <em>Cloud Cover Percentage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Cover Percentage</em>' containment reference.
	 * @see #getCloudCoverPercentage()
	 * @generated
	 */
	void setCloudCoverPercentage(RealPropertyType value);

	/**
	 * Returns the value of the '<em><b>Processing Level Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Level Code</em>' containment reference.
	 * @see #setProcessingLevelCode(MDIdentifierPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDImageDescriptionType_ProcessingLevelCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='processingLevelCode' namespace='##targetNamespace'"
	 * @generated
	 */
	MDIdentifierPropertyType getProcessingLevelCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDImageDescriptionType#getProcessingLevelCode <em>Processing Level Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Level Code</em>' containment reference.
	 * @see #getProcessingLevelCode()
	 * @generated
	 */
	void setProcessingLevelCode(MDIdentifierPropertyType value);

	/**
	 * Returns the value of the '<em><b>Compression Generation Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression Generation Quantity</em>' containment reference.
	 * @see #setCompressionGenerationQuantity(IntegerPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDImageDescriptionType_CompressionGenerationQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compressionGenerationQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerPropertyType getCompressionGenerationQuantity();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDImageDescriptionType#getCompressionGenerationQuantity <em>Compression Generation Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Generation Quantity</em>' containment reference.
	 * @see #getCompressionGenerationQuantity()
	 * @generated
	 */
	void setCompressionGenerationQuantity(IntegerPropertyType value);

	/**
	 * Returns the value of the '<em><b>Triangulation Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triangulation Indicator</em>' containment reference.
	 * @see #setTriangulationIndicator(BooleanPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDImageDescriptionType_TriangulationIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='triangulationIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanPropertyType getTriangulationIndicator();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDImageDescriptionType#getTriangulationIndicator <em>Triangulation Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triangulation Indicator</em>' containment reference.
	 * @see #getTriangulationIndicator()
	 * @generated
	 */
	void setTriangulationIndicator(BooleanPropertyType value);

	/**
	 * Returns the value of the '<em><b>Radiometric Calibration Data Availability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radiometric Calibration Data Availability</em>' containment reference.
	 * @see #setRadiometricCalibrationDataAvailability(BooleanPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDImageDescriptionType_RadiometricCalibrationDataAvailability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='radiometricCalibrationDataAvailability' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanPropertyType getRadiometricCalibrationDataAvailability();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDImageDescriptionType#getRadiometricCalibrationDataAvailability <em>Radiometric Calibration Data Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radiometric Calibration Data Availability</em>' containment reference.
	 * @see #getRadiometricCalibrationDataAvailability()
	 * @generated
	 */
	void setRadiometricCalibrationDataAvailability(BooleanPropertyType value);

	/**
	 * Returns the value of the '<em><b>Camera Calibration Information Availability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Camera Calibration Information Availability</em>' containment reference.
	 * @see #setCameraCalibrationInformationAvailability(BooleanPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDImageDescriptionType_CameraCalibrationInformationAvailability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cameraCalibrationInformationAvailability' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanPropertyType getCameraCalibrationInformationAvailability();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDImageDescriptionType#getCameraCalibrationInformationAvailability <em>Camera Calibration Information Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera Calibration Information Availability</em>' containment reference.
	 * @see #getCameraCalibrationInformationAvailability()
	 * @generated
	 */
	void setCameraCalibrationInformationAvailability(BooleanPropertyType value);

	/**
	 * Returns the value of the '<em><b>Film Distortion Information Availability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Film Distortion Information Availability</em>' containment reference.
	 * @see #setFilmDistortionInformationAvailability(BooleanPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDImageDescriptionType_FilmDistortionInformationAvailability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filmDistortionInformationAvailability' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanPropertyType getFilmDistortionInformationAvailability();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDImageDescriptionType#getFilmDistortionInformationAvailability <em>Film Distortion Information Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Film Distortion Information Availability</em>' containment reference.
	 * @see #getFilmDistortionInformationAvailability()
	 * @generated
	 */
	void setFilmDistortionInformationAvailability(BooleanPropertyType value);

	/**
	 * Returns the value of the '<em><b>Lens Distortion Information Availability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lens Distortion Information Availability</em>' containment reference.
	 * @see #setLensDistortionInformationAvailability(BooleanPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDImageDescriptionType_LensDistortionInformationAvailability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lensDistortionInformationAvailability' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanPropertyType getLensDistortionInformationAvailability();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDImageDescriptionType#getLensDistortionInformationAvailability <em>Lens Distortion Information Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lens Distortion Information Availability</em>' containment reference.
	 * @see #getLensDistortionInformationAvailability()
	 * @generated
	 */
	void setLensDistortionInformationAvailability(BooleanPropertyType value);

} // MDImageDescriptionType
