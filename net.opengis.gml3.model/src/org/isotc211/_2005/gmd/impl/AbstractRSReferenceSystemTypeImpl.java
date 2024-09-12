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
package org.isotc211._2005.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.AbstractRSReferenceSystemType;
import org.isotc211._2005.gmd.EXExtentPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.RSIdentifierPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract RS Reference System Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractRSReferenceSystemTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractRSReferenceSystemTypeImpl#getDomainOfValidity <em>Domain Of Validity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractRSReferenceSystemTypeImpl extends AbstractObjectTypeImpl implements AbstractRSReferenceSystemType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected RSIdentifierPropertyType name;

	/**
	 * The cached value of the '{@link #getDomainOfValidity() <em>Domain Of Validity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainOfValidity()
	 * @generated
	 * @ordered
	 */
	protected EList<EXExtentPropertyType> domainOfValidity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractRSReferenceSystemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getAbstractRSReferenceSystemType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RSIdentifierPropertyType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(RSIdentifierPropertyType newName, NotificationChain msgs) {
		RSIdentifierPropertyType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_RS_REFERENCE_SYSTEM_TYPE__NAME, oldName, newName);
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
	public void setName(RSIdentifierPropertyType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_RS_REFERENCE_SYSTEM_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_RS_REFERENCE_SYSTEM_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_RS_REFERENCE_SYSTEM_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EXExtentPropertyType> getDomainOfValidity() {
		if (domainOfValidity == null) {
			domainOfValidity = new EObjectContainmentEList<EXExtentPropertyType>(EXExtentPropertyType.class, this, GMDPackage.ABSTRACT_RS_REFERENCE_SYSTEM_TYPE__DOMAIN_OF_VALIDITY);
		}
		return domainOfValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.ABSTRACT_RS_REFERENCE_SYSTEM_TYPE__NAME:
				return basicSetName(null, msgs);
			case GMDPackage.ABSTRACT_RS_REFERENCE_SYSTEM_TYPE__DOMAIN_OF_VALIDITY:
				return ((InternalEList<?>)getDomainOfValidity()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.ABSTRACT_RS_REFERENCE_SYSTEM_TYPE__NAME:
				return getName();
			case GMDPackage.ABSTRACT_RS_REFERENCE_SYSTEM_TYPE__DOMAIN_OF_VALIDITY:
				return getDomainOfValidity();
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
			case GMDPackage.ABSTRACT_RS_REFERENCE_SYSTEM_TYPE__NAME:
				setName((RSIdentifierPropertyType)newValue);
				return;
			case GMDPackage.ABSTRACT_RS_REFERENCE_SYSTEM_TYPE__DOMAIN_OF_VALIDITY:
				getDomainOfValidity().clear();
				getDomainOfValidity().addAll((Collection<? extends EXExtentPropertyType>)newValue);
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
			case GMDPackage.ABSTRACT_RS_REFERENCE_SYSTEM_TYPE__NAME:
				setName((RSIdentifierPropertyType)null);
				return;
			case GMDPackage.ABSTRACT_RS_REFERENCE_SYSTEM_TYPE__DOMAIN_OF_VALIDITY:
				getDomainOfValidity().clear();
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
			case GMDPackage.ABSTRACT_RS_REFERENCE_SYSTEM_TYPE__NAME:
				return name != null;
			case GMDPackage.ABSTRACT_RS_REFERENCE_SYSTEM_TYPE__DOMAIN_OF_VALIDITY:
				return domainOfValidity != null && !domainOfValidity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractRSReferenceSystemTypeImpl
