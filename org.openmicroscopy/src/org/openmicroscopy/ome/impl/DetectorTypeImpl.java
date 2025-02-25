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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openmicroscopy.ome.AnnotationRefType;
import org.openmicroscopy.ome.DetectorType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.TypeType2;
import org.openmicroscopy.ome.UnitsElectricPotential;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.DetectorTypeImpl#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DetectorTypeImpl#getAmplificationGain <em>Amplification Gain</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DetectorTypeImpl#getGain <em>Gain</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DetectorTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DetectorTypeImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DetectorTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DetectorTypeImpl#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DetectorTypeImpl#getVoltageUnit <em>Voltage Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DetectorTypeImpl#getZoom <em>Zoom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetectorTypeImpl extends ManufacturerSpecImpl implements DetectorType {
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
	 * The default value of the '{@link #getAmplificationGain() <em>Amplification Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmplificationGain()
	 * @generated
	 * @ordered
	 */
	protected static final float AMPLIFICATION_GAIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmplificationGain() <em>Amplification Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmplificationGain()
	 * @generated
	 * @ordered
	 */
	protected float amplificationGain = AMPLIFICATION_GAIN_EDEFAULT;

	/**
	 * This is true if the Amplification Gain attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean amplificationGainESet;

	/**
	 * The default value of the '{@link #getGain() <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGain()
	 * @generated
	 * @ordered
	 */
	protected static final float GAIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGain() <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGain()
	 * @generated
	 * @ordered
	 */
	protected float gain = GAIN_EDEFAULT;

	/**
	 * This is true if the Gain attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gainESet;

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
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final float OFFSET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected float offset = OFFSET_EDEFAULT;

	/**
	 * This is true if the Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean offsetESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType2 TYPE_EDEFAULT = TypeType2.CCD;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType2 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected float voltage = VOLTAGE_EDEFAULT;

	/**
	 * This is true if the Voltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean voltageESet;

	/**
	 * The default value of the '{@link #getVoltageUnit() <em>Voltage Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsElectricPotential VOLTAGE_UNIT_EDEFAULT = UnitsElectricPotential.V;

	/**
	 * The cached value of the '{@link #getVoltageUnit() <em>Voltage Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsElectricPotential voltageUnit = VOLTAGE_UNIT_EDEFAULT;

	/**
	 * This is true if the Voltage Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean voltageUnitESet;

	/**
	 * The default value of the '{@link #getZoom() <em>Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoom()
	 * @generated
	 * @ordered
	 */
	protected static final float ZOOM_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getZoom() <em>Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoom()
	 * @generated
	 * @ordered
	 */
	protected float zoom = ZOOM_EDEFAULT;

	/**
	 * This is true if the Zoom attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zoomESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getDetectorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationRefType> getAnnotationRef() {
		if (annotationRef == null) {
			annotationRef = new EObjectContainmentEList<AnnotationRefType>(AnnotationRefType.class, this, OMEPackage.DETECTOR_TYPE__ANNOTATION_REF);
		}
		return annotationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAmplificationGain() {
		return amplificationGain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmplificationGain(float newAmplificationGain) {
		float oldAmplificationGain = amplificationGain;
		amplificationGain = newAmplificationGain;
		boolean oldAmplificationGainESet = amplificationGainESet;
		amplificationGainESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.DETECTOR_TYPE__AMPLIFICATION_GAIN, oldAmplificationGain, amplificationGain, !oldAmplificationGainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAmplificationGain() {
		float oldAmplificationGain = amplificationGain;
		boolean oldAmplificationGainESet = amplificationGainESet;
		amplificationGain = AMPLIFICATION_GAIN_EDEFAULT;
		amplificationGainESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.DETECTOR_TYPE__AMPLIFICATION_GAIN, oldAmplificationGain, AMPLIFICATION_GAIN_EDEFAULT, oldAmplificationGainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAmplificationGain() {
		return amplificationGainESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getGain() {
		return gain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGain(float newGain) {
		float oldGain = gain;
		gain = newGain;
		boolean oldGainESet = gainESet;
		gainESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.DETECTOR_TYPE__GAIN, oldGain, gain, !oldGainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGain() {
		float oldGain = gain;
		boolean oldGainESet = gainESet;
		gain = GAIN_EDEFAULT;
		gainESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.DETECTOR_TYPE__GAIN, oldGain, GAIN_EDEFAULT, oldGainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGain() {
		return gainESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.DETECTOR_TYPE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffset(float newOffset) {
		float oldOffset = offset;
		offset = newOffset;
		boolean oldOffsetESet = offsetESet;
		offsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.DETECTOR_TYPE__OFFSET, oldOffset, offset, !oldOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOffset() {
		float oldOffset = offset;
		boolean oldOffsetESet = offsetESet;
		offset = OFFSET_EDEFAULT;
		offsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.DETECTOR_TYPE__OFFSET, oldOffset, OFFSET_EDEFAULT, oldOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOffset() {
		return offsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType2 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeType2 newType) {
		TypeType2 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.DETECTOR_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		TypeType2 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.DETECTOR_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getVoltage() {
		return voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoltage(float newVoltage) {
		float oldVoltage = voltage;
		voltage = newVoltage;
		boolean oldVoltageESet = voltageESet;
		voltageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.DETECTOR_TYPE__VOLTAGE, oldVoltage, voltage, !oldVoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVoltage() {
		float oldVoltage = voltage;
		boolean oldVoltageESet = voltageESet;
		voltage = VOLTAGE_EDEFAULT;
		voltageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.DETECTOR_TYPE__VOLTAGE, oldVoltage, VOLTAGE_EDEFAULT, oldVoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVoltage() {
		return voltageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsElectricPotential getVoltageUnit() {
		return voltageUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoltageUnit(UnitsElectricPotential newVoltageUnit) {
		UnitsElectricPotential oldVoltageUnit = voltageUnit;
		voltageUnit = newVoltageUnit == null ? VOLTAGE_UNIT_EDEFAULT : newVoltageUnit;
		boolean oldVoltageUnitESet = voltageUnitESet;
		voltageUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.DETECTOR_TYPE__VOLTAGE_UNIT, oldVoltageUnit, voltageUnit, !oldVoltageUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVoltageUnit() {
		UnitsElectricPotential oldVoltageUnit = voltageUnit;
		boolean oldVoltageUnitESet = voltageUnitESet;
		voltageUnit = VOLTAGE_UNIT_EDEFAULT;
		voltageUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.DETECTOR_TYPE__VOLTAGE_UNIT, oldVoltageUnit, VOLTAGE_UNIT_EDEFAULT, oldVoltageUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVoltageUnit() {
		return voltageUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getZoom() {
		return zoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZoom(float newZoom) {
		float oldZoom = zoom;
		zoom = newZoom;
		boolean oldZoomESet = zoomESet;
		zoomESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.DETECTOR_TYPE__ZOOM, oldZoom, zoom, !oldZoomESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZoom() {
		float oldZoom = zoom;
		boolean oldZoomESet = zoomESet;
		zoom = ZOOM_EDEFAULT;
		zoomESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.DETECTOR_TYPE__ZOOM, oldZoom, ZOOM_EDEFAULT, oldZoomESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZoom() {
		return zoomESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.DETECTOR_TYPE__ANNOTATION_REF:
				return ((InternalEList<?>)getAnnotationRef()).basicRemove(otherEnd, msgs);
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
			case OMEPackage.DETECTOR_TYPE__ANNOTATION_REF:
				return getAnnotationRef();
			case OMEPackage.DETECTOR_TYPE__AMPLIFICATION_GAIN:
				return getAmplificationGain();
			case OMEPackage.DETECTOR_TYPE__GAIN:
				return getGain();
			case OMEPackage.DETECTOR_TYPE__ID:
				return getID();
			case OMEPackage.DETECTOR_TYPE__OFFSET:
				return getOffset();
			case OMEPackage.DETECTOR_TYPE__TYPE:
				return getType();
			case OMEPackage.DETECTOR_TYPE__VOLTAGE:
				return getVoltage();
			case OMEPackage.DETECTOR_TYPE__VOLTAGE_UNIT:
				return getVoltageUnit();
			case OMEPackage.DETECTOR_TYPE__ZOOM:
				return getZoom();
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
			case OMEPackage.DETECTOR_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				getAnnotationRef().addAll((Collection<? extends AnnotationRefType>)newValue);
				return;
			case OMEPackage.DETECTOR_TYPE__AMPLIFICATION_GAIN:
				setAmplificationGain((Float)newValue);
				return;
			case OMEPackage.DETECTOR_TYPE__GAIN:
				setGain((Float)newValue);
				return;
			case OMEPackage.DETECTOR_TYPE__ID:
				setID((String)newValue);
				return;
			case OMEPackage.DETECTOR_TYPE__OFFSET:
				setOffset((Float)newValue);
				return;
			case OMEPackage.DETECTOR_TYPE__TYPE:
				setType((TypeType2)newValue);
				return;
			case OMEPackage.DETECTOR_TYPE__VOLTAGE:
				setVoltage((Float)newValue);
				return;
			case OMEPackage.DETECTOR_TYPE__VOLTAGE_UNIT:
				setVoltageUnit((UnitsElectricPotential)newValue);
				return;
			case OMEPackage.DETECTOR_TYPE__ZOOM:
				setZoom((Float)newValue);
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
			case OMEPackage.DETECTOR_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				return;
			case OMEPackage.DETECTOR_TYPE__AMPLIFICATION_GAIN:
				unsetAmplificationGain();
				return;
			case OMEPackage.DETECTOR_TYPE__GAIN:
				unsetGain();
				return;
			case OMEPackage.DETECTOR_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case OMEPackage.DETECTOR_TYPE__OFFSET:
				unsetOffset();
				return;
			case OMEPackage.DETECTOR_TYPE__TYPE:
				unsetType();
				return;
			case OMEPackage.DETECTOR_TYPE__VOLTAGE:
				unsetVoltage();
				return;
			case OMEPackage.DETECTOR_TYPE__VOLTAGE_UNIT:
				unsetVoltageUnit();
				return;
			case OMEPackage.DETECTOR_TYPE__ZOOM:
				unsetZoom();
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
			case OMEPackage.DETECTOR_TYPE__ANNOTATION_REF:
				return annotationRef != null && !annotationRef.isEmpty();
			case OMEPackage.DETECTOR_TYPE__AMPLIFICATION_GAIN:
				return isSetAmplificationGain();
			case OMEPackage.DETECTOR_TYPE__GAIN:
				return isSetGain();
			case OMEPackage.DETECTOR_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OMEPackage.DETECTOR_TYPE__OFFSET:
				return isSetOffset();
			case OMEPackage.DETECTOR_TYPE__TYPE:
				return isSetType();
			case OMEPackage.DETECTOR_TYPE__VOLTAGE:
				return isSetVoltage();
			case OMEPackage.DETECTOR_TYPE__VOLTAGE_UNIT:
				return isSetVoltageUnit();
			case OMEPackage.DETECTOR_TYPE__ZOOM:
				return isSetZoom();
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
		result.append(" (amplificationGain: ");
		if (amplificationGainESet) result.append(amplificationGain); else result.append("<unset>");
		result.append(", gain: ");
		if (gainESet) result.append(gain); else result.append("<unset>");
		result.append(", iD: ");
		result.append(iD);
		result.append(", offset: ");
		if (offsetESet) result.append(offset); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", voltage: ");
		if (voltageESet) result.append(voltage); else result.append("<unset>");
		result.append(", voltageUnit: ");
		if (voltageUnitESet) result.append(voltageUnit); else result.append("<unset>");
		result.append(", zoom: ");
		if (zoomESet) result.append(zoom); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DetectorTypeImpl
