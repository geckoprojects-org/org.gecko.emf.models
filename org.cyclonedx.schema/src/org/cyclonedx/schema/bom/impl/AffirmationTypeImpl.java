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

import org.cyclonedx.schema.bom.AffirmationType;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.SignatoriesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Affirmation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AffirmationTypeImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AffirmationTypeImpl#getSignatories <em>Signatories</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AffirmationTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AffirmationTypeImpl extends MinimalEObjectImpl.Container implements AffirmationType {
	/**
	 * The default value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected String statement = STATEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSignatories() <em>Signatories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatories()
	 * @generated
	 * @ordered
	 */
	protected SignatoriesType signatories;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffirmationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getAffirmationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatement(String newStatement) {
		String oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.AFFIRMATION_TYPE__STATEMENT, oldStatement, statement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignatoriesType getSignatories() {
		return signatories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignatories(SignatoriesType newSignatories, NotificationChain msgs) {
		SignatoriesType oldSignatories = signatories;
		signatories = newSignatories;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.AFFIRMATION_TYPE__SIGNATORIES, oldSignatories, newSignatories);
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
	public void setSignatories(SignatoriesType newSignatories) {
		if (newSignatories != signatories) {
			NotificationChain msgs = null;
			if (signatories != null)
				msgs = ((InternalEObject)signatories).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.AFFIRMATION_TYPE__SIGNATORIES, null, msgs);
			if (newSignatories != null)
				msgs = ((InternalEObject)newSignatories).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.AFFIRMATION_TYPE__SIGNATORIES, null, msgs);
			msgs = basicSetSignatories(newSignatories, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.AFFIRMATION_TYPE__SIGNATORIES, newSignatories, newSignatories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.AFFIRMATION_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.AFFIRMATION_TYPE__SIGNATORIES:
				return basicSetSignatories(null, msgs);
			case BOMPackage.AFFIRMATION_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.AFFIRMATION_TYPE__STATEMENT:
				return getStatement();
			case BOMPackage.AFFIRMATION_TYPE__SIGNATORIES:
				return getSignatories();
			case BOMPackage.AFFIRMATION_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
			case BOMPackage.AFFIRMATION_TYPE__STATEMENT:
				setStatement((String)newValue);
				return;
			case BOMPackage.AFFIRMATION_TYPE__SIGNATORIES:
				setSignatories((SignatoriesType)newValue);
				return;
			case BOMPackage.AFFIRMATION_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case BOMPackage.AFFIRMATION_TYPE__STATEMENT:
				setStatement(STATEMENT_EDEFAULT);
				return;
			case BOMPackage.AFFIRMATION_TYPE__SIGNATORIES:
				setSignatories((SignatoriesType)null);
				return;
			case BOMPackage.AFFIRMATION_TYPE__ANY:
				getAny().clear();
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
			case BOMPackage.AFFIRMATION_TYPE__STATEMENT:
				return STATEMENT_EDEFAULT == null ? statement != null : !STATEMENT_EDEFAULT.equals(statement);
			case BOMPackage.AFFIRMATION_TYPE__SIGNATORIES:
				return signatories != null;
			case BOMPackage.AFFIRMATION_TYPE__ANY:
				return any != null && !any.isEmpty();
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
		result.append(" (statement: ");
		result.append(statement);
		result.append(", any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //AffirmationTypeImpl
