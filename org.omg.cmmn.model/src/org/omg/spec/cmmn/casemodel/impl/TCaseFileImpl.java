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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.cmmn.casemodel.CaseModelPackage;
import org.omg.spec.cmmn.casemodel.TCaseFile;
import org.omg.spec.cmmn.casemodel.TCaseFileItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCase File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TCaseFileImpl#getCaseFileItem <em>Case File Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCaseFileImpl extends TCmmnElementImpl implements TCaseFile {
	/**
	 * The cached value of the '{@link #getCaseFileItem() <em>Case File Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseFileItem()
	 * @generated
	 * @ordered
	 */
	protected EList<TCaseFileItem> caseFileItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCaseFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaseModelPackage.Literals.TCASE_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TCaseFileItem> getCaseFileItem() {
		if (caseFileItem == null) {
			caseFileItem = new EObjectContainmentEList<TCaseFileItem>(TCaseFileItem.class, this, CaseModelPackage.TCASE_FILE__CASE_FILE_ITEM);
		}
		return caseFileItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaseModelPackage.TCASE_FILE__CASE_FILE_ITEM:
				return ((InternalEList<?>)getCaseFileItem()).basicRemove(otherEnd, msgs);
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
			case CaseModelPackage.TCASE_FILE__CASE_FILE_ITEM:
				return getCaseFileItem();
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
			case CaseModelPackage.TCASE_FILE__CASE_FILE_ITEM:
				getCaseFileItem().clear();
				getCaseFileItem().addAll((Collection<? extends TCaseFileItem>)newValue);
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
			case CaseModelPackage.TCASE_FILE__CASE_FILE_ITEM:
				getCaseFileItem().clear();
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
			case CaseModelPackage.TCASE_FILE__CASE_FILE_ITEM:
				return caseFileItem != null && !caseFileItem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TCaseFileImpl
