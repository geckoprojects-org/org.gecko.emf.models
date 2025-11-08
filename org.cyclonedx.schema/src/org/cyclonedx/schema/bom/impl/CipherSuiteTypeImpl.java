/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom.impl;

import org.cyclonedx.schema.bom.AlgorithmsType;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.CipherSuiteType;
import org.cyclonedx.schema.bom.IdentifiersType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cipher Suite Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CipherSuiteTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CipherSuiteTypeImpl#getAlgorithms <em>Algorithms</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.CipherSuiteTypeImpl#getIdentifiers <em>Identifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CipherSuiteTypeImpl extends MinimalEObjectImpl.Container implements CipherSuiteType {
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
	 * The cached value of the '{@link #getAlgorithms() <em>Algorithms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithms()
	 * @generated
	 * @ordered
	 */
	protected AlgorithmsType algorithms;

	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifiers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected IdentifiersType identifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CipherSuiteTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getCipherSuiteType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CIPHER_SUITE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlgorithmsType getAlgorithms() {
		return algorithms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgorithms(AlgorithmsType newAlgorithms, NotificationChain msgs) {
		AlgorithmsType oldAlgorithms = algorithms;
		algorithms = newAlgorithms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CIPHER_SUITE_TYPE__ALGORITHMS, oldAlgorithms, newAlgorithms);
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
	public void setAlgorithms(AlgorithmsType newAlgorithms) {
		if (newAlgorithms != algorithms) {
			NotificationChain msgs = null;
			if (algorithms != null)
				msgs = ((InternalEObject)algorithms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CIPHER_SUITE_TYPE__ALGORITHMS, null, msgs);
			if (newAlgorithms != null)
				msgs = ((InternalEObject)newAlgorithms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CIPHER_SUITE_TYPE__ALGORITHMS, null, msgs);
			msgs = basicSetAlgorithms(newAlgorithms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CIPHER_SUITE_TYPE__ALGORITHMS, newAlgorithms, newAlgorithms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifiersType getIdentifiers() {
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifiers(IdentifiersType newIdentifiers, NotificationChain msgs) {
		IdentifiersType oldIdentifiers = identifiers;
		identifiers = newIdentifiers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.CIPHER_SUITE_TYPE__IDENTIFIERS, oldIdentifiers, newIdentifiers);
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
	public void setIdentifiers(IdentifiersType newIdentifiers) {
		if (newIdentifiers != identifiers) {
			NotificationChain msgs = null;
			if (identifiers != null)
				msgs = ((InternalEObject)identifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CIPHER_SUITE_TYPE__IDENTIFIERS, null, msgs);
			if (newIdentifiers != null)
				msgs = ((InternalEObject)newIdentifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.CIPHER_SUITE_TYPE__IDENTIFIERS, null, msgs);
			msgs = basicSetIdentifiers(newIdentifiers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.CIPHER_SUITE_TYPE__IDENTIFIERS, newIdentifiers, newIdentifiers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.CIPHER_SUITE_TYPE__ALGORITHMS:
				return basicSetAlgorithms(null, msgs);
			case BOMPackage.CIPHER_SUITE_TYPE__IDENTIFIERS:
				return basicSetIdentifiers(null, msgs);
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
			case BOMPackage.CIPHER_SUITE_TYPE__NAME:
				return getName();
			case BOMPackage.CIPHER_SUITE_TYPE__ALGORITHMS:
				return getAlgorithms();
			case BOMPackage.CIPHER_SUITE_TYPE__IDENTIFIERS:
				return getIdentifiers();
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
			case BOMPackage.CIPHER_SUITE_TYPE__NAME:
				setName((String)newValue);
				return;
			case BOMPackage.CIPHER_SUITE_TYPE__ALGORITHMS:
				setAlgorithms((AlgorithmsType)newValue);
				return;
			case BOMPackage.CIPHER_SUITE_TYPE__IDENTIFIERS:
				setIdentifiers((IdentifiersType)newValue);
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
			case BOMPackage.CIPHER_SUITE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BOMPackage.CIPHER_SUITE_TYPE__ALGORITHMS:
				setAlgorithms((AlgorithmsType)null);
				return;
			case BOMPackage.CIPHER_SUITE_TYPE__IDENTIFIERS:
				setIdentifiers((IdentifiersType)null);
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
			case BOMPackage.CIPHER_SUITE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BOMPackage.CIPHER_SUITE_TYPE__ALGORITHMS:
				return algorithms != null;
			case BOMPackage.CIPHER_SUITE_TYPE__IDENTIFIERS:
				return identifiers != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CipherSuiteTypeImpl
