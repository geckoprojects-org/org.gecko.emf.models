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
package org.omg.spec.cmmn.casemodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.cmmn.casemodel.CaseModelPackage;
import org.omg.spec.cmmn.casemodel.TIfPart;
import org.omg.spec.cmmn.casemodel.TOnPart;
import org.omg.spec.cmmn.casemodel.TSentry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSentry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TSentryImpl#getOnPartGroup <em>On Part Group</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TSentryImpl#getOnPart <em>On Part</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TSentryImpl#getIfPart <em>If Part</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TSentryImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TSentryImpl extends TCmmnElementImpl implements TSentry {
	/**
	 * The cached value of the '{@link #getOnPartGroup() <em>On Part Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPartGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap onPartGroup;

	/**
	 * The cached value of the '{@link #getIfPart() <em>If Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfPart()
	 * @generated
	 * @ordered
	 */
	protected TIfPart ifPart;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSentryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaseModelPackage.Literals.TSENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getOnPartGroup() {
		if (onPartGroup == null) {
			onPartGroup = new BasicFeatureMap(this, CaseModelPackage.TSENTRY__ON_PART_GROUP);
		}
		return onPartGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TOnPart> getOnPart() {
		return getOnPartGroup().list(CaseModelPackage.Literals.TSENTRY__ON_PART);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TIfPart getIfPart() {
		return ifPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfPart(TIfPart newIfPart, NotificationChain msgs) {
		TIfPart oldIfPart = ifPart;
		ifPart = newIfPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaseModelPackage.TSENTRY__IF_PART, oldIfPart, newIfPart);
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
	public void setIfPart(TIfPart newIfPart) {
		if (newIfPart != ifPart) {
			NotificationChain msgs = null;
			if (ifPart != null)
				msgs = ((InternalEObject)ifPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TSENTRY__IF_PART, null, msgs);
			if (newIfPart != null)
				msgs = ((InternalEObject)newIfPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TSENTRY__IF_PART, null, msgs);
			msgs = basicSetIfPart(newIfPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TSENTRY__IF_PART, newIfPart, newIfPart));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TSENTRY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaseModelPackage.TSENTRY__ON_PART_GROUP:
				return ((InternalEList<?>)getOnPartGroup()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TSENTRY__ON_PART:
				return ((InternalEList<?>)getOnPart()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TSENTRY__IF_PART:
				return basicSetIfPart(null, msgs);
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
			case CaseModelPackage.TSENTRY__ON_PART_GROUP:
				if (coreType) return getOnPartGroup();
				return ((FeatureMap.Internal)getOnPartGroup()).getWrapper();
			case CaseModelPackage.TSENTRY__ON_PART:
				return getOnPart();
			case CaseModelPackage.TSENTRY__IF_PART:
				return getIfPart();
			case CaseModelPackage.TSENTRY__NAME:
				return getName();
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
			case CaseModelPackage.TSENTRY__ON_PART_GROUP:
				((FeatureMap.Internal)getOnPartGroup()).set(newValue);
				return;
			case CaseModelPackage.TSENTRY__ON_PART:
				getOnPart().clear();
				getOnPart().addAll((Collection<? extends TOnPart>)newValue);
				return;
			case CaseModelPackage.TSENTRY__IF_PART:
				setIfPart((TIfPart)newValue);
				return;
			case CaseModelPackage.TSENTRY__NAME:
				setName((String)newValue);
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
			case CaseModelPackage.TSENTRY__ON_PART_GROUP:
				getOnPartGroup().clear();
				return;
			case CaseModelPackage.TSENTRY__ON_PART:
				getOnPart().clear();
				return;
			case CaseModelPackage.TSENTRY__IF_PART:
				setIfPart((TIfPart)null);
				return;
			case CaseModelPackage.TSENTRY__NAME:
				setName(NAME_EDEFAULT);
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
			case CaseModelPackage.TSENTRY__ON_PART_GROUP:
				return onPartGroup != null && !onPartGroup.isEmpty();
			case CaseModelPackage.TSENTRY__ON_PART:
				return !getOnPart().isEmpty();
			case CaseModelPackage.TSENTRY__IF_PART:
				return ifPart != null;
			case CaseModelPackage.TSENTRY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (onPartGroup: ");
		result.append(onPartGroup);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TSentryImpl
