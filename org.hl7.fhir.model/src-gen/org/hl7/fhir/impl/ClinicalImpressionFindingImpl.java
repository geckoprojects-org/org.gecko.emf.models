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
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ClinicalImpressionFinding;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.FHIRPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Impression Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionFindingImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClinicalImpressionFindingImpl#getBasis <em>Basis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClinicalImpressionFindingImpl extends BackboneElementImpl implements ClinicalImpressionFinding {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected CodeableReference item;

	/**
	 * The cached value of the '{@link #getBasis() <em>Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasis()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String basis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalImpressionFindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getClinicalImpressionFinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableReference getItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItem(CodeableReference newItem, NotificationChain msgs) {
		CodeableReference oldItem = item;
		item = newItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLINICAL_IMPRESSION_FINDING__ITEM, oldItem, newItem);
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
	public void setItem(CodeableReference newItem) {
		if (newItem != item) {
			NotificationChain msgs = null;
			if (item != null)
				msgs = ((InternalEObject)item).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLINICAL_IMPRESSION_FINDING__ITEM, null, msgs);
			if (newItem != null)
				msgs = ((InternalEObject)newItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLINICAL_IMPRESSION_FINDING__ITEM, null, msgs);
			msgs = basicSetItem(newItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLINICAL_IMPRESSION_FINDING__ITEM, newItem, newItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getBasis() {
		return basis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasis(org.hl7.fhir.String newBasis, NotificationChain msgs) {
		org.hl7.fhir.String oldBasis = basis;
		basis = newBasis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.CLINICAL_IMPRESSION_FINDING__BASIS, oldBasis, newBasis);
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
	public void setBasis(org.hl7.fhir.String newBasis) {
		if (newBasis != basis) {
			NotificationChain msgs = null;
			if (basis != null)
				msgs = ((InternalEObject)basis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLINICAL_IMPRESSION_FINDING__BASIS, null, msgs);
			if (newBasis != null)
				msgs = ((InternalEObject)newBasis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.CLINICAL_IMPRESSION_FINDING__BASIS, null, msgs);
			msgs = basicSetBasis(newBasis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CLINICAL_IMPRESSION_FINDING__BASIS, newBasis, newBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.CLINICAL_IMPRESSION_FINDING__ITEM:
				return basicSetItem(null, msgs);
			case FHIRPackage.CLINICAL_IMPRESSION_FINDING__BASIS:
				return basicSetBasis(null, msgs);
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
			case FHIRPackage.CLINICAL_IMPRESSION_FINDING__ITEM:
				return getItem();
			case FHIRPackage.CLINICAL_IMPRESSION_FINDING__BASIS:
				return getBasis();
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
			case FHIRPackage.CLINICAL_IMPRESSION_FINDING__ITEM:
				setItem((CodeableReference)newValue);
				return;
			case FHIRPackage.CLINICAL_IMPRESSION_FINDING__BASIS:
				setBasis((org.hl7.fhir.String)newValue);
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
			case FHIRPackage.CLINICAL_IMPRESSION_FINDING__ITEM:
				setItem((CodeableReference)null);
				return;
			case FHIRPackage.CLINICAL_IMPRESSION_FINDING__BASIS:
				setBasis((org.hl7.fhir.String)null);
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
			case FHIRPackage.CLINICAL_IMPRESSION_FINDING__ITEM:
				return item != null;
			case FHIRPackage.CLINICAL_IMPRESSION_FINDING__BASIS:
				return basis != null;
		}
		return super.eIsSet(featureID);
	}

} //ClinicalImpressionFindingImpl
