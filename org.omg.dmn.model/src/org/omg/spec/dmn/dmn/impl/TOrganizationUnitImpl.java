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
package org.omg.spec.dmn.dmn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.TDMNElementReference;
import org.omg.spec.dmn.dmn.TOrganizationUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TOrganization Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TOrganizationUnitImpl#getDecisionMade <em>Decision Made</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TOrganizationUnitImpl#getDecisionOwned <em>Decision Owned</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TOrganizationUnitImpl extends TBusinessContextElementImpl implements TOrganizationUnit {
	/**
	 * The cached value of the '{@link #getDecisionMade() <em>Decision Made</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionMade()
	 * @generated
	 * @ordered
	 */
	protected EList<TDMNElementReference> decisionMade;

	/**
	 * The cached value of the '{@link #getDecisionOwned() <em>Decision Owned</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionOwned()
	 * @generated
	 * @ordered
	 */
	protected EList<TDMNElementReference> decisionOwned;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TOrganizationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TORGANIZATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDMNElementReference> getDecisionMade() {
		if (decisionMade == null) {
			decisionMade = new EObjectContainmentEList<TDMNElementReference>(TDMNElementReference.class, this, DMNPackage.TORGANIZATION_UNIT__DECISION_MADE);
		}
		return decisionMade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDMNElementReference> getDecisionOwned() {
		if (decisionOwned == null) {
			decisionOwned = new EObjectContainmentEList<TDMNElementReference>(TDMNElementReference.class, this, DMNPackage.TORGANIZATION_UNIT__DECISION_OWNED);
		}
		return decisionOwned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TORGANIZATION_UNIT__DECISION_MADE:
				return ((InternalEList<?>)getDecisionMade()).basicRemove(otherEnd, msgs);
			case DMNPackage.TORGANIZATION_UNIT__DECISION_OWNED:
				return ((InternalEList<?>)getDecisionOwned()).basicRemove(otherEnd, msgs);
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
			case DMNPackage.TORGANIZATION_UNIT__DECISION_MADE:
				return getDecisionMade();
			case DMNPackage.TORGANIZATION_UNIT__DECISION_OWNED:
				return getDecisionOwned();
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
			case DMNPackage.TORGANIZATION_UNIT__DECISION_MADE:
				getDecisionMade().clear();
				getDecisionMade().addAll((Collection<? extends TDMNElementReference>)newValue);
				return;
			case DMNPackage.TORGANIZATION_UNIT__DECISION_OWNED:
				getDecisionOwned().clear();
				getDecisionOwned().addAll((Collection<? extends TDMNElementReference>)newValue);
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
			case DMNPackage.TORGANIZATION_UNIT__DECISION_MADE:
				getDecisionMade().clear();
				return;
			case DMNPackage.TORGANIZATION_UNIT__DECISION_OWNED:
				getDecisionOwned().clear();
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
			case DMNPackage.TORGANIZATION_UNIT__DECISION_MADE:
				return decisionMade != null && !decisionMade.isEmpty();
			case DMNPackage.TORGANIZATION_UNIT__DECISION_OWNED:
				return decisionOwned != null && !decisionOwned.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TOrganizationUnitImpl
