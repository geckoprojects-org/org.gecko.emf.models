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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BefruchtungsbehandlungenType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType;

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
 * An implementation of the model object '<em><b>Befruchtungsbehandlungen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BefruchtungsbehandlungenTypeImpl#getVersuch <em>Versuch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BefruchtungsbehandlungenTypeImpl extends MinimalEObjectImpl.Container implements BefruchtungsbehandlungenType {
	/**
	 * The cached value of the '{@link #getVersuch() <em>Versuch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersuch()
	 * @generated
	 * @ordered
	 */
	protected EList<VersuchType> versuch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BefruchtungsbehandlungenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.BEFRUCHTUNGSBEHANDLUNGEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VersuchType> getVersuch() {
		if (versuch == null) {
			versuch = new EObjectContainmentEList<VersuchType>(VersuchType.class, this, KinderwunschPackage.BEFRUCHTUNGSBEHANDLUNGEN_TYPE__VERSUCH);
		}
		return versuch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinderwunschPackage.BEFRUCHTUNGSBEHANDLUNGEN_TYPE__VERSUCH:
				return ((InternalEList<?>)getVersuch()).basicRemove(otherEnd, msgs);
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
			case KinderwunschPackage.BEFRUCHTUNGSBEHANDLUNGEN_TYPE__VERSUCH:
				return getVersuch();
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
			case KinderwunschPackage.BEFRUCHTUNGSBEHANDLUNGEN_TYPE__VERSUCH:
				getVersuch().clear();
				getVersuch().addAll((Collection<? extends VersuchType>)newValue);
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
			case KinderwunschPackage.BEFRUCHTUNGSBEHANDLUNGEN_TYPE__VERSUCH:
				getVersuch().clear();
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
			case KinderwunschPackage.BEFRUCHTUNGSBEHANDLUNGEN_TYPE__VERSUCH:
				return versuch != null && !versuch.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BefruchtungsbehandlungenTypeImpl
