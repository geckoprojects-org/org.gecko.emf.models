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
package de.xoev.xfamilie.baukasten._1.baukasten.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tatsache Mit Nachweis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.TatsacheMitNachweisTypeImpl#isLiegtVor <em>Liegt Vor</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.TatsacheMitNachweisTypeImpl#getNachweis <em>Nachweis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TatsacheMitNachweisTypeImpl extends MinimalEObjectImpl.Container implements TatsacheMitNachweisType {
	/**
	 * The default value of the '{@link #isLiegtVor() <em>Liegt Vor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLiegtVor()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LIEGT_VOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLiegtVor() <em>Liegt Vor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLiegtVor()
	 * @generated
	 * @ordered
	 */
	protected boolean liegtVor = LIEGT_VOR_EDEFAULT;

	/**
	 * This is true if the Liegt Vor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean liegtVorESet;

	/**
	 * The cached value of the '{@link #getNachweis() <em>Nachweis</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<String> nachweis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TatsacheMitNachweisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.TATSACHE_MIT_NACHWEIS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLiegtVor() {
		return liegtVor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLiegtVor(boolean newLiegtVor) {
		boolean oldLiegtVor = liegtVor;
		liegtVor = newLiegtVor;
		boolean oldLiegtVorESet = liegtVorESet;
		liegtVorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.TATSACHE_MIT_NACHWEIS_TYPE__LIEGT_VOR, oldLiegtVor, liegtVor, !oldLiegtVorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLiegtVor() {
		boolean oldLiegtVor = liegtVor;
		boolean oldLiegtVorESet = liegtVorESet;
		liegtVor = LIEGT_VOR_EDEFAULT;
		liegtVorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BaukastenPackage.TATSACHE_MIT_NACHWEIS_TYPE__LIEGT_VOR, oldLiegtVor, LIEGT_VOR_EDEFAULT, oldLiegtVorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLiegtVor() {
		return liegtVorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNachweis() {
		if (nachweis == null) {
			nachweis = new EDataTypeEList<String>(String.class, this, BaukastenPackage.TATSACHE_MIT_NACHWEIS_TYPE__NACHWEIS);
		}
		return nachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BaukastenPackage.TATSACHE_MIT_NACHWEIS_TYPE__LIEGT_VOR:
				return isLiegtVor();
			case BaukastenPackage.TATSACHE_MIT_NACHWEIS_TYPE__NACHWEIS:
				return getNachweis();
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
			case BaukastenPackage.TATSACHE_MIT_NACHWEIS_TYPE__LIEGT_VOR:
				setLiegtVor((Boolean)newValue);
				return;
			case BaukastenPackage.TATSACHE_MIT_NACHWEIS_TYPE__NACHWEIS:
				getNachweis().clear();
				getNachweis().addAll((Collection<? extends String>)newValue);
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
			case BaukastenPackage.TATSACHE_MIT_NACHWEIS_TYPE__LIEGT_VOR:
				unsetLiegtVor();
				return;
			case BaukastenPackage.TATSACHE_MIT_NACHWEIS_TYPE__NACHWEIS:
				getNachweis().clear();
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
			case BaukastenPackage.TATSACHE_MIT_NACHWEIS_TYPE__LIEGT_VOR:
				return isSetLiegtVor();
			case BaukastenPackage.TATSACHE_MIT_NACHWEIS_TYPE__NACHWEIS:
				return nachweis != null && !nachweis.isEmpty();
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
		result.append(" (liegtVor: ");
		if (liegtVorESet) result.append(liegtVor); else result.append("<unset>");
		result.append(", nachweis: ");
		result.append(nachweis);
		result.append(')');
		return result.toString();
	}

} //TatsacheMitNachweisTypeImpl
