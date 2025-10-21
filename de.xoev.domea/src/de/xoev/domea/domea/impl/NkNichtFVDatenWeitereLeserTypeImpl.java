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
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.KontaktType;
import de.xoev.domea.domea.NkNichtFVDatenWeitereLeserType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nk Nicht FV Daten Weitere Leser Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.NkNichtFVDatenWeitereLeserTypeImpl#getWeitererLeser <em>Weiterer Leser</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NkNichtFVDatenWeitereLeserTypeImpl extends NachrichtTypeImpl implements NkNichtFVDatenWeitereLeserType {
	/**
	 * The cached value of the '{@link #getWeitererLeser() <em>Weiterer Leser</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeitererLeser()
	 * @generated
	 * @ordered
	 */
	protected EList<KontaktType> weitererLeser;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NkNichtFVDatenWeitereLeserTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KontaktType> getWeitererLeser() {
		if (weitererLeser == null) {
			weitererLeser = new EObjectContainmentEList<KontaktType>(KontaktType.class, this, DomeaPackage.NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__WEITERER_LESER);
		}
		return weitererLeser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__WEITERER_LESER:
				return ((InternalEList<?>)getWeitererLeser()).basicRemove(otherEnd, msgs);
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
			case DomeaPackage.NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__WEITERER_LESER:
				return getWeitererLeser();
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
			case DomeaPackage.NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__WEITERER_LESER:
				getWeitererLeser().clear();
				getWeitererLeser().addAll((Collection<? extends KontaktType>)newValue);
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
			case DomeaPackage.NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__WEITERER_LESER:
				getWeitererLeser().clear();
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
			case DomeaPackage.NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__WEITERER_LESER:
				return weitererLeser != null && !weitererLeser.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NkNichtFVDatenWeitereLeserTypeImpl
