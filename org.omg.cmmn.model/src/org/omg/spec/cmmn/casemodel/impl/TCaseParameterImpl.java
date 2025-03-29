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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.cmmn.casemodel.CaseModelPackage;
import org.omg.spec.cmmn.casemodel.TCaseParameter;
import org.omg.spec.cmmn.casemodel.TExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCase Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TCaseParameterImpl#getBindingRefinement <em>Binding Refinement</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TCaseParameterImpl#getBindingRef <em>Binding Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCaseParameterImpl extends TParameterImpl implements TCaseParameter {
	/**
	 * The cached value of the '{@link #getBindingRefinement() <em>Binding Refinement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingRefinement()
	 * @generated
	 * @ordered
	 */
	protected TExpression bindingRefinement;

	/**
	 * The default value of the '{@link #getBindingRef() <em>Binding Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BINDING_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBindingRef() <em>Binding Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingRef()
	 * @generated
	 * @ordered
	 */
	protected String bindingRef = BINDING_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCaseParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaseModelPackage.Literals.TCASE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExpression getBindingRefinement() {
		return bindingRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindingRefinement(TExpression newBindingRefinement, NotificationChain msgs) {
		TExpression oldBindingRefinement = bindingRefinement;
		bindingRefinement = newBindingRefinement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaseModelPackage.TCASE_PARAMETER__BINDING_REFINEMENT, oldBindingRefinement, newBindingRefinement);
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
	public void setBindingRefinement(TExpression newBindingRefinement) {
		if (newBindingRefinement != bindingRefinement) {
			NotificationChain msgs = null;
			if (bindingRefinement != null)
				msgs = ((InternalEObject)bindingRefinement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TCASE_PARAMETER__BINDING_REFINEMENT, null, msgs);
			if (newBindingRefinement != null)
				msgs = ((InternalEObject)newBindingRefinement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TCASE_PARAMETER__BINDING_REFINEMENT, null, msgs);
			msgs = basicSetBindingRefinement(newBindingRefinement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TCASE_PARAMETER__BINDING_REFINEMENT, newBindingRefinement, newBindingRefinement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBindingRef() {
		return bindingRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBindingRef(String newBindingRef) {
		String oldBindingRef = bindingRef;
		bindingRef = newBindingRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TCASE_PARAMETER__BINDING_REF, oldBindingRef, bindingRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaseModelPackage.TCASE_PARAMETER__BINDING_REFINEMENT:
				return basicSetBindingRefinement(null, msgs);
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
			case CaseModelPackage.TCASE_PARAMETER__BINDING_REFINEMENT:
				return getBindingRefinement();
			case CaseModelPackage.TCASE_PARAMETER__BINDING_REF:
				return getBindingRef();
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
			case CaseModelPackage.TCASE_PARAMETER__BINDING_REFINEMENT:
				setBindingRefinement((TExpression)newValue);
				return;
			case CaseModelPackage.TCASE_PARAMETER__BINDING_REF:
				setBindingRef((String)newValue);
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
			case CaseModelPackage.TCASE_PARAMETER__BINDING_REFINEMENT:
				setBindingRefinement((TExpression)null);
				return;
			case CaseModelPackage.TCASE_PARAMETER__BINDING_REF:
				setBindingRef(BINDING_REF_EDEFAULT);
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
			case CaseModelPackage.TCASE_PARAMETER__BINDING_REFINEMENT:
				return bindingRefinement != null;
			case CaseModelPackage.TCASE_PARAMETER__BINDING_REF:
				return BINDING_REF_EDEFAULT == null ? bindingRef != null : !BINDING_REF_EDEFAULT.equals(bindingRef);
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
		result.append(" (bindingRef: ");
		result.append(bindingRef);
		result.append(')');
		return result.toString();
	}

} //TCaseParameterImpl
