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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openmicroscopy.ome.AnnotationRefType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.PlateAcquisitionType;
import org.openmicroscopy.ome.WellSampleRefType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plate Acquisition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateAcquisitionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateAcquisitionTypeImpl#getWellSampleRef <em>Well Sample Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateAcquisitionTypeImpl#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateAcquisitionTypeImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateAcquisitionTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateAcquisitionTypeImpl#getMaximumFieldCount <em>Maximum Field Count</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateAcquisitionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PlateAcquisitionTypeImpl#getStartTime <em>Start Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlateAcquisitionTypeImpl extends MinimalEObjectImpl.Container implements PlateAcquisitionType {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWellSampleRef() <em>Well Sample Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWellSampleRef()
	 * @generated
	 * @ordered
	 */
	protected EList<WellSampleRefType> wellSampleRef;

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
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar endTime = END_TIME_EDEFAULT;

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
	 * The default value of the '{@link #getMaximumFieldCount() <em>Maximum Field Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumFieldCount()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_FIELD_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaximumFieldCount() <em>Maximum Field Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumFieldCount()
	 * @generated
	 * @ordered
	 */
	protected int maximumFieldCount = MAXIMUM_FIELD_COUNT_EDEFAULT;

	/**
	 * This is true if the Maximum Field Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumFieldCountESet;

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
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar startTime = START_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlateAcquisitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getPlateAcquisitionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_ACQUISITION_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WellSampleRefType> getWellSampleRef() {
		if (wellSampleRef == null) {
			wellSampleRef = new EObjectContainmentEList<WellSampleRefType>(WellSampleRefType.class, this, OMEPackage.PLATE_ACQUISITION_TYPE__WELL_SAMPLE_REF);
		}
		return wellSampleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationRefType> getAnnotationRef() {
		if (annotationRef == null) {
			annotationRef = new EObjectContainmentEList<AnnotationRefType>(AnnotationRefType.class, this, OMEPackage.PLATE_ACQUISITION_TYPE__ANNOTATION_REF);
		}
		return annotationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndTime(XMLGregorianCalendar newEndTime) {
		XMLGregorianCalendar oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_ACQUISITION_TYPE__END_TIME, oldEndTime, endTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_ACQUISITION_TYPE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaximumFieldCount() {
		return maximumFieldCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumFieldCount(int newMaximumFieldCount) {
		int oldMaximumFieldCount = maximumFieldCount;
		maximumFieldCount = newMaximumFieldCount;
		boolean oldMaximumFieldCountESet = maximumFieldCountESet;
		maximumFieldCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_ACQUISITION_TYPE__MAXIMUM_FIELD_COUNT, oldMaximumFieldCount, maximumFieldCount, !oldMaximumFieldCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaximumFieldCount() {
		int oldMaximumFieldCount = maximumFieldCount;
		boolean oldMaximumFieldCountESet = maximumFieldCountESet;
		maximumFieldCount = MAXIMUM_FIELD_COUNT_EDEFAULT;
		maximumFieldCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.PLATE_ACQUISITION_TYPE__MAXIMUM_FIELD_COUNT, oldMaximumFieldCount, MAXIMUM_FIELD_COUNT_EDEFAULT, oldMaximumFieldCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaximumFieldCount() {
		return maximumFieldCountESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_ACQUISITION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTime(XMLGregorianCalendar newStartTime) {
		XMLGregorianCalendar oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.PLATE_ACQUISITION_TYPE__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.PLATE_ACQUISITION_TYPE__WELL_SAMPLE_REF:
				return ((InternalEList<?>)getWellSampleRef()).basicRemove(otherEnd, msgs);
			case OMEPackage.PLATE_ACQUISITION_TYPE__ANNOTATION_REF:
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
			case OMEPackage.PLATE_ACQUISITION_TYPE__DESCRIPTION:
				return getDescription();
			case OMEPackage.PLATE_ACQUISITION_TYPE__WELL_SAMPLE_REF:
				return getWellSampleRef();
			case OMEPackage.PLATE_ACQUISITION_TYPE__ANNOTATION_REF:
				return getAnnotationRef();
			case OMEPackage.PLATE_ACQUISITION_TYPE__END_TIME:
				return getEndTime();
			case OMEPackage.PLATE_ACQUISITION_TYPE__ID:
				return getID();
			case OMEPackage.PLATE_ACQUISITION_TYPE__MAXIMUM_FIELD_COUNT:
				return getMaximumFieldCount();
			case OMEPackage.PLATE_ACQUISITION_TYPE__NAME:
				return getName();
			case OMEPackage.PLATE_ACQUISITION_TYPE__START_TIME:
				return getStartTime();
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
			case OMEPackage.PLATE_ACQUISITION_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OMEPackage.PLATE_ACQUISITION_TYPE__WELL_SAMPLE_REF:
				getWellSampleRef().clear();
				getWellSampleRef().addAll((Collection<? extends WellSampleRefType>)newValue);
				return;
			case OMEPackage.PLATE_ACQUISITION_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				getAnnotationRef().addAll((Collection<? extends AnnotationRefType>)newValue);
				return;
			case OMEPackage.PLATE_ACQUISITION_TYPE__END_TIME:
				setEndTime((XMLGregorianCalendar)newValue);
				return;
			case OMEPackage.PLATE_ACQUISITION_TYPE__ID:
				setID((String)newValue);
				return;
			case OMEPackage.PLATE_ACQUISITION_TYPE__MAXIMUM_FIELD_COUNT:
				setMaximumFieldCount((Integer)newValue);
				return;
			case OMEPackage.PLATE_ACQUISITION_TYPE__NAME:
				setName((String)newValue);
				return;
			case OMEPackage.PLATE_ACQUISITION_TYPE__START_TIME:
				setStartTime((XMLGregorianCalendar)newValue);
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
			case OMEPackage.PLATE_ACQUISITION_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OMEPackage.PLATE_ACQUISITION_TYPE__WELL_SAMPLE_REF:
				getWellSampleRef().clear();
				return;
			case OMEPackage.PLATE_ACQUISITION_TYPE__ANNOTATION_REF:
				getAnnotationRef().clear();
				return;
			case OMEPackage.PLATE_ACQUISITION_TYPE__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case OMEPackage.PLATE_ACQUISITION_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case OMEPackage.PLATE_ACQUISITION_TYPE__MAXIMUM_FIELD_COUNT:
				unsetMaximumFieldCount();
				return;
			case OMEPackage.PLATE_ACQUISITION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OMEPackage.PLATE_ACQUISITION_TYPE__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
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
			case OMEPackage.PLATE_ACQUISITION_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OMEPackage.PLATE_ACQUISITION_TYPE__WELL_SAMPLE_REF:
				return wellSampleRef != null && !wellSampleRef.isEmpty();
			case OMEPackage.PLATE_ACQUISITION_TYPE__ANNOTATION_REF:
				return annotationRef != null && !annotationRef.isEmpty();
			case OMEPackage.PLATE_ACQUISITION_TYPE__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case OMEPackage.PLATE_ACQUISITION_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OMEPackage.PLATE_ACQUISITION_TYPE__MAXIMUM_FIELD_COUNT:
				return isSetMaximumFieldCount();
			case OMEPackage.PLATE_ACQUISITION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OMEPackage.PLATE_ACQUISITION_TYPE__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(", iD: ");
		result.append(iD);
		result.append(", maximumFieldCount: ");
		if (maximumFieldCountESet) result.append(maximumFieldCount); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(')');
		return result.toString();
	}

} //PlateAcquisitionTypeImpl
