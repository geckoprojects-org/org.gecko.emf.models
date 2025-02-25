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

import org.openmicroscopy.ome.DichroicRefType;
import org.openmicroscopy.ome.FilterRef;
import org.openmicroscopy.ome.FilterSetType;
import org.openmicroscopy.ome.OMEPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.FilterSetTypeImpl#getExcitationFilterRef <em>Excitation Filter Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.FilterSetTypeImpl#getDichroicRef <em>Dichroic Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.FilterSetTypeImpl#getEmissionFilterRef <em>Emission Filter Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.FilterSetTypeImpl#getID <em>ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterSetTypeImpl extends ManufacturerSpecImpl implements FilterSetType {
	/**
	 * The cached value of the '{@link #getExcitationFilterRef() <em>Excitation Filter Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcitationFilterRef()
	 * @generated
	 * @ordered
	 */
	protected EList<FilterRef> excitationFilterRef;

	/**
	 * The cached value of the '{@link #getDichroicRef() <em>Dichroic Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDichroicRef()
	 * @generated
	 * @ordered
	 */
	protected DichroicRefType dichroicRef;

	/**
	 * The cached value of the '{@link #getEmissionFilterRef() <em>Emission Filter Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionFilterRef()
	 * @generated
	 * @ordered
	 */
	protected EList<FilterRef> emissionFilterRef;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getFilterSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FilterRef> getExcitationFilterRef() {
		if (excitationFilterRef == null) {
			excitationFilterRef = new EObjectContainmentEList<FilterRef>(FilterRef.class, this, OMEPackage.FILTER_SET_TYPE__EXCITATION_FILTER_REF);
		}
		return excitationFilterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DichroicRefType getDichroicRef() {
		return dichroicRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDichroicRef(DichroicRefType newDichroicRef, NotificationChain msgs) {
		DichroicRefType oldDichroicRef = dichroicRef;
		dichroicRef = newDichroicRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.FILTER_SET_TYPE__DICHROIC_REF, oldDichroicRef, newDichroicRef);
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
	public void setDichroicRef(DichroicRefType newDichroicRef) {
		if (newDichroicRef != dichroicRef) {
			NotificationChain msgs = null;
			if (dichroicRef != null)
				msgs = ((InternalEObject)dichroicRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.FILTER_SET_TYPE__DICHROIC_REF, null, msgs);
			if (newDichroicRef != null)
				msgs = ((InternalEObject)newDichroicRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.FILTER_SET_TYPE__DICHROIC_REF, null, msgs);
			msgs = basicSetDichroicRef(newDichroicRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.FILTER_SET_TYPE__DICHROIC_REF, newDichroicRef, newDichroicRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FilterRef> getEmissionFilterRef() {
		if (emissionFilterRef == null) {
			emissionFilterRef = new EObjectContainmentEList<FilterRef>(FilterRef.class, this, OMEPackage.FILTER_SET_TYPE__EMISSION_FILTER_REF);
		}
		return emissionFilterRef;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.FILTER_SET_TYPE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.FILTER_SET_TYPE__EXCITATION_FILTER_REF:
				return ((InternalEList<?>)getExcitationFilterRef()).basicRemove(otherEnd, msgs);
			case OMEPackage.FILTER_SET_TYPE__DICHROIC_REF:
				return basicSetDichroicRef(null, msgs);
			case OMEPackage.FILTER_SET_TYPE__EMISSION_FILTER_REF:
				return ((InternalEList<?>)getEmissionFilterRef()).basicRemove(otherEnd, msgs);
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
			case OMEPackage.FILTER_SET_TYPE__EXCITATION_FILTER_REF:
				return getExcitationFilterRef();
			case OMEPackage.FILTER_SET_TYPE__DICHROIC_REF:
				return getDichroicRef();
			case OMEPackage.FILTER_SET_TYPE__EMISSION_FILTER_REF:
				return getEmissionFilterRef();
			case OMEPackage.FILTER_SET_TYPE__ID:
				return getID();
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
			case OMEPackage.FILTER_SET_TYPE__EXCITATION_FILTER_REF:
				getExcitationFilterRef().clear();
				getExcitationFilterRef().addAll((Collection<? extends FilterRef>)newValue);
				return;
			case OMEPackage.FILTER_SET_TYPE__DICHROIC_REF:
				setDichroicRef((DichroicRefType)newValue);
				return;
			case OMEPackage.FILTER_SET_TYPE__EMISSION_FILTER_REF:
				getEmissionFilterRef().clear();
				getEmissionFilterRef().addAll((Collection<? extends FilterRef>)newValue);
				return;
			case OMEPackage.FILTER_SET_TYPE__ID:
				setID((String)newValue);
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
			case OMEPackage.FILTER_SET_TYPE__EXCITATION_FILTER_REF:
				getExcitationFilterRef().clear();
				return;
			case OMEPackage.FILTER_SET_TYPE__DICHROIC_REF:
				setDichroicRef((DichroicRefType)null);
				return;
			case OMEPackage.FILTER_SET_TYPE__EMISSION_FILTER_REF:
				getEmissionFilterRef().clear();
				return;
			case OMEPackage.FILTER_SET_TYPE__ID:
				setID(ID_EDEFAULT);
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
			case OMEPackage.FILTER_SET_TYPE__EXCITATION_FILTER_REF:
				return excitationFilterRef != null && !excitationFilterRef.isEmpty();
			case OMEPackage.FILTER_SET_TYPE__DICHROIC_REF:
				return dichroicRef != null;
			case OMEPackage.FILTER_SET_TYPE__EMISSION_FILTER_REF:
				return emissionFilterRef != null && !emissionFilterRef.isEmpty();
			case OMEPackage.FILTER_SET_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
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
		result.append(" (iD: ");
		result.append(iD);
		result.append(')');
		return result.toString();
	}

} //FilterSetTypeImpl
