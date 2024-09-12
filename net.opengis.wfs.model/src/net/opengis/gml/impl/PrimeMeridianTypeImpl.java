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
package net.opengis.gml.impl;

import java.util.Collection;

import net.opengis.gml.AngleChoiceType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.IdentifierType;
import net.opengis.gml.PrimeMeridianType;
import net.opengis.gml.StringOrRefType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prime Meridian Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.PrimeMeridianTypeImpl#getMeridianID <em>Meridian ID</em>}</li>
 *   <li>{@link net.opengis.gml.impl.PrimeMeridianTypeImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link net.opengis.gml.impl.PrimeMeridianTypeImpl#getGreenwichLongitude <em>Greenwich Longitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimeMeridianTypeImpl extends PrimeMeridianBaseTypeImpl implements PrimeMeridianType {
	/**
	 * The cached value of the '{@link #getMeridianID() <em>Meridian ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeridianID()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentifierType> meridianID;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected StringOrRefType remarks;

	/**
	 * The cached value of the '{@link #getGreenwichLongitude() <em>Greenwich Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreenwichLongitude()
	 * @generated
	 * @ordered
	 */
	protected AngleChoiceType greenwichLongitude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimeMeridianTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getPrimeMeridianType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IdentifierType> getMeridianID() {
		if (meridianID == null) {
			meridianID = new EObjectContainmentEList<IdentifierType>(IdentifierType.class, this, GMLPackage.PRIME_MERIDIAN_TYPE__MERIDIAN_ID);
		}
		return meridianID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemarks(StringOrRefType newRemarks, NotificationChain msgs) {
		StringOrRefType oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.PRIME_MERIDIAN_TYPE__REMARKS, oldRemarks, newRemarks);
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
	public void setRemarks(StringOrRefType newRemarks) {
		if (newRemarks != remarks) {
			NotificationChain msgs = null;
			if (remarks != null)
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PRIME_MERIDIAN_TYPE__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PRIME_MERIDIAN_TYPE__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.PRIME_MERIDIAN_TYPE__REMARKS, newRemarks, newRemarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngleChoiceType getGreenwichLongitude() {
		return greenwichLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGreenwichLongitude(AngleChoiceType newGreenwichLongitude, NotificationChain msgs) {
		AngleChoiceType oldGreenwichLongitude = greenwichLongitude;
		greenwichLongitude = newGreenwichLongitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.PRIME_MERIDIAN_TYPE__GREENWICH_LONGITUDE, oldGreenwichLongitude, newGreenwichLongitude);
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
	public void setGreenwichLongitude(AngleChoiceType newGreenwichLongitude) {
		if (newGreenwichLongitude != greenwichLongitude) {
			NotificationChain msgs = null;
			if (greenwichLongitude != null)
				msgs = ((InternalEObject)greenwichLongitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PRIME_MERIDIAN_TYPE__GREENWICH_LONGITUDE, null, msgs);
			if (newGreenwichLongitude != null)
				msgs = ((InternalEObject)newGreenwichLongitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PRIME_MERIDIAN_TYPE__GREENWICH_LONGITUDE, null, msgs);
			msgs = basicSetGreenwichLongitude(newGreenwichLongitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.PRIME_MERIDIAN_TYPE__GREENWICH_LONGITUDE, newGreenwichLongitude, newGreenwichLongitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.PRIME_MERIDIAN_TYPE__MERIDIAN_ID:
				return ((InternalEList<?>)getMeridianID()).basicRemove(otherEnd, msgs);
			case GMLPackage.PRIME_MERIDIAN_TYPE__REMARKS:
				return basicSetRemarks(null, msgs);
			case GMLPackage.PRIME_MERIDIAN_TYPE__GREENWICH_LONGITUDE:
				return basicSetGreenwichLongitude(null, msgs);
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
			case GMLPackage.PRIME_MERIDIAN_TYPE__MERIDIAN_ID:
				return getMeridianID();
			case GMLPackage.PRIME_MERIDIAN_TYPE__REMARKS:
				return getRemarks();
			case GMLPackage.PRIME_MERIDIAN_TYPE__GREENWICH_LONGITUDE:
				return getGreenwichLongitude();
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
			case GMLPackage.PRIME_MERIDIAN_TYPE__MERIDIAN_ID:
				getMeridianID().clear();
				getMeridianID().addAll((Collection<? extends IdentifierType>)newValue);
				return;
			case GMLPackage.PRIME_MERIDIAN_TYPE__REMARKS:
				setRemarks((StringOrRefType)newValue);
				return;
			case GMLPackage.PRIME_MERIDIAN_TYPE__GREENWICH_LONGITUDE:
				setGreenwichLongitude((AngleChoiceType)newValue);
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
			case GMLPackage.PRIME_MERIDIAN_TYPE__MERIDIAN_ID:
				getMeridianID().clear();
				return;
			case GMLPackage.PRIME_MERIDIAN_TYPE__REMARKS:
				setRemarks((StringOrRefType)null);
				return;
			case GMLPackage.PRIME_MERIDIAN_TYPE__GREENWICH_LONGITUDE:
				setGreenwichLongitude((AngleChoiceType)null);
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
			case GMLPackage.PRIME_MERIDIAN_TYPE__MERIDIAN_ID:
				return meridianID != null && !meridianID.isEmpty();
			case GMLPackage.PRIME_MERIDIAN_TYPE__REMARKS:
				return remarks != null;
			case GMLPackage.PRIME_MERIDIAN_TYPE__GREENWICH_LONGITUDE:
				return greenwichLongitude != null;
		}
		return super.eIsSet(featureID);
	}

} //PrimeMeridianTypeImpl
