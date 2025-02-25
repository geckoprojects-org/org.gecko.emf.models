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
package org.openmicroscopy.ome.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openmicroscopy.ome.AcquisitionModeType;
import org.openmicroscopy.ome.AnnotationRefType;
import org.openmicroscopy.ome.ChannelType;
import org.openmicroscopy.ome.ContrastMethodType;
import org.openmicroscopy.ome.DetectorSettingsType;
import org.openmicroscopy.ome.FilterSetRefType;
import org.openmicroscopy.ome.IlluminationTypeType;
import org.openmicroscopy.ome.LightPathType;
import org.openmicroscopy.ome.LightSourceSettingsType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.UnitsLength;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getLightSourceSettings <em>Light Source Settings</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getDetectorSettings <em>Detector Settings</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getFilterSetRef <em>Filter Set Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getLightPath <em>Light Path</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getAcquisitionMode <em>Acquisition Mode</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getContrastMethod <em>Contrast Method</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getEmissionWavelength <em>Emission Wavelength</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getEmissionWavelengthUnit <em>Emission Wavelength Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getExcitationWavelength <em>Excitation Wavelength</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getExcitationWavelengthUnit <em>Excitation Wavelength Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getFluor <em>Fluor</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getIlluminationType <em>Illumination Type</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getNDFilter <em>ND Filter</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getPinholeSize <em>Pinhole Size</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getPinholeSizeUnit <em>Pinhole Size Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getPockelCellSetting <em>Pockel Cell Setting</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ChannelTypeImpl#getSamplesPerPixel <em>Samples Per Pixel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelTypeImpl extends MinimalEObjectImpl.Container implements ChannelType {
	/**
	 * The cached value of the '{@link #getLightSourceSettings() <em>Light Source Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightSourceSettings()
	 * @generated
	 * @ordered
	 */
	protected LightSourceSettingsType lightSourceSettings;

	/**
	 * The cached value of the '{@link #getDetectorSettings() <em>Detector Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectorSettings()
	 * @generated
	 * @ordered
	 */
	protected DetectorSettingsType detectorSettings;

	/**
	 * The cached value of the '{@link #getFilterSetRef() <em>Filter Set Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterSetRef()
	 * @generated
	 * @ordered
	 */
	protected FilterSetRefType filterSetRef;

	/**
	 * The cached value of the '{@link #getAnnotationRef() <em>Annotation Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationRef()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationRefType> annotationRef;

	/**
	 * The cached value of the '{@link #getLightPath() <em>Light Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightPath()
	 * @generated
	 * @ordered
	 */
	protected LightPathType lightPath;

	/**
	 * The default value of the '{@link #getAcquisitionMode() <em>Acquisition Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquisitionMode()
	 * @generated
	 * @ordered
	 */
	protected static final AcquisitionModeType ACQUISITION_MODE_EDEFAULT = AcquisitionModeType.WIDE_FIELD;

	/**
	 * The cached value of the '{@link #getAcquisitionMode() <em>Acquisition Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquisitionMode()
	 * @generated
	 * @ordered
	 */
	protected AcquisitionModeType acquisitionMode = ACQUISITION_MODE_EDEFAULT;

	/**
	 * This is true if the Acquisition Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean acquisitionModeESet;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final int COLOR_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected int color = COLOR_EDEFAULT;

	/**
	 * This is true if the Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean colorESet;

	/**
	 * The default value of the '{@link #getContrastMethod() <em>Contrast Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrastMethod()
	 * @generated
	 * @ordered
	 */
	protected static final ContrastMethodType CONTRAST_METHOD_EDEFAULT = ContrastMethodType.BRIGHTFIELD;

	/**
	 * The cached value of the '{@link #getContrastMethod() <em>Contrast Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrastMethod()
	 * @generated
	 * @ordered
	 */
	protected ContrastMethodType contrastMethod = CONTRAST_METHOD_EDEFAULT;

	/**
	 * This is true if the Contrast Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contrastMethodESet;

	/**
	 * The default value of the '{@link #getEmissionWavelength() <em>Emission Wavelength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionWavelength()
	 * @generated
	 * @ordered
	 */
	protected static final float EMISSION_WAVELENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEmissionWavelength() <em>Emission Wavelength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionWavelength()
	 * @generated
	 * @ordered
	 */
	protected float emissionWavelength = EMISSION_WAVELENGTH_EDEFAULT;

	/**
	 * This is true if the Emission Wavelength attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean emissionWavelengthESet;

	/**
	 * The default value of the '{@link #getEmissionWavelengthUnit() <em>Emission Wavelength Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionWavelengthUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength EMISSION_WAVELENGTH_UNIT_EDEFAULT = UnitsLength.NM;

	/**
	 * The cached value of the '{@link #getEmissionWavelengthUnit() <em>Emission Wavelength Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionWavelengthUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength emissionWavelengthUnit = EMISSION_WAVELENGTH_UNIT_EDEFAULT;

	/**
	 * This is true if the Emission Wavelength Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean emissionWavelengthUnitESet;

	/**
	 * The default value of the '{@link #getExcitationWavelength() <em>Excitation Wavelength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcitationWavelength()
	 * @generated
	 * @ordered
	 */
	protected static final float EXCITATION_WAVELENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getExcitationWavelength() <em>Excitation Wavelength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcitationWavelength()
	 * @generated
	 * @ordered
	 */
	protected float excitationWavelength = EXCITATION_WAVELENGTH_EDEFAULT;

	/**
	 * This is true if the Excitation Wavelength attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean excitationWavelengthESet;

	/**
	 * The default value of the '{@link #getExcitationWavelengthUnit() <em>Excitation Wavelength Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcitationWavelengthUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength EXCITATION_WAVELENGTH_UNIT_EDEFAULT = UnitsLength.NM;

	/**
	 * The cached value of the '{@link #getExcitationWavelengthUnit() <em>Excitation Wavelength Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcitationWavelengthUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength excitationWavelengthUnit = EXCITATION_WAVELENGTH_UNIT_EDEFAULT;

	/**
	 * This is true if the Excitation Wavelength Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean excitationWavelengthUnitESet;

	/**
	 * The default value of the '{@link #getFluor() <em>Fluor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFluor()
	 * @generated
	 * @ordered
	 */
	protected static final String FLUOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFluor() <em>Fluor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFluor()
	 * @generated
	 * @ordered
	 */
	protected String fluor = FLUOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIlluminationType() <em>Illumination Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIlluminationType()
	 * @generated
	 * @ordered
	 */
	protected static final IlluminationTypeType ILLUMINATION_TYPE_EDEFAULT = IlluminationTypeType.TRANSMITTED;

	/**
	 * The cached value of the '{@link #getIlluminationType() <em>Illumination Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIlluminationType()
	 * @generated
	 * @ordered
	 */
	protected IlluminationTypeType illuminationType = ILLUMINATION_TYPE_EDEFAULT;

	/**
	 * This is true if the Illumination Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean illuminationTypeESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNDFilter() <em>ND Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNDFilter()
	 * @generated
	 * @ordered
	 */
	protected static final float ND_FILTER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNDFilter() <em>ND Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNDFilter()
	 * @generated
	 * @ordered
	 */
	protected float nDFilter = ND_FILTER_EDEFAULT;

	/**
	 * This is true if the ND Filter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nDFilterESet;

	/**
	 * The default value of the '{@link #getPinholeSize() <em>Pinhole Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinholeSize()
	 * @generated
	 * @ordered
	 */
	protected static final float PINHOLE_SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPinholeSize() <em>Pinhole Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinholeSize()
	 * @generated
	 * @ordered
	 */
	protected float pinholeSize = PINHOLE_SIZE_EDEFAULT;

	/**
	 * This is true if the Pinhole Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pinholeSizeESet;

	/**
	 * The default value of the '{@link #getPinholeSizeUnit() <em>Pinhole Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinholeSizeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength PINHOLE_SIZE_UNIT_EDEFAULT = UnitsLength.ΜM;

	/**
	 * The cached value of the '{@link #getPinholeSizeUnit() <em>Pinhole Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinholeSizeUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength pinholeSizeUnit = PINHOLE_SIZE_UNIT_EDEFAULT;

	/**
	 * This is true if the Pinhole Size Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pinholeSizeUnitESet;

	/**
	 * The default value of the '{@link #getPockelCellSetting() <em>Pockel Cell Setting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPockelCellSetting()
	 * @generated
	 * @ordered
	 */
	protected static final int POCKEL_CELL_SETTING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPockelCellSetting() <em>Pockel Cell Setting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPockelCellSetting()
	 * @generated
	 * @ordered
	 */
	protected int pockelCellSetting = POCKEL_CELL_SETTING_EDEFAULT;

	/**
	 * This is true if the Pockel Cell Setting attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pockelCellSettingESet;

	/**
	 * The default value of the '{@link #getSamplesPerPixel() <em>Samples Per Pixel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplesPerPixel()
	 * @generated
	 * @ordered
	 */
	protected static final int SAMPLES_PER_PIXEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSamplesPerPixel() <em>Samples Per Pixel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplesPerPixel()
	 * @generated
	 * @ordered
	 */
	protected int samplesPerPixel = SAMPLES_PER_PIXEL_EDEFAULT;

	/**
	 * This is true if the Samples Per Pixel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean samplesPerPixelESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getChannelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightSourceSettingsType getLightSourceSettings() {
		return lightSourceSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLightSourceSettings(LightSourceSettingsType newLightSourceSettings, NotificationChain msgs) {
		LightSourceSettingsType oldLightSourceSettings = lightSourceSettings;
		lightSourceSettings = newLightSourceSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__LIGHT_SOURCE_SETTINGS, oldLightSourceSettings, newLightSourceSettings);
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
	public void setLightSourceSettings(LightSourceSettingsType newLightSourceSettings) {
		if (newLightSourceSettings != lightSourceSettings) {
			NotificationChain msgs = null;
			if (lightSourceSettings != null)
				msgs = ((InternalEObject)lightSourceSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.CHANNEL_TYPE__LIGHT_SOURCE_SETTINGS, null, msgs);
			if (newLightSourceSettings != null)
				msgs = ((InternalEObject)newLightSourceSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.CHANNEL_TYPE__LIGHT_SOURCE_SETTINGS, null, msgs);
			msgs = basicSetLightSourceSettings(newLightSourceSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__LIGHT_SOURCE_SETTINGS, newLightSourceSettings, newLightSourceSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetectorSettingsType getDetectorSettings() {
		return detectorSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetectorSettings(DetectorSettingsType newDetectorSettings, NotificationChain msgs) {
		DetectorSettingsType oldDetectorSettings = detectorSettings;
		detectorSettings = newDetectorSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__DETECTOR_SETTINGS, oldDetectorSettings, newDetectorSettings);
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
	public void setDetectorSettings(DetectorSettingsType newDetectorSettings) {
		if (newDetectorSettings != detectorSettings) {
			NotificationChain msgs = null;
			if (detectorSettings != null)
				msgs = ((InternalEObject)detectorSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.CHANNEL_TYPE__DETECTOR_SETTINGS, null, msgs);
			if (newDetectorSettings != null)
				msgs = ((InternalEObject)newDetectorSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.CHANNEL_TYPE__DETECTOR_SETTINGS, null, msgs);
			msgs = basicSetDetectorSettings(newDetectorSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__DETECTOR_SETTINGS, newDetectorSettings, newDetectorSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterSetRefType getFilterSetRef() {
		return filterSetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterSetRef(FilterSetRefType newFilterSetRef, NotificationChain msgs) {
		FilterSetRefType oldFilterSetRef = filterSetRef;
		filterSetRef = newFilterSetRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__FILTER_SET_REF, oldFilterSetRef, newFilterSetRef);
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
	public void setFilterSetRef(FilterSetRefType newFilterSetRef) {
		if (newFilterSetRef != filterSetRef) {
			NotificationChain msgs = null;
			if (filterSetRef != null)
				msgs = ((InternalEObject)filterSetRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.CHANNEL_TYPE__FILTER_SET_REF, null, msgs);
			if (newFilterSetRef != null)
				msgs = ((InternalEObject)newFilterSetRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.CHANNEL_TYPE__FILTER_SET_REF, null, msgs);
			msgs = basicSetFilterSetRef(newFilterSetRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__FILTER_SET_REF, newFilterSetRef, newFilterSetRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationRefType> getAnnotationRef() {
		if (annotationRef == null) {
			annotationRef = new EObjectContainmentEList<AnnotationRefType>(AnnotationRefType.class, this, OMEPackage.CHANNEL_TYPE__ANNOTATION_REF);
		}
		return annotationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightPathType getLightPath() {
		return lightPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLightPath(LightPathType newLightPath, NotificationChain msgs) {
		LightPathType oldLightPath = lightPath;
		lightPath = newLightPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__LIGHT_PATH, oldLightPath, newLightPath);
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
	public void setLightPath(LightPathType newLightPath) {
		if (newLightPath != lightPath) {
			NotificationChain msgs = null;
			if (lightPath != null)
				msgs = ((InternalEObject)lightPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.CHANNEL_TYPE__LIGHT_PATH, null, msgs);
			if (newLightPath != null)
				msgs = ((InternalEObject)newLightPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.CHANNEL_TYPE__LIGHT_PATH, null, msgs);
			msgs = basicSetLightPath(newLightPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__LIGHT_PATH, newLightPath, newLightPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcquisitionModeType getAcquisitionMode() {
		return acquisitionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcquisitionMode(AcquisitionModeType newAcquisitionMode) {
		AcquisitionModeType oldAcquisitionMode = acquisitionMode;
		acquisitionMode = newAcquisitionMode == null ? ACQUISITION_MODE_EDEFAULT : newAcquisitionMode;
		boolean oldAcquisitionModeESet = acquisitionModeESet;
		acquisitionModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__ACQUISITION_MODE, oldAcquisitionMode, acquisitionMode, !oldAcquisitionModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAcquisitionMode() {
		AcquisitionModeType oldAcquisitionMode = acquisitionMode;
		boolean oldAcquisitionModeESet = acquisitionModeESet;
		acquisitionMode = ACQUISITION_MODE_EDEFAULT;
		acquisitionModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.CHANNEL_TYPE__ACQUISITION_MODE, oldAcquisitionMode, ACQUISITION_MODE_EDEFAULT, oldAcquisitionModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAcquisitionMode() {
		return acquisitionModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(int newColor) {
		int oldColor = color;
		color = newColor;
		boolean oldColorESet = colorESet;
		colorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__COLOR, oldColor, color, !oldColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetColor() {
		int oldColor = color;
		boolean oldColorESet = colorESet;
		color = COLOR_EDEFAULT;
		colorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.CHANNEL_TYPE__COLOR, oldColor, COLOR_EDEFAULT, oldColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetColor() {
		return colorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContrastMethodType getContrastMethod() {
		return contrastMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContrastMethod(ContrastMethodType newContrastMethod) {
		ContrastMethodType oldContrastMethod = contrastMethod;
		contrastMethod = newContrastMethod == null ? CONTRAST_METHOD_EDEFAULT : newContrastMethod;
		boolean oldContrastMethodESet = contrastMethodESet;
		contrastMethodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__CONTRAST_METHOD, oldContrastMethod, contrastMethod, !oldContrastMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetContrastMethod() {
		ContrastMethodType oldContrastMethod = contrastMethod;
		boolean oldContrastMethodESet = contrastMethodESet;
		contrastMethod = CONTRAST_METHOD_EDEFAULT;
		contrastMethodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.CHANNEL_TYPE__CONTRAST_METHOD, oldContrastMethod, CONTRAST_METHOD_EDEFAULT, oldContrastMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetContrastMethod() {
		return contrastMethodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getEmissionWavelength() {
		return emissionWavelength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmissionWavelength(float newEmissionWavelength) {
		float oldEmissionWavelength = emissionWavelength;
		emissionWavelength = newEmissionWavelength;
		boolean oldEmissionWavelengthESet = emissionWavelengthESet;
		emissionWavelengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__EMISSION_WAVELENGTH, oldEmissionWavelength, emissionWavelength, !oldEmissionWavelengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEmissionWavelength() {
		float oldEmissionWavelength = emissionWavelength;
		boolean oldEmissionWavelengthESet = emissionWavelengthESet;
		emissionWavelength = EMISSION_WAVELENGTH_EDEFAULT;
		emissionWavelengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.CHANNEL_TYPE__EMISSION_WAVELENGTH, oldEmissionWavelength, EMISSION_WAVELENGTH_EDEFAULT, oldEmissionWavelengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEmissionWavelength() {
		return emissionWavelengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getEmissionWavelengthUnit() {
		return emissionWavelengthUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmissionWavelengthUnit(UnitsLength newEmissionWavelengthUnit) {
		UnitsLength oldEmissionWavelengthUnit = emissionWavelengthUnit;
		emissionWavelengthUnit = newEmissionWavelengthUnit == null ? EMISSION_WAVELENGTH_UNIT_EDEFAULT : newEmissionWavelengthUnit;
		boolean oldEmissionWavelengthUnitESet = emissionWavelengthUnitESet;
		emissionWavelengthUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__EMISSION_WAVELENGTH_UNIT, oldEmissionWavelengthUnit, emissionWavelengthUnit, !oldEmissionWavelengthUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEmissionWavelengthUnit() {
		UnitsLength oldEmissionWavelengthUnit = emissionWavelengthUnit;
		boolean oldEmissionWavelengthUnitESet = emissionWavelengthUnitESet;
		emissionWavelengthUnit = EMISSION_WAVELENGTH_UNIT_EDEFAULT;
		emissionWavelengthUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.CHANNEL_TYPE__EMISSION_WAVELENGTH_UNIT, oldEmissionWavelengthUnit, EMISSION_WAVELENGTH_UNIT_EDEFAULT, oldEmissionWavelengthUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEmissionWavelengthUnit() {
		return emissionWavelengthUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getExcitationWavelength() {
		return excitationWavelength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcitationWavelength(float newExcitationWavelength) {
		float oldExcitationWavelength = excitationWavelength;
		excitationWavelength = newExcitationWavelength;
		boolean oldExcitationWavelengthESet = excitationWavelengthESet;
		excitationWavelengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__EXCITATION_WAVELENGTH, oldExcitationWavelength, excitationWavelength, !oldExcitationWavelengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetExcitationWavelength() {
		float oldExcitationWavelength = excitationWavelength;
		boolean oldExcitationWavelengthESet = excitationWavelengthESet;
		excitationWavelength = EXCITATION_WAVELENGTH_EDEFAULT;
		excitationWavelengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.CHANNEL_TYPE__EXCITATION_WAVELENGTH, oldExcitationWavelength, EXCITATION_WAVELENGTH_EDEFAULT, oldExcitationWavelengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetExcitationWavelength() {
		return excitationWavelengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getExcitationWavelengthUnit() {
		return excitationWavelengthUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcitationWavelengthUnit(UnitsLength newExcitationWavelengthUnit) {
		UnitsLength oldExcitationWavelengthUnit = excitationWavelengthUnit;
		excitationWavelengthUnit = newExcitationWavelengthUnit == null ? EXCITATION_WAVELENGTH_UNIT_EDEFAULT : newExcitationWavelengthUnit;
		boolean oldExcitationWavelengthUnitESet = excitationWavelengthUnitESet;
		excitationWavelengthUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__EXCITATION_WAVELENGTH_UNIT, oldExcitationWavelengthUnit, excitationWavelengthUnit, !oldExcitationWavelengthUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetExcitationWavelengthUnit() {
		UnitsLength oldExcitationWavelengthUnit = excitationWavelengthUnit;
		boolean oldExcitationWavelengthUnitESet = excitationWavelengthUnitESet;
		excitationWavelengthUnit = EXCITATION_WAVELENGTH_UNIT_EDEFAULT;
		excitationWavelengthUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.CHANNEL_TYPE__EXCITATION_WAVELENGTH_UNIT, oldExcitationWavelengthUnit, EXCITATION_WAVELENGTH_UNIT_EDEFAULT, oldExcitationWavelengthUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetExcitationWavelengthUnit() {
		return excitationWavelengthUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFluor() {
		return fluor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFluor(String newFluor) {
		String oldFluor = fluor;
		fluor = newFluor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__FLUOR, oldFluor, fluor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IlluminationTypeType getIlluminationType() {
		return illuminationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIlluminationType(IlluminationTypeType newIlluminationType) {
		IlluminationTypeType oldIlluminationType = illuminationType;
		illuminationType = newIlluminationType == null ? ILLUMINATION_TYPE_EDEFAULT : newIlluminationType;
		boolean oldIlluminationTypeESet = illuminationTypeESet;
		illuminationTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__ILLUMINATION_TYPE, oldIlluminationType, illuminationType, !oldIlluminationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIlluminationType() {
		IlluminationTypeType oldIlluminationType = illuminationType;
		boolean oldIlluminationTypeESet = illuminationTypeESet;
		illuminationType = ILLUMINATION_TYPE_EDEFAULT;
		illuminationTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.CHANNEL_TYPE__ILLUMINATION_TYPE, oldIlluminationType, ILLUMINATION_TYPE_EDEFAULT, oldIlluminationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIlluminationType() {
		return illuminationTypeESet;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getNDFilter() {
		return nDFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNDFilter(float newNDFilter) {
		float oldNDFilter = nDFilter;
		nDFilter = newNDFilter;
		boolean oldNDFilterESet = nDFilterESet;
		nDFilterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__ND_FILTER, oldNDFilter, nDFilter, !oldNDFilterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNDFilter() {
		float oldNDFilter = nDFilter;
		boolean oldNDFilterESet = nDFilterESet;
		nDFilter = ND_FILTER_EDEFAULT;
		nDFilterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.CHANNEL_TYPE__ND_FILTER, oldNDFilter, ND_FILTER_EDEFAULT, oldNDFilterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNDFilter() {
		return nDFilterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPinholeSize() {
		return pinholeSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinholeSize(float newPinholeSize) {
		float oldPinholeSize = pinholeSize;
		pinholeSize = newPinholeSize;
		boolean oldPinholeSizeESet = pinholeSizeESet;
		pinholeSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__PINHOLE_SIZE, oldPinholeSize, pinholeSize, !oldPinholeSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPinholeSize() {
		float oldPinholeSize = pinholeSize;
		boolean oldPinholeSizeESet = pinholeSizeESet;
		pinholeSize = PINHOLE_SIZE_EDEFAULT;
		pinholeSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.CHANNEL_TYPE__PINHOLE_SIZE, oldPinholeSize, PINHOLE_SIZE_EDEFAULT, oldPinholeSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPinholeSize() {
		return pinholeSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getPinholeSizeUnit() {
		return pinholeSizeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinholeSizeUnit(UnitsLength newPinholeSizeUnit) {
		UnitsLength oldPinholeSizeUnit = pinholeSizeUnit;
		pinholeSizeUnit = newPinholeSizeUnit == null ? PINHOLE_SIZE_UNIT_EDEFAULT : newPinholeSizeUnit;
		boolean oldPinholeSizeUnitESet = pinholeSizeUnitESet;
		pinholeSizeUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__PINHOLE_SIZE_UNIT, oldPinholeSizeUnit, pinholeSizeUnit, !oldPinholeSizeUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPinholeSizeUnit() {
		UnitsLength oldPinholeSizeUnit = pinholeSizeUnit;
		boolean oldPinholeSizeUnitESet = pinholeSizeUnitESet;
		pinholeSizeUnit = PINHOLE_SIZE_UNIT_EDEFAULT;
		pinholeSizeUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.CHANNEL_TYPE__PINHOLE_SIZE_UNIT, oldPinholeSizeUnit, PINHOLE_SIZE_UNIT_EDEFAULT, oldPinholeSizeUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPinholeSizeUnit() {
		return pinholeSizeUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPockelCellSetting() {
		return pockelCellSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPockelCellSetting(int newPockelCellSetting) {
		int oldPockelCellSetting = pockelCellSetting;
		pockelCellSetting = newPockelCellSetting;
		boolean oldPockelCellSettingESet = pockelCellSettingESet;
		pockelCellSettingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__POCKEL_CELL_SETTING, oldPockelCellSetting, pockelCellSetting, !oldPockelCellSettingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPockelCellSetting() {
		int oldPockelCellSetting = pockelCellSetting;
		boolean oldPockelCellSettingESet = pockelCellSettingESet;
		pockelCellSetting = POCKEL_CELL_SETTING_EDEFAULT;
		pockelCellSettingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.CHANNEL_TYPE__POCKEL_CELL_SETTING, oldPockelCellSetting, POCKEL_CELL_SETTING_EDEFAULT, oldPockelCellSettingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPockelCellSetting() {
		return pockelCellSettingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSamplesPerPixel() {
		return samplesPerPixel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSamplesPerPixel(int newSamplesPerPixel) {
		int oldSamplesPerPixel = samplesPerPixel;
		samplesPerPixel = newSamplesPerPixel;
		boolean oldSamplesPerPixelESet = samplesPerPixelESet;
		samplesPerPixelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.CHANNEL_TYPE__SAMPLES_PER_PIXEL, oldSamplesPerPixel, samplesPerPixel, !oldSamplesPerPixelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSamplesPerPixel() {
		int oldSamplesPerPixel = samplesPerPixel;
		boolean oldSamplesPerPixelESet = samplesPerPixelESet;
		samplesPerPixel = SAMPLES_PER_PIXEL_EDEFAULT;
		samplesPerPixelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.CHANNEL_TYPE__SAMPLES_PER_PIXEL, oldSamplesPerPixel, SAMPLES_PER_PIXEL_EDEFAULT, oldSamplesPerPixelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSamplesPerPixel() {
		return samplesPerPixelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.CHANNEL_TYPE__LIGHT_SOURCE_SETTINGS:
				return basicSetLightSourceSettings(null, msgs);
			case OMEPackage.CHANNEL_TYPE__DETECTOR_SETTINGS:
				return basicSetDetectorSettings(null, msgs);
			case OMEPackage.CHANNEL_TYPE__FILTER_SET_REF:
				return basicSetFilterSetRef(null, msgs);
			case OMEPackage.CHANNEL_TYPE__ANNOTATION_REF:
				return ((InternalEList<?>)getAnnotationRef()).basicRemove(otherEnd, msgs);
			case OMEPackage.CHANNEL_TYPE__LIGHT_PATH:
				return basicSetLightPath(null, msgs);
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
			case OMEPackage.CHANNEL_TYPE__LIGHT_SOURCE_SETTINGS:
				return getLightSourceSettings();
			case OMEPackage.CHANNEL_TYPE__DETECTOR_SETTINGS:
				return getDetectorSettings();
			case OMEPackage.CHANNEL_TYPE__FILTER_SET_REF:
				return getFilterSetRef();
			case OMEPackage.CHANNEL_TYPE__ANNOTATION_REF:
				return getAnnotationRef();
			case OMEPackage.CHANNEL_TYPE__LIGHT_PATH:
				return getLightPath();
			case OMEPackage.CHANNEL_TYPE__ACQUISITION_MODE:
				return getAcquisitionMode();
			case OMEPackage.CHANNEL_TYPE__COLOR:
				return getColor();
			case OMEPackage.CHANNEL_TYPE__CONTRAST_METHOD:
				return getContrastMethod();
			case OMEPackage.CHANNEL_TYPE__EMISSION_WAVELENGTH:
				return getEmissionWavelength();
			case OMEPackage.CHANNEL_TYPE__EMISSION_WAVELENGTH_UNIT:
				return getEmissionWavelengthUnit();
			case OMEPackage.CHANNEL_TYPE__EXCITATION_WAVELENGTH:
				return getExcitationWavelength();
			case OMEPackage.CHANNEL_TYPE__EXCITATION_WAVELENGTH_UNIT:
				return getExcitationWavelengthUnit();
			case OMEPackage.CHANNEL_TYPE__FLUOR:
				return getFluor();
			case OMEPackage.CHANNEL_TYPE__ID:
				return getID();
			case OMEPackage.CHANNEL_TYPE__ILLUMINATION_TYPE:
				return getIlluminationType();
			case OMEPackage.CHANNEL_TYPE__NAME:
				return getName();
			case OMEPackage.CHANNEL_TYPE__ND_FILTER:
				return getNDFilter();
			case OMEPackage.CHANNEL_TYPE__PINHOLE_SIZE:
				return getPinholeSize();
			case OMEPackage.CHANNEL_TYPE__PINHOLE_SIZE_UNIT:
				return getPinholeSizeUnit();
			case OMEPackage.CHANNEL_TYPE__POCKEL_CELL_SETTING:
				return getPockelCellSetting();
			case OMEPackage.CHANNEL_TYPE__SAMPLES_PER_PIXEL:
				return getSamplesPerPixel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OMEPackage.CHANNEL_TYPE__LIGHT_SOURCE_SETTINGS:
				setLightSourceSettings((LightSourceSettingsType)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__DETECTOR_SETTINGS:
				setDetectorSettings((DetectorSettingsType)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__FILTER_SET_REF:
				setFilterSetRef((FilterSetRefType)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				getAnnotationRef().addAll((Collection<? extends AnnotationRefType>)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__LIGHT_PATH:
				setLightPath((LightPathType)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__ACQUISITION_MODE:
				setAcquisitionMode((AcquisitionModeType)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__COLOR:
				setColor((Integer)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__CONTRAST_METHOD:
				setContrastMethod((ContrastMethodType)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__EMISSION_WAVELENGTH:
				setEmissionWavelength((Float)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__EMISSION_WAVELENGTH_UNIT:
				setEmissionWavelengthUnit((UnitsLength)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__EXCITATION_WAVELENGTH:
				setExcitationWavelength((Float)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__EXCITATION_WAVELENGTH_UNIT:
				setExcitationWavelengthUnit((UnitsLength)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__FLUOR:
				setFluor((String)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__ID:
				setID((String)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__ILLUMINATION_TYPE:
				setIlluminationType((IlluminationTypeType)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__NAME:
				setName((String)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__ND_FILTER:
				setNDFilter((Float)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__PINHOLE_SIZE:
				setPinholeSize((Float)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__PINHOLE_SIZE_UNIT:
				setPinholeSizeUnit((UnitsLength)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__POCKEL_CELL_SETTING:
				setPockelCellSetting((Integer)newValue);
				return;
			case OMEPackage.CHANNEL_TYPE__SAMPLES_PER_PIXEL:
				setSamplesPerPixel((Integer)newValue);
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
			case OMEPackage.CHANNEL_TYPE__LIGHT_SOURCE_SETTINGS:
				setLightSourceSettings((LightSourceSettingsType)null);
				return;
			case OMEPackage.CHANNEL_TYPE__DETECTOR_SETTINGS:
				setDetectorSettings((DetectorSettingsType)null);
				return;
			case OMEPackage.CHANNEL_TYPE__FILTER_SET_REF:
				setFilterSetRef((FilterSetRefType)null);
				return;
			case OMEPackage.CHANNEL_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				return;
			case OMEPackage.CHANNEL_TYPE__LIGHT_PATH:
				setLightPath((LightPathType)null);
				return;
			case OMEPackage.CHANNEL_TYPE__ACQUISITION_MODE:
				unsetAcquisitionMode();
				return;
			case OMEPackage.CHANNEL_TYPE__COLOR:
				unsetColor();
				return;
			case OMEPackage.CHANNEL_TYPE__CONTRAST_METHOD:
				unsetContrastMethod();
				return;
			case OMEPackage.CHANNEL_TYPE__EMISSION_WAVELENGTH:
				unsetEmissionWavelength();
				return;
			case OMEPackage.CHANNEL_TYPE__EMISSION_WAVELENGTH_UNIT:
				unsetEmissionWavelengthUnit();
				return;
			case OMEPackage.CHANNEL_TYPE__EXCITATION_WAVELENGTH:
				unsetExcitationWavelength();
				return;
			case OMEPackage.CHANNEL_TYPE__EXCITATION_WAVELENGTH_UNIT:
				unsetExcitationWavelengthUnit();
				return;
			case OMEPackage.CHANNEL_TYPE__FLUOR:
				setFluor(FLUOR_EDEFAULT);
				return;
			case OMEPackage.CHANNEL_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case OMEPackage.CHANNEL_TYPE__ILLUMINATION_TYPE:
				unsetIlluminationType();
				return;
			case OMEPackage.CHANNEL_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OMEPackage.CHANNEL_TYPE__ND_FILTER:
				unsetNDFilter();
				return;
			case OMEPackage.CHANNEL_TYPE__PINHOLE_SIZE:
				unsetPinholeSize();
				return;
			case OMEPackage.CHANNEL_TYPE__PINHOLE_SIZE_UNIT:
				unsetPinholeSizeUnit();
				return;
			case OMEPackage.CHANNEL_TYPE__POCKEL_CELL_SETTING:
				unsetPockelCellSetting();
				return;
			case OMEPackage.CHANNEL_TYPE__SAMPLES_PER_PIXEL:
				unsetSamplesPerPixel();
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
			case OMEPackage.CHANNEL_TYPE__LIGHT_SOURCE_SETTINGS:
				return lightSourceSettings != null;
			case OMEPackage.CHANNEL_TYPE__DETECTOR_SETTINGS:
				return detectorSettings != null;
			case OMEPackage.CHANNEL_TYPE__FILTER_SET_REF:
				return filterSetRef != null;
			case OMEPackage.CHANNEL_TYPE__ANNOTATION_REF:
				return annotationRef != null && !annotationRef.isEmpty();
			case OMEPackage.CHANNEL_TYPE__LIGHT_PATH:
				return lightPath != null;
			case OMEPackage.CHANNEL_TYPE__ACQUISITION_MODE:
				return isSetAcquisitionMode();
			case OMEPackage.CHANNEL_TYPE__COLOR:
				return isSetColor();
			case OMEPackage.CHANNEL_TYPE__CONTRAST_METHOD:
				return isSetContrastMethod();
			case OMEPackage.CHANNEL_TYPE__EMISSION_WAVELENGTH:
				return isSetEmissionWavelength();
			case OMEPackage.CHANNEL_TYPE__EMISSION_WAVELENGTH_UNIT:
				return isSetEmissionWavelengthUnit();
			case OMEPackage.CHANNEL_TYPE__EXCITATION_WAVELENGTH:
				return isSetExcitationWavelength();
			case OMEPackage.CHANNEL_TYPE__EXCITATION_WAVELENGTH_UNIT:
				return isSetExcitationWavelengthUnit();
			case OMEPackage.CHANNEL_TYPE__FLUOR:
				return FLUOR_EDEFAULT == null ? fluor != null : !FLUOR_EDEFAULT.equals(fluor);
			case OMEPackage.CHANNEL_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OMEPackage.CHANNEL_TYPE__ILLUMINATION_TYPE:
				return isSetIlluminationType();
			case OMEPackage.CHANNEL_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OMEPackage.CHANNEL_TYPE__ND_FILTER:
				return isSetNDFilter();
			case OMEPackage.CHANNEL_TYPE__PINHOLE_SIZE:
				return isSetPinholeSize();
			case OMEPackage.CHANNEL_TYPE__PINHOLE_SIZE_UNIT:
				return isSetPinholeSizeUnit();
			case OMEPackage.CHANNEL_TYPE__POCKEL_CELL_SETTING:
				return isSetPockelCellSetting();
			case OMEPackage.CHANNEL_TYPE__SAMPLES_PER_PIXEL:
				return isSetSamplesPerPixel();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (acquisitionMode: ");
		if (acquisitionModeESet) result.append(acquisitionMode); else result.append("<unset>");
		result.append(", color: ");
		if (colorESet) result.append(color); else result.append("<unset>");
		result.append(", contrastMethod: ");
		if (contrastMethodESet) result.append(contrastMethod); else result.append("<unset>");
		result.append(", emissionWavelength: ");
		if (emissionWavelengthESet) result.append(emissionWavelength); else result.append("<unset>");
		result.append(", emissionWavelengthUnit: ");
		if (emissionWavelengthUnitESet) result.append(emissionWavelengthUnit); else result.append("<unset>");
		result.append(", excitationWavelength: ");
		if (excitationWavelengthESet) result.append(excitationWavelength); else result.append("<unset>");
		result.append(", excitationWavelengthUnit: ");
		if (excitationWavelengthUnitESet) result.append(excitationWavelengthUnit); else result.append("<unset>");
		result.append(", fluor: ");
		result.append(fluor);
		result.append(", iD: ");
		result.append(iD);
		result.append(", illuminationType: ");
		if (illuminationTypeESet) result.append(illuminationType); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", nDFilter: ");
		if (nDFilterESet) result.append(nDFilter); else result.append("<unset>");
		result.append(", pinholeSize: ");
		if (pinholeSizeESet) result.append(pinholeSize); else result.append("<unset>");
		result.append(", pinholeSizeUnit: ");
		if (pinholeSizeUnitESet) result.append(pinholeSizeUnit); else result.append("<unset>");
		result.append(", pockelCellSetting: ");
		if (pockelCellSettingESet) result.append(pockelCellSetting); else result.append("<unset>");
		result.append(", samplesPerPixel: ");
		if (samplesPerPixelESet) result.append(samplesPerPixel); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ChannelTypeImpl
