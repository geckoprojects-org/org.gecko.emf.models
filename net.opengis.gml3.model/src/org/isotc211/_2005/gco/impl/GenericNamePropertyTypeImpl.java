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

import net.opengis.gml.gml.CodeType;

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
import org.isotc211._2005.gco.GenericNamePropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Name Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gco.impl.GenericNamePropertyTypeImpl#getAbstractGenericNameGroup <em>Abstract Generic Name Group</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.GenericNamePropertyTypeImpl#getAbstractGenericName <em>Abstract Generic Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.GenericNamePropertyTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericNamePropertyTypeImpl extends MinimalEObjectImpl.Container implements GenericNamePropertyType {
	/**
	 * The cached value of the '{@link #getAbstractGenericNameGroup() <em>Abstract Generic Name Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractGenericNameGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractGenericNameGroup;

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
	protected GenericNamePropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GCOPackage.Literals.GENERIC_NAME_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractGenericNameGroup() {
		if (abstractGenericNameGroup == null) {
			abstractGenericNameGroup = new BasicFeatureMap(this, GCOPackage.GENERIC_NAME_PROPERTY_TYPE__ABSTRACT_GENERIC_NAME_GROUP);
		}
		return abstractGenericNameGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getAbstractGenericName() {
		return (CodeType)getAbstractGenericNameGroup().get(GCOPackage.Literals.GENERIC_NAME_PROPERTY_TYPE__ABSTRACT_GENERIC_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGenericName(CodeType newAbstractGenericName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractGenericNameGroup()).basicAdd(GCOPackage.Literals.GENERIC_NAME_PROPERTY_TYPE__ABSTRACT_GENERIC_NAME, newAbstractGenericName, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, GCOPackage.GENERIC_NAME_PROPERTY_TYPE__NIL_REASON, oldNilReason, nilReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GCOPackage.GENERIC_NAME_PROPERTY_TYPE__ABSTRACT_GENERIC_NAME_GROUP:
				return ((InternalEList<?>)getAbstractGenericNameGroup()).basicRemove(otherEnd, msgs);
			case GCOPackage.GENERIC_NAME_PROPERTY_TYPE__ABSTRACT_GENERIC_NAME:
				return basicSetAbstractGenericName(null, msgs);
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
			case GCOPackage.GENERIC_NAME_PROPERTY_TYPE__ABSTRACT_GENERIC_NAME_GROUP:
				if (coreType) return getAbstractGenericNameGroup();
				return ((FeatureMap.Internal)getAbstractGenericNameGroup()).getWrapper();
			case GCOPackage.GENERIC_NAME_PROPERTY_TYPE__ABSTRACT_GENERIC_NAME:
				return getAbstractGenericName();
			case GCOPackage.GENERIC_NAME_PROPERTY_TYPE__NIL_REASON:
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
			case GCOPackage.GENERIC_NAME_PROPERTY_TYPE__ABSTRACT_GENERIC_NAME_GROUP:
				((FeatureMap.Internal)getAbstractGenericNameGroup()).set(newValue);
				return;
			case GCOPackage.GENERIC_NAME_PROPERTY_TYPE__NIL_REASON:
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
			case GCOPackage.GENERIC_NAME_PROPERTY_TYPE__ABSTRACT_GENERIC_NAME_GROUP:
				getAbstractGenericNameGroup().clear();
				return;
			case GCOPackage.GENERIC_NAME_PROPERTY_TYPE__NIL_REASON:
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
			case GCOPackage.GENERIC_NAME_PROPERTY_TYPE__ABSTRACT_GENERIC_NAME_GROUP:
				return abstractGenericNameGroup != null && !abstractGenericNameGroup.isEmpty();
			case GCOPackage.GENERIC_NAME_PROPERTY_TYPE__ABSTRACT_GENERIC_NAME:
				return getAbstractGenericName() != null;
			case GCOPackage.GENERIC_NAME_PROPERTY_TYPE__NIL_REASON:
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
		result.append(" (abstractGenericNameGroup: ");
		result.append(abstractGenericNameGroup);
		result.append(", nilReason: ");
		result.append(nilReason);
		result.append(')');
		return result.toString();
	}

} //GenericNamePropertyTypeImpl
