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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalSymbolizersType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.SymbolizerType2;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Symbolizers Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.AdditionalSymbolizersType1Impl#getSymbolizer <em>Symbolizer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditionalSymbolizersType1Impl extends MinimalEObjectImpl.Container implements AdditionalSymbolizersType1 {
	/**
	 * The cached value of the '{@link #getSymbolizer() <em>Symbolizer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolizer()
	 * @generated
	 * @ordered
	 */
	protected EList<SymbolizerType2> symbolizer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalSymbolizersType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getAdditionalSymbolizersType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SymbolizerType2> getSymbolizer() {
		if (symbolizer == null) {
			symbolizer = new EObjectContainmentEList<SymbolizerType2>(SymbolizerType2.class, this, AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE1__SYMBOLIZER);
		}
		return symbolizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE1__SYMBOLIZER:
				return ((InternalEList<?>)getSymbolizer()).basicRemove(otherEnd, msgs);
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
			case AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE1__SYMBOLIZER:
				return getSymbolizer();
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
			case AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE1__SYMBOLIZER:
				getSymbolizer().clear();
				getSymbolizer().addAll((Collection<? extends SymbolizerType2>)newValue);
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
			case AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE1__SYMBOLIZER:
				getSymbolizer().clear();
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
			case AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE1__SYMBOLIZER:
				return symbolizer != null && !symbolizer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdditionalSymbolizersType1Impl
