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
import org.isotc211._2005.gco.MemberNameType;
import org.isotc211._2005.gco.TypeNamePropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Name Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gco.impl.MemberNameTypeImpl#getAName <em>AName</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.MemberNameTypeImpl#getAttributeType <em>Attribute Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberNameTypeImpl extends AbstractObjectTypeImpl implements MemberNameType {
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
	 * The cached value of the '{@link #getAttributeType() <em>Attribute Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeType()
	 * @generated
	 * @ordered
	 */
	protected TypeNamePropertyType attributeType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberNameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GCOPackage.Literals.MEMBER_NAME_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GCOPackage.MEMBER_NAME_TYPE__ANAME, oldAName, newAName);
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
				msgs = ((InternalEObject)aName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GCOPackage.MEMBER_NAME_TYPE__ANAME, null, msgs);
			if (newAName != null)
				msgs = ((InternalEObject)newAName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GCOPackage.MEMBER_NAME_TYPE__ANAME, null, msgs);
			msgs = basicSetAName(newAName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCOPackage.MEMBER_NAME_TYPE__ANAME, newAName, newAName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeNamePropertyType getAttributeType() {
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeType(TypeNamePropertyType newAttributeType, NotificationChain msgs) {
		TypeNamePropertyType oldAttributeType = attributeType;
		attributeType = newAttributeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GCOPackage.MEMBER_NAME_TYPE__ATTRIBUTE_TYPE, oldAttributeType, newAttributeType);
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
	public void setAttributeType(TypeNamePropertyType newAttributeType) {
		if (newAttributeType != attributeType) {
			NotificationChain msgs = null;
			if (attributeType != null)
				msgs = ((InternalEObject)attributeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GCOPackage.MEMBER_NAME_TYPE__ATTRIBUTE_TYPE, null, msgs);
			if (newAttributeType != null)
				msgs = ((InternalEObject)newAttributeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GCOPackage.MEMBER_NAME_TYPE__ATTRIBUTE_TYPE, null, msgs);
			msgs = basicSetAttributeType(newAttributeType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCOPackage.MEMBER_NAME_TYPE__ATTRIBUTE_TYPE, newAttributeType, newAttributeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GCOPackage.MEMBER_NAME_TYPE__ANAME:
				return basicSetAName(null, msgs);
			case GCOPackage.MEMBER_NAME_TYPE__ATTRIBUTE_TYPE:
				return basicSetAttributeType(null, msgs);
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
			case GCOPackage.MEMBER_NAME_TYPE__ANAME:
				return getAName();
			case GCOPackage.MEMBER_NAME_TYPE__ATTRIBUTE_TYPE:
				return getAttributeType();
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
			case GCOPackage.MEMBER_NAME_TYPE__ANAME:
				setAName((CharacterStringPropertyType)newValue);
				return;
			case GCOPackage.MEMBER_NAME_TYPE__ATTRIBUTE_TYPE:
				setAttributeType((TypeNamePropertyType)newValue);
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
			case GCOPackage.MEMBER_NAME_TYPE__ANAME:
				setAName((CharacterStringPropertyType)null);
				return;
			case GCOPackage.MEMBER_NAME_TYPE__ATTRIBUTE_TYPE:
				setAttributeType((TypeNamePropertyType)null);
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
			case GCOPackage.MEMBER_NAME_TYPE__ANAME:
				return aName != null;
			case GCOPackage.MEMBER_NAME_TYPE__ATTRIBUTE_TYPE:
				return attributeType != null;
		}
		return super.eIsSet(featureID);
	}

} //MemberNameTypeImpl
