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
package org.isotc211._2005.gco.impl;

import net.opengis.gml.gml.LengthType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.GCOPackage;
import org.isotc211._2005.gco.LengthPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Length Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gco.impl.LengthPropertyTypeImpl#getLengthGroup <em>Length Group</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.LengthPropertyTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.LengthPropertyTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LengthPropertyTypeImpl extends MinimalEObjectImpl.Container implements LengthPropertyType {
	/**
	 * The cached value of the '{@link #getLengthGroup() <em>Length Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap lengthGroup;

	/**
	 * The default value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected static final Object NIL_REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected Object nilReason = NIL_REASON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LengthPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GCOPackage.Literals.LENGTH_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLengthGroup() {
		if (lengthGroup == null) {
			lengthGroup = new BasicFeatureMap(this, GCOPackage.LENGTH_PROPERTY_TYPE__LENGTH_GROUP);
		}
		return lengthGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LengthType getLength() {
		return (LengthType)getLengthGroup().get(GCOPackage.Literals.LENGTH_PROPERTY_TYPE__LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(LengthType newLength, NotificationChain msgs) {
		return ((FeatureMap.Internal)getLengthGroup()).basicAdd(GCOPackage.Literals.LENGTH_PROPERTY_TYPE__LENGTH, newLength, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(LengthType newLength) {
		((FeatureMap.Internal)getLengthGroup()).set(GCOPackage.Literals.LENGTH_PROPERTY_TYPE__LENGTH, newLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getNilReason() {
		return nilReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNilReason(Object newNilReason) {
		Object oldNilReason = nilReason;
		nilReason = newNilReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCOPackage.LENGTH_PROPERTY_TYPE__NIL_REASON, oldNilReason, nilReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GCOPackage.LENGTH_PROPERTY_TYPE__LENGTH_GROUP:
				return ((InternalEList<?>)getLengthGroup()).basicRemove(otherEnd, msgs);
			case GCOPackage.LENGTH_PROPERTY_TYPE__LENGTH:
				return basicSetLength(null, msgs);
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
			case GCOPackage.LENGTH_PROPERTY_TYPE__LENGTH_GROUP:
				if (coreType) return getLengthGroup();
				return ((FeatureMap.Internal)getLengthGroup()).getWrapper();
			case GCOPackage.LENGTH_PROPERTY_TYPE__LENGTH:
				return getLength();
			case GCOPackage.LENGTH_PROPERTY_TYPE__NIL_REASON:
				return getNilReason();
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
			case GCOPackage.LENGTH_PROPERTY_TYPE__LENGTH_GROUP:
				((FeatureMap.Internal)getLengthGroup()).set(newValue);
				return;
			case GCOPackage.LENGTH_PROPERTY_TYPE__LENGTH:
				setLength((LengthType)newValue);
				return;
			case GCOPackage.LENGTH_PROPERTY_TYPE__NIL_REASON:
				setNilReason(newValue);
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
			case GCOPackage.LENGTH_PROPERTY_TYPE__LENGTH_GROUP:
				getLengthGroup().clear();
				return;
			case GCOPackage.LENGTH_PROPERTY_TYPE__LENGTH:
				setLength((LengthType)null);
				return;
			case GCOPackage.LENGTH_PROPERTY_TYPE__NIL_REASON:
				setNilReason(NIL_REASON_EDEFAULT);
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
			case GCOPackage.LENGTH_PROPERTY_TYPE__LENGTH_GROUP:
				return lengthGroup != null && !lengthGroup.isEmpty();
			case GCOPackage.LENGTH_PROPERTY_TYPE__LENGTH:
				return getLength() != null;
			case GCOPackage.LENGTH_PROPERTY_TYPE__NIL_REASON:
				return NIL_REASON_EDEFAULT == null ? nilReason != null : !NIL_REASON_EDEFAULT.equals(nilReason);
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
		result.append(" (lengthGroup: ");
		result.append(lengthGroup);
		result.append(", nilReason: ");
		result.append(nilReason);
		result.append(')');
		return result.toString();
	}

} //LengthPropertyTypeImpl
