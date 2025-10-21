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

import de.xoev.domea.domea.DokumentMitSchriftstueckType;
import de.xoev.domea.domea.DokumentType;
import de.xoev.domea.domea.DomeaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dokument Mit Schriftstueck Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.DokumentMitSchriftstueckTypeImpl#getSchriftstueck <em>Schriftstueck</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DokumentMitSchriftstueckTypeImpl extends DokumentSchriftstueckBasisTypeImpl implements DokumentMitSchriftstueckType {
	/**
	 * The cached value of the '{@link #getSchriftstueck() <em>Schriftstueck</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchriftstueck()
	 * @generated
	 * @ordered
	 */
	protected EList<DokumentType> schriftstueck;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DokumentMitSchriftstueckTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.DOKUMENT_MIT_SCHRIFTSTUECK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DokumentType> getSchriftstueck() {
		if (schriftstueck == null) {
			schriftstueck = new EObjectContainmentEList<DokumentType>(DokumentType.class, this, DomeaPackage.DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__SCHRIFTSTUECK);
		}
		return schriftstueck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__SCHRIFTSTUECK:
				return ((InternalEList<?>)getSchriftstueck()).basicRemove(otherEnd, msgs);
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
			case DomeaPackage.DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__SCHRIFTSTUECK:
				return getSchriftstueck();
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
			case DomeaPackage.DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__SCHRIFTSTUECK:
				getSchriftstueck().clear();
				getSchriftstueck().addAll((Collection<? extends DokumentType>)newValue);
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
			case DomeaPackage.DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__SCHRIFTSTUECK:
				getSchriftstueck().clear();
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
			case DomeaPackage.DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__SCHRIFTSTUECK:
				return schriftstueck != null && !schriftstueck.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DokumentMitSchriftstueckTypeImpl
