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
package org.isotc211._2005.gmd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.isotc211._2005.gco.BooleanPropertyType;
import org.isotc211._2005.gco.IntegerPropertyType;
import org.isotc211._2005.gco.RealPropertyType;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDIdentifierPropertyType;
import org.isotc211._2005.gmd.MDImageDescriptionType;
import org.isotc211._2005.gmd.MDImagingConditionCodePropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Image Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDImageDescriptionTypeImpl#getIlluminationElevationAngle <em>Illumination Elevation Angle</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDImageDescriptionTypeImpl#getIlluminationAzimuthAngle <em>Illumination Azimuth Angle</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDImageDescriptionTypeImpl#getImagingCondition <em>Imaging Condition</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDImageDescriptionTypeImpl#getImageQualityCode <em>Image Quality Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDImageDescriptionTypeImpl#getCloudCoverPercentage <em>Cloud Cover Percentage</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDImageDescriptionTypeImpl#getProcessingLevelCode <em>Processing Level Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDImageDescriptionTypeImpl#getCompressionGenerationQuantity <em>Compression Generation Quantity</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDImageDescriptionTypeImpl#getTriangulationIndicator <em>Triangulation Indicator</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDImageDescriptionTypeImpl#getRadiometricCalibrationDataAvailability <em>Radiometric Calibration Data Availability</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDImageDescriptionTypeImpl#getCameraCalibrationInformationAvailability <em>Camera Calibration Information Availability</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDImageDescriptionTypeImpl#getFilmDistortionInformationAvailability <em>Film Distortion Information Availability</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDImageDescriptionTypeImpl#getLensDistortionInformationAvailability <em>Lens Distortion Information Availability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDImageDescriptionTypeImpl extends MDCoverageDescriptionTypeImpl implements MDImageDescriptionType {
	/**
	 * The cached value of the '{@link #getIlluminationElevationAngle() <em>Illumination Elevation Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIlluminationElevationAngle()
	 * @generated
	 * @ordered
	 */
	protected RealPropertyType illuminationElevationAngle;

	/**
	 * The cached value of the '{@link #getIlluminationAzimuthAngle() <em>Illumination Azimuth Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIlluminationAzimuthAngle()
	 * @generated
	 * @ordered
	 */
	protected RealPropertyType illuminationAzimuthAngle;

	/**
	 * The cached value of the '{@link #getImagingCondition() <em>Imaging Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagingCondition()
	 * @generated
	 * @ordered
	 */
	protected MDImagingConditionCodePropertyType imagingCondition;

	/**
	 * The cached value of the '{@link #getImageQualityCode() <em>Image Quality Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageQualityCode()
	 * @generated
	 * @ordered
	 */
	protected MDIdentifierPropertyType imageQualityCode;

	/**
	 * The cached value of the '{@link #getCloudCoverPercentage() <em>Cloud Cover Percentage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudCoverPercentage()
	 * @generated
	 * @ordered
	 */
	protected RealPropertyType cloudCoverPercentage;

	/**
	 * The cached value of the '{@link #getProcessingLevelCode() <em>Processing Level Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingLevelCode()
	 * @generated
	 * @ordered
	 */
	protected MDIdentifierPropertyType processingLevelCode;

	/**
	 * The cached value of the '{@link #getCompressionGenerationQuantity() <em>Compression Generation Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionGenerationQuantity()
	 * @generated
	 * @ordered
	 */
	protected IntegerPropertyType compressionGenerationQuantity;

	/**
	 * The cached value of the '{@link #getTriangulationIndicator() <em>Triangulation Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriangulationIndicator()
	 * @generated
	 * @ordered
	 */
	protected BooleanPropertyType triangulationIndicator;

	/**
	 * The cached value of the '{@link #getRadiometricCalibrationDataAvailability() <em>Radiometric Calibration Data Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadiometricCalibrationDataAvailability()
	 * @generated
	 * @ordered
	 */
	protected BooleanPropertyType radiometricCalibrationDataAvailability;

	/**
	 * The cached value of the '{@link #getCameraCalibrationInformationAvailability() <em>Camera Calibration Information Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCameraCalibrationInformationAvailability()
	 * @generated
	 * @ordered
	 */
	protected BooleanPropertyType cameraCalibrationInformationAvailability;

	/**
	 * The cached value of the '{@link #getFilmDistortionInformationAvailability() <em>Film Distortion Information Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilmDistortionInformationAvailability()
	 * @generated
	 * @ordered
	 */
	protected BooleanPropertyType filmDistortionInformationAvailability;

	/**
	 * The cached value of the '{@link #getLensDistortionInformationAvailability() <em>Lens Distortion Information Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLensDistortionInformationAvailability()
	 * @generated
	 * @ordered
	 */
	protected BooleanPropertyType lensDistortionInformationAvailability;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDImageDescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDImageDescriptionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealPropertyType getIlluminationElevationAngle() {
		return illuminationElevationAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIlluminationElevationAngle(RealPropertyType newIlluminationElevationAngle, NotificationChain msgs) {
		RealPropertyType oldIlluminationElevationAngle = illuminationElevationAngle;
		illuminationElevationAngle = newIlluminationElevationAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__ILLUMINATION_ELEVATION_ANGLE, oldIlluminationElevationAngle, newIlluminationElevationAngle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIlluminationElevationAngle(RealPropertyType newIlluminationElevationAngle) {
		if (newIlluminationElevationAngle != illuminationElevationAngle) {
			NotificationChain msgs = null;
			if (illuminationElevationAngle != null)
				msgs = ((InternalEObject)illuminationElevationAngle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__ILLUMINATION_ELEVATION_ANGLE, null, msgs);
			if (newIlluminationElevationAngle != null)
				msgs = ((InternalEObject)newIlluminationElevationAngle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__ILLUMINATION_ELEVATION_ANGLE, null, msgs);
			msgs = basicSetIlluminationElevationAngle(newIlluminationElevationAngle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__ILLUMINATION_ELEVATION_ANGLE, newIlluminationElevationAngle, newIlluminationElevationAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealPropertyType getIlluminationAzimuthAngle() {
		return illuminationAzimuthAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIlluminationAzimuthAngle(RealPropertyType newIlluminationAzimuthAngle, NotificationChain msgs) {
		RealPropertyType oldIlluminationAzimuthAngle = illuminationAzimuthAngle;
		illuminationAzimuthAngle = newIlluminationAzimuthAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__ILLUMINATION_AZIMUTH_ANGLE, oldIlluminationAzimuthAngle, newIlluminationAzimuthAngle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIlluminationAzimuthAngle(RealPropertyType newIlluminationAzimuthAngle) {
		if (newIlluminationAzimuthAngle != illuminationAzimuthAngle) {
			NotificationChain msgs = null;
			if (illuminationAzimuthAngle != null)
				msgs = ((InternalEObject)illuminationAzimuthAngle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__ILLUMINATION_AZIMUTH_ANGLE, null, msgs);
			if (newIlluminationAzimuthAngle != null)
				msgs = ((InternalEObject)newIlluminationAzimuthAngle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__ILLUMINATION_AZIMUTH_ANGLE, null, msgs);
			msgs = basicSetIlluminationAzimuthAngle(newIlluminationAzimuthAngle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__ILLUMINATION_AZIMUTH_ANGLE, newIlluminationAzimuthAngle, newIlluminationAzimuthAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDImagingConditionCodePropertyType getImagingCondition() {
		return imagingCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagingCondition(MDImagingConditionCodePropertyType newImagingCondition, NotificationChain msgs) {
		MDImagingConditionCodePropertyType oldImagingCondition = imagingCondition;
		imagingCondition = newImagingCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__IMAGING_CONDITION, oldImagingCondition, newImagingCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImagingCondition(MDImagingConditionCodePropertyType newImagingCondition) {
		if (newImagingCondition != imagingCondition) {
			NotificationChain msgs = null;
			if (imagingCondition != null)
				msgs = ((InternalEObject)imagingCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__IMAGING_CONDITION, null, msgs);
			if (newImagingCondition != null)
				msgs = ((InternalEObject)newImagingCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__IMAGING_CONDITION, null, msgs);
			msgs = basicSetImagingCondition(newImagingCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__IMAGING_CONDITION, newImagingCondition, newImagingCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDIdentifierPropertyType getImageQualityCode() {
		return imageQualityCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageQualityCode(MDIdentifierPropertyType newImageQualityCode, NotificationChain msgs) {
		MDIdentifierPropertyType oldImageQualityCode = imageQualityCode;
		imageQualityCode = newImageQualityCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__IMAGE_QUALITY_CODE, oldImageQualityCode, newImageQualityCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageQualityCode(MDIdentifierPropertyType newImageQualityCode) {
		if (newImageQualityCode != imageQualityCode) {
			NotificationChain msgs = null;
			if (imageQualityCode != null)
				msgs = ((InternalEObject)imageQualityCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__IMAGE_QUALITY_CODE, null, msgs);
			if (newImageQualityCode != null)
				msgs = ((InternalEObject)newImageQualityCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__IMAGE_QUALITY_CODE, null, msgs);
			msgs = basicSetImageQualityCode(newImageQualityCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__IMAGE_QUALITY_CODE, newImageQualityCode, newImageQualityCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealPropertyType getCloudCoverPercentage() {
		return cloudCoverPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCloudCoverPercentage(RealPropertyType newCloudCoverPercentage, NotificationChain msgs) {
		RealPropertyType oldCloudCoverPercentage = cloudCoverPercentage;
		cloudCoverPercentage = newCloudCoverPercentage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__CLOUD_COVER_PERCENTAGE, oldCloudCoverPercentage, newCloudCoverPercentage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloudCoverPercentage(RealPropertyType newCloudCoverPercentage) {
		if (newCloudCoverPercentage != cloudCoverPercentage) {
			NotificationChain msgs = null;
			if (cloudCoverPercentage != null)
				msgs = ((InternalEObject)cloudCoverPercentage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__CLOUD_COVER_PERCENTAGE, null, msgs);
			if (newCloudCoverPercentage != null)
				msgs = ((InternalEObject)newCloudCoverPercentage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__CLOUD_COVER_PERCENTAGE, null, msgs);
			msgs = basicSetCloudCoverPercentage(newCloudCoverPercentage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__CLOUD_COVER_PERCENTAGE, newCloudCoverPercentage, newCloudCoverPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDIdentifierPropertyType getProcessingLevelCode() {
		return processingLevelCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessingLevelCode(MDIdentifierPropertyType newProcessingLevelCode, NotificationChain msgs) {
		MDIdentifierPropertyType oldProcessingLevelCode = processingLevelCode;
		processingLevelCode = newProcessingLevelCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__PROCESSING_LEVEL_CODE, oldProcessingLevelCode, newProcessingLevelCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessingLevelCode(MDIdentifierPropertyType newProcessingLevelCode) {
		if (newProcessingLevelCode != processingLevelCode) {
			NotificationChain msgs = null;
			if (processingLevelCode != null)
				msgs = ((InternalEObject)processingLevelCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__PROCESSING_LEVEL_CODE, null, msgs);
			if (newProcessingLevelCode != null)
				msgs = ((InternalEObject)newProcessingLevelCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__PROCESSING_LEVEL_CODE, null, msgs);
			msgs = basicSetProcessingLevelCode(newProcessingLevelCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__PROCESSING_LEVEL_CODE, newProcessingLevelCode, newProcessingLevelCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerPropertyType getCompressionGenerationQuantity() {
		return compressionGenerationQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompressionGenerationQuantity(IntegerPropertyType newCompressionGenerationQuantity, NotificationChain msgs) {
		IntegerPropertyType oldCompressionGenerationQuantity = compressionGenerationQuantity;
		compressionGenerationQuantity = newCompressionGenerationQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__COMPRESSION_GENERATION_QUANTITY, oldCompressionGenerationQuantity, newCompressionGenerationQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompressionGenerationQuantity(IntegerPropertyType newCompressionGenerationQuantity) {
		if (newCompressionGenerationQuantity != compressionGenerationQuantity) {
			NotificationChain msgs = null;
			if (compressionGenerationQuantity != null)
				msgs = ((InternalEObject)compressionGenerationQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__COMPRESSION_GENERATION_QUANTITY, null, msgs);
			if (newCompressionGenerationQuantity != null)
				msgs = ((InternalEObject)newCompressionGenerationQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__COMPRESSION_GENERATION_QUANTITY, null, msgs);
			msgs = basicSetCompressionGenerationQuantity(newCompressionGenerationQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__COMPRESSION_GENERATION_QUANTITY, newCompressionGenerationQuantity, newCompressionGenerationQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanPropertyType getTriangulationIndicator() {
		return triangulationIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriangulationIndicator(BooleanPropertyType newTriangulationIndicator, NotificationChain msgs) {
		BooleanPropertyType oldTriangulationIndicator = triangulationIndicator;
		triangulationIndicator = newTriangulationIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__TRIANGULATION_INDICATOR, oldTriangulationIndicator, newTriangulationIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriangulationIndicator(BooleanPropertyType newTriangulationIndicator) {
		if (newTriangulationIndicator != triangulationIndicator) {
			NotificationChain msgs = null;
			if (triangulationIndicator != null)
				msgs = ((InternalEObject)triangulationIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__TRIANGULATION_INDICATOR, null, msgs);
			if (newTriangulationIndicator != null)
				msgs = ((InternalEObject)newTriangulationIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__TRIANGULATION_INDICATOR, null, msgs);
			msgs = basicSetTriangulationIndicator(newTriangulationIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__TRIANGULATION_INDICATOR, newTriangulationIndicator, newTriangulationIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanPropertyType getRadiometricCalibrationDataAvailability() {
		return radiometricCalibrationDataAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRadiometricCalibrationDataAvailability(BooleanPropertyType newRadiometricCalibrationDataAvailability, NotificationChain msgs) {
		BooleanPropertyType oldRadiometricCalibrationDataAvailability = radiometricCalibrationDataAvailability;
		radiometricCalibrationDataAvailability = newRadiometricCalibrationDataAvailability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__RADIOMETRIC_CALIBRATION_DATA_AVAILABILITY, oldRadiometricCalibrationDataAvailability, newRadiometricCalibrationDataAvailability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRadiometricCalibrationDataAvailability(BooleanPropertyType newRadiometricCalibrationDataAvailability) {
		if (newRadiometricCalibrationDataAvailability != radiometricCalibrationDataAvailability) {
			NotificationChain msgs = null;
			if (radiometricCalibrationDataAvailability != null)
				msgs = ((InternalEObject)radiometricCalibrationDataAvailability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__RADIOMETRIC_CALIBRATION_DATA_AVAILABILITY, null, msgs);
			if (newRadiometricCalibrationDataAvailability != null)
				msgs = ((InternalEObject)newRadiometricCalibrationDataAvailability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__RADIOMETRIC_CALIBRATION_DATA_AVAILABILITY, null, msgs);
			msgs = basicSetRadiometricCalibrationDataAvailability(newRadiometricCalibrationDataAvailability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__RADIOMETRIC_CALIBRATION_DATA_AVAILABILITY, newRadiometricCalibrationDataAvailability, newRadiometricCalibrationDataAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanPropertyType getCameraCalibrationInformationAvailability() {
		return cameraCalibrationInformationAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCameraCalibrationInformationAvailability(BooleanPropertyType newCameraCalibrationInformationAvailability, NotificationChain msgs) {
		BooleanPropertyType oldCameraCalibrationInformationAvailability = cameraCalibrationInformationAvailability;
		cameraCalibrationInformationAvailability = newCameraCalibrationInformationAvailability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__CAMERA_CALIBRATION_INFORMATION_AVAILABILITY, oldCameraCalibrationInformationAvailability, newCameraCalibrationInformationAvailability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCameraCalibrationInformationAvailability(BooleanPropertyType newCameraCalibrationInformationAvailability) {
		if (newCameraCalibrationInformationAvailability != cameraCalibrationInformationAvailability) {
			NotificationChain msgs = null;
			if (cameraCalibrationInformationAvailability != null)
				msgs = ((InternalEObject)cameraCalibrationInformationAvailability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__CAMERA_CALIBRATION_INFORMATION_AVAILABILITY, null, msgs);
			if (newCameraCalibrationInformationAvailability != null)
				msgs = ((InternalEObject)newCameraCalibrationInformationAvailability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__CAMERA_CALIBRATION_INFORMATION_AVAILABILITY, null, msgs);
			msgs = basicSetCameraCalibrationInformationAvailability(newCameraCalibrationInformationAvailability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__CAMERA_CALIBRATION_INFORMATION_AVAILABILITY, newCameraCalibrationInformationAvailability, newCameraCalibrationInformationAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanPropertyType getFilmDistortionInformationAvailability() {
		return filmDistortionInformationAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilmDistortionInformationAvailability(BooleanPropertyType newFilmDistortionInformationAvailability, NotificationChain msgs) {
		BooleanPropertyType oldFilmDistortionInformationAvailability = filmDistortionInformationAvailability;
		filmDistortionInformationAvailability = newFilmDistortionInformationAvailability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__FILM_DISTORTION_INFORMATION_AVAILABILITY, oldFilmDistortionInformationAvailability, newFilmDistortionInformationAvailability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilmDistortionInformationAvailability(BooleanPropertyType newFilmDistortionInformationAvailability) {
		if (newFilmDistortionInformationAvailability != filmDistortionInformationAvailability) {
			NotificationChain msgs = null;
			if (filmDistortionInformationAvailability != null)
				msgs = ((InternalEObject)filmDistortionInformationAvailability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__FILM_DISTORTION_INFORMATION_AVAILABILITY, null, msgs);
			if (newFilmDistortionInformationAvailability != null)
				msgs = ((InternalEObject)newFilmDistortionInformationAvailability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__FILM_DISTORTION_INFORMATION_AVAILABILITY, null, msgs);
			msgs = basicSetFilmDistortionInformationAvailability(newFilmDistortionInformationAvailability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__FILM_DISTORTION_INFORMATION_AVAILABILITY, newFilmDistortionInformationAvailability, newFilmDistortionInformationAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanPropertyType getLensDistortionInformationAvailability() {
		return lensDistortionInformationAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLensDistortionInformationAvailability(BooleanPropertyType newLensDistortionInformationAvailability, NotificationChain msgs) {
		BooleanPropertyType oldLensDistortionInformationAvailability = lensDistortionInformationAvailability;
		lensDistortionInformationAvailability = newLensDistortionInformationAvailability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__LENS_DISTORTION_INFORMATION_AVAILABILITY, oldLensDistortionInformationAvailability, newLensDistortionInformationAvailability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLensDistortionInformationAvailability(BooleanPropertyType newLensDistortionInformationAvailability) {
		if (newLensDistortionInformationAvailability != lensDistortionInformationAvailability) {
			NotificationChain msgs = null;
			if (lensDistortionInformationAvailability != null)
				msgs = ((InternalEObject)lensDistortionInformationAvailability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__LENS_DISTORTION_INFORMATION_AVAILABILITY, null, msgs);
			if (newLensDistortionInformationAvailability != null)
				msgs = ((InternalEObject)newLensDistortionInformationAvailability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__LENS_DISTORTION_INFORMATION_AVAILABILITY, null, msgs);
			msgs = basicSetLensDistortionInformationAvailability(newLensDistortionInformationAvailability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__LENS_DISTORTION_INFORMATION_AVAILABILITY, newLensDistortionInformationAvailability, newLensDistortionInformationAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__ILLUMINATION_ELEVATION_ANGLE:
				return basicSetIlluminationElevationAngle(null, msgs);
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__ILLUMINATION_AZIMUTH_ANGLE:
				return basicSetIlluminationAzimuthAngle(null, msgs);
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__IMAGING_CONDITION:
				return basicSetImagingCondition(null, msgs);
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__IMAGE_QUALITY_CODE:
				return basicSetImageQualityCode(null, msgs);
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__CLOUD_COVER_PERCENTAGE:
				return basicSetCloudCoverPercentage(null, msgs);
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__PROCESSING_LEVEL_CODE:
				return basicSetProcessingLevelCode(null, msgs);
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__COMPRESSION_GENERATION_QUANTITY:
				return basicSetCompressionGenerationQuantity(null, msgs);
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__TRIANGULATION_INDICATOR:
				return basicSetTriangulationIndicator(null, msgs);
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__RADIOMETRIC_CALIBRATION_DATA_AVAILABILITY:
				return basicSetRadiometricCalibrationDataAvailability(null, msgs);
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__CAMERA_CALIBRATION_INFORMATION_AVAILABILITY:
				return basicSetCameraCalibrationInformationAvailability(null, msgs);
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__FILM_DISTORTION_INFORMATION_AVAILABILITY:
				return basicSetFilmDistortionInformationAvailability(null, msgs);
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__LENS_DISTORTION_INFORMATION_AVAILABILITY:
				return basicSetLensDistortionInformationAvailability(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__ILLUMINATION_ELEVATION_ANGLE:
				return getIlluminationElevationAngle();
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__ILLUMINATION_AZIMUTH_ANGLE:
				return getIlluminationAzimuthAngle();
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__IMAGING_CONDITION:
				return getImagingCondition();
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__IMAGE_QUALITY_CODE:
				return getImageQualityCode();
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__CLOUD_COVER_PERCENTAGE:
				return getCloudCoverPercentage();
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__PROCESSING_LEVEL_CODE:
				return getProcessingLevelCode();
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__COMPRESSION_GENERATION_QUANTITY:
				return getCompressionGenerationQuantity();
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__TRIANGULATION_INDICATOR:
				return getTriangulationIndicator();
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__RADIOMETRIC_CALIBRATION_DATA_AVAILABILITY:
				return getRadiometricCalibrationDataAvailability();
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__CAMERA_CALIBRATION_INFORMATION_AVAILABILITY:
				return getCameraCalibrationInformationAvailability();
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__FILM_DISTORTION_INFORMATION_AVAILABILITY:
				return getFilmDistortionInformationAvailability();
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__LENS_DISTORTION_INFORMATION_AVAILABILITY:
				return getLensDistortionInformationAvailability();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__ILLUMINATION_ELEVATION_ANGLE:
				setIlluminationElevationAngle((RealPropertyType)newValue);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__ILLUMINATION_AZIMUTH_ANGLE:
				setIlluminationAzimuthAngle((RealPropertyType)newValue);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__IMAGING_CONDITION:
				setImagingCondition((MDImagingConditionCodePropertyType)newValue);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__IMAGE_QUALITY_CODE:
				setImageQualityCode((MDIdentifierPropertyType)newValue);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__CLOUD_COVER_PERCENTAGE:
				setCloudCoverPercentage((RealPropertyType)newValue);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__PROCESSING_LEVEL_CODE:
				setProcessingLevelCode((MDIdentifierPropertyType)newValue);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__COMPRESSION_GENERATION_QUANTITY:
				setCompressionGenerationQuantity((IntegerPropertyType)newValue);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__TRIANGULATION_INDICATOR:
				setTriangulationIndicator((BooleanPropertyType)newValue);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__RADIOMETRIC_CALIBRATION_DATA_AVAILABILITY:
				setRadiometricCalibrationDataAvailability((BooleanPropertyType)newValue);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__CAMERA_CALIBRATION_INFORMATION_AVAILABILITY:
				setCameraCalibrationInformationAvailability((BooleanPropertyType)newValue);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__FILM_DISTORTION_INFORMATION_AVAILABILITY:
				setFilmDistortionInformationAvailability((BooleanPropertyType)newValue);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__LENS_DISTORTION_INFORMATION_AVAILABILITY:
				setLensDistortionInformationAvailability((BooleanPropertyType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__ILLUMINATION_ELEVATION_ANGLE:
				setIlluminationElevationAngle((RealPropertyType)null);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__ILLUMINATION_AZIMUTH_ANGLE:
				setIlluminationAzimuthAngle((RealPropertyType)null);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__IMAGING_CONDITION:
				setImagingCondition((MDImagingConditionCodePropertyType)null);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__IMAGE_QUALITY_CODE:
				setImageQualityCode((MDIdentifierPropertyType)null);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__CLOUD_COVER_PERCENTAGE:
				setCloudCoverPercentage((RealPropertyType)null);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__PROCESSING_LEVEL_CODE:
				setProcessingLevelCode((MDIdentifierPropertyType)null);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__COMPRESSION_GENERATION_QUANTITY:
				setCompressionGenerationQuantity((IntegerPropertyType)null);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__TRIANGULATION_INDICATOR:
				setTriangulationIndicator((BooleanPropertyType)null);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__RADIOMETRIC_CALIBRATION_DATA_AVAILABILITY:
				setRadiometricCalibrationDataAvailability((BooleanPropertyType)null);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__CAMERA_CALIBRATION_INFORMATION_AVAILABILITY:
				setCameraCalibrationInformationAvailability((BooleanPropertyType)null);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__FILM_DISTORTION_INFORMATION_AVAILABILITY:
				setFilmDistortionInformationAvailability((BooleanPropertyType)null);
				return;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__LENS_DISTORTION_INFORMATION_AVAILABILITY:
				setLensDistortionInformationAvailability((BooleanPropertyType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__ILLUMINATION_ELEVATION_ANGLE:
				return illuminationElevationAngle != null;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__ILLUMINATION_AZIMUTH_ANGLE:
				return illuminationAzimuthAngle != null;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__IMAGING_CONDITION:
				return imagingCondition != null;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__IMAGE_QUALITY_CODE:
				return imageQualityCode != null;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__CLOUD_COVER_PERCENTAGE:
				return cloudCoverPercentage != null;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__PROCESSING_LEVEL_CODE:
				return processingLevelCode != null;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__COMPRESSION_GENERATION_QUANTITY:
				return compressionGenerationQuantity != null;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__TRIANGULATION_INDICATOR:
				return triangulationIndicator != null;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__RADIOMETRIC_CALIBRATION_DATA_AVAILABILITY:
				return radiometricCalibrationDataAvailability != null;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__CAMERA_CALIBRATION_INFORMATION_AVAILABILITY:
				return cameraCalibrationInformationAvailability != null;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__FILM_DISTORTION_INFORMATION_AVAILABILITY:
				return filmDistortionInformationAvailability != null;
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE__LENS_DISTORTION_INFORMATION_AVAILABILITY:
				return lensDistortionInformationAvailability != null;
		}
		return super.eIsSet(featureID);
	}

} //MDImageDescriptionTypeImpl
