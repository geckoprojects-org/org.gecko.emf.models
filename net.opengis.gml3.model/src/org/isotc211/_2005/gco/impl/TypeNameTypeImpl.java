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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.GCOPackage;
import org.isotc211._2005.gco.TypeNameType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Name Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gco.impl.TypeNameTypeImpl#getAName <em>AName</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeNameTypeImpl extends AbstractObjectTypeImpl implements TypeNameType {
	/**
	 * The cached value of the '{@link #getAName() <em>AName</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAName()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType aName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeNameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GCOPackage.Literals.TYPE_NAME_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getAName() {
		return aName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAName(CharacterStringPropertyType newAName, NotificationChain msgs) {
		CharacterStringPropertyType oldAName = aName;
		aName = newAName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GCOPackage.TYPE_NAME_TYPE__ANAME, oldAName, newAName);
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
	public void setAName(CharacterStringPropertyType newAName) {
		if (newAName != aName) {
			NotificationChain msgs = null;
			if (aName != null)
				msgs = ((InternalEObject)aName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GCOPackage.TYPE_NAME_TYPE__ANAME, null, msgs);
			if (newAName != null)
				msgs = ((InternalEObject)newAName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GCOPackage.TYPE_NAME_TYPE__ANAME, null, msgs);
			msgs = basicSetAName(newAName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCOPackage.TYPE_NAME_TYPE__ANAME, newAName, newAName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GCOPackage.TYPE_NAME_TYPE__ANAME:
				return basicSetAName(null, msgs);
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
			case GCOPackage.TYPE_NAME_TYPE__ANAME:
				return getAName();
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
			case GCOPackage.TYPE_NAME_TYPE__ANAME:
				setAName((CharacterStringPropertyType)newValue);
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
			case GCOPackage.TYPE_NAME_TYPE__ANAME:
				setAName((CharacterStringPropertyType)null);
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
			case GCOPackage.TYPE_NAME_TYPE__ANAME:
				return aName != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeNameTypeImpl
