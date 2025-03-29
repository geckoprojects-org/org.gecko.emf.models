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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.cmmn.casemodel.CaseModelPackage;
import org.omg.spec.cmmn.casemodel.TEntryCriterion;
import org.omg.spec.cmmn.casemodel.TExitCriterion;
import org.omg.spec.cmmn.casemodel.TPlanItem;
import org.omg.spec.cmmn.casemodel.TPlanItemControl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPlan Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TPlanItemImpl#getItemControl <em>Item Control</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TPlanItemImpl#getEntryCriterion <em>Entry Criterion</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TPlanItemImpl#getExitCriterion <em>Exit Criterion</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TPlanItemImpl#getDefinitionRef <em>Definition Ref</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TPlanItemImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TPlanItemImpl extends TCmmnElementImpl implements TPlanItem {
	/**
	 * The cached value of the '{@link #getItemControl() <em>Item Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemControl()
	 * @generated
	 * @ordered
	 */
	protected TPlanItemControl itemControl;

	/**
	 * The cached value of the '{@link #getEntryCriterion() <em>Entry Criterion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryCriterion()
	 * @generated
	 * @ordered
	 */
	protected EList<TEntryCriterion> entryCriterion;

	/**
	 * The cached value of the '{@link #getExitCriterion() <em>Exit Criterion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitCriterion()
	 * @generated
	 * @ordered
	 */
	protected EList<TExitCriterion> exitCriterion;

	/**
	 * The default value of the '{@link #getDefinitionRef() <em>Definition Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionRef()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinitionRef() <em>Definition Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionRef()
	 * @generated
	 * @ordered
	 */
	protected String definitionRef = DEFINITION_REF_EDEFAULT;

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
	protected TPlanItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaseModelPackage.Literals.TPLAN_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPlanItemControl getItemControl() {
		return itemControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemControl(TPlanItemControl newItemControl, NotificationChain msgs) {
		TPlanItemControl oldItemControl = itemControl;
		itemControl = newItemControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaseModelPackage.TPLAN_ITEM__ITEM_CONTROL, oldItemControl, newItemControl);
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
	public void setItemControl(TPlanItemControl newItemControl) {
		if (newItemControl != itemControl) {
			NotificationChain msgs = null;
			if (itemControl != null)
				msgs = ((InternalEObject)itemControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TPLAN_ITEM__ITEM_CONTROL, null, msgs);
			if (newItemControl != null)
				msgs = ((InternalEObject)newItemControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TPLAN_ITEM__ITEM_CONTROL, null, msgs);
			msgs = basicSetItemControl(newItemControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TPLAN_ITEM__ITEM_CONTROL, newItemControl, newItemControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TEntryCriterion> getEntryCriterion() {
		if (entryCriterion == null) {
			entryCriterion = new EObjectContainmentEList<TEntryCriterion>(TEntryCriterion.class, this, CaseModelPackage.TPLAN_ITEM__ENTRY_CRITERION);
		}
		return entryCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TExitCriterion> getExitCriterion() {
		if (exitCriterion == null) {
			exitCriterion = new EObjectContainmentEList<TExitCriterion>(TExitCriterion.class, this, CaseModelPackage.TPLAN_ITEM__EXIT_CRITERION);
		}
		return exitCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefinitionRef() {
		return definitionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionRef(String newDefinitionRef) {
		String oldDefinitionRef = definitionRef;
		definitionRef = newDefinitionRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TPLAN_ITEM__DEFINITION_REF, oldDefinitionRef, definitionRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TPLAN_ITEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaseModelPackage.TPLAN_ITEM__ITEM_CONTROL:
				return basicSetItemControl(null, msgs);
			case CaseModelPackage.TPLAN_ITEM__ENTRY_CRITERION:
				return ((InternalEList<?>)getEntryCriterion()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TPLAN_ITEM__EXIT_CRITERION:
				return ((InternalEList<?>)getExitCriterion()).basicRemove(otherEnd, msgs);
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
			case CaseModelPackage.TPLAN_ITEM__ITEM_CONTROL:
				return getItemControl();
			case CaseModelPackage.TPLAN_ITEM__ENTRY_CRITERION:
				return getEntryCriterion();
			case CaseModelPackage.TPLAN_ITEM__EXIT_CRITERION:
				return getExitCriterion();
			case CaseModelPackage.TPLAN_ITEM__DEFINITION_REF:
				return getDefinitionRef();
			case CaseModelPackage.TPLAN_ITEM__NAME:
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
			case CaseModelPackage.TPLAN_ITEM__ITEM_CONTROL:
				setItemControl((TPlanItemControl)newValue);
				return;
			case CaseModelPackage.TPLAN_ITEM__ENTRY_CRITERION:
				getEntryCriterion().clear();
				getEntryCriterion().addAll((Collection<? extends TEntryCriterion>)newValue);
				return;
			case CaseModelPackage.TPLAN_ITEM__EXIT_CRITERION:
				getExitCriterion().clear();
				getExitCriterion().addAll((Collection<? extends TExitCriterion>)newValue);
				return;
			case CaseModelPackage.TPLAN_ITEM__DEFINITION_REF:
				setDefinitionRef((String)newValue);
				return;
			case CaseModelPackage.TPLAN_ITEM__NAME:
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
			case CaseModelPackage.TPLAN_ITEM__ITEM_CONTROL:
				setItemControl((TPlanItemControl)null);
				return;
			case CaseModelPackage.TPLAN_ITEM__ENTRY_CRITERION:
				getEntryCriterion().clear();
				return;
			case CaseModelPackage.TPLAN_ITEM__EXIT_CRITERION:
				getExitCriterion().clear();
				return;
			case CaseModelPackage.TPLAN_ITEM__DEFINITION_REF:
				setDefinitionRef(DEFINITION_REF_EDEFAULT);
				return;
			case CaseModelPackage.TPLAN_ITEM__NAME:
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
			case CaseModelPackage.TPLAN_ITEM__ITEM_CONTROL:
				return itemControl != null;
			case CaseModelPackage.TPLAN_ITEM__ENTRY_CRITERION:
				return entryCriterion != null && !entryCriterion.isEmpty();
			case CaseModelPackage.TPLAN_ITEM__EXIT_CRITERION:
				return exitCriterion != null && !exitCriterion.isEmpty();
			case CaseModelPackage.TPLAN_ITEM__DEFINITION_REF:
				return DEFINITION_REF_EDEFAULT == null ? definitionRef != null : !DEFINITION_REF_EDEFAULT.equals(definitionRef);
			case CaseModelPackage.TPLAN_ITEM__NAME:
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
		result.append(" (definitionRef: ");
		result.append(definitionRef);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TPlanItemImpl
