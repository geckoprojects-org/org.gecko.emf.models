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
package org.emau.icmvc.ganimed.ttp.cm2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Type4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType4Impl#getCurrentConsentTemplates <em>Current Consent Templates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnType4Impl extends MinimalEObjectImpl.Container implements ReturnType4 {
	/**
	 * The cached value of the '{@link #getCurrentConsentTemplates() <em>Current Consent Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentConsentTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentTemplateDTO> currentConsentTemplates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnType4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getReturnType4();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentTemplateDTO> getCurrentConsentTemplates() {
		if (currentConsentTemplates == null) {
			currentConsentTemplates = new EObjectContainmentEList<ConsentTemplateDTO>(ConsentTemplateDTO.class, this, Cm2Package.RETURN_TYPE4__CURRENT_CONSENT_TEMPLATES);
		}
		return currentConsentTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.RETURN_TYPE4__CURRENT_CONSENT_TEMPLATES:
				return ((InternalEList<?>)getCurrentConsentTemplates()).basicRemove(otherEnd, msgs);
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
			case Cm2Package.RETURN_TYPE4__CURRENT_CONSENT_TEMPLATES:
				return getCurrentConsentTemplates();
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
			case Cm2Package.RETURN_TYPE4__CURRENT_CONSENT_TEMPLATES:
				getCurrentConsentTemplates().clear();
				getCurrentConsentTemplates().addAll((Collection<? extends ConsentTemplateDTO>)newValue);
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
			case Cm2Package.RETURN_TYPE4__CURRENT_CONSENT_TEMPLATES:
				getCurrentConsentTemplates().clear();
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
			case Cm2Package.RETURN_TYPE4__CURRENT_CONSENT_TEMPLATES:
				return currentConsentTemplates != null && !currentConsentTemplates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReturnType4Impl
