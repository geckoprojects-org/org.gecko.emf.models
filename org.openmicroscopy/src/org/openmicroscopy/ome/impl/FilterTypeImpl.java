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
import org.openmicroscopy.ome.FilterType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.TransmittanceRangeType;
import org.openmicroscopy.ome.TypeType6;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.FilterTypeImpl#getTransmittanceRange <em>Transmittance Range</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.FilterTypeImpl#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.FilterTypeImpl#getFilterWheel <em>Filter Wheel</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.FilterTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.FilterTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterTypeImpl extends ManufacturerSpecImpl implements FilterType {
	/**
	 * The cached value of the '{@link #getTransmittanceRange() <em>Transmittance Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmittanceRange()
	 * @generated
	 * @ordered
	 */
	protected TransmittanceRangeType transmittanceRange;

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
	 * The default value of the '{@link #getFilterWheel() <em>Filter Wheel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterWheel()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_WHEEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilterWheel() <em>Filter Wheel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterWheel()
	 * @generated
	 * @ordered
	 */
	protected String filterWheel = FILTER_WHEEL_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType6 TYPE_EDEFAULT = TypeType6.DICHROIC;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType6 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getFilterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmittanceRangeType getTransmittanceRange() {
		return transmittanceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransmittanceRange(TransmittanceRangeType newTransmittanceRange, NotificationChain msgs) {
		TransmittanceRangeType oldTransmittanceRange = transmittanceRange;
		transmittanceRange = newTransmittanceRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.FILTER_TYPE__TRANSMITTANCE_RANGE, oldTransmittanceRange, newTransmittanceRange);
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
	public void setTransmittanceRange(TransmittanceRangeType newTransmittanceRange) {
		if (newTransmittanceRange != transmittanceRange) {
			NotificationChain msgs = null;
			if (transmittanceRange != null)
				msgs = ((InternalEObject)transmittanceRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.FILTER_TYPE__TRANSMITTANCE_RANGE, null, msgs);
			if (newTransmittanceRange != null)
				msgs = ((InternalEObject)newTransmittanceRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.FILTER_TYPE__TRANSMITTANCE_RANGE, null, msgs);
			msgs = basicSetTransmittanceRange(newTransmittanceRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.FILTER_TYPE__TRANSMITTANCE_RANGE, newTransmittanceRange, newTransmittanceRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationRefType> getAnnotationRef() {
		if (annotationRef == null) {
			annotationRef = new EObjectContainmentEList<AnnotationRefType>(AnnotationRefType.class, this, OMEPackage.FILTER_TYPE__ANNOTATION_REF);
		}
		return annotationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFilterWheel() {
		return filterWheel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilterWheel(String newFilterWheel) {
		String oldFilterWheel = filterWheel;
		filterWheel = newFilterWheel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.FILTER_TYPE__FILTER_WHEEL, oldFilterWheel, filterWheel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.FILTER_TYPE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType6 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeType6 newType) {
		TypeType6 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.FILTER_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		TypeType6 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.FILTER_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.FILTER_TYPE__TRANSMITTANCE_RANGE:
				return basicSetTransmittanceRange(null, msgs);
			case OMEPackage.FILTER_TYPE__ANNOTATION_REF:
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
			case OMEPackage.FILTER_TYPE__TRANSMITTANCE_RANGE:
				return getTransmittanceRange();
			case OMEPackage.FILTER_TYPE__ANNOTATION_REF:
				return getAnnotationRef();
			case OMEPackage.FILTER_TYPE__FILTER_WHEEL:
				return getFilterWheel();
			case OMEPackage.FILTER_TYPE__ID:
				return getID();
			case OMEPackage.FILTER_TYPE__TYPE:
				return getType();
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
			case OMEPackage.FILTER_TYPE__TRANSMITTANCE_RANGE:
				setTransmittanceRange((TransmittanceRangeType)newValue);
				return;
			case OMEPackage.FILTER_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				getAnnotationRef().addAll((Collection<? extends AnnotationRefType>)newValue);
				return;
			case OMEPackage.FILTER_TYPE__FILTER_WHEEL:
				setFilterWheel((String)newValue);
				return;
			case OMEPackage.FILTER_TYPE__ID:
				setID((String)newValue);
				return;
			case OMEPackage.FILTER_TYPE__TYPE:
				setType((TypeType6)newValue);
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
			case OMEPackage.FILTER_TYPE__TRANSMITTANCE_RANGE:
				setTransmittanceRange((TransmittanceRangeType)null);
				return;
			case OMEPackage.FILTER_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				return;
			case OMEPackage.FILTER_TYPE__FILTER_WHEEL:
				setFilterWheel(FILTER_WHEEL_EDEFAULT);
				return;
			case OMEPackage.FILTER_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case OMEPackage.FILTER_TYPE__TYPE:
				unsetType();
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
			case OMEPackage.FILTER_TYPE__TRANSMITTANCE_RANGE:
				return transmittanceRange != null;
			case OMEPackage.FILTER_TYPE__ANNOTATION_REF:
				return annotationRef != null && !annotationRef.isEmpty();
			case OMEPackage.FILTER_TYPE__FILTER_WHEEL:
				return FILTER_WHEEL_EDEFAULT == null ? filterWheel != null : !FILTER_WHEEL_EDEFAULT.equals(filterWheel);
			case OMEPackage.FILTER_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OMEPackage.FILTER_TYPE__TYPE:
				return isSetType();
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
		result.append(" (filterWheel: ");
		result.append(filterWheel);
		result.append(", iD: ");
		result.append(iD);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FilterTypeImpl
